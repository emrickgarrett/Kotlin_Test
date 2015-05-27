package kotlin_files

/**
 * Created by Garrett on 5/26/2015.
 *
 * Kotlin does NOT allow static variables, so instead we have to create an instance of the class.
 */

class Palindrome{

    public fun isPalindrome(s:String): Boolean{

        if(s.length() < 2)
            return true;

        val arr = s.toCharArray()
        val length = arr.size()

        for(i in arr.indices){
            if(i < length/2){
                if(arr[i] != arr[length-i-1]){
                    return false;
                }
            }
            else
                break;
        }



        return true;
    }
}
