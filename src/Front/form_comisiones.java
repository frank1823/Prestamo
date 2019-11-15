/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Front;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Franklyn Escobar
 */
public class form_comisiones extends javax.swing.JFrame {

    /**
     * Creates new form form_comisiones
     */
    conexcion con = new conexcion();

    public form_comisiones() {
        initComponents();
        cerrar();
        setResizable(false);
        this.setLocationRelativeTo(null);
        txt_id_pre.setVisible(false);
        DefaultTableModel tbl = new DefaultTableModel();

        SimpleDateFormat dformat = new SimpleDateFormat("dd-MM-yyyy");

        LocalDate local = LocalDate.now();
        Date date = java.sql.Date.valueOf(local);
        String fecha = dformat.format(date);
        txt_pagocomision.setText(fecha);
        tbl.addColumn("ID");
        tbl.addColumn("Nombre del cobrador");
        tbl.addColumn("Apellido del cobrador");
        tbl.addColumn("DPI ");
        tbl.addColumn("Montp + Interes ");
        tbl.addColumn("Ganancia del Prestamo");
        tbl.addColumn("%");
        tbl.addColumn("Pago de la comision");
        tbl_prestamo.setModel(tbl);

        String query_co = "select p.id_prestamo,c.nombre,c.apellido,c.dpi,p.monto_interes,\n"
                + "p.ganancia,p.porcentaje_cobra,p.pago_comision from tbl_prestamo p\n"
                + "inner join tbl_cobrador c\n"
                + "on p.id_cobrador=c.id_cobrador\n"
                + "where estado_comision=1;";
        String[] dato_co = new String[8];
        Statement str_co;

        try {

            str_co = con.getConnection().createStatement();
            ResultSet result_co = str_co.executeQuery(query_co);

            while (result_co.next()) {
                dato_co[0] = result_co.getString(1);
                dato_co[1] = result_co.getString(2);
                dato_co[2] = result_co.getString(3);
                dato_co[3] = result_co.getString(4);
                dato_co[4] = result_co.getString(5);
                dato_co[5] = result_co.getString(6);
                dato_co[6] = result_co.getString(7);
                dato_co[7] = result_co.getString(8);

                tbl.addRow(dato_co);
            }
            str_co.close();
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
        jLabel9 = new javax.swing.JLabel();
        txt_monto = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_comision = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        btn_regresar = new javax.swing.JButton();
        txt_pagocomision = new javax.swing.JTextField();
        txt_id_pre = new javax.swing.JTextField();
        txt_desc = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_prestamo = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txt_apellidos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_nombres = new javax.swing.JTextField();
        txt_dpi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingreso Comisiones");
        setMinimumSize(new java.awt.Dimension(645, 647));
        setPreferredSize(new java.awt.Dimension(645, 647));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("INGRESO COMISIÓN");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(259, 6, 172, 41);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel9.setText("Ganancia");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(44, 474, 44, 22);

        txt_monto.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        getContentPane().add(txt_monto);
        txt_monto.setBounds(106, 474, 62, 20);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel12.setText("Comisión Q");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(180, 478, 58, 14);

        txt_comision.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        getContentPane().add(txt_comision);
        txt_comision.setBounds(244, 474, 62, 20);

        btn_guardar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_guardar);
        btn_guardar.setBounds(234, 570, 85, 45);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel13.setText("Fecha Pago comisión");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(335, 478, 100, 14);

        btn_regresar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_regresar.setText("Regresar");
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_regresar);
        btn_regresar.setBounds(331, 568, 79, 49);

        txt_pagocomision.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        getContentPane().add(txt_pagocomision);
        txt_pagocomision.setBounds(453, 474, 87, 20);
        getContentPane().add(txt_id_pre);
        txt_id_pre.setBounds(609, 65, 20, 14);

        txt_desc.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        getContentPane().add(txt_desc);
        txt_desc.setBounds(276, 514, 264, 36);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel15.setText("Descripcion");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(200, 525, 58, 14);

        jPanel2.setBackground(new java.awt.Color(187, 187, 187,80));

        tbl_prestamo.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
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

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Datos del Prestamo");

        txt_apellidos.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txt_apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidosActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("Nombres");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("Apellidos");

