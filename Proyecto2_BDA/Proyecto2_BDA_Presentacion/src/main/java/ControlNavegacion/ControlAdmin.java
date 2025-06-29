/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlNavegacion;

import CasoAdministrador.CasoAdministrador;
import DTOs.AgregarComputadoraDTO;
import DTOs.AgregarLaboratorioDTO;
import DTOs.NuevaUnidadAcademicaDTO;
import FabricaBOs.FabricaObjetosNegocio;
import Interfacez.IAlumnoBO;
import Interfacez.IComputadoraBO;
import Interfacez.ILaboratorioBO;
import Interfacez.IUnidadAcademicaBO;
import Paneles.AgregarComputadora;
import Paneles.AgregarLaboratorio;
import Paneles.PanelRegistroID;
import PanelesApartar.SeleccionLaboratorio;
import PanelesAdministrador.*;
import PanelesApartar.ConfirmarApartado;
import PanelesApartar.SeleccionComputadora;
import PanelesApartar.SeleccionTiempoApartado;
import entidades.ComputadoraDominio;
import entidades.LaboratorioDominio;
import entidades.UnidadAcademicaDominio;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author $Luis Carlos Manjarrez Gonzalez
 */
public class ControlAdmin {

    //Paneles de modulo Administrador
    private MenuAdministrador menuAdmin;
    private ListadoLaboratoriosAdmin listadoLaboratorio;
    private ListadoComputadorasAdmin listadoComputadoras;
    private ListadoBloqueos listadoBloqueos;
    private ResumenLaboratorio confirmarLaboratorio;
    private SeleccionarUnidad listadoUnidades;
    private PanelRegistroID login;
    private AgregarComputadora agregarComputadora;
    
    //FabricaBOs
    private FabricaObjetosNegocio ManejadorBO;
    //ObjetosBOs
    private IAlumnoBO alumnoBO;
    private IComputadoraBO computadoraBO;
    private ILaboratorioBO laboratorioBO;
    private IUnidadAcademicaBO unidadAcademicaBO;
    
    //Casos 
    //Admin
    private CasoAdministrador casoAdmin;
    

    //DTOs Temporales para creacion
    private AgregarLaboratorioDTO laboratorioTemporal;
    private NuevaUnidadAcademicaDTO unidadTemporal;
    private AgregarComputadoraDTO computadoraTemporal;
    
    //Paneles Apartar
    private SeleccionLaboratorio seleccionLaboratorio;
    private SeleccionComputadora seleccionComputadora;
    private SeleccionTiempoApartado seleccionTiempoApartado;
    private ConfirmarApartado confirmarApartado;
    
    //Paneles Generales
    private JFrame framePrincipal;
    
    public void iniciar(){
        valoresDefault();
        
    }
    public void valoresDefault(){
        this.casoAdmin = new CasoAdministrador();
        menuAdmin = new MenuAdministrador(this);
        menuAdmin.setVisible(true);
        menuAdmin.setLocationRelativeTo(null);
    }
    
    //------------------------------------flujo Admin---------------------------------------
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
    
    public void mostrarPantallaSeleccionarUnidad() {
        listadoUnidades = new SeleccionarUnidad(this);
        menuAdmin.cambiarPanel(listadoUnidades);
    }

    public void mostrarPantallaFormularioLaboratorio() {
        AgregarLaboratorio panel = new AgregarLaboratorio(this);
        menuAdmin.cambiarPanel(panel);
    } 
    public void mostrarPantallaConfirmarLaboratorio(){
        confirmarLaboratorio = new ResumenLaboratorio(this);
        menuAdmin.cambiarPanel(confirmarLaboratorio);
    }
    public void mostrarPantallaAgregarComputadora(){
        agregarComputadora = new AgregarComputadora(this);
        menuAdmin.cambiarPanel(confirmarLaboratorio);
    }
    public List<LaboratorioDominio> cargarLaboratrios(){
        return laboratorioBO.consultarLaboratorios();
    }
    public List<LaboratorioDominio> consultarLaboratoriosUnidadAcademica(Long id){
        return laboratorioBO.consultarLaboratoriosUnidadAcademica(id);
    }
    public List<UnidadAcademicaDominio> cargarUnidadesAcademicas(){
         return unidadAcademicaBO.consultarUnidades();
    }
    public UnidadAcademicaDominio consultarUnidadesAcademicasId(Long id){
         return unidadAcademicaBO.consultarUnidadAcademicaPorId(id);
    }
    
    public List<ComputadoraDominio> cargarComputadoras(){
         return computadoraBO.consultarComputadoras();
    }
    
    

    public ControlAdmin() {
        this.alumnoBO = FabricaObjetosNegocio.crearAlumnoBO();
        this.laboratorioBO = FabricaObjetosNegocio.crearLaboratorioBO();
        this.computadoraBO = FabricaObjetosNegocio.crearComputadoraBO();
        this.unidadAcademicaBO = FabricaObjetosNegocio.crearUnidadAcademicaBO();
//        valoresDefault();
    
    }
    
    //------------------------------------flujo Admin---------------------------------------
    
