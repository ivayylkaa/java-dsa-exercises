
import java.util.Arrays;

public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
        int insertPos=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[insertPos];
                nums[insertPos]=temp;
                insertPos++;
            }
            
        }

    }

    public static void main(String[] args) {
        int[] test1 = {0, 1, 0, 3, 12}; // expected: [1, 3, 12, 0, 0]
        int[] test2 = {1, 2, 3};        // expected: [1, 2, 3]
        int[] test3 = {0, 0, 0};        // expected: [0, 0, 0]

        moveZeroes(test1);
        moveZeroes(test2);
        moveZeroes(test3);

        System.out.println(Arrays.toString(test1));
        System.out.println(Arrays.toString(test2));
        System.out.println(Arrays.toString(test3));
    }
}