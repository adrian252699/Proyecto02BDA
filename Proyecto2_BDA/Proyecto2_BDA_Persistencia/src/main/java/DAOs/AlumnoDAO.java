/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import Conexion.ConexionBD;
import DTOs.NuevoAlumnoDTO;
import DTOs.ReservarAlumnoComputadoraDTO;
import entidades.AlumnoDominio;
import entidades.ComputadoraDominio;
import interfaces.IAlumnoDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author jalt2
 */
public class AlumnoDAO implements IAlumnoDAO{
    
    private static AlumnoDAO instanciaAlumnoDAO;
    
    public static AlumnoDAO getInstanciaDAO() {
        if (instanciaAlumnoDAO == null) {
            instanciaAlumnoDAO = new AlumnoDAO();
        }
        return instanciaAlumnoDAO;
    }
    
    //en todas las daos Falta agregar las consultas con JPA
    @Override
    public AlumnoDominio consultarAlumnoId(Long idAlumno) {
        //EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("LaboratorioComputo"); //esta linea esta en la clase ConexioBD
        
 
            EntityManager em = ConexionBD.getEntityManager();
    //        AlumnoDominio alumno = em.find(AlumnoDominio.class, idAlumno);
            //ocupamos consultas con JPA
//            String comando = "Select a from AlumnoDominio a where a.id_Alumno = :id";
//            TypedQuery<AlumnoDominio> query = em.createQuery(comando, AlumnoDominio.class);
//            query.setParameter("id", idAlumno);
//            return query.getSingleResult();   
        
        AlumnoDominio alumno = em.find(AlumnoDominio.class, idAlumno);
        
        return alumno;
        
    }
    
    @Override
    public AlumnoDominio agregarAlumno(NuevoAlumnoDTO nuevoAlumno) {
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("LaboratorioComputo");
        EntityManager em = fabrica.createEntityManager();
        
        em.getTransaction().begin();
        //esto funciona como un adapter
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

    @Override
    public AlumnoDominio consultarAlumnoIdJPA(Long idAlumno) {
        EntityManager em = ConexionBD.getEntityManager();
        
        AlumnoDominio alumno = em.find(AlumnoDominio.class, idAlumno);
        
        return alumno;
    }
    
    
    
}
