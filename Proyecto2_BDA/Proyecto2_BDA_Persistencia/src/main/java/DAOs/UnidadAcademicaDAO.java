/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import DTOs.NuevaUnidadAcademicaDTO;
import entidades.UnidadAcademicaDominio;
import interfaces.IUnidadAcademicaDAO;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author jalt2
 */
public class UnidadAcademicaDAO implements IUnidadAcademicaDAO{
    private List<UnidadAcademicaDominio> unidadesAcademicas = new ArrayList<>();
    
    private static UnidadAcademicaDAO instanciaUnidadAcademicaDAO;

        public static UnidadAcademicaDAO getInstanciaDAO() {
            if (instanciaUnidadAcademicaDAO == null) {
                instanciaUnidadAcademicaDAO = new UnidadAcademicaDAO();
            }
            return instanciaUnidadAcademicaDAO;
        }
    @Override
    public UnidadAcademicaDominio agregarUnidadAcademica(NuevaUnidadAcademicaDTO nuevaUnidad) {
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("LaboratorioComputo");
        EntityManager em = fabrica.createEntityManager();
        
        em.getTransaction().begin();
        
        UnidadAcademicaDominio unidadAcademicaGuardar = new UnidadAcademicaDominio(nuevaUnidad.getNombre());
        if (nuevaUnidad.getLaboratorios()!=null && nuevaUnidad.getLaboratorios().isEmpty()) {
            unidadAcademicaGuardar.setLaboratorios(nuevaUnidad.getLaboratorios());
        }
   
        em.persist(unidadAcademicaGuardar);
        
        em.getTransaction().commit();
        
        em.close();
        fabrica.close();
        
        return unidadAcademicaGuardar;
    }

    @Override
    public List<UnidadAcademicaDominio> consultarUnidadesAcademicas() {
           EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("LaboratorioComputo");
           EntityManager em = fabrica.createEntityManager();

           CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
           CriteriaQuery<UnidadAcademicaDominio> criteriaQuery = criteriaBuilder.createQuery(UnidadAcademicaDominio.class);
           Root<UnidadAcademicaDominio> root = criteriaQuery.from(UnidadAcademicaDominio.class);
           criteriaQuery.select(root);

           List<UnidadAcademicaDominio> unidadesAcademicas = em.createQuery(criteriaQuery).getResultList();
           for (UnidadAcademicaDominio unidad : unidadesAcademicas) {
                System.out.println("Unidad: " + unidad.getNombreUnidad() + " | ID: " + unidad.getId());
           }
           em.close();
           fabrica.close();

            return unidadesAcademicas;
    }

    @Override
    public UnidadAcademicaDominio consultarUnidadesAcademicasId(Long id) {
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("LaboratorioComputo");
        EntityManager em = fabrica.createEntityManager();
        
        UnidadAcademicaDominio unidadAcademica = em.find(UnidadAcademicaDominio.class, id);
        
        em.close();
        fabrica.close();
        
        return unidadAcademica;
    }
    
}
