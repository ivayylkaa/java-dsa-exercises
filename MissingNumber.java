import java.util.HashSet;

public class MissingNumber {
    
    public static int missingNumber(int[] nums){
        HashSet<Integer> set= new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

       for(int i=0;i<=nums.length;i++){
        if(!set.contains(i)){
            return i;
        }
       }

       throw new IllegalArgumentException("No missing number");
    }

    public static void main(String[] args) {
        int[] test1={0, 1, 2};
        int[] test2={1, 2, 3};
        int[] test3={3, 0, 1};

        System.out.println(missingNumber(test1));
        System.out.println(missingNumber(test2));
        System.out.println(missingNumber(test3));
    }
}
