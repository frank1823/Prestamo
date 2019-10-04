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

    public form_reportes() {
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
        btn_Generar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmb_mes = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txt_año = new javax.swing.JTextField();
        btn_cancelar1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_cancelar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("REPORTES");

        btn_Generar.setText("Generar");
        btn_Generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GenerarActionPerformed(evt);
            }
        });

        btn_cancelar.setText("Cancelar");

        jLabel5.setText("PAGO TOTALES DEL MES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        jLabel2.setText("Seleccione Mes:");

        cmb_mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MES", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        cmb_mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_mesActionPerformed(evt);
            }
        });

        jLabel4.setText("Ingrese Año:");

        btn_cancelar1.setText("Generar");
        btn_cancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar1ActionPerformed(evt);
            }
        });

        jLabel6.setText("PAGO TOTALES DEL MES");

        jLabel7.setText("CUANTO SE GENERO AL MES");

        btn_cancelar2.setText("Generar");
        btn_cancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(254, 254, 254))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmb_mes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_año, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(228, 228, 228))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(btn_cancelar1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Generar)
                            .addComponent(jLabel6))))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_cancelar)
                            .addComponent(btn_cancelar2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(33, 33, 33)
                        .addComponent(btn_cancelar1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(33, 33, 33)
                        .addComponent(btn_cancelar2)))
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Generar)
                    .addComponent(btn_cancelar))
                .addGap(66, 66, 66))
        );

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
                    "C:\\Users\\Kevin\\Documents\\NetBeansProjects\\Prestamo\\Diseño reporte\\pago_mes.jasper", parametros,
                    con.getConnection());
            JRPdfExporter exp = new JRPdfExporter();
            exp.setExporterInput(new SimpleExporterInput(jasperPrint));
            exp.setExporterOutput(new SimpleOutputStreamExporterOutput("C:\\Users\\Kevin\\Documents\\NetBeansProjects\\Prestamo\\reportes\\Detalle_prueba.pdf"));
            SimplePdfExporterConfiguration conf = new SimplePdfExporterConfiguration();
            exp.setConfiguration(conf);
            exp.exportReport();

            // se muestra en una ventana aparte para su descarga
            JasperPrint jasperPrintWindow = JasperFillManager.fillReport(
                    "C:\\Users\\Kevin\\Documents\\NetBeansProjects\\Prestamo\\Diseño reporte\\pago_mes.jasper", parametros,
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
                    "C:\\Users\\Kevin\\Documents\\NetBeansProjects\\Prestamo\\Diseño reporte\\reporte_mes.jasper", parametros,
                    con.getConnection());
            JRPdfExporter exp = new JRPdfExporter();
            exp.setExporterInput(new SimpleExporterInput(jasperPrint));
            exp.setExporterOutput(new SimpleOutputStreamExporterOutput("C:\\Users\\Kevin\\Documents\\NetBeansProjects\\Prestamo\\reportes\\Detalle_Inversion.pdf"));
            SimplePdfExporterConfiguration conf = new SimplePdfExporterConfiguration();
            exp.setConfiguration(conf);
            exp.exportReport();

            // se muestra en una ventana aparte para su descarga
            JasperPrint jasperPrintWindow = JasperFillManager.fillReport(
                    "C:\\Users\\Kevin\\Documents\\NetBeansProjects\\Prestamo\\Diseño reporte\\reporte_mes.jasper", parametros,
                    con.getConnection());
            JasperViewer jasperViewer = new JasperViewer(jasperPrintWindow);
            jasperViewer.setVisible(true);
        } catch (JRException ex) {

        }
    }//GEN-LAST:event_btn_cancelar2ActionPerformed

    private void btn_GenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GenerarActionPerformed
        try {
            JasperPrint jasperPrint = JasperFillManager.fillReport(
                    "C:\\Users\\Kevin\\Documents\\NetBeansProjects\\Prestamo\\Diseño reporte\\prueba1.jasper", null,
                    con.getConnection());
            JRPdfExporter exp = new JRPdfExporter();
            exp.setExporterInput(new SimpleExporterInput(jasperPrint));
            exp.setExporterOutput(new SimpleOutputStreamExporterOutput("Detalle_prueba.pdf"));
            SimplePdfExporterConfiguration conf = new SimplePdfExporterConfiguration();
            exp.setConfiguration(conf);
            exp.exportReport();

            // se muestra en una ventana aparte para su descarga
            JasperPrint jasperPrintWindow = JasperFillManager.fillReport(
                    "C:\\Users\\Kevin\\Documents\\NetBeansProjects\\Prestamo\\Diseño reporte\\prueba1.jasper", null,
                    con.getConnection());
            JasperViewer jasperViewer = new JasperViewer(jasperPrintWindow);
            jasperViewer.setVisible(true);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btn_GenerarActionPerformed

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
    private javax.swing.JButton btn_Generar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_cancelar1;
    private javax.swing.JButton btn_cancelar2;
    private javax.swing.JComboBox<String> cmb_mes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_año;
    // End of variables declaration//GEN-END:variables
}
