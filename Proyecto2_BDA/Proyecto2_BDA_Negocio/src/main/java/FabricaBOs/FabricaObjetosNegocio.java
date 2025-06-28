/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FabricaBOs;

import BOs.AlumnoBO;
import BOs.ComputadoraBO;
import BOs.LaboratorioBO;
import DAOs.AlumnoDAO;
import DAOs.ComputadoraDAO;
import DAOs.LaboratorioDAO;
import Interfacez.IAlumnoBO;
import Interfacez.IComputadoraBO;
import Interfacez.ILaboratorioBO;
import interfaces.IAlumnoDAO;
import interfaces.IComputadoraDAO;
import interfaces.ILaboratorioDAO;

/**
 *
 * @author jalt2
 */
public class FabricaObjetosNegocio {
    public static IAlumnoBO crearAlumnoBO(){
        IAlumnoDAO daoAlumno = AlumnoDAO.getInstanciaDAO();
        IAlumnoBO alumnoBO = new AlumnoBO(daoAlumno);
        return alumnoBO;
    }
    
    public static IComputadoraBO crearComputadoraBO(){
        IComputadoraDAO daoComputadora = ComputadoraDAO.getInstanciaDAO();
        IComputadoraBO computadoraBO = new ComputadoraBO(daoComputadora);
        
        return computadoraBO;
    }
    
    public static ILaboratorioBO crearLaboratorioBO(){
        ILaboratorioDAO daoLaboratorio = LaboratorioDAO.getInstanciaDAO();
        ILaboratorioBO laboratorioBO = new LaboratorioBO(daoLaboratorio);
        
        return laboratorioBO;
        
    }
}
