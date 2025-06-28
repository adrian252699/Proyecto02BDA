/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author jalt2
 */
@Entity
@Table(name = "computadoras")
public class ComputadoraDominio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "idComputadora")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "direccionIP")
    private String direccionIP;
    
    @Column(name = "numeroComputadora")
    private String numeroComputadora;
    
    @Column(name = "estatus")
    private String estatus;

    @Column(name="ListaSoftwares")
    private List<String> listaSoftwares;
    
    //Relacion Reserva N:M con alumno
    @OneToMany(mappedBy ="computadora")
    private List<ComputadoraAlumnoDominio> computadorasApartadas;
    
     //Relacion 1:N con software
    @OneToMany(mappedBy = "computadora")
    private List<SoftwareComputadoraDominio> listaSoftware;
    
    //Realcion N:1 con laboratorio
    @ManyToOne
    @JoinColumn(name = "idLaboratorio")
    private LaboratorioDominio laboratorio;
    
    public ComputadoraDominio() {
    }

    public ComputadoraDominio(String direccionIP, String numeroComputadora, String estatus, AlumnoDominio alumno, LaboratorioDominio laboratorio) {
        this.direccionIP = direccionIP;
        this.numeroComputadora = numeroComputadora;
        this.estatus = estatus;

        this.laboratorio = laboratorio;
    }

    public ComputadoraDominio(String direccionIP, String numeroComputadora, String estatus, List<String> listaSoftwares, AlumnoDominio alumno, List<ComputadoraAlumnoDominio> computadorasApartadas, List<SoftwareComputadoraDominio> computadoras, LaboratorioDominio laboratorio) {
        this.direccionIP = direccionIP;
        this.numeroComputadora = numeroComputadora;
        this.estatus = estatus;
        this.listaSoftwares = listaSoftwares;
;
        this.computadorasApartadas = computadorasApartadas;
        this.listaSoftware = computadoras;
        this.laboratorio = laboratorio;
    }
    
    
    
    //Sin id ni lista de software
    public ComputadoraDominio(String direccionIP, String numeroComputadora, String estatus) {
        this.direccionIP = direccionIP;
        this.numeroComputadora = numeroComputadora;
        this.estatus = estatus;
    }

    public ComputadoraDominio(Long id, String direccionIP, String numeroComputadora, String estatus) {
        this.id = id;
        this.direccionIP = direccionIP;
        this.numeroComputadora = numeroComputadora;
        this.estatus = estatus;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDireccionIP() {
        return direccionIP;
    }

    public void setDireccionIP(String direccionIP) {
        this.direccionIP = direccionIP;
    }

    public String getNumeroComputadora() {
        return numeroComputadora;
    }

    public void setNumeroComputadora(String numeroComputadora) {
        this.numeroComputadora = numeroComputadora;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }



    public LaboratorioDominio getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(LaboratorioDominio laboratorio) {
        this.laboratorio = laboratorio;
    }

    public List<ComputadoraAlumnoDominio> getComputadorasApartadas() {
        return computadorasApartadas;
    }

    public void setComputadorasApartadas(List<ComputadoraAlumnoDominio> computadorasApartadas) {
        this.computadorasApartadas = computadorasApartadas;
    }

    public List<String> getListaSoftwares() {
        return listaSoftwares;
    }

    public void setListaSoftwares(List<String> listaSoftwares) {
        this.listaSoftwares = listaSoftwares;
    }

    public List<SoftwareComputadoraDominio> getSoftware() {
        return listaSoftware;
    }

    public void getSoftware(List<SoftwareComputadoraDominio> computadoras) {
        this.listaSoftware = computadoras;
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
        if (!(object instanceof ComputadoraDominio)) {
            return false;
        }
        ComputadoraDominio other = (ComputadoraDominio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
  
}
