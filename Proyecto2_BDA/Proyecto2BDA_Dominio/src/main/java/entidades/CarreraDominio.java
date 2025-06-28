/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;


import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author jalt2
 */
@Entity
@Table(name = "carreras")
public class CarreraDominio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "idCarrera")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nombreCarrera")
    private String nombreCarrera;
    
    @Column(name = "tiempoMax")
    private int tiempoMax;
    
    
    //Atributos de la relacion 1 a 1 con alumno
    @OneToMany(mappedBy = "carrera", cascade = CascadeType.ALL)
    private List<AlumnoDominio> alumno;  
    
    public CarreraDominio() {
    }

    public CarreraDominio(String nombreCarrera, int tiempoMax, List<AlumnoDominio> alumno) {
        this.nombreCarrera = nombreCarrera;
        this.tiempoMax = tiempoMax;
        this.alumno = alumno;
    }

    public CarreraDominio(String nombreCarrera, int tiempoMax) {
        this.nombreCarrera = nombreCarrera;
        this.tiempoMax = tiempoMax;
    }
    
    
    
    public CarreraDominio(Long id, String nombreCarrera, int tiempoMax) {
        this.id = id;
        this.nombreCarrera = nombreCarrera;
        this.tiempoMax = tiempoMax;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public int getTiempoMax() {
        return tiempoMax;
    }

    public void setTiempoMax(int tiempoMax) {
        this.tiempoMax = tiempoMax;
    }

    public List<AlumnoDominio> getAlumno() {
        return alumno;
    }

    public void setAlumno(List<AlumnoDominio> alumno) {
        this.alumno = alumno;
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
        if (!(object instanceof CarreraDominio)) {
            return false;
        }
        CarreraDominio other = (CarreraDominio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.CarreraDominio[ id=" + id + " ]";
    }
    
}
