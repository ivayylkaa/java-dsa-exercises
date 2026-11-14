import java.util.HashMap;

public class RansomNote {

    public static boolean canConstruct(String ransomNote, String magazine) {
       HashMap<Character,Integer> magazineMap=new HashMap<>();

       for(int i=0;i<magazine.length();i++){
        if(!magazineMap.containsKey(magazine.charAt(i))){
           magazineMap.put(magazine.charAt(i), 1);
        }else{
            int counter=magazineMap.get(magazine.charAt(i));
            magazineMap.put(magazine.charAt(i), counter+1);
        }
       }

       for(int i=0;i<ransomNote.length();i++){
        char c=ransomNote.charAt(i);
         if(!magazineMap.containsKey(c) || magazineMap.get(c)<=0){
           return false;
         }
        
         int counter=magazineMap.get(c);
         magazineMap.put(c, counter-1);

       }
 
       return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("a", "b"));     // false
        System.out.println(canConstruct("aa", "ab"));   // false
        System.out.println(canConstruct("aa", "aab"));  // true
    }
}