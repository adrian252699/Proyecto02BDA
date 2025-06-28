/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import Conexion.ConexionBD;
import DTOs.AgregarComputadoraDTO;
import entidades.AlumnoDominio;
import entidades.ComputadoraDominio;
import entidades.LaboratorioDominio;
import interfaces.IComputadoraDAO;
import java.util.ArrayList;
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
public class ComputadoraDAO implements IComputadoraDAO{
    
    private static ComputadoraDAO instanciaComputadoraDAO;

        public static ComputadoraDAO getInstanciaDAO() {
            if (instanciaComputadoraDAO == null) {
                instanciaComputadoraDAO = new  ComputadoraDAO();
            }
            return instanciaComputadoraDAO;
        }
    @Override
    public ComputadoraDominio agregarComputadora(AgregarComputadoraDTO nuevaComputadora) {
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("LaboratorioComputo");
        EntityManager em = fabrica.createEntityManager();
        
        em.getTransaction().begin();
            AlumnoDominio alumno = null;
        if (nuevaComputadora.getAlumno() != null && nuevaComputadora.getAlumno().getId() != null) {
            alumno = em.find(AlumnoDominio.class, nuevaComputadora.getAlumno().getId());
        }

        LaboratorioDominio laboratorio = null;
        if (nuevaComputadora.getLaboratorio() != null && nuevaComputadora.getLaboratorio().getId() != null) {
            laboratorio = em.find(LaboratorioDominio.class, nuevaComputadora.getLaboratorio().getId());
        }
        
        ComputadoraDominio computadoraGuardar = new ComputadoraDominio(nuevaComputadora.getDireccionIP(), nuevaComputadora.getNumero(), nuevaComputadora.getEstatus(), nuevaComputadora.getAlumno(), nuevaComputadora.getLaboratorio());
                
        em.persist(computadoraGuardar);
        
        em.getTransaction().commit();
        
        em.close();
        
        fabrica.close();
        
        return computadoraGuardar;
    }

    @Override
    public List<ComputadoraDominio> consultarComputadorasPorLab(LaboratorioDominio laboratorio) {
       // EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("LaboratorioComputo");
       List<ComputadoraDominio> computadoras = new ArrayList<>();
               //getResultList();
       try{
           EntityManager em = ConexionBD.crearConexion();
           String comando = "Select pc from ComputadoraDominio where pc.laboratorio_id = :id";
           TypedQuery<ComputadoraDominio> query = em.createQuery(comando, ComputadoraDominio.class);
           query.setParameter("laboratorio_id", laboratorio.getId());
           computadoras = query.getResultList();
           
       }catch(Exception ex){
           
       }
       
        
//        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
//        
//        CriteriaQuery<ComputadoraDominio> criteriaQuery = criteriaBuilder.createQuery(ComputadoraDominio.class);
//        
//        
//         
//        for(ComputadoraDominio computadora : computadoras){
//            System.out.println(computadora.getDireccionIP());
//            System.out.println(computadora.getEstatus());
//        }
//        
//        em.close();
//        fabrica.close();
        
        return computadoras;
    }
    @Override
    public List<ComputadoraDominio> consultarComputadoras() {
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("LaboratorioComputo");
        List<ComputadoraDominio> computadoras = new ArrayList<>();
//       try{
           EntityManager em = ConexionBD.crearConexion();
//           String comando = "Select pc from ComputadoraDominio where pc.laboratorio_id = :id";
//           TypedQuery<ComputadoraDominio> query = em.createQuery(comando, ComputadoraDominio.class);
//           query.setParameter("laboratorio_id", laboratorio.getId());
//           computadoras = query.getResultList();
//           
//       }catch(Exception ex){
//           
//       }
       
        
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        
        CriteriaQuery<ComputadoraDominio> criteriaQuery = criteriaBuilder.createQuery(ComputadoraDominio.class);
        
        
         
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