    //------------------------------------crear Computadora Admin---------------------------------------
    public void setNumeroPC(String numPC){
        computadoraTemporal.setNumero(numPC);
    }
    public void setTipoPC(String tipo){
//        computadoraTemporal.setTipo(tipo);
    }
    public void setLaboratorioPC(LaboratorioDominio lab){
        computadoraTemporal.setLaboratorio(lab);
    }
    public void setDireccionIPPC(String direccionIP){
        computadoraTemporal.setDireccionIP(direccionIP);
    }
    public void setListaSoftwares(ArrayList listaSoftwares){
        computadoraTemporal.setListaSoftWare(listaSoftwares);
    }
    
    public ComputadoraDominio agregarComputadora(AgregarComputadoraDTO pc){
        return computadoraBO.agregarComputadora(pc);   
    }
//    public void setUnidadPC(UnidadAcademicaDominio unidad){
//        
//    }
    
    
    //------------------------------------crear Computadora Admin---------------------------------------
    //------------------------------------crear Lab Admin---------------------------------------
    
    public void setUnidadAcademica(UnidadAcademicaDominio unidadAcademica){
        NuevaUnidadAcademicaDTO unidadTemporal = new NuevaUnidadAcademicaDTO(unidadAcademica.getNombreUnidad());
        this.unidadTemporal= unidadTemporal;
        UnidadAcademicaDominio unidadLab = new UnidadAcademicaDominio(unidadAcademica.getNombreUnidad());
        casoAdmin.setUnidadLab(unidadLab);
        setLaboratorioTemporal();
        
    }
    public UnidadAcademicaDominio getUnidadTemporal(Long id){
        return unidadAcademicaBO.consultarUnidadAcademicaPorId(id);
        
    }
    public void setUnidadLab(Long id){       
            System.out.println("unidad consultada en BO por ID(control):     "+ unidadAcademicaBO.consultarUnidadAcademicaPorId(id).toString() );           
            casoAdmin.setUnidadLab(unidadAcademicaBO.consultarUnidadAcademicaPorId(id));
           
    }
    public void setNombreLab(String nombre){
        casoAdmin.setNombreLab(nombre);
        setLaboratorioTemporal();
    }
    public void setHorarioLab(Calendar fechaInicioLab, Calendar fechaFinLab){
        casoAdmin.setHorarioLab(fechaInicioLab,fechaFinLab);
        setLaboratorioTemporal();
    }
//    public void setAdminCambios(){
//        casoAdmin.setAdminCambios()
//    }
    public void guardarLaboratorio(AgregarLaboratorioDTO lab){
        mostrarExitoGuardarLab();
        laboratorioBO.agregarLaboratorio(lab);
        mostrarListadoLaboratoriosAdmin();
    }
    public void setLaboratorioTemporal(){
        laboratorioTemporal = casoAdmin.getLaboratorioTemporal();
    }
    public AgregarLaboratorioDTO getLaboratorioTemporal(){
        return casoAdmin.getLaboratorioTemporal();
    }
    
    
    
    
    
    
    
    //------------------------------------crear Lab Admin---------------------------------------
    
    //------------------------------------flujo Apartar-------------------------------------
    
//    public void mostrarPantallaSeleccionLaboratorio(){
//        seleccionLaboratorio = new SeleccionLaboratorio(this);
//        cambiarPanel(seleccionLaboratorio);
//    }
//    public void mostrarPantallaSeleccionComputadora(){
//        seleccionComputadora = new SeleccionComputadora(this);
//        cambiarPanel(seleccionComputadora);
//    }
//    public void mostrarPantallaTiempoApartado(){
//        seleccionTiempoApartado = new SeleccionTiempoApartado(this);
//        cambiarPanel(seleccionTiempoApartado);
//    }
    public void mostrarPantallaConfirmarApartado(){
        confirmarApartado = new ConfirmarApartado(this);
        cambiarPanel(confirmarApartado);
    }

    //------------------------------------flujo Apartar-------------------------------------
    
    //------------------------------------Metodos auxiliares------------------------------------
//    public void valoresDefault(){
//        framePrincipal = new JFrame();
//        framePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        framePrincipal.setSize(1050,650);
//        framePrincipal.setLocationRelativeTo(null);
//        PanelRegistroID login = new PanelRegistroID(this);
//        framePrincipal.add(login);
//        framePrincipal.setVisible(true);
//        casoAdmin = new CasoAdministrador();
//        
//    }
    
//    public void cambiarPanel(JFrame frame, JPanel panelActual){
//        frame.getContentPane().removeAll();
//        frame.setContentPane(panelActual);
//        frame.repaint();
//        frame.revalidate();
//    }
    
     public void cambiarPanel(JPanel jpanel) {
        framePrincipal.getContentPane().removeAll();
        framePrincipal.setContentPane(jpanel);
        framePrincipal.repaint();
        framePrincipal.revalidate();
    }
    //------------------------------------Metodos auxiliares------------------------------------
    
    //------------------------------------Errores (JOptionPane)---------------------------------
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
        
    public void mostrarExitoGuardarLab(){
        JOptionPane.showConfirmDialog(menuAdmin, "laboratorio Guardado Con exito", "Exito", JOptionPane.YES_OPTION);
    }

    public boolean mostrarErrorCredenciales() {
        JOptionPane.showMessageDialog(framePrincipal, "Credenciales Incorrectas", "Eror", JOptionPane.ERROR_MESSAGE);
        return false;
    } 
}
