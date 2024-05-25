/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.controller.operations;

import core.controller.utils.Responce;
import core.controller.utils.Status;

/**
 *
 * @author cotes
 */
public class ControllerAdd implements ControllerOperations {

    @Override
    public Responce createOperation(String number1, String number2, String operator) {

         try {
            double num1, num2;
            try {
                num1 = Double.parseDouble(number1);
            } catch (NumberFormatException ex) {
                return new Responce("Number 1 must be numeric", Status.BAD_REQUEST);

            }
            try {
                num2 = Double.parseDouble(number1);
            } catch (NumberFormatException ex) {
                return new Responce("Number 2 must be numeric", Status.BAD_REQUEST);

            }
            if (operator.equals("")) {
                return new Responce("The operator must be not empty", Status.BAD_REQUEST);
            }
            
            
        } catch (Exception er) {
            return new Responce("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
         
        return null;
    }

}
