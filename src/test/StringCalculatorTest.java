package test;

import main.StringCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class StringCalculatorTest {

    // zadanie 1
    @Test
    public void shouldReturnSumIfTwoInts(){
        assertEquals(1, StringCalculator.add("-7,8"));
    }

    @Test
    public void shouldReturnSumIfOneInt(){
        assertEquals(99, StringCalculator.add("99"));
    }

    @Test
    public void shouldReturnZeroIfEmptyOrNull(){
        assertEquals(0, StringCalculator.add(null));
        assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public void shouldThrowExceptionIfMoreThanTwoInts(){
        assertThrows( Throwable.class, () -> StringCalculator.add("1,2,3"));
    }





}
