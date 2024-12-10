import java.util.Scanner;
import java.lang.Character;

public class Palindrome {

    public static boolean isPalindrome (String s) {
        if (s.length() == 0 ) {
            return true; //Base case
        }
        else if (s.length() == 1) {
            if (Character.isLetterOrDigit(s.charAt(0))){
                return true;
            }
            else {
                return false;
            }
        }
        else {
            /*Trimming any character that is NOT a letter or a digit, using the isLetterOrDigit() method*/
            int firstchar = 0, lastchar = s.length() - 1 ; /*initializing the indices that will walkthrough the string*/
            while (! Character.isLetterOrDigit (s.charAt(firstchar)) && firstchar < s.length()-1) firstchar++ ; /*We increment the first index until we find the first letter or digit*/
            while (! Character.isLetterOrDigit (s.charAt (lastchar)) && lastchar > 0) lastchar--; /*We decrement the last index until we find the last letter or digit */

            if (lastchar - firstchar <= 1 ) { 
                /*Check if we are in the base case */
                if ( lastchar == firstchar) {
                    return true;
                }
                else {
                    return false;
                }
                
            } else if (s.charAt(firstchar) == s.charAt(lastchar)) { /*Comparing the first and last characters */
                return isPalindrome (s.substring(firstchar + 1, lastchar )); /*Calling isPalindrome for the substring from the second character up to but not including the last character */
            }
            else {
                return false;   /*If we arrive at this step, the string is NOT a palindrome */
            }
        }
    }


    public static void main (String [] args) {

        Scanner keyboard = new Scanner (System.in);
        System.out.print ("Please type a string, and I will determine palindrome-hood: ");
        String s = keyboard.nextLine();
        s = s.toLowerCase();
        
        if (isPalindrome(s)) {
            System.out.println ("The typed string IS a Palindrome");
        }
        else {
            System.out.println ("The typed string is NOT a Palindrome");
        }
    }

}