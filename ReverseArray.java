import java.util.Arrays;

public class ReverseArray {

    public static int[] reverseArray(int[] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[arr.length - 1 - i] = arr[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(reverseArray(nums)));
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(reverseArray(new int[] {})));
    }
}
