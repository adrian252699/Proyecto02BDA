/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package CasoAdministrador;

import DTOs.AgregarLaboratorioDTO;
import entidades.UnidadAcademicaDominio;
import java.util.Calendar;

/**
 *
 * @author $Luis Carlos Manjarrez Gonzalez
 */

public class CasoAdministrador {
    //DTOs Temporales para creacion
    private AgregarLaboratorioDTO laboratorioTemporal;
    
    public CasoAdministrador(){
        if(laboratorioTemporal == null){
            System.out.println("Constructo CasoADmin lab es null");
            laboratorioTemporal = new AgregarLaboratorioDTO();
            System.out.println("labTemporal no es null");
        }else{
            System.out.println("Constructo CasoADmin lab no es null");
        }
        
    }
    public AgregarLaboratorioDTO setNombreLab(String nombre){
            System.out.println("SetUnidad CasoADmin: lab si es null");
            laboratorioTemporal.setNombre(nombre);
            return laboratorioTemporal;     
    }
    public AgregarLaboratorioDTO setUnidadLab(UnidadAcademicaDominio unidadAcademica){
            System.out.println("Unidad en CasoAdmin:  " + unidadAcademica.toString());
            laboratorioTemporal.setUnidadAcademica(unidadAcademica);
            return laboratorioTemporal;
        
    }
    public AgregarLaboratorioDTO setHorarioLab(Calendar fechaInicioLab, Calendar fechaFinLab){
        laboratorioTemporal.setHoraFin(fechaInicioLab);
        laboratorioTemporal.setHoraInicio(fechaFinLab);
        return laboratorioTemporal;
    }
    
    public AgregarLaboratorioDTO getLaboratorioTemporal(){
        return laboratorioTemporal;
    }
    public void setLaboratorioTemporal(AgregarLaboratorioDTO lab){
        this.laboratorioTemporal = lab;
    }
}
