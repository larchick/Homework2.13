package ru.skypro.springtesting.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.skypro.springtesting.calculator.service.CalculatorService;
import ru.skypro.springtesting.calculator.service.CalculatorServiceImpl;

public class CalculatorServiceImplTest {

    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    public void shouldCorrectlyCalculateSum() {
        int num1 = 10;
        int num2 = 5;
        int expectedSum = num1 + num2;

        Integer actualSum = calculatorService.plus(num1, num2);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldCorrectlyCalculateSumTwo() {
        int num1 = 100;
        int num2 = 2;
        int expectedSum = num1 + num2;

        Integer actualSum = calculatorService.plus(num1, num2);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldCorrectlyCalculateMinus() {
        int num1 = 1000;
        int num2 = 50;
        int expectedSum = num1 - num2;

        Integer actualSum = calculatorService.minus(num1, num2);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldCorrectlyCalculateMinusTwo() {
        int num1 = 700;
        int num2 = 10;
        int expectedSum = num1 - num2;

        Integer actualSum = calculatorService.minus(num1, num2);

        Assertions.assertEquals(expectedSum, actualSum);
    }
    @Test
    public void shouldCorrectlyCalculateMultiply() {
        int num1 = 20;
        int num2 = 10;
        int expectedSum = num1 * num2;

        Integer actualSum = calculatorService.multiply(num1, num2);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldCorrectlyCalculateMultiplyTwo() {
        int num1 = 1000;
        int num2 = 10;
        int expectedSum = num1 * num2;

        Integer actualSum = calculatorService.multiply(num1, num2);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldCorrectlyCalculateDivide(){
        int num1 = 500;
        int num2 = 5;
        int expectedSum = num1 / num2;

        Double actualSum = calculatorService.divide(num1, num2);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldCorrectlyCalculateDivideTwo(){
        int num1 = 50010;
        int num2 = 2;
        int expectedSum = num1 / num2;

        Double actualSum = calculatorService.divide(num1, num2);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldThrowExceptionWhenSecondNumberIsZero() {

        int num1 = 10;
        int num2 = 5;



        Assertions.assertThrows(IllegalAccessException.class, () -> {
            calculatorService.divide(num1, num2);
        });

    }


}
