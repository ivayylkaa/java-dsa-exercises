import java.util.Arrays;

public class SortedSquares {

    public static int[] sortedSquares(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int[] result = new int[nums.length];
        int resultIndex = nums.length - 1;

        while(left<=right){
           
        if (Math.pow(nums[left], 2) > Math.pow(nums[right], 2)){
        result[resultIndex]=nums[left]*nums[left];
        left++;
        }else{
        result[resultIndex]=nums[right]*nums[right];
        right--;
        }

        resultIndex--;
        }

        
        return result; 
    }

    public static void main(String[] args) {
        int[] nums1 = {-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(sortedSquares(nums1))); //  [0, 1, 9, 16, 100]

        int[] nums2 = {-7, -3, 2, 3, 11};
        System.out.println(Arrays.toString(sortedSquares(nums2))); //  [4, 9, 9, 49, 121]
    }
}