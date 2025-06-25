/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import DTOs.NuevoAlumnoDTO;
import entidades.AlumnoDominio;
import interfaces.IAlumnoDAO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
    
}
