package test;

import main.StringCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class StringCalculatorTest {

    // zadanie 1
    @Test
    public void shouldReturnSumIfTwoInts(){
        assertEquals(15, StringCalculator.add("7,8"));
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
        assertEquals(59, StringCalculator.add("21,23\n15"));
//        assertEquals(-331, StringCalculator.add("-557,123,419,-200,-116"));
    }

    // zadanie 3

    @Test
    public void shouldReturnSumIfNewLineSeparator(){

        assertEquals(28, StringCalculator.add("1,2,3,4\n5,6,7"));
//        assertEquals(8, StringCalculator.add("1\n-2\n-13,4\n5,6,7"));
    }

    // zadanie 4
    @Test
    public void shouldReturnSumIfCustomDelimiter(){

        assertEquals(25, StringCalculator.add("//---\n1---2---10---4---8"));

        assertEquals(5, StringCalculator.add("////\n1//2//2"));

    }

    // zadanie 5

    @Test
    public void shouldThrowExceptionIfNegativeValue(){
        String numbers = "15 -13 44";
        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            StringCalculator.add("// \n" + numbers);
        });

        assertEquals("Negatives not allowed! -> " + "-13", exception.getMessage());
    }

    // zadanie 6

    @Test
    public void shouldIgnoreWhenGreaterThan1000(){
        assertEquals(10, StringCalculator.add("1\n2,1001,7"));
        assertEquals(1000, StringCalculator.add("1000,1001"));
    }



}
