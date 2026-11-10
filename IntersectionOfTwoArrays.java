import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> result=new  HashSet<>();
        for (int element : nums1) {
            set.add(element);
        }

        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
              result.add(nums2[i]);
            }
        }

        int[] arr = new int[result.size()];

        int index=0;
        for(int n:result){
            arr[index]=n;
            index++;
        }
        
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[] { 1, 2, 2, 1 }, new int[] { 2, 2 }))); 
        System.out.println(Arrays.toString(intersection(new int[] { 4, 9, 5 }, new int[] { 9, 4, 9, 8, 4 })));
        System.out.println(Arrays.toString(intersection(new int[] { 1, 2 }, new int[] { 3, 4 }))); 
    }
}