/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Calculator3;

/**
 *
 * @author Abigail Oseni
 */
public class Calculator3 extends javax.swing.JFrame {

    /**
     * Creates new form Calculator3
     */
    
    double NumEnter1;
    double NumEnter2;
    double Result;
    String op;
    public Calculator3() {
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

        jtxtResult = new javax.swing.JTextField();
        jbtnCE = new javax.swing.JButton();
        jbtnBS = new javax.swing.JButton();
        jbtnC = new javax.swing.JButton();
        jbtnPM = new javax.swing.JButton();
        jbtnDigit7 = new javax.swing.JButton();
        jbtnDigit8 = new javax.swing.JButton();
        jbtnDigit9 = new javax.swing.JButton();
        jbtnPlus = new javax.swing.JButton();
        jbtnDigit4 = new javax.swing.JButton();
        jbtnDigit5 = new javax.swing.JButton();
        jbtnDigit6 = new javax.swing.JButton();
        jbtnSubtract = new javax.swing.JButton();
        jbtnDigit3 = new javax.swing.JButton();
        jbtnDigit2 = new javax.swing.JButton();
        jbtnDigit1 = new javax.swing.JButton();
        jbtnDigitMultiplication = new javax.swing.JButton();
        jbtnDigit0 = new javax.swing.JButton();
        jbtnDot = new javax.swing.JButton();
        jbtnEqual = new javax.swing.JButton();
        jbtnDivision = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtResult.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtResult.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jtxtResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 320, 50));

        jbtnCE.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnCE.setText("CE");
        jbtnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCEActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnCE, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 74, 60));

        jbtnBS.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnBS.setText("⌫");
        jbtnBS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBSActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBS, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 74, 60));

        jbtnC.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnC.setText("C");
        jbtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 74, 60));

        jbtnPM.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnPM.setText("+/-");
        jbtnPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPMActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, 60));

        jbtnDigit7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit7.setText("7");
        jbtnDigit7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit7ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 74, 60));

        jbtnDigit8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit8.setText("8");
        jbtnDigit8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit8ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 74, 60));

        jbtnDigit9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit9.setText("9");
        jbtnDigit9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit9ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 74, 60));

        jbtnPlus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnPlus.setText("+");
        jbtnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPlusActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 74, 60));

        jbtnDigit4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit4.setText("4");
        jbtnDigit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit4ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 74, 60));

        jbtnDigit5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit5.setText("5");
        jbtnDigit5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit5ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 74, 60));

        jbtnDigit6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit6.setText("6");
        jbtnDigit6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit6ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 74, 60));

        jbtnSubtract.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnSubtract.setText("-");
        jbtnSubtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSubtractActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnSubtract, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 74, 60));

        jbtnDigit3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit3.setText("3");
        jbtnDigit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit3ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 74, 60));

        jbtnDigit2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit2.setText("2");
        jbtnDigit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 74, 60));

        jbtnDigit1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit1.setText("1");
        jbtnDigit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 74, 60));

        jbtnDigitMultiplication.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigitMultiplication.setText("*");
        jbtnDigitMultiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigitMultiplicationActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigitMultiplication, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 74, 60));

        jbtnDigit0.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit0.setText("0");
        jbtnDigit0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit0ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 74, 60));

        jbtnDot.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDot.setText(".");
        jbtnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDotActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDot, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 74, 60));

        jbtnEqual.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnEqual.setText("=");
        jbtnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEqualActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnEqual, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 74, 60));

        jbtnDivision.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDivision.setText("/");
        jbtnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDivisionActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 74, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnDigit7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit7ActionPerformed
        // TODO add your handling code here:
        EnterNumbers("7");
    }//GEN-LAST:event_jbtnDigit7ActionPerformed

    private void jbtnDigit8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit8ActionPerformed
        // TODO add your handling code here:
        EnterNumbers("8");
    }//GEN-LAST:event_jbtnDigit8ActionPerformed

    private void jbtnDigit9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit9ActionPerformed
        // TODO add your handling code here:
        EnterNumbers("9");
    }//GEN-LAST:event_jbtnDigit9ActionPerformed

    private void jbtnDigit6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit6ActionPerformed
        // TODO add your handling code here:
        EnterNumbers("6");
    }//GEN-LAST:event_jbtnDigit6ActionPerformed

    private void jbtnDigit5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit5ActionPerformed
        // TODO add your handling code here:
        EnterNumbers("5");
    }//GEN-LAST:event_jbtnDigit5ActionPerformed

    private void jbtnDigit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit4ActionPerformed
        // TODO add your handling code here:
        EnterNumbers("4");
    }//GEN-LAST:event_jbtnDigit4ActionPerformed

    private void jbtnDigit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit3ActionPerformed
        // TODO add your handling code here:
        EnterNumbers("3");
    }//GEN-LAST:event_jbtnDigit3ActionPerformed

    private void jbtnDigit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit2ActionPerformed
        // TODO add your handling code here:
        EnterNumbers("2");
    }//GEN-LAST:event_jbtnDigit2ActionPerformed

    private void jbtnDigit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit1ActionPerformed
        // TODO add your handling code here:
        EnterNumbers("1");
    }//GEN-LAST:event_jbtnDigit1ActionPerformed

    private void jbtnDigit0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit0ActionPerformed
        // TODO add your handling code here:
        EnterNumbers("0");
    }//GEN-LAST:event_jbtnDigit0ActionPerformed

    private void jbtnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDivisionActionPerformed
        // TODO add your handling code here:
        NumEnter1 = Double.parseDouble(jtxtResult.getText());
        jtxtResult.setText("");
        op = "/";
    }//GEN-LAST:event_jbtnDivisionActionPerformed

    private void jbtnDigitMultiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigitMultiplicationActionPerformed
        // TODO add your handling code here:
        NumEnter1 = Double.parseDouble(jtxtResult.getText());
        jtxtResult.setText("");
        op = "*";
    }//GEN-LAST:event_jbtnDigitMultiplicationActionPerformed

    private void jbtnSubtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSubtractActionPerformed
        // TODO add your handling code here:
        NumEnter1 = Double.parseDouble(jtxtResult.getText());
        jtxtResult.setText("");
        op = "-";
    }//GEN-LAST:event_jbtnSubtractActionPerformed

    private void jbtnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPlusActionPerformed
        // TODO add your handling code here:
        NumEnter1 = Double.parseDouble(jtxtResult.getText());
        jtxtResult.setText("");
        op = "+";
    }//GEN-LAST:event_jbtnPlusActionPerformed

    private void jbtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCActionPerformed
        // TODO add your handling code here:
        jtxtResult.setText("");
    }//GEN-LAST:event_jbtnCActionPerformed

    private void jbtnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCEActionPerformed
        // TODO add your handling code here:
        jtxtResult.setText("");
        
        String Fn, Sn;
        
        Fn = String.valueOf(NumEnter1);
        Sn = String.valueOf(NumEnter2);
        
        Fn = "";
        Sn = "";
    }//GEN-LAST:event_jbtnCEActionPerformed

    private void jbtnPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPMActionPerformed
        // TODO add your handling code here:
        double nums = Double.parseDouble(String.valueOf(jtxtResult.getText()));
        nums = nums * (-1);
        jtxtResult.setText(String.valueOf(nums));
        
    }//GEN-LAST:event_jbtnPMActionPerformed

    private void jbtnBSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBSActionPerformed
        // TODO add your handling code here:
        String backSp = null;
        
        if (jtxtResult.getText().length() > 0) {
            StringBuilder sb = new StringBuilder(jtxtResult.getText());
            sb.deleteCharAt(jtxtResult.getText() .length() - 1);
            backSp = sb.toString();
            jtxtResult.setText(backSp);
        }
    }//GEN-LAST:event_jbtnBSActionPerformed

    private void jbtnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDotActionPerformed
        // TODO add your handling code here:
        if (! jtxtResult.getText().contains("."))
        {
            jtxtResult.setText(jtxtResult.getText() +jbtnDot.getText());
        }
    }//GEN-LAST:event_jbtnDotActionPerformed

    private void jbtnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEqualActionPerformed
        // TODO add your handling code here:
        NumEnter2 = Double.parseDouble(jtxtResult.getText());
        if (op == "+")
        {
            Result = NumEnter1 + NumEnter2;
            jtxtResult.setText(String.valueOf(Result));
        }
        else if (op == "-")
        {
            Result = NumEnter1 - NumEnter2;
            jtxtResult.setText(String.valueOf(Result));
        }
        else if (op == "*")
        {
            Result = NumEnter1 * NumEnter2;
            jtxtResult.setText(String.valueOf(Result));
        }
        else if (op == "/")
        {
            Result = NumEnter1 / NumEnter2;
            jtxtResult.setText(String.valueOf(Result));
        }
    }//GEN-LAST:event_jbtnEqualActionPerformed

    /**
     * @param args the command line arguments
     */
    
    private void EnterNumbers(String q)
    {
        String Nums = jtxtResult.getText() + q;
         jtxtResult.setText(Nums);
    }
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
            java.util.logging.Logger.getLogger(Calculator3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnBS;
    private javax.swing.JButton jbtnC;
    private javax.swing.JButton jbtnCE;
    private javax.swing.JButton jbtnDigit0;
    private javax.swing.JButton jbtnDigit1;
    private javax.swing.JButton jbtnDigit2;
    private javax.swing.JButton jbtnDigit3;
    private javax.swing.JButton jbtnDigit4;
    private javax.swing.JButton jbtnDigit5;
    private javax.swing.JButton jbtnDigit6;
    private javax.swing.JButton jbtnDigit7;
    private javax.swing.JButton jbtnDigit8;
    private javax.swing.JButton jbtnDigit9;
    private javax.swing.JButton jbtnDigitMultiplication;
    private javax.swing.JButton jbtnDivision;
    private javax.swing.JButton jbtnDot;
    private javax.swing.JButton jbtnEqual;
    private javax.swing.JButton jbtnPM;
    private javax.swing.JButton jbtnPlus;
    private javax.swing.JButton jbtnSubtract;
    private javax.swing.JTextField jtxtResult;
    // End of variables declaration//GEN-END:variables
}
