package com.zipcodewilmington.assessment1.part1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        int sum = 0;
        for (int i : intArray){
            sum += i;
        }
       return sum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        int productSum = 1;
        for (int i = 0; i < intArray.length; i++)
            productSum = productSum * intArray[i];

        return productSum;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        double sumFirst = getSum(intArray);
        return sumFirst / intArray.length;
    }
}
