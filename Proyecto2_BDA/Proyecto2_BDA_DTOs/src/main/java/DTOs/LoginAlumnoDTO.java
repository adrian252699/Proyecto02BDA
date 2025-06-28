/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOs;

import entidades.AlumnoDominio;

/**
 *
 * @author jalt2
 */
public class LoginAlumnoDTO {
    private AlumnoDominio alumnoActual;

    public LoginAlumnoDTO() {
    }

    public LoginAlumnoDTO(AlumnoDominio alumnoActual) {
        this.alumnoActual = alumnoActual;
    }

    public AlumnoDominio getAlumnoActual() {
        return alumnoActual;
    }

    public void setAlumnoActual(AlumnoDominio alumnoActual) {
        this.alumnoActual = alumnoActual;
    }

    

    
    
}
