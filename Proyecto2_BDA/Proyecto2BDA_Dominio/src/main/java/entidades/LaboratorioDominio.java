/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author jalt2
 */
@Entity
@Table(name = "laboratorios")
public class LaboratorioDominio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "idLaboratorio")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nombreLaboratorio", nullable = false)
    private String nombreLaboratorio;
    
    @Temporal(TemporalType.TIME)
    @Column(name = "horaInicio")
    private Calendar horaInicio;

    @Temporal(TemporalType.TIME)
    @Column(name = "horaFIn")
    private Calendar horaFin;
    
    //Lista de reglas
    
    //Relacion n:1 con unidad academica
    @ManyToOne
    @JoinColumn(name = "unidadAcademica_id")
    private UnidadAcademicaDominio unidadAcademica;
    
    
    //Relacion 1:N con computadora
    @OneToMany(mappedBy = "laboratorio")
    private List<ComputadoraDominio> computadoras;
    
    public LaboratorioDominio() {
    }

    public LaboratorioDominio(String nombreLaboratorio, Calendar horaInicio, Calendar horaFin, UnidadAcademicaDominio unidadAcademica) {
        this.nombreLaboratorio = nombreLaboratorio;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.unidadAcademica = unidadAcademica;
    }
    
    
    
    public LaboratorioDominio(String nombreLaboratorio, Calendar horaInicio, Calendar horaFin) {
        this.nombreLaboratorio = nombreLaboratorio;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
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

    public UnidadAcademicaDominio getUnidadAcademica() {
        return unidadAcademica;
    }

    public void setUnidadAcademica(UnidadAcademicaDominio unidadAcademica) {
        this.unidadAcademica = unidadAcademica;
    }

    public List<ComputadoraDominio> getComputadoras() {
        return computadoras;
    }

    public void setComputadoras(List<ComputadoraDominio> computadoras) {
        this.computadoras = computadoras;
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
        return "LaboratorioDominio{" + "id=" + id + ", nombreLaboratorio=" + nombreLaboratorio + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + ", unidadAcademica=" + unidadAcademica + ", computadoras=" + computadoras + '}';
    }

    
}
