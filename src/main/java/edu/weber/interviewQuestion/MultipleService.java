package edu.weber.interviewQuestion;

public class MultipleService {

    // Finish this method.  This method should return the product of two numbers
    // You need to finish this method without using any multiplication operator or function
    public Integer multiply(Integer d1, Integer d2) {
        Integer response = 0;
        boolean returnNegative = false;
        if (d1 == null || d2 == null || d1 == 0 || d2== 0 ) {
            return response;
        }
        Integer lessVal = Math.abs(d1);
        Integer greaterVal = Math.abs(d2);

        if(d2 < d1) {
            lessVal = d2;
            greaterVal = d1;
        }

        if ((d2 < 0 && d1 > 0) || (d1 < 0 && d2 > 0)) {
            returnNegative = true;
        }

        for (int i = 1; i <= lessVal; i++) {
            response = response + greaterVal;
        }

        if(returnNegative) {
            return 0 - response;
        }
        return response;
    }

}
