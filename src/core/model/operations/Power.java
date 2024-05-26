/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.model.operations;

import core.model.calculation.Calculation;

/**
 *
 * @author cotes
 */
//La clase  cumple el principo de Single Responsibilit
public class Power implements Calculation{

    public Power() {
    }

    @Override
    public double operationResult(double number1, double number2) {
      return Math.pow(number1, number2);
    }
    
}
