import java.util.Arrays;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int lastRealNumInNum1 = m - 1;
        int lastNumInNum2 = n - 1;
        int lastPlaceInNum1 = (m + n) - 1;

        while (lastNumInNum2 >= 0) {

            if (lastRealNumInNum1 >= 0) {

                if (nums1[lastRealNumInNum1] > nums2[lastNumInNum2]) {
                    nums1[lastPlaceInNum1] = nums1[lastRealNumInNum1];
                    lastRealNumInNum1--;
                    lastPlaceInNum1--;
                } else {
                    nums1[lastPlaceInNum1] = nums2[lastNumInNum2];
                    lastNumInNum2--;
                    lastPlaceInNum1--;
                }

            } else {

                nums1[lastPlaceInNum1] = nums2[lastNumInNum2];
                lastNumInNum2--;
                lastPlaceInNum1--;

            }
        }
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 0, 0, 0 };
        merge(a, 3, new int[] { 2, 5, 6 }, 3);
        System.out.println(Arrays.toString(a)); // [1, 2, 2, 3, 5, 6]

        int[] b = { 1 };
        merge(b, 1, new int[] {}, 0);
        System.out.println(Arrays.toString(b)); // [1]

        int[] c = { 0 };
        merge(c, 0, new int[] { 1 }, 1);
        System.out.println(Arrays.toString(c)); // [1]
    }
}