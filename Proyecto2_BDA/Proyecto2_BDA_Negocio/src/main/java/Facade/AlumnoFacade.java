/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Facade;

import Interfacez.IAlumnoBO;
import entidades.AlumnoDominio;
import java.util.List;

/**
 *
 * @author $Luis Carlos Manjarrez Gonzalez
 */
public class AlumnoFacade implements IAlumnoFacade{
    private IAlumnoBO alumnoBO;
    
//    public AlumnoFacadde(){
//        IConexionBD conexion = new  ConexionBD();
//        IAlumnoDAO alumnoDAO = new AlumnoDAO(conexion);
//        this.AlumnoNegocio = new AlumnoBO(alumnoDAO);
//    }
//    
    @Override
    public List<AlumnoDominio> consultarAlumnoPorId(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

}
