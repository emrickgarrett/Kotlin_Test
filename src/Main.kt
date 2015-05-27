/**
 * Created by Garrett on 5/26/2015.
 */

import java_files.Palindrome
import java_files.Person;
import kotlin_files.*;

//Main Method
fun main(args: Array<String>){



    println("****** Java Default w/ Kotlin *******")
    val java_person = Person()
    println("${java_person.getLast()}, ${java_person.getFirst()}")
    println("Age: ${java_person.getAge()}, Weight: ${java_person.getWeight()}")
    println("Siblings: ${java_person.getSiblings().size()}")
    println("*************************************")
    println()

    println("****** Kotlin Default w/ Kotlin ******")
    val kotlin_person = kPerson()
    println("${kotlin_person.getLast()}, ${kotlin_person.getFirst()}")
    println("${kotlin_person.getAge()}, Weight: ${kotlin_person.getWeight()}")
    println("Siblings: ${kotlin_person.getSiblings().size()}")
    println("*************************************")
    println()

    println("****** Palindromes Java ********")
    println("a: " + Palindrome.isPalindrome("a"))
    println(": " + Palindrome.isPalindrome(""))
    println("ab: " + Palindrome.isPalindrome("ab"))
    println("aa: " + Palindrome.isPalindrome("aa"))
    println("aabbccbbaa: " + Palindrome.isPalindrome("aabbccbbaa"))
    println("********************************")
    println()

    println("****** Palindromes Kotlin ******")
    val kPalindrome = kotlin_files.Palindrome();
    println("a: " + kPalindrome.isPalindrome("a"))
    println(": " + kPalindrome.isPalindrome(""))
    println("ab: " + kPalindrome.isPalindrome("ab"))
    println("aa: " + kPalindrome.isPalindrome("aa"))
    println("aabbccbbaa: " + kPalindrome.isPalindrome("aabbccbbaa"))
    println("********************************")
    println()



}