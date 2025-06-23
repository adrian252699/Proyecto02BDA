package entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *@author $Luis Carlos Manjarrez Gonzalez
 */
@Entity
@Table (name = "alumnos")
public class AlumnoDominio implements Serializable{ 
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "nombreCompleto")
    private String nombreCompleto;
    
    @Column(name = "password")
    private String password;
    
    //Atributos de la relacion con carrera (1 a 1)
    //...
    
    //Atributos de la relacion con computadoras (1 a 1)
    //...
    
    //Atributos de la relacion con BloqueoAdminstradorAlumno (N:M)
    //...
    
    public AlumnoDominio() {
    }

    public AlumnoDominio(int id, String nombreCompleto, String password) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.password = password;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "AlumnoDominio{" + "id=" + id + ", nombreCompleto=" + nombreCompleto + ", password=" + password + '}';
    }

}
