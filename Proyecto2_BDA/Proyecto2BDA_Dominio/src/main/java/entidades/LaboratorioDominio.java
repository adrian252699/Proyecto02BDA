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
import javax.persistence.Table;

/**
 *
 * @author jalt2
 */
@Entity
@Table(name = "laboratorios")
public class LaboratorioDominio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "nombreLaboratorio")
    private String nombreLaboratorio;
    
    @Column(name = "horaInicio")
    private Calendar horaInicio;
    
    @Column(name = "horaFIn")
    private Calendar horaFin;
    
    //Lista de reglas
    
    //Relacion n:M con unidad academica
    
    //Relacion N:M con computadora
    
    public LaboratorioDominio() {
    }

    public LaboratorioDominio(Long id, String nombreLaboratorio, Calendar horaInicio, Calendar horaFin) {
        this.id = id;
        this.nombreLaboratorio = nombreLaboratorio;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreLaboratorio() {
        return nombreLaboratorio;
    }

    public void setNombreLaboratorio(String nombreLaboratorio) {
        this.nombreLaboratorio = nombreLaboratorio;
    }

    public Calendar getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Calendar horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Calendar getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Calendar horaFin) {
        this.horaFin = horaFin;
    }
    
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LaboratorioDominio)) {
            return false;
        }
        LaboratorioDominio other = (LaboratorioDominio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.LaboratorioDominio[ id=" + id + " ]";
    }
    
}
