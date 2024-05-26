/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.controller.history;

import core.model.Operation;
import core.controller.utils.Responce;
import core.controller.utils.Status;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;

/**
 * >0
 *
 * @author cotes
 */
public class ControllerHistory {
//Controllador para verificar si la lista de History esta vacia
    public static Responce UpdateHistory(ArrayList<Operation> operation) {
        try {
            if (operation.isEmpty()) {
                return new Responce("The historial is empty", Status.BAD_REQUEST);
            }

            return new Responce("Operation is successfully ", Status.OK);
        } catch (Exception ex) {
            return new Responce("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }

    }
//Controlador para mostrar la el History en el frame
    public static DefaultListModel showTheList(ArrayList<Operation> operation) {
        Collections.reverse(operation);
        DefaultListModel ListModel = new DefaultListModel();
        ListModel.addAll(operation);
        return ListModel;
    }
}
