package edu.weber.interviewQuestion;

import edu.weber.interviewQuestion.roman.RomanNumeralService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class RomanNumeralServiceTest {
    RomanNumeralService romanNumeralService = null;

    @BeforeEach
    public void setup() {
        romanNumeralService = new RomanNumeralService();
    }

    @Test
    public void returns_0_when_null() {
        assertEquals(0, romanNumeralService.convert(null));
    }

    @Test
    public void returns_5() {
        assertEquals(5, romanNumeralService.convert("V"));
    }

    @Test
    public void returns_19() {
        assertEquals(19, romanNumeralService.convert("XIX"));
    }

    @Test
    public void returns_91() {
        assertEquals(91, romanNumeralService.convert("XCI"));
    }
}
