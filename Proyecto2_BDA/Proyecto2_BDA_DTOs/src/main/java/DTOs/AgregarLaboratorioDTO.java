/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOs;

import entidades.UnidadAcademicaDominio;
import java.util.Calendar;

/**
 *
 * @author jalt2
 */
public class AgregarLaboratorioDTO {
    private UnidadAcademicaDominio UnidadAcademica;
    private String nombre;
    private Calendar horaInicio;
    private Calendar horaFin;

    public AgregarLaboratorioDTO() {
    }

    public AgregarLaboratorioDTO(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    public AgregarLaboratorioDTO(UnidadAcademicaDominio UnidadAcademica, String nombre, Calendar horaInicio, Calendar horaFin) {
        this.UnidadAcademica = UnidadAcademica;
        this.nombre = nombre;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Calendar getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Calendar horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Calendar getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Calendar horaFin) {
        this.horaFin = horaFin;
    }

    public UnidadAcademicaDominio getUnidadAcademica() {
        return UnidadAcademica;
    }

    public void setUnidadAcademica(UnidadAcademicaDominio UnidadAcademica) {
        this.UnidadAcademica = UnidadAcademica;
    }

    
    
    
}
