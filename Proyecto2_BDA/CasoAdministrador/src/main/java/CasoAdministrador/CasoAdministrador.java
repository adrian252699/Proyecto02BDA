/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package CasoAdministrador;

import DTOs.AgregarLaboratorioDTO;
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
        }
        System.out.println("Constructo CasoADmin lab no es null");
    }
    public AgregarLaboratorioDTO setUnidad(String unidadAcademica){
        if(laboratorioTemporal == null){
            System.out.println("SetUnidad CasoADmin lab si es null");
            AgregarLaboratorioDTO nuevoLab = new AgregarLaboratorioDTO();
            nuevoLab.setNombre(unidadAcademica);
            return nuevoLab;
        }else{
            System.out.println("SetUnidad CasoADmin lab no es null");
            laboratorioTemporal.setNombre(unidadAcademica);
            return laboratorioTemporal;
        }
    }
    public AgregarLaboratorioDTO setHorarioLab(Calendar fechaInicioLab, Calendar fechaFinLab){
        System.out.println("setHorarioLab CasoADmin lab:  " + laboratorioTemporal.toString());
        laboratorioTemporal.setHoraFin(fechaInicioLab);
        laboratorioTemporal.setHoraInicio(fechaFinLab);
        return laboratorioTemporal;
    }
    public AgregarLaboratorioDTO getLaboratorioTemporal(){
        return laboratorioTemporal;
    }
}
