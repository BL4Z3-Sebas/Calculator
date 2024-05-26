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
public class Divide implements Calculation{

    public Divide() {
    }

    @Override
    public double operationResult(double number1, double number2) {
      return number1/number2;
    }
    
}
