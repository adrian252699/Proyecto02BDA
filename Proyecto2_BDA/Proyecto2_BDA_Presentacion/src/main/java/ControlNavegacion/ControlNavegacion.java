/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlNavegacion;

import Paneles.AgregarLaboratorio;
import Paneles.AgregarLaboratorioUnidad;
import Paneles.PanelRegistroID;
import PanelesAdministrador.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author $Luis Carlos Manjarrez Gonzalez
 */
public class ControlNavegacion {

    //Paneles de modulo Administrador
    MenuAdministrador menuAdmin;

    //Paneles Generales
    JFrame framePrincipal;

    public void iniciarSistema() {
        valoresDefault();
        PanelRegistroID login = new PanelRegistroID(this);
        framePrincipal.add(login);
        framePrincipal.setVisible(true);
    }

    public void mostrarPantallaAdminisrador() {
        menuAdmin = new MenuAdministrador(this);
        framePrincipal.dispose();
        menuAdmin.setVisible(true);
    }

    public void valoresDefault() {
        framePrincipal = new JFrame();
        framePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framePrincipal.setSize(1050, 650);
    }

    public void cambiarFrame(JPanel jpanel) {
        framePrincipal.getContentPane().removeAll();
        framePrincipal.setContentPane(jpanel);
        framePrincipal.repaint();
        framePrincipal.revalidate();
    }

    public void mostrarPantallaAgregarLaboratorio() {
        AgregarLaboratorioUnidad panel = new AgregarLaboratorioUnidad(this);
        cambiarFrame(panel);
    }

    public void mostrarPantallaFormularioLaboratorio() {
        AgregarLaboratorio panel = new AgregarLaboratorio(this);
        cambiarFrame(panel);
    }

    //----------------------Errores (JOptionPane)----------------------
    public boolean validarCredenciales(String idTextField, String password) {
        //Mientras
        String idAdmin ="12345";
        String passwordAdmin ="admin1";
        String idAlumno ="54321";
        String passwordAlumno ="alumno1";
        
        if(idTextField.equals(idTextField)&& passwordAdmin.equals(password)){
            //no recuerdo si las validaciones van aqui o deben de ir enun lugar especifico
            return true;
        }
        else{
            // aqui mostraremos la pantalla para cuando se registre un alumno
            //mostrarPantallaSeleccionarComputadora();
            return false;

        }
        // esta validacion es por minetras, deberemos hacer una consulta pa ver si esta en Admin
        // o si estan en Estudiantes buscandolos por id
        //no recuerdo si las validaciones van aqui o en negocio
        //implementar validacion tanto de ParseLong (contenga carracteres numericos)
        // y verificar en BD
    }

    public boolean mostrarErrorCredenciales() {
        JOptionPane.showMessageDialog(framePrincipal, "Credenciales Incorrectas", "Eror", JOptionPane.ERROR_MESSAGE);
        return false;
    }

}
