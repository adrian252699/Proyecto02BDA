/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import DTOs.AgregarComputadoraDTO;
import entidades.ComputadoraDominio;
import interfaces.IComputadoraDAO;
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
public class ComputadoraDAO implements IComputadoraDAO{

    @Override
    public ComputadoraDominio agregarComputadora(AgregarComputadoraDTO nuevaComputadora) {
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("LaboratorioComputo");
        EntityManager em = fabrica.createEntityManager();
        
        em.getTransaction().begin();
        
        ComputadoraDominio computadoraGuardar = new ComputadoraDominio(nuevaComputadora.getDireccionIP(), nuevaComputadora.getNumero(), nuevaComputadora.getEstatus(), nuevaComputadora.getAlumno(), nuevaComputadora.getLaboratorio());
                
        em.persist(computadoraGuardar);
        
        em.getTransaction().commit();
        
        em.close();
        
        fabrica.close();
        
        return computadoraGuardar;
    }

    @Override
    public List<ComputadoraDominio> consultarComputadoras() {
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("LaboratorioComputo");
        EntityManager em = fabrica.createEntityManager();
        
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        
        CriteriaQuery<ComputadoraDominio> criteriaQuery = criteriaBuilder.createQuery(ComputadoraDominio.class);
        
        List<ComputadoraDominio> computadoras = em.createQuery(criteriaQuery).getResultList();
         
        for(ComputadoraDominio computadora : computadoras){
            System.out.println(computadora.getDireccionIP());
            System.out.println(computadora.getEstatus());
        }
        
        em.close();
        fabrica.close();
        
        return computadoras;
    }

    @Override
    public ComputadoraDominio consultarComputadoraId(Long id) {
       EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("LaboratorioComputo");
       EntityManager em = fabrica.createEntityManager();
       
       ComputadoraDominio computadora = em.find(ComputadoraDominio.class, id);
       
       em.close();
       fabrica.close();
       
       return computadora;
    }
    
    
    
}
