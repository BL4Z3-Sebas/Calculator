/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.calculation.operations;

import core.calculation.Calculation;

/**
 *
 * @author cotes
 */
public class Power implements Calculation{

    public Power() {
    }

    @Override
    public double operationResult(double number1, double number2) {
      return Math.pow(number1, number2);
    }
    
}
