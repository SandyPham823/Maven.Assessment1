package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        char[] reversedString = str.toCharArray();
        int start = 0;
        int end = reversedString.length - 1;
        char temp;
        while (end > start) {
            temp = reversedString[start];
            reversedString[start] = reversedString[end];
            reversedString[end] = temp;
            end--;
            start++;
        }
        return new String(reversedString);
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String firstReverse = reverse(str);
        return camelCase(firstReverse);
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        return str.substring(1, str.length() - 1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        String invertDeez = "";
        for (int i = 0; i < str.length(); i++){
            char thisChar = str.charAt(i);
            if (Character.isUpperCase(thisChar)){
                char currentCharLower = Character.toLowerCase(thisChar);
                invertDeez = invertDeez + currentCharLower;
            }else{
                char currentCharUpper = Character.toUpperCase(thisChar);
                invertDeez = invertDeez + currentCharUpper;
            }
        }
            return invertDeez;
    }
}