package org.easy;

public class RomanToInteger {

//    https://leetcode.com/problems/roman-to-integer/

    public static int romanToInt(String s){
        String currentS = null;
        String previousS = null;
        int currentN = 0;
        int previousN = 0;
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            currentS = String.valueOf(s.charAt(i));
            currentN = romanNumberToInt(currentS);
            if (checkForDecrement(previousN, currentN)){
                currentN -= previousN;
                result -=previousN;
            }
            result += currentN;
            previousS = currentS;
            previousN = currentN;
        }
        return result;
    }

    static boolean checkForDecrement(int previousN, int currentN) {
        if (previousN == 1 && currentN == 5) return true;
        if (previousN == 1 && currentN == 10) return true;
        if (previousN == 10 && currentN == 50) return true;
        if (previousN == 10 && currentN == 100) return true;
        if (previousN == 100 && currentN == 500) return true;
        if (previousN == 100 && currentN == 1000) return true;
        return false;
    }

    private static int romanNumberToInt(String current) {
        int number = 0;
        switch (current){
            case ("I"): number = 1;
                break;
            case ("V"): number = 5;
                break;
            case ("X"): number = 10;
                break;
            case ("L"): number = 50;
                break;
            case ("C"): number = 100;
                break;
            case ("D"): number = 500;
                break;
            case ("M"): number = 1000;
                break;
        }
        return number;
    }
}
