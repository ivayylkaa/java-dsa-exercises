import java.util.LinkedHashSet;
import java.util.Arrays;

public class RemoveDuplicatesHash {

    public static int[] removeDuplicatesHash(int[] arr) {
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        int index = 0;
        int[] result = new int[set.size()];
        for (int x : set) {
            result[index] = x;
            index++;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeDuplicatesHash(new int[] { 1, 2, 2, 3, 1 })));
        System.out.println(Arrays.toString(removeDuplicatesHash(new int[] { 4, 5, 5, 5, 6, 7 })));
        System.out.println(Arrays.toString(removeDuplicatesHash(new int[] { 3, 1, 2, 3, 1 })));
        System.out.println(Arrays.toString(removeDuplicatesHash(new int[] {})));
    }
}


