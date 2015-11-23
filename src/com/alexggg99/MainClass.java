package com.alexggg99;

/**
 * Created by Alex on 21.11.2015.
 */
public class MainClass {

    public static void main(String[] args){
        System.out.println("Main class");
        CalculatorImpl calc = new CalculatorImpl();
        calc.sum(2147483648, 32);
    }

}
