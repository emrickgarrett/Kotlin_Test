package java_files;

/**
 * Created by Garrett on 5/26/2015.
 *
 * Palindrome class that gives access to static method to determine if a string is a palindrome
 * Any String that is less than 2 characters long is considered one by my definition.
 */
public class Palindrome {

    private Palindrome(){

    }

    static public boolean isPalindrome(String s){

        if(s.length() < 2){
            return true;
        }

        char[] chars = s.toCharArray();
        int length = chars.length;

        for(int i = 0; i < length/2; i++){
            if(chars[i] != chars[length-i-1])
                return false;
        }



        return true;
    }
}
