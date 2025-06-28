/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;


import java.util.Calendar;
import javax.persistence.*;

import java.util.Calendar;

/**
 *
 * @author Sandra
 */
public class BloqueoDominio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloqueo;

    @ManyToOne
    @JoinColumn(name = "idAlumno")
    private AlumnoDominio alumno;

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar fechaBloqueo;

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar fechaLiberacion;

    private String motivo;

    public BloqueoDominio() {}

    public BloqueoDominio(AlumnoDominio alumno, Calendar fechaBloqueo, Calendar fechaLiberacion, String motivo) {
        this.alumno = alumno;
        this.fechaBloqueo = fechaBloqueo;
        this.fechaLiberacion = fechaLiberacion;
        this.motivo = motivo;
    }

    public Long getIdBloqueo() {
        return idBloqueo;
    }

    public AlumnoDominio getAlumno() {
        return alumno;
    }

    public void setAlumno(AlumnoDominio alumno) {
        this.alumno = alumno;
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
}
