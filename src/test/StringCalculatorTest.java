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

//    @Test
//    public void shouldThrowExceptionIfMoreThanTwoInts(){
//        assertThrows( Throwable.class, () -> StringCalculator.add("1,2,3"));
//    }

    // zadanie 2

    @Test
    public void shouldReturnSumIfMultipleInts(){
        assertEquals(59, StringCalculator.add("21,23,15"));
        assertEquals(-331, StringCalculator.add("-557,123,419,-200,-116"));
    }

    // zadanie 3

    @Test
    public void shouldReturnSumIfNewLineSeparator(){

        assertEquals(28, StringCalculator.add("1,2,3,4\n5,6,7"));
        assertEquals(8, StringCalculator.add("1\n-2\n-13,4\n5,6,7"));
    }



}
