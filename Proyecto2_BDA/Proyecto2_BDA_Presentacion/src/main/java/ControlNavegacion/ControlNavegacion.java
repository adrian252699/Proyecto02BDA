/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlNavegacion;

import Paneles.AgregarLaboratorio;
import Paneles.AgregarLaboratorioUnidad;
import Paneles.PanelRegistroID;
import PanelesApartar.SeleccionLaboratorio;
import PanelesAdministrador.*;
import PanelesApartar.ConfirmarApartado;
import PanelesApartar.SeleccionComputadora;
import PanelesApartar.SeleccionTiempoApartado;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author $Luis Carlos Manjarrez Gonzalez
 */
public class ControlNavegacion {

    //Paneles de modulo Administrador
    private MenuAdministrador menuAdmin;
    private ListadoLaboratoriosAdmin listadoLaboratorio;
    private ListadoComputadorasAdmin listadoComputadoras;
    private ListadoBloqueos listadoBloqueos;
    
    //Paneles Apartar
    private SeleccionLaboratorio seleccionLaboratorio;
    private SeleccionComputadora seleccionComputadora;
    private SeleccionTiempoApartado seleccionTiempoApartado;
    private ConfirmarApartado confirmarApartado;
    //Paneles Generales
    private JFrame framePrincipal;

    public void iniciarSistema() {
        valoresDefault();
    }
    //------------------------------------flujo Admin------------------------------------
    public void mostrarListadoLaboratoriosAdmin(){
        listadoLaboratorio = new ListadoLaboratoriosAdmin(this);
        menuAdmin.cambiarPanel(listadoLaboratorio);
    }
    
    public void mostrarListadoComputadorasAdmin(){
        listadoComputadoras = new ListadoComputadorasAdmin(this);
        menuAdmin.cambiarPanel(listadoComputadoras);
    }
    
    public void mostrarPantallaBloqueosAdmin(){
        listadoBloqueos = new ListadoBloqueos(this);
        menuAdmin.cambiarPanel(listadoBloqueos);
    }

    public void mostrarPantallaAdminisrador() {
        menuAdmin = new MenuAdministrador(this);
        framePrincipal.dispose();
        menuAdmin.setVisible(true);
    }

    public void cambiarPanel(JPanel jpanel) {
        framePrincipal.getContentPane().removeAll();
        framePrincipal.setContentPane(jpanel);
        framePrincipal.repaint();
        framePrincipal.revalidate();
    }

    public void mostrarPantallaAgregarLaboratorio() {
        AgregarLaboratorioUnidad panel = new AgregarLaboratorioUnidad(this);
        cambiarPanel(panel);
    }

    public void mostrarPantallaFormularioLaboratorio() {
        AgregarLaboratorio panel = new AgregarLaboratorio(this);
        cambiarPanel(panel);
    } 
    //------------------------------------flujo Admin------------------------------------
    
    //------------------------------------flujo Apartar------------------------------------
    
    public void mostrarPantallaSeleccionLaboratorio(){
        seleccionLaboratorio = new SeleccionLaboratorio(this);
        cambiarPanel(seleccionLaboratorio);
    }
    public void mostrarPantallaSeleccionComputadora(){
        seleccionComputadora = new SeleccionComputadora(this);
        cambiarPanel(seleccionComputadora);
    }
    public void mostrarPantallaTiempoApartado(){
        seleccionTiempoApartado = new SeleccionTiempoApartado(this);
        cambiarPanel(seleccionTiempoApartado);
    }
    public void mostrarPantallaConfirmarApartado(){
        confirmarApartado = new ConfirmarApartado(this);
        cambiarPanel(confirmarApartado);
    }
    
    
    
    
    
    
    
    
    
    //------------------------------------flujo Apartar------------------------------------
    public void valoresDefault(){
        framePrincipal = new JFrame();
        framePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framePrincipal.setSize(1050,650);
        framePrincipal.setLocationRelativeTo(null);
        PanelRegistroID login = new PanelRegistroID(this);
        framePrincipal.add(login);
        framePrincipal.setVisible(true);
    }
    
    public void cambiarPanel(JFrame frame, JPanel panelActual){
        frame.getContentPane().removeAll();
        frame.setContentPane(panelActual);
        frame.repaint();
        frame.revalidate();
    }
 
    //----------------------Errores (JOptionPane)----------------------
    public boolean validarCredenciales(String idTextField, String password) {
        //Mientras
        String idAdmin ="12345";
        String passwordAdmin ="admin1";
        String idAlumno ="54321";
        String passwordAlumno ="alumno1";
        // esta validacion es por minetras, deberemos hacer una consulta pa ver si esta en Admin
        // o si estan en Estudiantes BUSCANDOLOS POR ID
        //no recuerdo si las validaciones van aqui o en negocio
        // y verificar en BD
        if(idTextField.equals(idAdmin)&& password.equals(passwordAdmin)){
            //no recuerdo si las validaciones van aqui o deben de ir enun lugar especifico
            return true;
        }else if(idTextField.equals(idAlumno)&& passwordAlumno.equals(password)){
            // aqui mostraremos la pantalla para cuando se registre un alumno
            //mostrarPantallaSeleccionarComputadora();
            return false;
      
        }
        return mostrarErrorCredenciales();
        }
        
    

    public boolean mostrarErrorCredenciales() {
        JOptionPane.showMessageDialog(framePrincipal, "Credenciales Incorrectas", "Eror", JOptionPane.ERROR_MESSAGE);
        return false;
    } 
}
