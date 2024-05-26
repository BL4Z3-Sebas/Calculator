/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package core.controller.operations;

import core.model.History;
import core.model.Operation;
import core.model.operations.Add;
import core.model.operations.Divide;
import core.model.operations.Multiply;
import core.model.operations.Power;
import core.model.operations.Subtract;
import core.controller.utils.Responce;
import core.controller.utils.Status;

/**
 *
 * @author cotes
 */
public class ControllerOperations {

    public static Responce createAddOperation(String number1, String number2, String operator, History history) {

        try {
            double num1, num2;
            Add add = new Add();
            try {
                int position1 = number1.indexOf(".");
                String compare1 = number1.substring(position1 + 1);
                if (compare1.length() > 3&&position1!=-1) {

                    return new Responce("The Number 1 must have only 3 decimals", Status.BAD_REQUEST);
                }

                if (number1.equals("")) {
                    return new Responce("The Number 1 is empty", Status.BAD_REQUEST);
                }

                num1 = Double.parseDouble(number1);
            } catch (NumberFormatException ex) {

                return new Responce("Number 1 must be numeric", Status.BAD_REQUEST);

            }
            try {
                int position2 = number2.indexOf(".");
                String compare2 = number2.substring(position2 + 1);
                if (compare2.length() > 3&&position2!=-1) {

                    return new Responce("The Number 2 must have only 3 decimals", Status.BAD_REQUEST);
                }

                if (number2.equals("")) {
                    return new Responce("The Number 2 is empty", Status.BAD_REQUEST);
                }
                num2 = Double.parseDouble(number2);
            } catch (NumberFormatException ex) {
                return new Responce("Number 2 must be numeric", Status.BAD_REQUEST);
            }
            if (operator.equals("")) {
                return new Responce("The operator must be not empty", Status.BAD_REQUEST);
            }
            history.addOperation(new Operation(num1, num2, operator, controllerDecimals(add.operationResult(num1, num2))));

            return new Responce("Operation is successfully ", Status.OK);
        } catch (Exception er) {
            return new Responce("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }

    }

    public static Responce createSubtractOperation(String number1, String number2, String operator, History history) {

        try {
            double num1, num2;
            Subtract sub = new Subtract();
            try {
                int position1 = number1.indexOf(".");
                String compare1 = number1.substring(position1 + 1);
                if (compare1.length() > 3&&position1!=-1) {

                    return new Responce("The Number 1 must have only 3 decimals", Status.BAD_REQUEST);
                }

                if (number1.equals("")) {
                    return new Responce("The Number 1 is empty", Status.BAD_REQUEST);
                }

                num1 = Double.parseDouble(number1);
            } catch (NumberFormatException ex) {

                return new Responce("Number 1 must be numeric", Status.BAD_REQUEST);

            }
            try {
                int position2 = number2.indexOf(".");
                String compare2 = number2.substring(position2 + 1);
                if (compare2.length() > 3&&position2!=-1) {

                    return new Responce("The Number 2 must have only 3 decimals", Status.BAD_REQUEST);
                }

                if (number2.equals("")) {
                    return new Responce("The Number 2 is empty", Status.BAD_REQUEST);
                }
                num2 = Double.parseDouble(number2);
            } catch (NumberFormatException ex) {
                return new Responce("Number 2 must be numeric", Status.BAD_REQUEST);
            }

            if (operator.equals("")) {
                return new Responce("The operator must be not empty", Status.BAD_REQUEST);
            }

            history.addOperation(new Operation(num1, num2, operator, controllerDecimals(sub.operationResult(num1, num2))));

            return new Responce("Operation is successfully ", Status.OK);
        } catch (Exception er) {
            return new Responce("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }

    }

    public static Responce createMultiplyOperation(String number1, String number2, String operator, History history) {

        try {
            double num1, num2;
            Multiply multi = new Multiply();

            try {
                int position1 = number1.indexOf(".");
                String compare1 = number1.substring(position1 + 1);
                if (compare1.length() > 3&&position1!=-1) {

                    return new Responce("The Number 1 must have only 3 decimals", Status.BAD_REQUEST);
                }

                if (number1.equals("")) {
                    return new Responce("The Number 1 is empty", Status.BAD_REQUEST);
                }

                num1 = Double.parseDouble(number1);
            } catch (NumberFormatException ex) {

                return new Responce("Number 1 must be numeric", Status.BAD_REQUEST);

            }
            try {
                int position2 = number2.indexOf(".");
                String compare2 = number2.substring(position2 + 1);
                if (compare2.length() > 3&&position2!=-1) {

                    return new Responce("The Number 2 must have only  3 decimals", Status.BAD_REQUEST);
                }

                if (number2.equals("")) {
                    return new Responce("The Number 2 is empty", Status.BAD_REQUEST);
                }
                num2 = Double.parseDouble(number2);
            } catch (NumberFormatException ex) {
                return new Responce("Number 2 must be numeric", Status.BAD_REQUEST);
            }
            if (operator.equals("")) {
                return new Responce("The operator must be not empty", Status.BAD_REQUEST);
            }
            
            history.addOperation(new Operation(num1, num2, operator, controllerDecimals(multi.operationResult(num1, num2))));

            return new Responce("Operation is successfully ", Status.OK);
        } catch (Exception er) {
            return new Responce("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }

    }

    public static Responce createDivideOperation(String number1, String number2, String operator, History history) {

        try {
            double num1, num2;
            Divide div = new Divide();
           try {
                int position1 = number1.indexOf(".");
               
                String compare1 = number1.substring(position1 + 1);
                if (compare1.length() > 3&&position1!=-1) {

                    return new Responce("The Number 1 must have 3 decimals", Status.BAD_REQUEST);
                }

                if (number1.equals("")) {
                    return new Responce("The Number 1 only is empty", Status.BAD_REQUEST);
                }

                num1 = Double.parseDouble(number1);
            } catch (NumberFormatException ex) {

                return new Responce("Number 1 must be numeric", Status.BAD_REQUEST);

            }
            //verificacion del segundo numero
            if (number2.equals("0")) {
                return new Responce("Syntax Error:\n\nThe number 2 can't be 0", Status.BAD_REQUEST);
            }
            int position2 = number2.indexOf(".");
            System.out.println(position2);
                String compare2 = number2.substring(position2 + 1);
                if (compare2.length() > 3&&position2!=-1) {

                    return new Responce("The Number 2 must have only 3 decimals", Status.BAD_REQUEST);
                }
            try {
                

                if (number2.equals("")) {
                    return new Responce("The Number 2 is empty", Status.BAD_REQUEST);
                }
                num2 = Double.parseDouble(number2);
            } catch (NumberFormatException ex) {
                return new Responce("Number 2 must be numeric", Status.BAD_REQUEST);
            }
           

            history.addOperation(new Operation(num1, num2, operator, controllerDecimals(div.operationResult(num1, num2))));

            return new Responce("Operation is successfully ", Status.OK);
        } catch (Exception er) {
            return new Responce("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }

    }

    public static Responce createPowerOperation(String number1, String number2, String operator, History history) {

        try {
            double num1, num2;
            Power pow = new Power();

            try {
                //verificacion del primer numero
                int position1 = number1.indexOf(".");
                System.out.println(position1);
                String compare1 = number1.substring(position1 + 1);
                if (compare1.length() > 3&&position1!=-1) {

                    return new Responce("The Number 1 must have only 3 decimals", Status.BAD_REQUEST);
                }

                if (number1.equals("")) {
                    return new Responce("The Number 1 is empty", Status.BAD_REQUEST);
                }

                num1 = Double.parseDouble(number1);
            } catch (NumberFormatException ex) {

                return new Responce("Number 1 must be numeric", Status.BAD_REQUEST);

            }
            try {
                //verificacion del segundo numero
                int position2 = number2.indexOf(".");
                String compare2 = number2.substring(position2 + 1);
                if (compare2.length() > 3&&position2!=-1) {

                    return new Responce("The Number 2 must have only 3 decimals", Status.BAD_REQUEST);
                }

                if (number2.equals("")) {
                    return new Responce("The Number 2 is empty", Status.BAD_REQUEST);
                }
                num2 = Double.parseDouble(number2);
            } catch (NumberFormatException ex) {
                return new Responce("Number 2 must be numeric", Status.BAD_REQUEST);
            }

            if (operator.equals("")) {
                return new Responce("The operator must be not empty", Status.BAD_REQUEST);
            }
            history.addOperation(new Operation(num1, num2, operator, controllerDecimals(pow.operationResult(num1, num2))));

            return new Responce("Operation is successfully ", Status.OK);
        } catch (Exception er) {
            return new Responce("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }

    }

    public static double controllerDecimals(double result) {
        //controlador para validar todos los decimales
        
        String ShowString = "";
        String FinalResult = "" + result;
      
        int desimals = FinalResult.indexOf(".");
        
        if (FinalResult.substring(desimals + 1).length() > 3) {
            ShowString = FinalResult.substring(0, desimals) + FinalResult.substring(desimals, 5);
        } else {

            ShowString = FinalResult;
            
        }

        return Double.parseDouble(ShowString);

    }

}
