/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Paneles;

import ControlNavegacion.ControlAdmin;
import java.util.Calendar;

/**
 *
 * @author Sandra
 */
public class AgregarLaboratorio extends javax.swing.JPanel {
    private ControlAdmin control;
    

    /**
     * Creates new form AgregarLaboratorio
     */
    public AgregarLaboratorio() {
        initComponents();
    }
    public AgregarLaboratorio(ControlAdmin control) {
        this.control = control;
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
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        HoraInicio = new javax.swing.JSpinner();
        MinInicio = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        horaFin = new javax.swing.JSpinner();
        MinFin = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Agregar laboratorio");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setText("Nombre");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 210, -1));

        jLabel3.setText("Abierto desde");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 80, -1));

        HoraInicio.setMaximumSize(new java.awt.Dimension(64, 22));
        add(HoraInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        MinInicio.setMaximumSize(new java.awt.Dimension(64, 22));
        add(MinInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel4.setText("min");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        jLabel5.setText("hr");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        btnContinuar.setText("Continuar");
        btnContinuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnContinuarMouseClicked(evt);
            }
        });
        add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, -1, -1));

        btnRegresar.setText("cancelar");
        add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jLabel6.setText("Cierra");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 80, -1));

        horaFin.setMaximumSize(new java.awt.Dimension(64, 22));
        add(horaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        MinFin.setMaximumSize(new java.awt.Dimension(64, 22));
        add(MinFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        jLabel7.setText("min");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        jLabel8.setText("hr");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinuarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContinuarMouseClicked
        // TODO add your handling code here:
        obtenerDatosLab();
        control.mostrarPantallaConfirmarLaboratorio();
    }//GEN-LAST:event_btnContinuarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner HoraInicio;
    private javax.swing.JSpinner MinFin;
    private javax.swing.JSpinner MinInicio;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JSpinner horaFin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

public void obtenerDatosLab(){
    String nombreLab = txtNombre.getText();
    int horaInicio = (int) HoraInicio.getValue();
    int minutoInicio = (int) MinInicio.getValue();
    int horaFinal = (int) horaFin.getValue();
    int minutoFinal = (int) MinFin.getValue();
     //hora Inicio
    Calendar calendarInicio = Calendar.getInstance();
    calendarInicio.set(Calendar.HOUR_OF_DAY, horaInicio);
    calendarInicio.set(Calendar.MINUTE, minutoInicio);
    calendarInicio.set(Calendar.SECOND, 0);
    calendarInicio.set(Calendar.MILLISECOND, 0);
   //hora fin
    Calendar calendarFin = Calendar.getInstance();
    calendarFin.set(Calendar.HOUR_OF_DAY, horaFinal);
    calendarFin.set(Calendar.MINUTE, minutoFinal);
    calendarFin.set(Calendar.SECOND, 0);
    calendarFin.set(Calendar.MILLISECOND, 0);
    control.setNombreLab(nombreLab);
    control.setHorarioLab(calendarInicio,calendarFin);
}


}
