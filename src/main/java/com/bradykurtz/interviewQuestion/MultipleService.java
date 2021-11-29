package com.bradykurtz.interviewQuestion;

public class MultipleService {

    /**
     * Performs multiplication without multiplication operator or function
     * @param d1
     * @param d2
     * @return
     */

    public Integer multiply(Integer d1, Integer d2) {
        int product = 0;
        int index = 0;
        int sumNumber = 0;
        boolean oneIsNegative = false;

        // Check for null
        if(d1 != null && d2 != null) {

            // Check if one number is less than 0
            if((d1 < 0 && d2 > 0)) {
                d1 = -d1;
                oneIsNegative = true;
            }
            if((d1 > 0 && d2 < 0)) {
                d2 = -d2;
                oneIsNegative = true;
            }

            // Check if both less than 0
            else if(d1 < 0 && d2 < 0) {
                d1 = -d1;
                d2 = -d2;
            }

            // Set the lower to index for performance
            int[] values = setIndexAndNumSum(d1, d2);

            // Perform the productization
            for (int i = 0; i < values[0]; i++) {
                product += values[1];
            }
            if(oneIsNegative) {
                return -product;
            }
            return product;
        }
        else {
            return 0;
        }
    }


    /**
     * Sets the index to the lower of d1 and d2 for performance
     * @param d1
     * @param d2
     * @return
     */

    public int[] setIndexAndNumSum(Integer d1, Integer d2) {

        if(d1 != null && d2 != null) {
            int[] values = new int[2];
            if (d1 < d2) {
                values[0] = d1;
                values[1] = d2;
            } else {
                values[0] = d2;
                values[1] = d1;
            }
            return values;
        }
        else
            return null;
    }
}
