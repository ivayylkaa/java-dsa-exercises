public class Largest {

    public static int largest(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(largest(new int[] { 2, 3, 1, 5 }));
        System.out.println(largest(new int[] { -2, -8, -1 }));
        System.out.println(largest(new int[] {}));
    }
}
