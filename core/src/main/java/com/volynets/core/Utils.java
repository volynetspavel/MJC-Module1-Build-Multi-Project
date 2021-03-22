package com.volynets.core;

import com.volynets.util.StringUtils;

/**
 * Defines special utils.
 */
public class Utils {

    /**
     * Tests a list of numbers to be positive or not.
     * @param str - source list of numbers as string.
     * @return true if all numbers are positive.
     */
    public static boolean isAllPositiveNumbers(String... str){
        StringUtils stringUtils = new StringUtils();

        for (int i = 0; i < str.length; i++){
            if (!stringUtils.isPositiveNumber(str[i])){
                return false;
            }
        }
        return true;
    }
}
