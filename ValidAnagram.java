import java.util.Arrays;

public class ValidAnagram{

    public static boolean isValidAnagram(String s1,String s2){

        if(s1.length()!=s2.length()){
          return false;
        }

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        

        return Arrays.equals(arr1, arr2);
     } 

     public static boolean ArrayValidAnagram(String s1,String s2){
          if(s1.length()!=s2.length()){
          return false;
        }

         int[] count=new int[26];

         for(char ch:s1.toCharArray()){
            count[ch-'a']++;
         }

      
         for(char ch:s2.toCharArray()){
            count[ch-'a']--;
         }

         for(int n:count){
           if(n!=0) return false;
         }

        return true;
     }

public static void main(String[] args) {
    System.out.println(ArrayValidAnagram("car", "rac"));
    System.out.println(ArrayValidAnagram("anagram", "nagaram"));
    System.out.println(ArrayValidAnagram("rat", "car"));
    System.out.println(ArrayValidAnagram("racing", "car"));

}

}