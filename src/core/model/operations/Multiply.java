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
public class Multiply implements Calculation{

    public Multiply() {
    }

    @Override
    public double operationResult(double number1, double number2) {
    return number1*number2;
    }
    
}
