/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import DTOs.NuevoAlumnoDTO;
import DTOs.ReservarAlumnoComputadoraDTO;
import entidades.AlumnoDominio;
import entidades.ComputadoraDominio;
import interfaces.IAlumnoDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author jalt2
 */
public class AlumnoDAO implements IAlumnoDAO{

    @Override
    public AlumnoDominio consultarAlumnoId(Long idAlumno) {
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("LaboratorioComputo");
        EntityManager em = fabrica.createEntityManager();
        
        AlumnoDominio alumno = em.find(AlumnoDominio.class, idAlumno);
        
        em.close();
        fabrica.close();
        
        return alumno;
    }

    @Override
    public AlumnoDominio agregarAlumno(NuevoAlumnoDTO nuevoAlumno) {
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("LaboratorioComputo");
        EntityManager em = fabrica.createEntityManager();
        
        em.getTransaction().begin();
        
        AlumnoDominio alumnoGuardar = new AlumnoDominio(nuevoAlumno.getNombre(), nuevoAlumno.getPassword(), nuevoAlumno.getCarrera());
        
        em.persist(alumnoGuardar);
        
        em.getTransaction().commit();
        
        em.close();
        fabrica.close();
        
        return alumnoGuardar;
    }

    @Override
    public List<AlumnoDominio> consultarAlumnos() {
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("LaboratorioComputo");
        EntityManager em = fabrica.createEntityManager();
        
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        
        CriteriaQuery criteriaQuery = criteriaBuilder.createQuery(AlumnoDominio.class);
        
        List<AlumnoDominio> alumnos = em.createQuery(criteriaQuery).getResultList();
        
        
        
        em.close();
        fabrica.close();
        
        return alumnos;
    }

    @Override
    public AlumnoDominio reservarComputadora(ReservarAlumnoComputadoraDTO alumnoComputadora) {
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("LaboratorioComputo");
        EntityManager em = fabrica.createEntityManager();
        
        em.getTransaction().begin();
        
        AlumnoDominio alumnoReservar = em.find(AlumnoDominio.class, alumnoComputadora.getAlumno().getId());
        ComputadoraDominio computadoraReservar = em.find(ComputadoraDominio.class, alumnoComputadora.getComputadora().getId());
        if (alumnoReservar!=null) {
            alumnoReservar.setComputadora(alumnoComputadora.getComputadora());
            computadoraReservar.setAlumno(alumnoComputadora.getAlumno());
            computadoraReservar.setEstatus("Apartada");
            
            em.getTransaction().commit();
        }
        
        em.close();
        fabrica.close();
        
        return alumnoReservar;
    }
    
    
    
}
