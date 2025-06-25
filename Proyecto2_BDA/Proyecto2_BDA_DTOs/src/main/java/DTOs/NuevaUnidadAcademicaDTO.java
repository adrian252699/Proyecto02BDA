/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOs;

import entidades.LaboratorioDominio;
import java.util.List;

/**
 *
 * @author jalt2
 */
public class NuevaUnidadAcademicaDTO {
    private String nombre;
    private List<LaboratorioDominio> laboratorios;

    public NuevaUnidadAcademicaDTO() {
    }

    public NuevaUnidadAcademicaDTO(String nombre, List<LaboratorioDominio> laboratorios) {
        this.nombre = nombre;
        this.laboratorios = laboratorios;
    }

    public NuevaUnidadAcademicaDTO(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<LaboratorioDominio> getLaboratorios() {
        return laboratorios;
    }

    public void setLaboratorios(List<LaboratorioDominio> laboratorios) {
        this.laboratorios = laboratorios;
    }
    
    
}
