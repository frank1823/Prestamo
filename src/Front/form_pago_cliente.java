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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Kevin
 */
public class form_pago_cliente extends javax.swing.JFrame {

    /**
     * Creates new form form_pago_cliente
     */
    conexcion con = new conexcion();
    double monto_restante, pago_estipulado_actual;
    int cuota_res;
    double env_CuotaFinal;
    int env_Plazo, env_ID;
    DefaultTableModel dm;

    // pmazariegos -- Rutina para recalcular el pago estipulado -- 19/11/2019
    public double RecalcularPagoEstipulado() {
        /* 
        pmazariegos -- 19/11/2019
        NOTA:
            Para calcular el siguiente pago estipulado aplicar la siguiente formula
            (txt_saldo a pagar - txt_Faltante) / txt_Faltante_cuota
         */
        double out_PagoEstipulado = monto_restante / cuota_res;
        if(Double.isNaN(out_PagoEstipulado)) {
            out_PagoEstipulado = 0;
        }

        return out_PagoEstipulado;
    }

    public form_pago_cliente() {

        initComponents();
        //pmazariegos -- ocultar boton de financiar saldo restante al inicio del form -- 19/11/2019        
        btn_financiar_restante.setVisible(false);

        setResizable(false);
        this.setLocationRelativeTo(null);
        cerrar();
        txt_id.setEditable(false);
        txt_Faltante.setEditable(false);
        txt_Faltante_cuota.setEditable(false);
        txt_pago_estipulado.setEditable(false);
        txt_monto_prestamo.setEditable(false);
        txt_saldo_pagar.setEditable(true);
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("ID");
        tbl.addColumn("Nombre");
        tbl.addColumn("DPI");
        tbl.addColumn("Prestamo");
        tbl.addColumn("Saldo a pagar");
        tbl.addColumn("Cuotas Faltantes");
        tbl.addColumn("Cuotas Totales");
        tbl.addColumn("Pago estupilado");
        tbl_prestamo.setModel(tbl);

        String query = "select id_prestamo,nombre_cliente, dpi, monto_interes,saldo_faltante,cuota_faltante, cuotas,total_cuota from tbl_prestamo\n"
                + "inner join tbl_cliente \n"
                + "on tbl_prestamo.id_cliente= tbl_cliente.id_cliente \n"
                + "where estado=1";
        String[] dato = new String[8];
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
                dato[6] = result.getString(7);
                dato[7] = result.getString(8);
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txt_id = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_dpi = new javax.swing.JTextField();
        txt_monto_prestamo = new javax.swing.JTextField();
        txt_Faltante = new javax.swing.JTextField();
        txt_Faltante_cuota = new javax.swing.JTextField();
        txt_pago_estipulado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_saldo_pagar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btn_financiar_restante = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pago Clientes");
        setMinimumSize(new java.awt.Dimension(835, 640));
        setPreferredSize(new java.awt.Dimension(835, 640));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("PAGO DE CLIENTES");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 20, 420, 56);

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
        jScrollPane1.setBounds(0, 100, 826, 120);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/save.png"))); // NOI18N
        jButton1.setText("GUARDAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(260, 550, 130, 46);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back.png"))); // NOI18N
        jButton2.setText("REGRESAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(400, 550, 130, 44);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit.png"))); // NOI18N
        jButton3.setText("CANCELAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(540, 550, 130, 40);

        jPanel1.setBackground(new java.awt.Color(187, 187, 187,80));
        jPanel1.setLayout(null);

        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });
        jPanel1.add(txt_id);
        txt_id.setBounds(320, 10, 100, 24);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel9.setText("ID");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(250, 10, 20, 14);

        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_nombreKeyReleased(evt);
            }
        });
        jPanel1.add(txt_nombre);
        txt_nombre.setBounds(320, 40, 341, 24);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel2.setText("Nombres");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(230, 40, 43, 14);

        txt_dpi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dpiActionPerformed(evt);
            }
        });
        txt_dpi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_dpiKeyReleased(evt);
            }
        });
        jPanel1.add(txt_dpi);
        txt_dpi.setBounds(320, 70, 341, 24);

        txt_monto_prestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_monto_prestamoActionPerformed(evt);
            }
        });
        jPanel1.add(txt_monto_prestamo);
        txt_monto_prestamo.setBounds(320, 100, 100, 24);

        txt_Faltante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_FaltanteActionPerformed(evt);
            }
        });
        jPanel1.add(txt_Faltante);
        txt_Faltante.setBounds(320, 130, 98, 24);

        txt_Faltante_cuota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Faltante_cuotaActionPerformed(evt);
            }
        });
        jPanel1.add(txt_Faltante_cuota);
        txt_Faltante_cuota.setBounds(320, 170, 98, 24);

        txt_pago_estipulado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pago_estipuladoActionPerformed(evt);
            }
        });
        jPanel1.add(txt_pago_estipulado);
        txt_pago_estipulado.setBounds(320, 200, 98, 24);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel3.setText("DPI");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(240, 70, 21, 14);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel4.setText("Monto Prestamo");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(210, 100, 80, 14);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel5.setText("Saldo Faltante");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(220, 130, 74, 14);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel7.setText("Cuotas Faltantes");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(210, 170, 83, 14);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel8.setText("Pago estipulado");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(210, 200, 80, 14);

        txt_saldo_pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_saldo_pagarActionPerformed(evt);
            }
        });
        jPanel1.add(txt_saldo_pagar);
        txt_saldo_pagar.setBounds(390, 250, 170, 32);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel6.setText("Saldo a Pagar");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(300, 260, 70, 14);

        btn_financiar_restante.setBackground(new java.awt.Color(255, 255, 255));
        btn_financiar_restante.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_financiar_restante.setText("Financiar Saldo Restante");
        btn_financiar_restante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btn_financiar_restante.setBorderPainted(false);
        btn_financiar_restante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_financiar_restanteActionPerformed(evt);
            }
        });
        jPanel1.add(btn_financiar_restante);
        btn_financiar_restante.setBounds(580, 250, 170, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 240, 830, 310);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/wall2.jpg"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 890, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed
    private void filtro(String consulta, JTable jtableBuscar) {
        dm = (DefaultTableModel) jtableBuscar.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(dm);
        jtableBuscar.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(consulta));
    }
    private void txt_dpiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dpiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dpiActionPerformed

    private void txt_monto_prestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_monto_prestamoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_monto_prestamoActionPerformed

    private void txt_FaltanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_FaltanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_FaltanteActionPerformed

    private void txt_saldo_pagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_saldo_pagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_saldo_pagarActionPerformed

    private void tbl_prestamoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_prestamoMouseClicked
        int seleccion = tbl_prestamo.rowAtPoint(evt.getPoint());
        txt_id.setText(String.valueOf(tbl_prestamo.getValueAt(seleccion, 0)));
        txt_nombre.setText(String.valueOf(tbl_prestamo.getValueAt(seleccion, 1)));
        txt_dpi.setText(String.valueOf(tbl_prestamo.getValueAt(seleccion, 2)));
        txt_monto_prestamo.setText(String.valueOf(tbl_prestamo.getValueAt(seleccion, 3)));
        txt_Faltante.setText(String.valueOf(tbl_prestamo.getValueAt(seleccion, 4)));
        txt_Faltante_cuota.setText(String.valueOf(tbl_prestamo.getValueAt(seleccion, 5)));
        int cuotasTotales = Integer.parseInt(String.valueOf(tbl_prestamo.getValueAt(seleccion, 6)));
        txt_pago_estipulado.setText(String.valueOf(tbl_prestamo.getValueAt(seleccion, 7)));
        txt_saldo_pagar.setText(String.valueOf(tbl_prestamo.getValueAt(seleccion, 7)));

        // pmazariegos -- habilitacion de boton para financiar restante -- 19/11/2019
        int noCuotaActual = Integer.parseInt(String.valueOf(tbl_prestamo.getValueAt(seleccion, 5)));
        //pmazariegos -- habilitacion de boton para financiar restante en cualquier cuota, no solo cuando falte 1 -- 25/11/2019
        //if (noCuotaActual == 1) { 
            double saldoTotalPrestamo = Double.parseDouble(txt_monto_prestamo.getText());

            // cuota inicial
            double cuotaInicial = saldoTotalPrestamo / cuotasTotales;
            //cuota final
            double cuotaFinal = Double.parseDouble(String.valueOf(tbl_prestamo.getValueAt(seleccion, 7)));

            if (cuotaFinal > cuotaInicial) {
                //Variables de envio al siguiente formulario
                env_CuotaFinal = cuotaFinal;
                env_ID = Integer.parseInt(String.valueOf(tbl_prestamo.getValueAt(seleccion, 0)));
                env_Plazo = cuotasTotales;

                btn_financiar_restante.setVisible(true);
                this.invalidate();
                this.validate();
                this.repaint();
            } else {
                btn_financiar_restante.setVisible(false);
                this.invalidate();
                this.validate();
                this.repaint();
            }

        //}


    }//GEN-LAST:event_tbl_prestamoMouseClicked

    private void txt_Faltante_cuotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Faltante_cuotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Faltante_cuotaActionPerformed

    private void txt_pago_estipuladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pago_estipuladoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pago_estipuladoActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double pago = 0, saldo_fal = 0;
        int cuota = 0, modifica = 0, id, dato = 0;
        int valor;
        LocalDate date = LocalDate.now();

        if (txt_dpi.getText().isEmpty() && txt_nombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione un prestamo");
        } else {
            if (txt_saldo_pagar.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ingrese el monto a pagar");
            } else {
                // pmazariegos -- Mensajes de error al pagar MENOS o MAS de cuota estipulada -- 19/11/2019
                pago = Double.parseDouble(txt_saldo_pagar.getText());
                pago_estipulado_actual = Double.parseDouble(txt_pago_estipulado.getText());
                cuota = Integer.parseInt(txt_Faltante_cuota.getText());
                cuota_res = cuota - 1;
                monto_restante = Double.parseDouble(txt_Faltante.getText());
                monto_restante = monto_restante - pago;

                //PAGO MENOR AL ESTIPULADO
                if (pago < pago_estipulado_actual) {
                    valor = JOptionPane.showConfirmDialog(this,
                            "¿Esta Seguro que desea Realizar el Pago MENOR a la cuota estipulada?\n La siguiente cuota seria de: Q." + RecalcularPagoEstipulado(),
                            "Advertencia", JOptionPane.YES_NO_OPTION);
                } else {
                    //PAGO MAYOR AL ESTIPULADO
                    if (pago > pago_estipulado_actual) {
                        valor = JOptionPane.showConfirmDialog(this,
                                "¿Esta Seguro que desea Realizar el Pago MAYOR a la cuota estipulada?\n La siguiente cuota seria de: Q." + RecalcularPagoEstipulado(),
                                "Advertencia", JOptionPane.YES_NO_OPTION);
                    } else {
                        valor = JOptionPane.showConfirmDialog(this, "¿Esta Seguro que desea Realizar el Pago?", "Advertencia", JOptionPane.YES_NO_OPTION);
                    }
                }

                if (valor == JOptionPane.YES_OPTION) {
                    id = Integer.parseInt(txt_id.getText());

                    String query = "INSERT INTO tbl_abonos (id_abono,pago_cliente,fecha_pago,saldo_faltante,no_cuota) VALUES (?, ?, ?, ?, ?)";
                    String query_pagos = "INSERT INTO tbl_detalle_pago (id_prestamo, id_abono) VALUES (?,?) ";
                    try {
                        PreparedStatement str = con.getConnection().prepareStatement(query);
                        str.setNull(1, java.sql.Types.BIGINT);
                        str.setDouble(2, pago);
                        str.setString(3, date.toString());
                        str.setDouble(4, monto_restante);
                        str.setInt(5, cuota);

                        int res = str.executeUpdate();
                        if (res > 0) {
                            JOptionPane.showMessageDialog(null, "Ingreso completado abono");
                            modifica = 1;
                        } else {
                            JOptionPane.showMessageDialog(null, "Error");
                        }
                        str.close();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "Error!, la llamada no pudo ser agregada a la base de datos." + e);
                    }
                    // pmazariegos -- Recalcular siguiente pago estipulado -- 19/11/2019
                    String query_update = "UPDATE tbl_prestamo SET  saldo_faltante = " + monto_restante + ", cuota_faltante = " + cuota_res + ", total_cuota = " + RecalcularPagoEstipulado() + " WHERE (id_prestamo = " + id + ")";
                    String query_last = "select max(id_abono) from tbl_abonos";
                    String query_estado = "UPDATE tbl_prestamo SET  estado = " + 0 + ",estado_comision= " + 1 + " WHERE (id_prestamo = " + id + ")";
                    String query_cambio = "select saldo_faltante,cuota_faltante from tbl_prestamo WHERE (id_prestamo = " + id + ")";
                    int[] cambio = new int[3];
                    boolean bandera_estado = false;
                    if (modifica == 1) {
                        try {
                            PreparedStatement str_update = con.getConnection().prepareStatement(query_update);

                            int res_update = str_update.executeUpdate();
                            if (res_update > 0) {
                                ////////////////////////////////////////////  
                                try {
                                    PreparedStatement str_last = con.getConnection().prepareStatement(query_last);

                                    ResultSet result = str_last.executeQuery(query_last);
                                    while (result.next()) {
                                        dato = result.getInt(1);
                                    }
                                    PreparedStatement str_pago = con.getConnection().prepareStatement(query_pagos);
                                    str_pago.setInt(1, id);
                                    str_pago.setInt(2, dato);
                                    int res_pago = str_pago.executeUpdate();
                                    if (res_pago > 0) {
                                        try {
                                            PreparedStatement str_estado_cambio = con.getConnection().prepareStatement(query_estado);
                                            PreparedStatement str_cambio = con.getConnection().prepareStatement(query_cambio);

                                            ResultSet result_cambio = str_last.executeQuery(query_cambio);
                                            while (result_cambio.next()) {
                                                cambio[0] = result_cambio.getInt(1);
                                                cambio[1] = result_cambio.getInt(2);
                                            }
                                            if (cambio[0] == 0 && cambio[1] == 0) {

                                                bandera_estado = true;
                                            } else {
                                                bandera_estado = false;
                                            }
                                            if (bandera_estado == true) {

                                                int res_estado = str_estado_cambio.executeUpdate();
                                                if (res_update > 0) {
                                                } else {

                                                }
                                            }
                                            str_estado_cambio.close();
                                            str_cambio.close();
                                        } catch (SQLException e) {

                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Error");
                                    }
                                    str_pago.close();
                                    str_last.close();
                                } catch (SQLException e) {
                                    JOptionPane.showMessageDialog(null, "Error!, la llamada no pudo ser agregada a la base de datos." + e);
                                }

                                //////////////////////////////////////////////
                            } else {
                                JOptionPane.showMessageDialog(null, "Error");
                            }
                            str_update.close();
                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null, "Error!, la llamada no pudo ser agregada a la base de datos." + e);
                        }
                    }
                }
            }
            actualizar();
            txt_Faltante.setText("");
            txt_Faltante_cuota.setText("");
            txt_dpi.setText("");
            txt_id.setText("");
            txt_monto_prestamo.setText("");
            txt_nombre.setText("");
            txt_pago_estipulado.setText("");
            txt_saldo_pagar.setText("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int valor = JOptionPane.showConfirmDialog(this, "¿Esta Seguro que desea regresar?", "Advertencia", JOptionPane.YES_NO_OPTION);
        if (valor == JOptionPane.YES_OPTION) {
            form_principal frm = new form_principal();
            frm.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        confirmarSalida();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txt_nombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyReleased
        filtro(txt_nombre.getText(), tbl_prestamo);
    }//GEN-LAST:event_txt_nombreKeyReleased

    private void txt_dpiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dpiKeyReleased
        filtro(txt_dpi.getText(), tbl_prestamo);
    }//GEN-LAST:event_txt_dpiKeyReleased

    private void btn_financiar_restanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_financiar_restanteActionPerformed
        // TODO add your handling code here:
        form_financiar_restante financiarRestante = new form_financiar_restante(env_CuotaFinal, env_Plazo, env_ID );
        financiarRestante.setVisible(true);
        financiarRestante.setLocationRelativeTo(this);
        this.hide();
    }//GEN-LAST:event_btn_financiar_restanteActionPerformed

    public void actualizar() {
        DefaultTableModel tbl = new DefaultTableModel();    
        tbl.addColumn("ID");
        tbl.addColumn("Nombre");
        tbl.addColumn("DPI");
        tbl.addColumn("Prestamo");
        tbl.addColumn("Saldo a pagar");
        tbl.addColumn("Cuotas Faltantes");
        tbl.addColumn("Cuotas Totales");
        tbl.addColumn("Pago estupilado");
        
        
        tbl_prestamo.setModel(tbl);

        String query = "select id_prestamo,nombre_cliente, dpi, monto_interes,saldo_faltante,cuota_faltante, cuotas,total_cuota from tbl_prestamo\n"
                + "inner join tbl_cliente \n"
                + "on tbl_prestamo.id_cliente= tbl_cliente.id_cliente \n"
                + "where estado=1";
        String[] dato = new String[8];
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
                dato[6] = result.getString(7);
                dato[7] = result.getString(8);
                tbl.addRow(dato);
            }
            str.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error!, la llamada no pudo ser agregada a la base de datos.");
        }
    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(form_pago_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_pago_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_pago_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_pago_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_pago_cliente().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_financiar_restante;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_prestamo;
    private javax.swing.JTextField txt_Faltante;
    private javax.swing.JTextField txt_Faltante_cuota;
    private javax.swing.JTextField txt_dpi;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_monto_prestamo;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_pago_estipulado;
    private javax.swing.JTextField txt_saldo_pagar;
    // End of variables declaration//GEN-END:variables
}
