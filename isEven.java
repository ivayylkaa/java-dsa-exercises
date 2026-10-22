class IsEven {

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(isEven(2));
        System.out.println(isEven(3));
        System.out.println(isEven(0));
        System.out.println(isEven(-4));
    }
}