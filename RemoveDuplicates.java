import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {

    public static int[] removeDuplicates(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (!list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeDuplicates(new int[] { 1, 2, 2, 3, 1 })));
        System.out.println(Arrays.toString(removeDuplicates(new int[] { 4, 5, 5, 5, 6, 7 })));
        System.out.println(Arrays.toString(removeDuplicates(new int[] {})));
    }
}