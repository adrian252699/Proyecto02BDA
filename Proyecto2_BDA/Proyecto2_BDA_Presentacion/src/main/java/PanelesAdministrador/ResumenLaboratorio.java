/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package PanelesAdministrador;

import ControlNavegacion.ControlAdmin;
import DTOs.AgregarLaboratorioDTO;
import java.time.LocalDateTime;
import java.util.Calendar;

/**
 *
 * @author HP
 */
public class ResumenLaboratorio extends javax.swing.JPanel {
    private ControlAdmin control;
    private AgregarLaboratorioDTO laboratorioTemporal;
    /**
     * Creates new form ResumenLaboratorio
     */
    public ResumenLaboratorio(ControlAdmin control) {
        this.control = control;
        initComponents();
        valoresDefault();
        laboratorioTemporal = this.control.getLaboratorioTemporal();
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
        labelAdminCambios = new javax.swing.JLabel();
        labelUnidad = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelHorario = new javax.swing.JLabel();
        campoUnidad = new javax.swing.JLabel();
        labelFechaCreacion = new javax.swing.JLabel();
        campoHorario = new javax.swing.JLabel();
        campoFechaCreacion = new javax.swing.JLabel();
        campoAdmin = new javax.swing.JLabel();
        campoNombreLab = new javax.swing.JLabel();
        BtnCancelar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Agregar Laboratorio");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Verifique que todos los datos sean correctos");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        labelAdminCambios.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelAdminCambios.setText("Creado Por(administrador):");
        add(labelAdminCambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        labelUnidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelUnidad.setText("Unidad");
        add(labelUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        labelNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelNombre.setText("Nombre:");
        add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, -1, -1));

        labelHorario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelHorario.setText("Horario");
        add(labelHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, -1, -1));

        campoUnidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoUnidad.setText("ITSON");
        add(campoUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, -1));

        labelFechaCreacion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelFechaCreacion.setText("Fecha Creacion:");
        add(labelFechaCreacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, -1));

        campoHorario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoHorario.setText("Fecha Creacion:");
        add(campoHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, -1));

        campoFechaCreacion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoFechaCreacion.setText("Fecha Creacion:");
        add(campoFechaCreacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, -1, -1));

        campoAdmin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoAdmin.setText("Fecha Creacion:");
        add(campoAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, -1, -1));

        campoNombreLab.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoNombreLab.setText("Fecha Creacion:");
        add(campoNombreLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, -1, -1));

        BtnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BtnCancelar.setText("Cancelar");
        add(BtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 130, 40));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Confirmar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, 130, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        control.guardarLaboratorio(laboratorioTemporal);
    }//GEN-LAST:event_jButton2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JLabel campoAdmin;
    private javax.swing.JLabel campoFechaCreacion;
    private javax.swing.JLabel campoHorario;
    private javax.swing.JLabel campoNombreLab;
    private javax.swing.JLabel campoUnidad;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelAdminCambios;
    private javax.swing.JLabel labelFechaCreacion;
    private javax.swing.JLabel labelHorario;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelUnidad;
    // End of variables declaration//GEN-END:variables

    public void valoresDefault(){
        laboratorioTemporal = control.getLaboratorioTemporal();
        System.out.println("Laboratorio en resumenLab;   " + laboratorioTemporal.toString());
        
        campoNombreLab.setText(laboratorioTemporal.getNombre());
        String horario = String.format("%02d:%02d - %02d:%02d",
        laboratorioTemporal.getHoraInicio().get(Calendar.HOUR_OF_DAY),
        laboratorioTemporal.getHoraInicio().get(Calendar.MINUTE),
        laboratorioTemporal.getHoraFin().get(Calendar.HOUR_OF_DAY),
        laboratorioTemporal.getHoraFin().get(Calendar.MINUTE));
        campoHorario.setText(horario);
        LocalDateTime fechaActual = LocalDateTime.now();
        campoFechaCreacion.setText(fechaActual.toString());    
        campoUnidad.setText(laboratorioTemporal.getUnidadAcademica().getNombreUnidad()); 
    }


}
