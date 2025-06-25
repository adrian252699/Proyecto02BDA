/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOs;

import entidades.CarreraDominio;
import entidades.ComputadoraDominio;

/**
 *
 * @author jalt2
 */
public class NuevoAlumnoDTO {
    private String nombre;
    private String password;
    private CarreraDominio carrera;
    private ComputadoraDominio computadora;

    public NuevoAlumnoDTO() {
    }

    public NuevoAlumnoDTO(String nombre, String password, CarreraDominio carrera, ComputadoraDominio computadora) {
        this.nombre = nombre;
        this.password = password;
        this.carrera = carrera;
        this.computadora = computadora;
    }

    public NuevoAlumnoDTO(String nombre, String password, CarreraDominio carrera) {
        this.nombre = nombre;
        this.password = password;
        this.carrera = carrera;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public CarreraDominio getCarrera() {
        return carrera;
    }

    public void setCarrera(CarreraDominio carrera) {
        this.carrera = carrera;
    }

    public ComputadoraDominio getComputadora() {
        return computadora;
    }

    public void setComputadora(ComputadoraDominio computadora) {
        this.computadora = computadora;
    }
    
    
}
