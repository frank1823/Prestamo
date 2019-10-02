/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Front;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.awt.Dimension;

/**
 *
 * @author Franklyn Escobar
 */
public class form_principal extends javax.swing.JFrame {

    /**
     * Creates new form form_principal
     */
    public String datos;

    public form_principal() {
        initComponents();
        cerrar();
        //setLocationRelativeTo(form_principal.this);
        setSize(800, 570);
        setResizable(false);

        Image icon = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/icon.jpg"));
        setIconImage(icon);

        
         conexcion con = new conexcion();

       
         String query = "SELECT sum(estado) FROM tbl_prestamo";
         Statement str;
         try {

         str = con.getConnection().createStatement();
         ResultSet result = str.executeQuery(query);

         while (result.next()) {
         datos = result.getString(1);
         lbl_pagos.setText(datos);
         }
         str.close();
         } catch (SQLException e) {
         JOptionPane.showMessageDialog(null, "Error!, la llamada no pudo ser agregada a la base de datos.");
         }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_ingclient = new javax.swing.JButton();
        btn_ingprestamo = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btn_pagocliente1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbl_pagos = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(" Menú Principal");
        setForeground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(700, 500));
        setMinimumSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(null);

        btn_ingclient.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_ingclient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/new_user.png"))); // NOI18N
        btn_ingclient.setText("Ingreso Cliente");
        btn_ingclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingclientActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ingclient);
        btn_ingclient.setBounds(70, 90, 210, 100);

        btn_ingprestamo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_ingprestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_personales.png"))); // NOI18N
        btn_ingprestamo.setText("Pagos Pendientes");
        btn_ingprestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingprestamoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ingprestamo);
        btn_ingprestamo.setBounds(70, 220, 210, 100);

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modify.png"))); // NOI18N
        jButton4.setText("Modificar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(530, 350, 210, 100);

        btn_pagocliente1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_pagocliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/equipment.png"))); // NOI18N
        btn_pagocliente1.setText("         Reportes");
        getContentPane().add(btn_pagocliente1);
        btn_pagocliente1.setBounds(70, 350, 210, 100);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pagos Pendientes:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 500, 185, 28);

        lbl_pagos.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_pagos.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_pagos);
        lbl_pagos.setBounds(270, 500, 37, 28);

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consult.png"))); // NOI18N
        jButton5.setText("Consultas");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(300, 350, 210, 100);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/newprestamo.png"))); // NOI18N
        jButton2.setText("Nuevo Prestamo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(300, 90, 210, 100);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/pagos.png"))); // NOI18N
        jButton1.setText("     Pagos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(530, 90, 210, 100);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/motorcycle.png"))); // NOI18N
        jButton3.setText("       Cobradores");
        jButton3.setMaximumSize(new java.awt.Dimension(145, 76));
        jButton3.setMinimumSize(new java.awt.Dimension(145, 76));
        jButton3.setPreferredSize(new java.awt.Dimension(145, 76));
        getContentPane().add(jButton3);
        jButton3.setBounds(300, 220, 210, 100);

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/coins.png"))); // NOI18N
        jButton6.setText("Comisiones");
        jButton6.setMaximumSize(new java.awt.Dimension(145, 76));
        jButton6.setMinimumSize(new java.awt.Dimension(145, 76));
        jButton6.setPreferredSize(new java.awt.Dimension(145, 76));
        getContentPane().add(jButton6);
        jButton6.setBounds(530, 220, 210, 100);

        jPanel2.setBackground(new java.awt.Color(187, 187, 187,80));
        jPanel2.setForeground(new java.awt.Color(204, 204, 204,80));

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MENÚ PRINCIPAL");
        jPanel2.add(jLabel2);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(60, 50, 690, 410);

        jPanel1.setMinimumSize(new java.awt.Dimension(800, 540));
        jPanel1.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/forest.jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 800, 550);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 840, 540);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ingprestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingprestamoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ingprestamoActionPerformed

    private void btn_ingclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingclientActionPerformed
        frm_nuevo_cliente client = new frm_nuevo_cliente();
        client.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_ingclientActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        form_pago_cliente frm = new form_pago_cliente();
        frm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        form_nuevo_prestamo frm = new form_nuevo_prestamo();
        frm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
     /*public void centrarventana() {
        //Tamaño de pantalla
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        if (frameSize.height > screenSize.height) {
            frameSize.height = screenSize.height;
        }
        if (frameSize.width > screenSize.width) {
            frameSize.width = screenSize.width;
        }
        //centrar ventana
        setLocation ((screenSize.width - frameSize.width) / 2,
                (screenSize.height - frameSize.height) / 2);
                

    }*/

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
            java.util.logging.Logger.getLogger(form_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_principal().setVisible(true);
            }
        });
    } 
    public void cerrar() {
        try {
            this.setDefaultCloseOperation(form_newcobrador.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    confirmarSalida();
                }
            }
            );
            this.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void confirmarSalida() {
        int valor = JOptionPane.showConfirmDialog(this, "¿Esta Seguro que desa Salir?", "Advertencia", JOptionPane.YES_NO_OPTION);
        if (valor == JOptionPane.YES_OPTION) {
            System.exit(0);

        }
    }

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ingclient;
    private javax.swing.JButton btn_ingprestamo;
    private javax.swing.JButton btn_pagocliente1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    public javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_pagos;
    // End of variables declaration//GEN-END:variables
}
