package org.easy;

public class PalindromeNumber {

//    https://leetcode.com/problems/palindrome-number/

    public static boolean isPalindrome(int x){
        int carry = x;
        int revertedNumber = 0;
        while (x > 0){
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return revertedNumber == carry;
    }
}
