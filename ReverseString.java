import java.util.Arrays;

public class ReverseString {

    public static void reverseString(char[] s) {
       int left=0;
       int right=s.length-1;

       while(left<right){
        char temp=s[left];
        s[left]=s[right];
        s[right]=temp;

         left++;
         right--;
       }
    }

    public static void main(String[] args) {
        char[] test1 = {'h', 'e', 'l', 'l', 'o'};
        char[] test2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        char[] test3 = {'a'};

        reverseString(test1);
        reverseString(test2);
        reverseString(test3);

        System.out.println(Arrays.toString(test1)); // [o, l, l, e, h]
        System.out.println(Arrays.toString(test2)); // [h, a, n, n, a, H]
        System.out.println(Arrays.toString(test3)); // [a]
    }
}