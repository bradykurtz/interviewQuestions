package com.bradykurtz.interviewQuestion.roman;

public class RomanNumeralService {

    /*
    Adding Roman Numerals Rule
    if current number is less than the next number you subtract
    else if number is equal or greater you add
    Example: IV = 4
    Example: XIX = 19
     */

    /**
     * Converts a Roman numeral to an integer value
     * @param romanNumeral
     * @return
     */

    public int convert(String romanNumeral) {
        if(romanNumeral != null) {
            int result = 0;
            for(int i = 0; i < romanNumeral.length(); i++) {
                char numeral = romanNumeral.charAt(i);
                int number = RomanNumeral.getRomanNumeral(Character.toString(numeral)).getValue();
                if((i + 1) < romanNumeral.length()) {
                    char nextNumeral = romanNumeral.charAt(i + 1);
                    int nextNumber = RomanNumeral.getRomanNumeral(Character.toString(nextNumeral)).getValue();
                    if (nextNumber > number) {
                        result += nextNumber - number;
                        i++;
                    } else {
                        result += number;
                    }
                }
                else {
                    result += number;
                }
            }
            return result;
        }
        else {
            return 0;
        }
    }
}
