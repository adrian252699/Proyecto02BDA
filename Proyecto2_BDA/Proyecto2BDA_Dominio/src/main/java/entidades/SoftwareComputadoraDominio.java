/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author jalt2
 */
@Entity
public class SoftwareComputadoraDominio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "idComputadora")
    private ComputadoraDominio computadora;

    public SoftwareComputadoraDominio() {
    }

    public SoftwareComputadoraDominio(Long id, ComputadoraDominio computadora) {
        this.id = id;
        this.computadora = computadora;
    }

    public SoftwareComputadoraDominio(ComputadoraDominio computadora) {
        this.computadora = computadora;
    }

    public ComputadoraDominio getComputadora() {
        return computadora;
    }

    public void setComputadora(ComputadoraDominio computadora) {
        this.computadora = computadora;
    }
    
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof SoftwareComputadoraDominio)) {
            return false;
        }
        SoftwareComputadoraDominio other = (SoftwareComputadoraDominio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.SoftwareComputadoraDominio[ id=" + id + " ]";
    }
    
}
