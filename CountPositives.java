public class CountPositives {

    public static int countPositives(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPositives(new int[] { 1, 2, 34, 2, 1 }));
        System.out.println(countPositives(new int[] { 3, -10, -10 }));
        System.out.println(countPositives(new int[] {}));
    }
}