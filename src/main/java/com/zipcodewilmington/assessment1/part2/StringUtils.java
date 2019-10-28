package com.zipcodewilmington.assessment1.part2;

/**
 * Created by leon on 2/16/18.
 */
public class StringUtils {

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence, return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence) {
        String[] allWords = sentence.split("\\s+");
        for (int i = 0; i < allWords.length; i++) {
            allWords[i] = allWords[i].replaceAll("[^\\w]", "");
        }
        return allWords;
    }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence
     */
    public static String getFirstWord(String sentence) {
        String arr[] = sentence.split(" ", 2);
        return arr[0];
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {
        String firstWord = getFirstWord(sentence);
        char[] firstWordReverse = (firstWord.toCharArray());
        int start = 0;
        int end = firstWordReverse.length - 1;
        char temp;
        while (end > start) {
            temp = firstWordReverse[start];
            firstWordReverse[start] = firstWordReverse[end];
            firstWordReverse[end] = temp;
            end--;
            start++;
        }
        return new String(firstWordReverse);

    }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order and the first character capitalized
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {
        String reverseFirstWord = reverseFirstWord(sentence);
        return reverseFirstWord.substring(0, 1).toUpperCase() + reverseFirstWord.substring(1);
    }


    /**
     * @param str string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {
        String ch = "";
        str = str.substring(0, index) + ch + str.substring(index + 1);
        return str;
    }

}
