/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package entidades;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author $Luis Carlos Manjarrez Gonzalez
 */
@Entity
@Table(name = "ComputadorasApartadas")
public class ComputadoraAlumnoDominio implements Serializable{

    @Id()
    @Column(name = "idApartado")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "fechaInicio")
    private Calendar fechaInicio;
    
    @Column(name = "fechaFin")
    private Calendar fechaFin;
    
    @ManyToOne
    @JoinColumn(name ="idAlumno")
    private AlumnoDominio alumno;
    
    @ManyToOne
    @JoinColumn(name ="idComputadora")
    private ComputadoraDominio computadora;

    public ComputadoraAlumnoDominio() {
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Calendar getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Calendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Calendar getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Calendar fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return "ComputadoraAlumnoDominio{" + "id=" + id + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", alumno=" + alumno + ", computadora=" + computadora + '}';
    }

    
    
    
    
}
