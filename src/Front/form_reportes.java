/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Front;

/**
 *
 * @author Kevin
 */
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimplePdfExporterConfiguration;
import net.sf.jasperreports.view.JasperViewer;

public class form_reportes extends javax.swing.JFrame {

    /**
     * Creates new form form_reportes
     */
    conexcion con = new conexcion();
    SimpleDateFormat dformat = new SimpleDateFormat("dd-MM-yyyy");
    LocalDate local = LocalDate.now();
    Date date = java.sql.Date.valueOf(local);
    String fecha = dformat.format(date);
    public form_reportes() {
        initComponents();
        setResizable(false);
        cerrar();
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
        btn_cancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cmb_mes = new javax.swing.JComboBox<String>();
        jLabel4 = new javax.swing.JLabel();
        txt_año = new javax.swing.JTextField();
        btn_cancelar1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_cancelar2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btn_cancelar3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btn_cancelar4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reporteria");
        setMaximumSize(new java.awt.Dimension(524, 524));
        setMinimumSize(new java.awt.Dimension(524, 524));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("REPORTES");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(218, 35, 128, 28);

        btn_cancelar.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit.png"))); // NOI18N
        btn_cancelar.setText("CANCELAR");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancelar);
        btn_cancelar.setBounds(149, 438, 122, 41);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Seleccione Mes:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(175, 102, 86, 14);

