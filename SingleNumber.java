import java.util.HashMap;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
              map.put(nums[i],1);
            }else{
                int counter=map.get(nums[i]);
                map.put(nums[i],counter+=1);
            }
        }

       for(int i:map.keySet()){
          if(map.get(i)==1){
            return i;
          }
       }

       return -1;
      
    }

    public static void main(String[] args) {

        int[] nums1 = {2, 2, 1};
        int[] nums2 = {4, 1, 2, 1, 2};
        int[] nums3 = {1};
        int[] nums4 = {-1, 2, 2};
        int[] nums5 = {7, 3, 7, 5, 3};

        System.out.println(singleNumber(nums1)); // 1
        System.out.println(singleNumber(nums2)); // 4
        System.out.println(singleNumber(nums3)); // 1
        System.out.println(singleNumber(nums4)); // -1
        System.out.println(singleNumber(nums5)); // 5
    }
}
