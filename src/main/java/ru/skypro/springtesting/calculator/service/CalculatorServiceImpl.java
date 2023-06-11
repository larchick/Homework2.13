package ru.skypro.springtesting.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String greeting(){ return "Добро пожаловать в калькулятор!";}


    public Integer plus(Integer num, Integer num2) {
        return num + num2;
    }

    public Integer minus(Integer num, Integer num2) {
        return num - num2;
    }

    public Integer multiply(Integer num, Integer num2) {
        return num * num2;
    }

    public Double divide(Integer num, Integer num2){
        if (num2 == 0){
            throw new IllegalArgumentException();
        }
        return (double) num / num2;
    }
}