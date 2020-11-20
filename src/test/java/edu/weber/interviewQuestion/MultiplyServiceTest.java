package edu.weber.interviewQuestion;

import java.time.Duration;
import java.time.Instant;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MultiplyServiceTest {

    MultipleService multipleService = null;

    @Before
    public void setup() {
        multipleService = new MultipleService();
    }

    @Test
    public void returns_0_when_first_parameter_is_null() {
        Assert.assertEquals(0, multipleService.multiply(null, 5), 0);
    }

    @Test
    public void returns_0_when_second_parameter_is_null() {
        Assert.assertEquals(0, multipleService.multiply(5, null), 0);
    }

    @Test
    public void returns_0_when_both_parameters_are_null() {
        Assert.assertEquals(0, multipleService.multiply(null, null), 0);
    }

    @Test
    public void five_times_five_is_25() {
        Assert.assertEquals(25, multipleService.multiply(5, 5), 0);
    }

    @Test
    public void five_times_zero_is_0() {
        Assert.assertEquals(0, multipleService.multiply(5, 0), 0);
    }

    @Test
    public void zero_times_5_is_0() {
        Assert.assertEquals(0, multipleService.multiply(0, 5), 0);
    }

    @Test
    public void negative_five_times_five_is_negative_25() {
        Assert.assertEquals(-25, multipleService.multiply(-5, 5), 0);
    }

    @Test
    public void negative_five_times_negative_five_is_positive_25() {
        Assert.assertEquals(25, multipleService.multiply(-5, -5), 0);
    }

    @Test
    public void test_loop_is_efficient() {
        Instant start = Instant.now();
        multipleService.multiply(5, 100000000);
        Instant finish = Instant.now();
        long secondParam = Duration.between(start, finish).toMillis();
        start = Instant.now();
        multipleService.multiply(100000000, 5);
        finish = Instant.now();
        long firstParam = Duration.between(start, finish).toMillis();
        Assert.assertEquals(secondParam, firstParam, 0);
    }



}
