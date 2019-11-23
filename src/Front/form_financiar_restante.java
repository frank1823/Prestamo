/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Front;

import com.sun.corba.se.spi.activation._ActivatorImplBase;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Pablo
 */
public class form_financiar_restante extends javax.swing.JFrame {
    public static double prm_Restante;
    public static int prm_Plazo, prm_IDPrestamo;
    conexcion cnx = new conexcion();
    /**
     * Creates new form form_financiar_restante
     */
    public form_financiar_restante(double _Restante, int _Plazo, int _IDPrestamo) {
        prm_Restante = _Restante;
        prm_Plazo = _Plazo;
        prm_IDPrestamo = _IDPrestamo;
        initComponents();
        chk_plazo.setText("Financiamiento con "+ _Plazo + " cuotas (plazo inicial)");
        chk_plazo.setSelected(true);
        txt_saldo_actual.setText(""+prm_Restante);
        
        txt_cuota_final.setText(""+(prm_Restante / prm_Plazo));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_saldo_actual = new javax.swing.JTextField();
        chk_plazo = new javax.swing.JCheckBox();
        chk_cuotas = new javax.swing.JCheckBox();
        txt_cuotas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_cuota_final = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btn_procesar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("FINANCIAMIENTO SALDO RESTANTE");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Saldo Restante Actual");

        txt_saldo_actual.setEditable(false);
        txt_saldo_actual.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        buttonGroup1.add(chk_plazo);
        chk_plazo.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        chk_plazo.setText("Financiamiento con x cuotas");

        buttonGroup1.add(chk_cuotas);
        chk_cuotas.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        chk_cuotas.setText("No. de cuotas personalizadas");
        chk_cuotas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chk_cuotasStateChanged(evt);
            }
        });
        chk_cuotas.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                chk_cuotasPropertyChange(evt);
            }
        });

        txt_cuotas.setText("1");
        txt_cuotas.setEnabled(false);
        txt_cuotas.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txt_cuotasInputMethodTextChanged(evt);
            }
        });
        txt_cuotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cuotasActionPerformed(evt);
            }
        });
        txt_cuotas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_cuotasKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cuotasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cuotasKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel3.setText("Cuotas");

        txt_cuota_final.setEditable(false);
        txt_cuota_final.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("CUOTA FINAL");

        btn_procesar.setText("Procesar");
        btn_procesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_procesarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txt_cuotas, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(chk_plazo, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_saldo_actual, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(chk_cuotas, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txt_cuota_final, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(btn_procesar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_saldo_actual, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(chk_plazo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chk_cuotas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_cuotas, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_cuota_final, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btn_procesar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chk_cuotasPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_chk_cuotasPropertyChange
        // TODO add your handling code here:
        
    }//GEN-LAST:event_chk_cuotasPropertyChange

    private void chk_cuotasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chk_cuotasStateChanged
        // TODO add your handling code here:
        if(chk_cuotas.isSelected() == true){
            txt_cuotas.setEnabled(true);
        }else{
            txt_cuota_final.setText(""+(prm_Restante / prm_Plazo));
            txt_cuotas.setEnabled(false);
        }
    }//GEN-LAST:event_chk_cuotasStateChanged

    private void txt_cuotasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cuotasKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_cuotasKeyTyped

    private void txt_cuotasInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txt_cuotasInputMethodTextChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_cuotasInputMethodTextChanged

    private void txt_cuotasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cuotasKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_cuotasKeyPressed

    private void txt_cuotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cuotasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cuotasActionPerformed

    private void txt_cuotasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cuotasKeyReleased
        // TODO add your handling code here:
        if(!txt_cuotas.getText().equals("")){
            System.out.println(txt_cuotas.getText());
            double cuotas = Integer.parseInt(txt_cuotas.getText());
            if(cuotas <= 0){
                cuotas = 1;
            }
            System.out.println(prm_Restante / cuotas);
            txt_cuota_final.setText(""+(prm_Restante / cuotas));
        }
        
    }//GEN-LAST:event_txt_cuotasKeyReleased

    private void btn_procesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_procesarActionPerformed
        // TODO add your handling code here:
        int cuotas = 0;
        int SQL_STATUS = 0;
        double financiado = 0;
        String query = "";
        PreparedStatement stm;
        
        if(chk_plazo.isSelected() == true){
            cuotas = prm_Plazo;
        }else{
            if(chk_cuotas.isSelected() == true){
                cuotas = Integer.parseInt(txt_cuotas.getText());
            }
        }
        
        financiado = Double.parseDouble(txt_cuota_final.getText()); 
        try {
            if(cuotas > prm_Plazo){
                query = "UPDATE tbl_prestamo SET cuota_faltante = ?, total_cuota = ?,  cuotas = ? WHERE id_prestamo = ?";   
                stm= cnx.getConnection().prepareStatement(query);
                stm.setInt(1, cuotas);
                stm.setDouble(2, financiado);
                stm.setDouble(3, cuotas);
                stm.setInt(4, prm_IDPrestamo);
                
            }else{
                query = "UPDATE tbl_prestamo SET cuota_faltante = ?, total_cuota = ? WHERE id_prestamo = ?";
                stm = cnx.getConnection().prepareStatement(query);
                stm.setInt(1, cuotas);
                stm.setDouble(2, financiado);
                stm.setInt(3, prm_IDPrestamo);
            }    
        
            SQL_STATUS = stm.executeUpdate();
            if(SQL_STATUS > 0){
                JOptionPane.showMessageDialog(this, "Extra Financiamiento Aplicado!");
                form_pago_cliente frm_pago = new form_pago_cliente();
                frm_pago.invalidate();
                frm_pago.validate();
                frm_pago.repaint();
                this.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(this, "Error al aplicar extra-financiamiento, intente de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btn_procesarActionPerformed

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
            java.util.logging.Logger.getLogger(form_financiar_restante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_financiar_restante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_financiar_restante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_financiar_restante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_financiar_restante(prm_Restante, prm_Plazo, prm_IDPrestamo).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_procesar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chk_cuotas;
    private javax.swing.JCheckBox chk_plazo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txt_cuota_final;
    private javax.swing.JTextField txt_cuotas;
    private javax.swing.JTextField txt_saldo_actual;
    // End of variables declaration//GEN-END:variables
}
