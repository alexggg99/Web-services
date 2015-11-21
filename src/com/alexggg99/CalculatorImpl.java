package com.alexggg99;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.text.DecimalFormat;

/**
 * Created by Alex on 21.11.2015.
 */

@WebService(name = "calculator", targetNamespace = "alexggg99")
public class CalculatorImpl implements Calculator {

    @Override
    @WebMethod
    public double Multiplication(double[] args) {
        double result = 0.0;
        for(double num : args){
            result *= num;
        }
        return round(result);
    }

    @Override
    @WebMethod
    public double Addition(double[] args) {
        double result = 0.0;
        for(double num : args){
            result += num;
        }
        return round(result);
    }

    private double round(double input){
        double time = 200.3456;
        DecimalFormat df = new DecimalFormat("#.##");
        time = Double.valueOf(df.format(time));
        return time;
    }

}
