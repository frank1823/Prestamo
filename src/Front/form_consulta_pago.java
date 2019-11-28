/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Front;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kevin
 */
public class form_consulta_pago extends javax.swing.JFrame {

    /**
     * Creates new form form_consulta_pago
     */
    conexcion con = new conexcion();

    public form_consulta_pago() {
        initComponents();
        cerrar();
        setResizable(false);
        this.setLocationRelativeTo(null);
        DefaultTableModel tbl = new DefaultTableModel();
        DefaultTableModel tbl2 = new DefaultTableModel();
        tbl.addColumn("ID");
        tbl.addColumn("Nombre");
        tbl.addColumn("DPI");
        tbl.addColumn("Monto del prestamo");
        tbl.addColumn("FECHA INICIO");
        tbl.addColumn("FECHA FIN");

        tbl_prestamo.setModel(tbl);

        String query = "select id_prestamo,nombre_cliente,dpi, monto_interes,fecha_creacion,fecha_finalizacion from tbl_prestamo\n"
                + "inner join tbl_cliente \n"
                + "on tbl_prestamo.id_cliente=tbl_cliente.id_cliente";
        String[] dato = new String[6];
        Statement str;

        try {

            str = con.getConnection().createStatement();
            ResultSet result = str.executeQuery(query);

            while (result.next()) {
                dato[0] = result.getString(1);
                dato[1] = result.getString(2);
                dato[2] = result.getString(3);
                dato[3] = result.getString(4);
                dato[4] = result.getString(5);
                dato[5] = result.getString(6);

                tbl.addRow(dato);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_prestamo = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_detalle = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_monto = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_dpi = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consulta de Pagos");
        setMaximumSize(new java.awt.Dimension(998, 490));
        setMinimumSize(new java.awt.Dimension(998, 490));
        setPreferredSize(new java.awt.Dimension(998, 490));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("CONSULTA DE PAGOS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(411, 12, 286, 36);

        tbl_prestamo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tbl_prestamo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_prestamo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_prestamoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_prestamo);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(125, 54, 786, 162);

        tbl_detalle.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tbl_detalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Dpi", "Monto del prestamo", "Pago del Cliente", "Saldo Restante", "Cuota", "Fecha del pago"
            }
        ));
        jScrollPane2.setViewportView(tbl_detalle);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(29, 292, 945, 97);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/check.png"))); // NOI18N
        jButton1.setText("REVISAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(380, 410, 120, 51);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("ID ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 240, 16, 14);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Monto del prestamo");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(440, 240, 104, 14);

        txt_monto.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txt_monto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_montoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_monto);
        txt_monto.setBounds(550, 230, 139, 30);

        txt_id.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });
        getContentPane().add(txt_id);
        txt_id.setBounds(190, 230, 39, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Nombre");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(250, 240, 42, 14);

        txt_nombre.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nombre);
        txt_nombre.setBounds(300, 230, 125, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("DPI");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(700, 240, 20, 14);

        txt_dpi.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txt_dpi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dpiActionPerformed(evt);
            }
        });
        getContentPane().add(txt_dpi);
        txt_dpi.setBounds(730, 230, 125, 30);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back.png"))); // NOI18N
        jButton2.setText("REGRESAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(510, 410, 125, 50);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/background consulta.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 1000, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int id;
        DefaultTableModel tbl = new DefaultTableModel();
        String[] dat = new String[9];
        String sSubCadena ;
        
        if (txt_id.getText().isEmpty() || txt_nombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione un prestamo");
        } else {
            id = Integer.parseInt(txt_id.getText());
            String query = "select  tbl_detalle_pago.id_prestamo,tbl_cliente.nombre_cliente,tbl_cliente.dpi,tbl_prestamo.monto_interes,\n"
                    + "tbl_abonos.pago_cliente,tbl_abonos.saldo_faltante,\n"
                    + "tbl_abonos.no_cuota ,tbl_abonos.fecha_pago from tbl_detalle_pago\n"
                    + "inner join tbl_prestamo\n"
                    + "on tbl_detalle_pago.id_prestamo=tbl_prestamo.id_prestamo\n"
                    + "inner join tbl_abonos\n"
                    + "on tbl_detalle_pago.id_abono=tbl_abonos.id_abono \n"
                    + "inner join tbl_cliente\n"
                    + "on tbl_prestamo.id_cliente =tbl_cliente.id_cliente\n"
                    + "where tbl_detalle_pago.id_prestamo=" + id;
            Statement str;
            tbl.addColumn("ID");
            tbl.addColumn("Nombre");
            tbl.addColumn("DPI");
            tbl.addColumn("Monto del prestamo");
            tbl.addColumn("Pago Cliente");
            tbl.addColumn("Saldo Restante");
            tbl.addColumn("Cuota");
            tbl.addColumn("Fecha pago");

            tbl_detalle.setModel(tbl);
            try {

                str = con.getConnection().createStatement();
                ResultSet result = str.executeQuery(query);

                while (result.next()) {
                    dat[0] = result.getString(1);
                    dat[1] = result.getString(2);
                    dat[2] = result.getString(3);
                    dat[3] = result.getString(4);
                    dat[4] = result.getString(5);
                    dat[5] = result.getString(6);
                    dat[6] = result.getString(7);
                    sSubCadena= result.getString(8).substring(0,10);
                    dat[7] = sSubCadena;

                    tbl.addRow(dat);
                }
                str.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error!, la llamada no pudo ser agregada a la base de datos.");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_montoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_montoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_montoActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_dpiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dpiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dpiActionPerformed

    private void tbl_prestamoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_prestamoMouseClicked
        int seleccion = tbl_prestamo.rowAtPoint(evt.getPoint());
        txt_id.setText(String.valueOf(tbl_prestamo.getValueAt(seleccion, 0)));
        txt_nombre.setText(String.valueOf(tbl_prestamo.getValueAt(seleccion, 1)));
        txt_dpi.setText(String.valueOf(tbl_prestamo.getValueAt(seleccion, 2)));
        txt_monto.setText(String.valueOf(tbl_prestamo.getValueAt(seleccion, 3)));

    }//GEN-LAST:event_tbl_prestamoMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int valor = JOptionPane.showConfirmDialog(this, "¿Esta Seguro que desea regresar?", "Advertencia", JOptionPane.YES_NO_OPTION);
        if (valor == JOptionPane.YES_OPTION) {
            frm_consults frm = new frm_consults();
            frm.setVisible(true);
            this.dispose();
        }  
    }//GEN-LAST:event_jButton2ActionPerformed

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
        int valor = JOptionPane.showConfirmDialog(this, "¿Esta Seguro que desea Salir?", "Advertencia", JOptionPane.YES_NO_OPTION);
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
            java.util.logging.Logger.getLogger(form_consulta_pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_consulta_pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_consulta_pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_consulta_pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_consulta_pago().setVisible(true);
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_detalle;
    private javax.swing.JTable tbl_prestamo;
    private javax.swing.JTextField txt_dpi;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_monto;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
