package com.bradykurtz.interviewQuestion.roman;

public enum RomanNumeral {

    I(1),
    V(5),
    X(10),
    L(50),
    C(100),
    D(500),
    M(1000);
    
    private Integer value;

    RomanNumeral(Integer value) {
        this.value = value;
    }
    
    public static RomanNumeral getRomanNumeral(String value) {
        RomanNumeral romanNumeral = null;
        for (RomanNumeral rn : RomanNumeral.values()) {
            if (rn.name().equalsIgnoreCase(value)) {
                romanNumeral = rn;
            }
        }
        return romanNumeral;
    }

    public Integer getValue() {
        return value;
    }
}
