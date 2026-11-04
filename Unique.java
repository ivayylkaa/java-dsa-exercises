import java.util.HashMap;

public class Unique {

    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                int currentValue = map.get(s.charAt(i));
                map.put(s.charAt(i), currentValue + 1);
            }

        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        Unique solution = new Unique();

        String s1 = "leetcode";
        System.out.println("Input: \"" + s1 + "\" | Output: " + solution.firstUniqChar(s1));

        String s2 = "loveleetcode";
        System.out.println("Input: \"" + s2 + "\" | Output: " + solution.firstUniqChar(s2)); 

        String s3 = "aabb";
        System.out.println("Input: \"" + s3 + "\" | Output: " + solution.firstUniqChar(s3)); 
    }
}