        cmb_mes.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cmb_mes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MES", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        cmb_mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_mesActionPerformed(evt);
            }
        });
        getContentPane().add(cmb_mes);
        cmb_mes.setBounds(279, 97, 91, 24);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Ingrese Año:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(194, 132, 67, 14);

        txt_año.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txt_año.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_añoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_año);
        txt_año.setBounds(279, 128, 91, 22);

        btn_cancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/report4.png"))); // NOI18N
        btn_cancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancelar1);
        btn_cancelar1.setBounds(46, 207, 73, 74);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("PAGOS MENSUALES");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 168, 118, 24);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("GENERADO MENSUALMENTE");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(155, 173, 170, 14);

        btn_cancelar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/report1.png"))); // NOI18N
        btn_cancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancelar2);
        btn_cancelar2.setBounds(220, 210, 73, 74);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("GENERADO POR SOCIO");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(343, 168, 139, 24);

        btn_cancelar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/report3.png"))); // NOI18N
        btn_cancelar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancelar3);
        btn_cancelar3.setBounds(380, 210, 73, 74);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setText("GANANCIA COMISION POR MES");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(155, 306, 189, 14);

        btn_cancelar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/report5.png"))); // NOI18N
        btn_cancelar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancelar4);
        btn_cancelar4.setBounds(220, 332, 73, 74);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back.png"))); // NOI18N
        jButton1.setText("REGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(283, 436, 130, 44);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/report6.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 520, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_mesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_mesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_mesActionPerformed

    private void btn_cancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar1ActionPerformed

        int seleccion = cmb_mes.getSelectedIndex();
        String mes = " ", año, fecha_u = "";
        switch (seleccion) {
            case 1:
                mes = "01";
                break;
            case 2:
                mes = "02";
                break;
            case 3:
                mes = "03";
                break;
            case 4:
                mes = "04";
                break;
            case 5:
                mes = "05";
                break;
            case 6:
                mes = "06";
                break;
            case 7:
                mes = "07";
                break;
            case 8:
                mes = "08";
                break;
            case 9:
                mes = "09";
                break;
            case 10:
                mes = "10";
                break;
            case 11:
                mes = "11";
                break;
            case 12:
                mes = "12";
                break;
        }
        año = txt_año.getText();
        fecha_u = mes + "-" + año;
        Map<String, Object> parametros = new HashMap<>();
        parametros.put("idfecha", new String(fecha_u));
        try {
            JasperPrint jasperPrint = JasperFillManager.fillReport(
                    "C:\\Users\\Franklyn Escobar\\Documents\\GitHub\\prestamo\\Diseño reporte\\mes_reporte.jasper", parametros,
                    con.getConnection());
            JRPdfExporter exp = new JRPdfExporter();
            exp.setExporterInput(new SimpleExporterInput(jasperPrint));
            exp.setExporterOutput(new SimpleOutputStreamExporterOutput("C:\\Users\\Franklyn Escobar\\Documents\\GitHub\\prestamo\\Diseño reporte\\"+fecha+"Pagos_del_Mes.pdf"));
            SimplePdfExporterConfiguration conf = new SimplePdfExporterConfiguration();
            exp.setConfiguration(conf);
            exp.exportReport();

            // se muestra en una ventana aparte para su descarga
            JasperPrint jasperPrintWindow = JasperFillManager.fillReport(
                    "C:\\Users\\Franklyn Escobar\\Documents\\GitHub\\prestamo\\Diseño reporte\\mes_reporte.jasper", parametros,
                    con.getConnection());
            JasperViewer jasperViewer = new JasperViewer(jasperPrintWindow);
            jasperViewer.setVisible(true);
        } catch (JRException ex) {

        }
    }//GEN-LAST:event_btn_cancelar1ActionPerformed

    private void btn_cancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar2ActionPerformed
        int seleccion = cmb_mes.getSelectedIndex();
        String mes = " ", año, fecha_u = "";
        switch (seleccion) {
            case 1:
                mes = "01";
                break;
            case 2:
                mes = "02";
                break;
            case 3:
                mes = "03";
                break;
            case 4:
                mes = "04";
                break;
            case 5:
                mes = "05";
                break;
            case 6:
                mes = "06";
                break;
            case 7:
                mes = "07";
                break;
            case 8:
                mes = "08";
                break;
            case 9:
                mes = "09";
                break;
            case 10:
                mes = "10";
                break;
            case 11:
                mes = "11";
                break;
            case 12:
                mes = "12";
                break;
        }
        año = txt_año.getText();
        fecha_u = mes + "-" + año;
        Map<String, Object> parametros = new HashMap<>();
        parametros.put("idfecha", new String(fecha_u));
        try {
            JasperPrint jasperPrint = JasperFillManager.fillReport(
                    "C:\\Users\\Franklyn Escobar\\Documents\\GitHub\\prestamo\\Diseño reporte\\reporte_mes.jasper", parametros,
                    con.getConnection());
            JRPdfExporter exp = new JRPdfExporter();
            exp.setExporterInput(new SimpleExporterInput(jasperPrint));
            exp.setExporterOutput(new SimpleOutputStreamExporterOutput("C:\\Users\\Franklyn Escobar\\Documents\\GitHub\\prestamo\\Diseño reporte\\"+fecha+"Detalle_Inversion.pdf"));
            SimplePdfExporterConfiguration conf = new SimplePdfExporterConfiguration();
            exp.setConfiguration(conf);
            exp.exportReport();

            // se muestra en una ventana aparte para su descarga
            JasperPrint jasperPrintWindow = JasperFillManager.fillReport(
                    "C:\\Users\\Franklyn Escobar\\Documents\\GitHub\\prestamo\\Diseño reporte\\reporte_mes.jasper", parametros,
                    con.getConnection());
            JasperViewer jasperViewer = new JasperViewer(jasperPrintWindow);
            jasperViewer.setVisible(true);
        } catch (JRException ex) {

        }
    }//GEN-LAST:event_btn_cancelar2ActionPerformed

    private void btn_cancelar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar3ActionPerformed
        int seleccion = cmb_mes.getSelectedIndex();
        String mes = " ", año, fecha_u = "";
        switch (seleccion) {
            case 1:
                mes = "01";
                break;
            case 2:
                mes = "02";
                break;
            case 3:
                mes = "03";
                break;
            case 4:
                mes = "04";
                break;
            case 5:
                mes = "05";
                break;
            case 6:
                mes = "06";
                break;
            case 7:
                mes = "07";
                break;
            case 8:
                mes = "08";
                break;
            case 9:
                mes = "09";
                break;
            case 10:
                mes = "10";
                break;
            case 11:
                mes = "11";
                break;
            case 12:
                mes = "12";
                break;
        }
        año = txt_año.getText();
        fecha_u = mes + "-" + año;
        Map<String, Object> parametros = new HashMap<>();
        parametros.put("idfecha", new String(fecha_u));
        try {
            JasperPrint jasperPrint = JasperFillManager.fillReport(
                    "C:\\Users\\Franklyn Escobar\\Documents\\GitHub\\prestamo\\Diseño reporte\\Genero_socio_mes.jasper", parametros,
                    con.getConnection());
            JRPdfExporter exp = new JRPdfExporter();
            exp.setExporterInput(new SimpleExporterInput(jasperPrint));
            exp.setExporterOutput(new SimpleOutputStreamExporterOutput("C:\\Users\\Franklyn Escobar\\Documents\\GitHub\\prestamo\\Diseño reporte\\"+fecha+"Detalle_socio.pdf"));
            SimplePdfExporterConfiguration conf = new SimplePdfExporterConfiguration();
            exp.setConfiguration(conf);
            exp.exportReport();

            // se muestra en una ventana aparte para su descarga
            JasperPrint jasperPrintWindow = JasperFillManager.fillReport(
                    "C:\\Users\\Franklyn Escobar\\Documents\\GitHub\\prestamo\\Diseño reporte\\Genero_socio_mes.jasper", parametros,
                    con.getConnection());
            JasperViewer jasperViewer = new JasperViewer(jasperPrintWindow);
            jasperViewer.setVisible(true);
        } catch (JRException ex) {

        }
    }//GEN-LAST:event_btn_cancelar3ActionPerformed

    private void btn_cancelar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar4ActionPerformed
        int seleccion = cmb_mes.getSelectedIndex();
        String mes = " ", año, fecha_u = "";
        switch (seleccion) {
            case 1:
                mes = "01";
                break;
            case 2:
                mes = "02";
                break;
            case 3:
                mes = "03";
                break;
            case 4:
                mes = "04";
                break;
            case 5:
                mes = "05";
                break;
            case 6:
                mes = "06";
                break;
            case 7:
                mes = "07";
                break;
            case 8:
                mes = "08";
                break;
            case 9:
                mes = "09";
                break;
            case 10:
                mes = "10";
                break;
            case 11:
                mes = "11";
                break;
            case 12:
                mes = "12";
                break;
        }
        año = txt_año.getText();
        fecha_u = mes + "-" + año;
        Map<String, Object> parametros = new HashMap<>();
        parametros.put("idfecha", new String(fecha_u));
        try {
            JasperPrint jasperPrint = JasperFillManager.fillReport(
                    "C:\\Users\\Franklyn Escobar\\Documents\\GitHub\\prestamo\\Diseño reporte\\Comisiones_mes.jasper", parametros,
                    con.getConnection());
            JRPdfExporter exp = new JRPdfExporter();
            exp.setExporterInput(new SimpleExporterInput(jasperPrint));
            exp.setExporterOutput(new SimpleOutputStreamExporterOutput("C:\\Users\\Franklyn Escobar\\Documents\\GitHub\\prestamo\\Diseño reporte"+fecha+"Detalle_comision.pdf"));
            SimplePdfExporterConfiguration conf = new SimplePdfExporterConfiguration();
            exp.setConfiguration(conf);
            exp.exportReport();

            // se muestra en una ventana aparte para su descarga
            JasperPrint jasperPrintWindow = JasperFillManager.fillReport(
                    "C:\\Users\\Franklyn Escobar\\Documents\\GitHub\\prestamo\\Diseño reporte\\Comisiones_mes.jasper", parametros,
                    con.getConnection());
            JasperViewer jasperViewer = new JasperViewer(jasperPrintWindow);
            jasperViewer.setVisible(true);
        } catch (JRException ex) {

        }
    }//GEN-LAST:event_btn_cancelar4ActionPerformed

    private void txt_añoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_añoKeyTyped
        char valida = evt.getKeyChar();
        if (Character.isLetter(valida)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo numeros");
        } else {
            if (txt_año.getText().length() == 4) {
                getToolkit().beep();
                evt.consume();
                JOptionPane.showMessageDialog(null, "No mas de 4 digitos");
            }
        }
    }//GEN-LAST:event_txt_añoKeyTyped

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
         confirmarSalida();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int valor = JOptionPane.showConfirmDialog(this, "¿Esta Seguro que desea regresar?", "Advertencia", JOptionPane.YES_NO_OPTION);
        if (valor == JOptionPane.YES_OPTION) {
        form_principal frm = new form_principal();
        frm.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(form_reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_reportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_cancelar1;
    private javax.swing.JButton btn_cancelar2;
    private javax.swing.JButton btn_cancelar3;
    private javax.swing.JButton btn_cancelar4;
    private javax.swing.JComboBox<String> cmb_mes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_año;
    // End of variables declaration//GEN-END:variables
}
