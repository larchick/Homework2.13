package ru.skypro.springtesting.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.skypro.springtesting.calculator.service.CalculatorService;
import ru.skypro.springtesting.calculator.service.CalculatorServiceImpl;

import java.util.stream.Stream;

public class CalculatorServiceImplParameterizedTest {

    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    public static Stream<Arguments> argumentProviderForCalculator(){
        return Stream.of(
                Arguments.of(100,100),
                Arguments.of(20,5),
                Arguments.of(40,4),
                Arguments.of(66,6)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentProviderForCalculator")
    public void shouldCorrectlyCalculateSum(int num1, int num2) {

        int expectedSum = num1 + num2;


        Integer actualSum = calculatorService.plus(num1, num2);

        Assertions.assertEquals(expectedSum, actualSum);
    }
    @ParameterizedTest
    @MethodSource("argumentProviderForCalculator")
    public void shouldCorrectlyCalculateMinus(int num1, int num2) {

        int expectedSum = num1 - num2;


        Integer actualSum = calculatorService.plus(num1, num2);

        Assertions.assertEquals(expectedSum, actualSum);
    }
    @ParameterizedTest
    @MethodSource("argumentProviderForCalculator")
    public void shouldCorrectlyCalculateMultiply(int num1, int num2) {

        int expectedSum = num1 * num2;


        Integer actualSum = calculatorService.plus(num1, num2);

        Assertions.assertEquals(expectedSum, actualSum);
    }
    @ParameterizedTest
    @MethodSource("argumentProviderForCalculator")
    public void shouldCorrectlyCalculateDivide(int num1, int num2) {

        int expectedSum = num1 / num2;


        Double actualSum = calculatorService.divide(num1, num2);

        Assertions.assertEquals(expectedSum, actualSum);
    }




}
