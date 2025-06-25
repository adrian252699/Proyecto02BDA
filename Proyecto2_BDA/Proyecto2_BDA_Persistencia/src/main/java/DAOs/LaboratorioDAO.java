/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import DTOs.AgregarLaboratorioDTO;
import entidades.LaboratorioDominio;
import interfaces.ILaboratorioDAO;
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
public class LaboratorioDAO implements ILaboratorioDAO{

    @Override
    public LaboratorioDominio agregarLaboratorio(AgregarLaboratorioDTO nuevoLaboratorio) {
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("LaboratorioComputo");
        EntityManager em = fabrica.createEntityManager();
        
        em.getTransaction().begin();
        
        LaboratorioDominio laboratorioGuardar = new LaboratorioDominio(nuevoLaboratorio.getNombre(), nuevoLaboratorio.getHoraInicio(), nuevoLaboratorio.getHoraFin());
        
        em.persist(laboratorioGuardar);
        
        em.getTransaction().commit();
        
        em.close();
        fabrica.close();
        
        return laboratorioGuardar;
    }

    @Override
    public List<LaboratorioDominio> consultarLaboratorios() {
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("LaboratorioComputo");
        EntityManager em = fabrica.createEntityManager();
        
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        
        CriteriaQuery criteriaQuery = criteriaBuilder.createQuery(LaboratorioDominio.class);
        
        List<LaboratorioDominio> laboratorios = em.createQuery(criteriaQuery).getResultList();
        
        for(LaboratorioDominio laboratorio : laboratorios){
            System.out.println(laboratorio.getNombreLaboratorio());
            System.out.println(laboratorio.getHoraInicio());
            System.out.println(laboratorio.getHoraFin());
        }
        
        em.close();
        fabrica.close();
        
        return laboratorios;
    }
    
}
