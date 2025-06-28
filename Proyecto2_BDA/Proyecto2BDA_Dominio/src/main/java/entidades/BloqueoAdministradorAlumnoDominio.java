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
 * @author jalt2
 */
@Entity
@Table(name = "BloqueoAdministradorAlumno")
public class BloqueoAdministradorAlumnoDominio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "idBloqueoAdministradorAlumno")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }
    //Atributos de la relacion Bloquea - adminstrador alumno
    @Column(name ="Motivo")
    private String motivo;
    
    @Column (name ="Fecha_Inicio")
    private Calendar fechaInicio;
    
    @Column (name ="Fecha_Fin")
    private Calendar fechaFin;
    
    //llaves foraneas
    @ManyToOne
    @JoinColumn (name ="idAdministrador")
    private AdministradorDominio administrador;
    
    @ManyToOne
    @JoinColumn (name ="idAlumno")
    private AlumnoDominio alumnoBloqueado;
    
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
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

    public AdministradorDominio getAdministrador() {
        return administrador;
    }

    public void setAdministrador(AdministradorDominio administrador) {
        this.administrador = administrador;
    }

    public AlumnoDominio getAlumnoBloqueado() {
        return alumnoBloqueado;
    }

    public void setAlumnoBloqueado(AlumnoDominio alumnoBloqueado) {
        this.alumnoBloqueado = alumnoBloqueado;
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
        if (!(object instanceof BloqueoAdministradorAlumnoDominio)) {
            return false;
        }
        BloqueoAdministradorAlumnoDominio other = (BloqueoAdministradorAlumnoDominio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.BloqueoAdministradorAlumnoDominio[ id=" + id + " ]";
    }
    
}
