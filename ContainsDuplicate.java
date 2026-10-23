import java.util.ArrayList; 
public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
         ArrayList<Integer> arr = new ArrayList<Integer>();

        for(int i=0;i<nums.length;i++){
            if(arr.contains(nums[i]))return true;
            else arr.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{ 1, 2, 2, 3, 1 }));
        System.out.println(containsDuplicate(new int[]{4,5,6,7}));
        System.out.println(containsDuplicate(new int[]{}));
    }
}
