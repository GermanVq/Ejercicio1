/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucion;

import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmdcalcular = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtnumerodos = new javax.swing.JTextField();
        txtnumerotres = new javax.swing.JTextField();
        txtnumerouno = new javax.swing.JTextField();
        txtresultadodos = new javax.swing.JTextField();
        txtresultadotres = new javax.swing.JTextField();
        txtresultadouno = new javax.swing.JTextField();
        cmdborrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Inversionista 1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel2.setText("Inversionista 2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel3.setText("Inversionista 3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        cmdcalcular.setText("Calcular");
        cmdcalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdcalcularActionPerformed(evt);
            }
        });
        getContentPane().add(cmdcalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("PORCENTAJE DE INVERSIONISTAS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 24, 250, 30));

        jLabel5.setText("%");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 20, -1));

        jLabel6.setText("%");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 20, -1));

        jLabel7.setText("%");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 20, -1));

        txtnumerodos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumerodosKeyTyped(evt);
            }
        });
        getContentPane().add(txtnumerodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 70, 30));

        txtnumerotres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumerotresKeyTyped(evt);
            }
        });
        getContentPane().add(txtnumerotres, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 70, 30));

        txtnumerouno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumerounoKeyTyped(evt);
            }
        });
        getContentPane().add(txtnumerouno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 70, 30));

        txtresultadodos.setEditable(false);
        getContentPane().add(txtresultadodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 50, 30));

        txtresultadotres.setEditable(false);
        getContentPane().add(txtresultadotres, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 50, 30));

        txtresultadouno.setEditable(false);
        getContentPane().add(txtresultadouno, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 50, 30));

        cmdborrar.setText("Borrar");
        cmdborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdborrarActionPerformed(evt);
            }
        });
        getContentPane().add(cmdborrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdcalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdcalcularActionPerformed
      double n1,n2,n3,resultadouno,resultadodos,resultadotres,total;
      String resuno,resdos,restres;
      
      if(txtnumerouno.getText().trim().isEmpty()){
         JOptionPane.showMessageDialog(this,"Digite la cantidad invertida por inversionista  uno","Error", JOptionPane.ERROR_MESSAGE);
         txtnumerouno.requestFocusInWindow();
     }else if(txtnumerodos.getText().trim().isEmpty()){
         JOptionPane.showMessageDialog(this,"Digite la cantidad invertida por inversionista  dos","Error", JOptionPane.ERROR_MESSAGE);
         txtnumerodos.requestFocusInWindow();
     }else if(txtnumerotres.getText().trim().isEmpty()){
         JOptionPane.showMessageDialog(this,"Digite la cantidad invertida por inversionista  tres","Error", JOptionPane.ERROR_MESSAGE);
         txtnumerotres.requestFocusInWindow();
     }else{
      
      n1=Double.parseDouble(txtnumerouno.getText());
      n2=Double.parseDouble(txtnumerodos.getText());
      n3=Double.parseDouble(txtnumerotres.getText());
      
      
      total=n1+n2+n3;
      resultadouno=(n1/total)*100;
      resultadodos=(n2/total)*100;
      resultadotres=(n3/total)*100;
      
     resuno = String.valueOf(resultadouno);
     txtresultadouno.setText(resuno);
     resdos = String.valueOf(resultadodos);
     txtresultadodos.setText(resdos);
     restres = String.valueOf(resultadotres);
     txtresultadotres.setText(restres);
     }
    }//GEN-LAST:event_cmdcalcularActionPerformed

    private void txtnumerounoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumerounoKeyTyped
       char c=evt.getKeyChar(); 
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
               
              evt.consume(); 
                      
          } 
    }//GEN-LAST:event_txtnumerounoKeyTyped

    private void txtnumerodosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumerodosKeyTyped
     char c=evt.getKeyChar(); 
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
               
              evt.consume(); 
                      
          } 
    }//GEN-LAST:event_txtnumerodosKeyTyped

    private void txtnumerotresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumerotresKeyTyped
      char c=evt.getKeyChar(); 
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
               
              evt.consume(); 
                      
          } 
    }//GEN-LAST:event_txtnumerotresKeyTyped

    private void cmdborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdborrarActionPerformed
     txtnumerouno.setText("");
     txtnumerodos.setText("");
     txtnumerotres.setText("");
     txtresultadouno.setText("");
     txtresultadodos.setText("");
     txtresultadotres.setText("");
     
     
     
     txtnumerouno.requestFocusInWindow();
    }//GEN-LAST:event_cmdborrarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdborrar;
    private javax.swing.JButton cmdcalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtnumerodos;
    private javax.swing.JTextField txtnumerotres;
    private javax.swing.JTextField txtnumerouno;
    private javax.swing.JTextField txtresultadodos;
    private javax.swing.JTextField txtresultadotres;
    private javax.swing.JTextField txtresultadouno;
    // End of variables declaration//GEN-END:variables
}
