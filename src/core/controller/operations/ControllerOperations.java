/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package core.controller.operations;

import core.controller.utils.Responce;

/**
 *
 * @author cotes
 */
public interface ControllerOperations {
   
    
    public abstract Responce createOperation(String number1,String number2,String operator);
}
