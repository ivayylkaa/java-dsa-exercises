import java.util.HashMap;

public class MajorityElement {

    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }else{
                int counter=map.get(nums[i]);
                map.put(nums[i],counter+=1);
            }
        }

        int majority=nums.length/2;

        for(int x:map.keySet()){
         if(map.get(x)>majority){
            return x;
         }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3, 2, 3}));          // 3
        System.out.println(majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2})); // 2
        System.out.println(majorityElement(new int[]{7}));                // 7
    }
}