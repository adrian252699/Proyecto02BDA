package entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *@author $Luis Carlos Manjarrez Gonzalez
 */
@Entity
@Table (name = "alumnos")
public class AlumnoDominio implements Serializable{ 
    @Id()
    @Column(name = "idAlumno")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nombreCompleto")
    private String nombreCompleto;
    
    @Column(name = "password")
    private String password;
    
    @Column(name = "estatus")
    private String estatus;
    
    //Atributos de la relacion con carrera (1 a N)
    @OneToOne
    @JoinColumn(name = "id_carrera", nullable = false)
    private CarreraDominio carrera;
    
    //Atributos de la relacion con computadoras (N a M)
    @OneToMany(mappedBy = "alumno")
    private List<ComputadoraAlumnoDominio> computadorasApartadas;
    
    //Atributos de la relacion con BloqueoAdminstradorAlumno (N:M) se creo Otra Clase para la relacion pq la relacion Bloquear tiene atributos
    @OneToMany(mappedBy ="alumnoBloqueado")
    private List<BloqueoAdministradorAlumnoDominio> bloqueos;
   
    
    public AlumnoDominio() {
    }

    public AlumnoDominio(String nombreCompleto, String password, CarreraDominio carrera) {
        this.nombreCompleto = nombreCompleto;
        this.password = password;
        this.carrera = carrera;
    }

    public AlumnoDominio(String nombreCompleto, String password, CarreraDominio carrera, ComputadoraDominio computadora) {
        this.nombreCompleto = nombreCompleto;
        this.password = password;
        this.carrera = carrera;
    }
    
    
    
    public AlumnoDominio(String nombreCompleto, String password) {
        this.nombreCompleto = nombreCompleto;
        this.password = password;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public CarreraDominio getCarrera() {
        return carrera;
    }

    public void setCarrera(CarreraDominio carrera) {
        this.carrera = carrera;
    }
   

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public List<ComputadoraAlumnoDominio> getComputadorasApartadas() {
        return computadorasApartadas;
    }

    public void setComputadorasApartadas(List<ComputadoraAlumnoDominio> computadorasApartadas) {
        this.computadorasApartadas = computadorasApartadas;
    }

}
