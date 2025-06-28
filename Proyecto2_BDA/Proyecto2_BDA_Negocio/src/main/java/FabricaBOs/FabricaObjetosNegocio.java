/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FabricaBOs;

import BOs.AlumnoBO;
import BOs.ComputadoraBO;
import BOs.LaboratorioBO;
import BOs.UnidadesAcademicasBO;
import DAOs.AlumnoDAO;
import DAOs.ComputadoraDAO;
import DAOs.LaboratorioDAO;
import DAOs.UnidadAcademicaDAO;
import Interfacez.IAlumnoBO;
import Interfacez.IComputadoraBO;
import Interfacez.ILaboratorioBO;
import Interfacez.IUnidadAcademicaBO;
import interfaces.IAlumnoDAO;
import interfaces.IComputadoraDAO;
import interfaces.ILaboratorioDAO;
import interfaces.IUnidadAcademicaDAO;

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
    public static IUnidadAcademicaBO crearUnidadAcademicaBO(){
        IUnidadAcademicaDAO daoUnidad = UnidadAcademicaDAO.getInstanciaDAO();
        IUnidadAcademicaBO unidadBO = new UnidadesAcademicasBO(daoUnidad);
        
        return unidadBO;
        
    }
}