        txt_nombres.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txt_nombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombresActionPerformed(evt);
            }
        });

        txt_dpi.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txt_dpi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dpiActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setText("DPI");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_dpi, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_dpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 60, 660, 500);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Commision background.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 710, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    validaciones validarDatos = new validaciones();


    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed

        String Descr;
        double monto;
        LocalDate local = LocalDate.now();
        String fecha = local.toString();
        int dato_final = 0;

        if (txt_apellidos.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione un Cobrador:");
        } else {
            if (txt_apellidos.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Seleccione un Cobrador:");
            } else {
                if (txt_id_pre.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Seleccione un cobrador");
                } else {
                    if (txt_comision.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Ingrese el dinero de la Comision");
                    } else {
                        Descr = txt_desc.getText();
                        monto = Double.parseDouble(txt_comision.getText());
                        int id_prestamo = Integer.parseInt(txt_id_pre.getText());

                        String query = "INSERT INTO tbl_comision (id_comision,descripcion,monto_comision,fecha_pago) VALUES ( ?, ?, ?, ?)";
                        String query_pagos = "INSERT INTO tbl_detalle_comision (id_comision,id_prestamo) VALUES ( ?, ?)";
                        String query_last = "select max(id_comision) from tbl_comision";
                        String query_estado = "UPDATE tbl_prestamo SET  estado_comision= " + 2 + " WHERE (id_prestamo = " + id_prestamo + ")";
                        try {
                            PreparedStatement str = con.getConnection().prepareStatement(query);
                            str.setNull(1, java.sql.Types.BIGINT);
                            str.setString(2, Descr);
                            str.setDouble(3, monto);
                            str.setString(4, fecha);

                            int res = str.executeUpdate();
                            if (res > 0) {
                                try {
                                    PreparedStatement str_last = con.getConnection().prepareStatement(query_last);

                                    ResultSet result = str_last.executeQuery(query_last);
                                    while (result.next()) {
                                        dato_final = result.getInt(1);
                                    }
                                    PreparedStatement str_pago = con.getConnection().prepareStatement(query_pagos);
                                    str_pago.setInt(1, dato_final);
                                    str_pago.setInt(2, id_prestamo);
                                    int res_pago = str_pago.executeUpdate();
                                    if (res > 0) {
                                        try {
                                            PreparedStatement str_estado_cambio = con.getConnection().prepareStatement(query_estado);

                                            int res_estado = str_estado_cambio.executeUpdate();
                                            if (res_estado > 0) {
                                                JOptionPane.showMessageDialog(null, "Ingreso Correcto");
                                            } else {

                                            }

                                            str_estado_cambio.close();
                                        } catch (SQLException e) {
                                            JOptionPane.showMessageDialog(null, "Error");
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Error");
                                    }
                                    str_pago.close();
                                    str_last.close();
                                } catch (SQLException e) {
                                    JOptionPane.showMessageDialog(null, "Error!, la llamada no pudo ser agregada a la base de datos." + e);
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Error");
                            }
                            str.close();
                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null, "Error!, la llamada no pudo ser agregada a la base de datos." + e);
                        }
                    }
                }

            }
            actualizar();
            txt_nombres.setText("");
            txt_apellidos.setText("");
            txt_desc.setText("");
            txt_comision.setText("");
            txt_dpi.setText("");
            txt_id_pre.setText("");
            txt_monto.setText("");
        }


    }//GEN-LAST:event_btn_guardarActionPerformed

    public void actualizar() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("ID");
        tbl.addColumn("Nombre del cobrador");
        tbl.addColumn("Apellido del cobrador");
        tbl.addColumn("DPI ");
        tbl.addColumn("Montp + Interes ");
        tbl.addColumn("Ganancia del Prestamo");
        tbl.addColumn("%");
        tbl.addColumn("Pago de la comision");
        tbl_prestamo.setModel(tbl);

        String query_co = "select p.id_prestamo,c.nombre,c.apellido,c.dpi,p.monto_interes,\n"
                + "p.ganancia,p.porcentaje_cobra,p.pago_comision from tbl_prestamo p\n"
                + "inner join tbl_cobrador c\n"
                + "on p.id_cobrador=c.id_cobrador\n"
                + "where estado_comision=1;";
        String[] dato_co = new String[8];
        Statement str_co;

        try {

            str_co = con.getConnection().createStatement();
            ResultSet result_co = str_co.executeQuery(query_co);

            while (result_co.next()) {
                dato_co[0] = result_co.getString(1);
                dato_co[1] = result_co.getString(2);
                dato_co[2] = result_co.getString(3);
                dato_co[3] = result_co.getString(4);
                dato_co[4] = result_co.getString(5);
                dato_co[5] = result_co.getString(6);
                dato_co[6] = result_co.getString(7);
                dato_co[7] = result_co.getString(8);

                tbl.addRow(dato_co);
            }
            str_co.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error!, la llamada no pudo ser agregada a la base de datos.");
        }
    }
    private void tbl_prestamoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_prestamoMouseClicked
        int seleccion = tbl_prestamo.rowAtPoint(evt.getPoint());
        txt_id_pre.setText(String.valueOf(tbl_prestamo.getValueAt(seleccion, 0)));
        txt_nombres.setText(String.valueOf(tbl_prestamo.getValueAt(seleccion, 1)));
        txt_apellidos.setText(String.valueOf(tbl_prestamo.getValueAt(seleccion, 2)));
        txt_dpi.setText(String.valueOf(tbl_prestamo.getValueAt(seleccion, 3)));
        txt_monto.setText(String.valueOf(tbl_prestamo.getValueAt(seleccion, 5)));
        txt_comision.setText(String.valueOf(tbl_prestamo.getValueAt(seleccion, 7)));
    }//GEN-LAST:event_tbl_prestamoMouseClicked

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        // TODO add your handling code here:
        int valor = JOptionPane.showConfirmDialog(this, "¿Esta Seguro que desea regresar?", "Advertencia", JOptionPane.YES_NO_OPTION);
        if (valor == JOptionPane.YES_OPTION) {
            form_principal frm = new form_principal();
            frm.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void txt_apellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidosActionPerformed

    private void txt_nombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombresActionPerformed

    private void txt_dpiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dpiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dpiActionPerformed
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
            java.util.logging.Logger.getLogger(form_comisiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_comisiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_comisiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_comisiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_comisiones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_prestamo;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_comision;
    private javax.swing.JTextField txt_desc;
    private javax.swing.JTextField txt_dpi;
    private javax.swing.JTextField txt_id_pre;
    private javax.swing.JTextField txt_monto;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JTextField txt_pagocomision;
    // End of variables declaration//GEN-END:variables
}
