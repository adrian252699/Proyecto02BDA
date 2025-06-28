/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOs;

import java.util.Calendar;

/**
 *
 * @author jalt2
 */
public class AgregarCarreraDTO {
    private String nombre;
    private int tiempoMax;

    public AgregarCarreraDTO() {
    }

    public AgregarCarreraDTO(String nombre, int tiempoMax) {
        this.nombre = nombre;
        this.tiempoMax = tiempoMax;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempoMax() {
        return tiempoMax;
    }

    public void setTiempoMax(int tiempoMax) {
        this.tiempoMax = tiempoMax;
    }

    @Override
    public String toString() {
        return "AgregarCarreraDTO{" + "nombre=" + nombre + ", tiempoMax=" + tiempoMax + '}';
    }
    
    
    
}
