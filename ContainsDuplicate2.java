import java.util.HashSet;

public class ContainsDuplicate2 {
    
    public static boolean containsDuplicate2(int[] nums){
     HashSet<Integer> set=new HashSet<Integer>();

     for(int i=0;i<nums.length;i++){
      if(set.contains(nums[i])) return true;
      else set.add(nums[i]);
     }

     return false;
    }

    public static void main(String[] args) {
         System.out.println(containsDuplicate2(new int[]{ 1, 2, 2, 3, 1 }));
        System.out.println(containsDuplicate2(new int[]{4,5,6,7}));
        System.out.println(containsDuplicate2(new int[]{}));
    }
}
