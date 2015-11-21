package com.alexggg99;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.text.DecimalFormat;

/**
 * Created by Alex on 21.11.2015.
 */

@WebService(
        portName = "CalculatorPort",
        serviceName = "CalculatorService",
        targetNamespace = "http://alexggg99.com/wsdl")
public class CalculatorImpl implements Calculator {

    SaveToDB saver = new SaveToDB();

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
        DecimalFormat df = new DecimalFormat("#.##");
        input = Double.valueOf(df.format(input));
        saver.save(input);
        return input;
    }

}
