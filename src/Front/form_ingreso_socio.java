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
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class form_ingreso_socio extends javax.swing.JFrame {

    /**
     * Creates new form form_ingreso_socio
     */
    conexcion con = new conexcion();

    public form_ingreso_socio() {
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/icon.jpg"));
        setIconImage(icon);
        setVisible(true);
        cerrar();
        setResizable(false);
        this.setLocationRelativeTo(null);
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
        txt_nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_dpi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingreso Nuevo Socio");
        setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        setMaximumSize(new java.awt.Dimension(428, 290));
        setMinimumSize(new java.awt.Dimension(428, 290));
        setPreferredSize(new java.awt.Dimension(428, 290));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel1.setText("Nombre ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(104, 82, 42, 14);

        txt_nombre.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        getContentPane().add(txt_nombre);
        txt_nombre.setBounds(181, 78, 166, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Ingreso Socio");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(172, 17, 138, 28);

        txt_apellido.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        getContentPane().add(txt_apellido);
        txt_apellido.setBounds(181, 118, 166, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("Apellidos");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(104, 122, 47, 14);

        txt_dpi.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txt_dpi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_dpiKeyTyped(evt);
            }
        });
        getContentPane().add(txt_dpi);
        txt_dpi.setBounds(181, 158, 166, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setText("DPI ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(104, 162, 23, 14);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/save.png"))); // NOI18N
        jButton1.setText("GUARDAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(100, 210, 130, 40);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back.png"))); // NOI18N
        jButton2.setText("REGRESAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(240, 210, 130, 40);

        jPanel1.setBackground(new java.awt.Color(187, 187, 187,80));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(90, 70, 290, 130);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo socio background.jpg"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(495, 290));
        jLabel5.setMinimumSize(new java.awt.Dimension(495, 290));
        jLabel5.setName(""); // NOI18N
        jLabel5.setPreferredSize(new java.awt.Dimension(495, 280));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, -10, 430, 290);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nombre = "";
        String apellido = "";
        long dpi;
        if (txt_nombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ingrese nombre");
        } else {
            if (txt_dpi.getText().isEmpty() || txt_dpi.getText().length()< 13) {
                JOptionPane.showMessageDialog(null, "Ingrese dpi");
            } else {
                if (txt_dpi.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Ingrese Telefono");
                } else{ 
                    nombre = txt_nombre.getText();
                    apellido = txt_apellido.getText();
                    dpi = Long.parseLong(txt_dpi.getText());
                    String query="INSERT INTO tbl_socio (id_socio, nombres_socio,apellidos_socio, dpi) VALUES (?,?,?,?)";
                    try {
                        PreparedStatement str = con.getConnection().prepareStatement(query);
                        str.setNull(1, java.sql.Types.BIGINT);
                        str.setString(2, nombre);
                        str.setString(3, apellido);
                        str.setLong(4, dpi);

                        int res = str.executeUpdate();
                        if (res > 0) {
                            JOptionPane.showMessageDialog(null, "Ingreso completado");
                            txt_nombre.setText(null);
                            txt_dpi.setText(null);
                            txt_apellido.setText(null);
                        } else {
                            JOptionPane.showMessageDialog(null, "Error");
                        }
                        str.close();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "Error!, la llamada no pudo ser agregada a la base de datos." +e);
                    }
                    
                    }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int valor = JOptionPane.showConfirmDialog(this, "¿Esta Seguro que desea regresar?", "Advertencia", JOptionPane.YES_NO_OPTION);
        if (valor == JOptionPane.YES_OPTION) {
        frm_consultas frm = new frm_consultas();
        frm.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_dpiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dpiKeyTyped
        // TODO add your handling code here:
        char valida = evt.getKeyChar();
        if (Character.isLetter(valida)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo numeros");
        } else {
            if (txt_dpi.getText().length() == 13) {
                getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(null, "No mas de 13 digitos");
            }
        }
    }//GEN-LAST:event_txt_dpiKeyTyped
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
            java.util.logging.Logger.getLogger(form_ingreso_socio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_ingreso_socio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_ingreso_socio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_ingreso_socio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_ingreso_socio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_dpi;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
