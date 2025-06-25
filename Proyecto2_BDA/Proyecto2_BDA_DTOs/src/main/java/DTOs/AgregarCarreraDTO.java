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
    private Long tiempoMax;

    public AgregarCarreraDTO() {
    }

    public AgregarCarreraDTO(String nombre, Long tiempoMax) {
        this.nombre = nombre;
        this.tiempoMax = tiempoMax;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getTiempoMax() {
        return tiempoMax;
    }

    public void setTiempoMax(Long tiempoMax) {
        this.tiempoMax = tiempoMax;
    }
    
    
}
