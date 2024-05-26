/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculator;

import core.calculation.Calculation;
import core.calculation.operations.Subtract;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import core.calculation.operations.Add;
import core.calculation.operations.Divide;
import core.calculation.operations.Multiply;
import core.calculation.operations.Power;
import core.controller.operations.ControllerOperations;
import core.controller.utils.Responce;

/**
 *
 * @author edangulo
 */
public class CalculatorFrame extends javax.swing.JFrame {

    private History history;

    /**
     * Creates new form Calculator
     */
    public CalculatorFrame() {
        this.history = new History();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        subtractButton = new javax.swing.JButton();
        multiplyButton = new javax.swing.JButton();
        divideButton = new javax.swing.JButton();
        potencyButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        historyButton = new javax.swing.JButton();
        number1TextField = new javax.swing.JTextField();
        number2TextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        showList = new javax.swing.JList<>();
        resultTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Calculator");

        addButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        subtractButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        subtractButton.setText("Subtract");
        subtractButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractButtonActionPerformed(evt);
            }
        });

        multiplyButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        multiplyButton.setText("Multiply");
        multiplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyButtonActionPerformed(evt);
            }
        });

        divideButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        divideButton.setText("Divide");
        divideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideButtonActionPerformed(evt);
            }
        });

        potencyButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        potencyButton.setText("Potency");
        potencyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potencyButtonActionPerformed(evt);
            }
        });

        clearButton.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        clearButton.setText("Clear numbers");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        historyButton.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        historyButton.setText("Update history");
        historyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyButtonActionPerformed(evt);
            }
        });

        number1TextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        number1TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number1TextFieldActionPerformed(evt);
            }
        });

        number2TextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        number2TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number2TextFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Number 1");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Number 2");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Result");

        showList.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        showList.setEnabled(false);
        jScrollPane1.setViewportView(showList);

        resultTextField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        resultTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        resultTextField.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(number1TextField)
                            .addComponent(number2TextField)
                            .addComponent(resultTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(potencyButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(multiplyButton, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(subtractButton, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(divideButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(historyButton, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(number1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(historyButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(number2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(resultTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addButton)
                            .addComponent(subtractButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(divideButton)
                            .addComponent(multiplyButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(potencyButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearButton))
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        Calculation add = new Add();
        String number1 = number1TextField.getText();
        String number2 = number2TextField.getText();

        Responce responce = ControllerOperations.createAddOperation(number1, number2, "+", this.history);

        if (responce.getStatus() >= 500) {
            JOptionPane.showMessageDialog(null, responce.getMessage(), "Error " + responce.getStatus(), JOptionPane.ERROR_MESSAGE);
        } else if (responce.getStatus() >= 400) {
            JOptionPane.showMessageDialog(null, responce.getMessage(), "Error " + responce.getStatus(), JOptionPane.WARNING_MESSAGE);
        } else {
JOptionPane.showMessageDialog(null, responce.getMessage(), "Response Message", JOptionPane.INFORMATION_MESSAGE);
            double result = add.operationResult(Double.parseDouble(number1), Double.parseDouble(number2));
            resultTextField.setText("" + result);
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void subtractButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractButtonActionPerformed

        Subtract subtract = new Subtract();
        String number1 = number1TextField.getText();
        String number2 = number2TextField.getText();

        Responce responce = ControllerOperations.createSubtractOperation(number1, number2, "-", this.history);

        if (responce.getStatus() >= 500) {
            JOptionPane.showMessageDialog(null, responce.getMessage(), "Error " + responce.getStatus(), JOptionPane.ERROR_MESSAGE);
        } else if (responce.getStatus() >= 400) {
            JOptionPane.showMessageDialog(null, responce.getMessage(), "Error " + responce.getStatus(), JOptionPane.WARNING_MESSAGE);
        } else {
JOptionPane.showMessageDialog(null, responce.getMessage(), "Response Message", JOptionPane.INFORMATION_MESSAGE);
            double result = subtract.operationResult(Double.parseDouble(number1), Double.parseDouble(number2));
            resultTextField.setText("" + result);
        }
    }//GEN-LAST:event_subtractButtonActionPerformed

    private void multiplyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyButtonActionPerformed
        Multiply multiply = new Multiply();
        String number1 = number1TextField.getText();
        String number2 = number2TextField.getText();

        Responce responce = ControllerOperations.createMultiplyOperation(number1, number2, "*", this.history);

        if (responce.getStatus() >= 500) {
            JOptionPane.showMessageDialog(null, responce.getMessage(), "Error " + responce.getStatus(), JOptionPane.ERROR_MESSAGE);
        } else if (responce.getStatus() >= 400) {
            JOptionPane.showMessageDialog(null, responce.getMessage(), "Error " + responce.getStatus(), JOptionPane.WARNING_MESSAGE);
        } else {
JOptionPane.showMessageDialog(null, responce.getMessage(), "Response Message", JOptionPane.INFORMATION_MESSAGE);
            double result = multiply.operationResult(Double.parseDouble(number1), Double.parseDouble(number2));
            resultTextField.setText("" + result);
        }
    }//GEN-LAST:event_multiplyButtonActionPerformed

    private void divideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideButtonActionPerformed
        Divide divide = new Divide();
        String number1 = number1TextField.getText();
        String number2 = number2TextField.getText();

        Responce responce = ControllerOperations.createDivideOperation(number1, number2, "/", this.history);

        if (responce.getStatus() >= 500) {
            JOptionPane.showMessageDialog(null, responce.getMessage(), "Error " + responce.getStatus(), JOptionPane.ERROR_MESSAGE);
        } else if (responce.getStatus() >= 400) {
            JOptionPane.showMessageDialog(null, responce.getMessage(), "Error " + responce.getStatus(), JOptionPane.WARNING_MESSAGE);
        } else {
JOptionPane.showMessageDialog(null, responce.getMessage(), "Response Message", JOptionPane.INFORMATION_MESSAGE);
            double result = divide.operationResult(Double.parseDouble(number1), Double.parseDouble(number2));
            
            resultTextField.setText("" + ControllerOperations.controllerDecimals(result));
        }
    }//GEN-LAST:event_divideButtonActionPerformed

    private void potencyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potencyButtonActionPerformed
        Power pow=new Power();
        String number1 = number1TextField.getText();
        String number2 = number2TextField.getText();

        Responce responce = ControllerOperations.createPowerOperation(number1, number2, "^", this.history);

        if (responce.getStatus() >= 500) {
            JOptionPane.showMessageDialog(null, responce.getMessage(), "Error " + responce.getStatus(), JOptionPane.ERROR_MESSAGE);
        } else if (responce.getStatus() >= 400) {
            JOptionPane.showMessageDialog(null, responce.getMessage(), "Error " + responce.getStatus(), JOptionPane.WARNING_MESSAGE);
        } else {
 JOptionPane.showMessageDialog(null, responce.getMessage(), "Response Message", JOptionPane.INFORMATION_MESSAGE);
            double result = pow.operationResult(Double.parseDouble(number1), Double.parseDouble(number2));
            resultTextField.setText("" + result);
        }
    }//GEN-LAST:event_potencyButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        number1TextField.setText("");
        number2TextField.setText("");
        resultTextField.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void historyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyButtonActionPerformed
        // TODO add your handling code here:
        ArrayList<Operation> operationHistory = this.history.getOperations();
        Collections.reverse(this.history.getOperations());

        DefaultListModel model = new DefaultListModel();
        model.addAll(operationHistory);
        showList.setModel(model);
    }//GEN-LAST:event_historyButtonActionPerformed

    private void number2TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number2TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_number2TextFieldActionPerformed

    private void number1TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number1TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_number1TextFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton divideButton;
    private javax.swing.JButton historyButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton multiplyButton;
    private javax.swing.JTextField number1TextField;
    private javax.swing.JTextField number2TextField;
    private javax.swing.JButton potencyButton;
    private javax.swing.JTextField resultTextField;
    private javax.swing.JList<String> showList;
    private javax.swing.JButton subtractButton;
    // End of variables declaration//GEN-END:variables
}
