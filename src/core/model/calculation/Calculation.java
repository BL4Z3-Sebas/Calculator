/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package core.model.calculation;

/**
 *
 * @author cotes
 */

//Esta interfas tiene la funcion de implemetar el metodo de operacionResult
//a todas las clases que la implentan, cumpliendo el principio de Interface Segregatio,el 
//principio de Open-Closed y el principio de Dependency Inversio para cada clase.
public interface Calculation {
    
    
    public abstract double operationResult(double number1,double number2);
}
