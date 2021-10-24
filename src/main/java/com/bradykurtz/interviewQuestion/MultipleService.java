package com.bradykurtz.interviewQuestion;

import java.util.Objects;

public class MultipleService {

    // Finish this method.  This method should return the product of two numbers
    // You need to finish this method without using any multiplication operator or function
    public Integer multiply(Integer d1, Integer d2) {

        Integer product = 0;

        if (isInputNullOrZero(d1) || isInputNullOrZero(d2)){
            return product;
        }

        Integer looper = d1;
        Integer adder = d2;

        if (d1 > d2){
            looper = d2;
            adder = d1;
        }

        product = multiplyAbsoluteValues(Math.abs(looper), Math.abs(adder));

        if (isResultNegative(d1, d2)){
            product = 0 - product;
        }

        return product;
    }

    private Integer multiplyAbsoluteValues(Integer looper, Integer adder){
        Integer absoluteProduct = 0;
        for (int i = 0; i < looper; i++){
            absoluteProduct += adder;
        }
        return absoluteProduct;
    }

    private boolean isInputNullOrZero(Integer input){
        boolean isNullOrZero = false;
        if(Objects.isNull(input) || input.intValue() == 0){
            isNullOrZero = true;
        }
        return isNullOrZero;
    }

    private boolean isResultNegative(Integer d1, Integer d2){
        boolean isResultNegative = false;
        if(d1.intValue() < 0 ^ d2.intValue() < 0){
            isResultNegative = true;
        }
        return isResultNegative;
    }

}
