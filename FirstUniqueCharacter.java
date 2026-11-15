import java.util.HashMap;

public class FirstUniqueCharacter {

    public static int firstUniqChar(String s) {
        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!map.containsKey(c)){
                map.put(c, 1);
            }else{
                int counter=map.get(c);
                map.put(c, counter+1);
            }
        }

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(map.get(c)==1) return i;
        }


        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));     // 0
        System.out.println(firstUniqChar("loveleetcode")); // 2
        System.out.println(firstUniqChar("aabb"));         // -1
        System.out.println(firstUniqChar("z")); //0
    }
}