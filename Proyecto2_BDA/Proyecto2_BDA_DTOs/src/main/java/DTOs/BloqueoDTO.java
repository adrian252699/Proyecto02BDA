/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOs;

import java.util.Calendar;

/**
 *
 * @author Sandra
 */
public class BloqueoDTO {
     private String nombreAlumno;
    private Calendar fechaBloqueo;
    private Calendar fechaLiberacion;
    private String motivo;

    public BloqueoDTO() {}

    public BloqueoDTO(String nombreAlumno, Calendar fechaBloqueo, Calendar fechaLiberacion, String motivo) {
        this.nombreAlumno = nombreAlumno;
        this.fechaBloqueo = fechaBloqueo;
        this.fechaLiberacion = fechaLiberacion;
        this.motivo = motivo;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public Calendar getFechaBloqueo() {
        return fechaBloqueo;
    }

    public void setFechaBloqueo(Calendar fechaBloqueo) {
        this.fechaBloqueo = fechaBloqueo;
    }

    public Calendar getFechaLiberacion() {
        return fechaLiberacion;
    }

    public void setFechaLiberacion(Calendar fechaLiberacion) {
        this.fechaLiberacion = fechaLiberacion;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    // Utilidad para mapear desde entidad
    public static BloqueoDTO fromEntity(entidades.BloqueoDominio b) {
        return new BloqueoDTO(
            b.getAlumno().getNombreCompleto(),
            b.getFechaBloqueo(),
            b.getFechaLiberacion(),
            b.getMotivo()
        );
    }
    
}
