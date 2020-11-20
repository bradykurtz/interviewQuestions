package edu.weber.interviewQuestion;

import edu.weber.interviewQuestion.roman.RomanNumeralService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class RomanNumeralServiceTest {
    RomanNumeralService romanNumeralService = null;

    @Before
    public void setup() {
        romanNumeralService = new RomanNumeralService();
    }

    @Test
    public void returns_0_when_null() {
        Assert.assertEquals(0, romanNumeralService.convert(null));
    }

    @Test
    public void returns_5() {
        Assert.assertEquals(5, romanNumeralService.convert("V"));
    }

    @Test
    public void returns_19() {
        Assert.assertEquals(19, romanNumeralService.convert("XIX"));
    }

    @Test
    public void returns_91() {
        Assert.assertEquals(91, romanNumeralService.convert("XCI"));
    }
}
