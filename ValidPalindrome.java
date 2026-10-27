public class ValidPalindrome {

    //with cleaning
    public static boolean isPalindrome(String s) {
        StringBuilder cleaned = new StringBuilder();

        for (char ch : s.toCharArray()) {
        if (Character.isLetterOrDigit(ch)) {           
            cleaned.append(Character.toLowerCase(ch)); 
        }
        }

        int left=0;
        int right=cleaned.length()-1;

        while(left<right){
           if( cleaned.charAt(left)!=cleaned.charAt(right)) return false;
           left++;
           right--;
        }

        return true;
    }

    //with skipping pointers
    public static boolean isPalindromeSecond(String s){
        int left=0;
        int right=s.length()-1;

        while(left<right){
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
            left++;}

            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
            right--;
            }

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
       System.out.println(isPalindromeSecond("A man, a plan, a canal: Panama"));  
       System.out.println(isPalindromeSecond("race a car"));                       
       System.out.println(isPalindromeSecond(" "));                               
       System.out.println(isPalindromeSecond("racecar"));   
       System.out.println(isPalindromeSecond(".,"));                     
    }
}