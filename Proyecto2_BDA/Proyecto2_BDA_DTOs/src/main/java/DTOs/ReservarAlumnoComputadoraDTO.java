/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOs;

import entidades.AlumnoDominio;
import entidades.ComputadoraDominio;

/**
 *
 * @author jalt2
 */
public class ReservarAlumnoComputadoraDTO {
    private AlumnoDominio alumno;
    private ComputadoraDominio computadora;

    public ReservarAlumnoComputadoraDTO() {
    }

    public ReservarAlumnoComputadoraDTO(AlumnoDominio alumno, ComputadoraDominio computadora) {
        this.alumno = alumno;
        this.computadora = computadora;
    }

    public AlumnoDominio getAlumno() {
        return alumno;
    }

    public void setAlumno(AlumnoDominio alumno) {
        this.alumno = alumno;
    }

    public ComputadoraDominio getComputadora() {
        return computadora;
    }

    public void setComputadora(ComputadoraDominio computadora) {
        this.computadora = computadora;
    }
    
    
}
