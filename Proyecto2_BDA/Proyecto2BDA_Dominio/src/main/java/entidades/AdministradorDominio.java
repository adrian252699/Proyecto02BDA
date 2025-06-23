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
import javax.persistence.Table;

/**
 *
 * @author jalt2
 */
@Entity
@Table(name = "administradores")
public class AdministradorDominio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "claveAdmin")
    private String claveAdmin;
    
    //atributos de la relacion N:M con estudiante
    //...

    public AdministradorDominio() {
    }

    public AdministradorDominio(Long id, String claveAdmin) {
        this.id = id;
        this.claveAdmin = claveAdmin;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClaveAdmin() {
        return claveAdmin;
    }

    public void setClaveAdmin(String claveAdmin) {
        this.claveAdmin = claveAdmin;
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
        if (!(object instanceof AdministradorDominio)) {
            return false;
        }
        AdministradorDominio other = (AdministradorDominio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.AdministradorDominio[ id=" + id + " ]";
    }
    
}
