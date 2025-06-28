/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlNavegacion;

import CasoAdministrador.CasoAdministrador;
import DTOs.LoginAlumnoDTO;
import FabricaBOs.FabricaObjetosNegocio;
import Interfacez.IAlumnoBO;
import Interfacez.IComputadoraBO;
import Interfacez.ILaboratorioBO;
import Paneles.PanelRegistroID;
import PanelesApartar.SeleccionLaboratorio;
import entidades.AlumnoDominio;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author jalt2
 */
public class ControlLoginAlumno {
    
    private IAlumnoBO alumnoBO;
    private ILaboratorioBO labBO;
    private IComputadoraBO compBO;
    private SeleccionLaboratorio frmSeleccionLaboratorio;
    private PanelRegistroID login;
    private JFrame framePrincipal;
    private CasoAdministrador casoAdmin;
     
    public ControlLoginAlumno() {
        this.alumnoBO = FabricaObjetosNegocio.crearAlumnoBO();
        this.labBO = FabricaObjetosNegocio.crearLaboratorioBO();
        this.compBO = FabricaObjetosNegocio.crearComputadoraBO();
    }
    
    public void iniciarSesion(){
        login = new PanelRegistroID(alumnoBO, this);
        
        login.getBtnConfirmar().addActionListener(e -> {
            try {
                Long id = Long.valueOf(login.getCampoId().toString());
                String password = login.getCampoPassword().toString();
                
                LoginAlumnoDTO alumnoActual = new LoginAlumnoDTO(alumnoBO.consultarEstudiantePorId(id));
                
                if (alumnoActual.getAlumnoActual().getPassword().equals(password)) {
                    JOptionPane.showMessageDialog(login, "Credenciales Correctas", "Inicio de sesion", JOptionPane.ERROR_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(login, "Credenciales incorrectas", "Inicio de sesion", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception ex) {
                new Exception(ex.getMessage());
            }
            
        });
        
    }
    
    public void mostrarPantallaSeleccionLaboratorio(){
        frmSeleccionLaboratorio = new SeleccionLaboratorio(labBO,this);
        cambiarPanel(frmSeleccionLaboratorio);
    }
    
    public void valoresDefault(){
        framePrincipal = new JFrame();
        framePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framePrincipal.setSize(1050,650);
        framePrincipal.setLocationRelativeTo(null);
        PanelRegistroID login = new PanelRegistroID(alumnoBO,this);
        framePrincipal.add(login);
        framePrincipal.setVisible(true);
        casoAdmin = new CasoAdministrador();
        
    }
    
    public void cambiarPanel(JPanel jpanel) {
        framePrincipal.getContentPane().removeAll();
        framePrincipal.setContentPane(jpanel);
        framePrincipal.repaint();
        framePrincipal.revalidate();
    }
}
