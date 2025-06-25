/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package DTOs;

import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author $Luis Carlos Manjarrez Gonzalez
 */
public class LabortatorioDTO {
    private String nombre;
    private LocalTime horaInicio, horaFin;
    private ArrayList<String> listaReglas;

    public LabortatorioDTO() {
    }

    public LabortatorioDTO(String nombre, LocalTime horaInicio, LocalTime horaFin, ArrayList<String> listaReglas) {
        this.nombre = nombre;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.listaReglas = listaReglas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

    public ArrayList<String> getListaReglas() {
        return listaReglas;
    }

    public void setListaReglas(ArrayList<String> listaReglas) {
        this.listaReglas = listaReglas;
    }

    @Override
    public String toString() {
        return "LabortatorioDTO{" + "nombre=" + nombre + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + ", listaReglas=" + listaReglas + '}';
    }
    
    
}
