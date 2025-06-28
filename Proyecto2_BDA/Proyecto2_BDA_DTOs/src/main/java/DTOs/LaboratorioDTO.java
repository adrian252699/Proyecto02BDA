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
public class LaboratorioDTO {
    private UnidadAcademicaDominio UnidadAcademica;
    private String nombre;
    private Calendar horaFin;
    

    public LaboratorioDTO() {
    }

    public LaboratorioDTO(UnidadAcademicaDominio UnidadAcademica, String nombre) {
        this.UnidadAcademica = UnidadAcademica;
        this.nombre = nombre;
    }

    public LaboratorioDTO(String nombre) {
        this.nombre = nombre;
    }

    public UnidadAcademicaDominio getUnidadAcademica() {
        return UnidadAcademica;
    }

    public void setUnidadAcademica(UnidadAcademicaDominio UnidadAcademica) {
        this.UnidadAcademica = UnidadAcademica;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

}
