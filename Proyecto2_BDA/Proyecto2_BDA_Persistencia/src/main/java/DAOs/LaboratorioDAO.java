/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import Conexion.ConexionBD;
import DTOs.AgregarLaboratorioDTO;
import entidades.LaboratorioDominio;
import entidades.UnidadAcademicaDominio;
import interfaces.ILaboratorioDAO;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author jalt2
 */
public class LaboratorioDAO implements ILaboratorioDAO {
    
    private static LaboratorioDAO instanciaLaboratoioDAO;

        public static LaboratorioDAO getInstanciaDAO() {
            if (instanciaLaboratoioDAO == null) {
                instanciaLaboratoioDAO = new LaboratorioDAO();
            }
            return instanciaLaboratoioDAO;
        }
        
    @Override
    public LaboratorioDominio agregarLaboratorio(AgregarLaboratorioDTO nuevoLaboratorio) {
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("LaboratorioComputo");
        EntityManager em = fabrica.createEntityManager();

        em.getTransaction().begin();
        UnidadAcademicaDominio unidad= em.find(UnidadAcademicaDominio.class, nuevoLaboratorio.getUnidadAcademica().getId());
        LaboratorioDominio laboratorioGuardar = new LaboratorioDominio(nuevoLaboratorio.getNombre(), nuevoLaboratorio.getHoraInicio(), nuevoLaboratorio.getHoraFin(), unidad);
        em.persist(laboratorioGuardar);

        em.getTransaction().commit();

        em.close();
        fabrica.close();

        return laboratorioGuardar;
    }

    @Override
    public List<LaboratorioDominio> consultarLaboratorios() {
       // EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("LaboratorioComputo");
       List<LaboratorioDominio> laboratorios = new ArrayList<>();
       try{
           EntityManager em = ConexionBD.crearConexion();
           String comando = "Select e from LaboratorioDominio e";
           TypedQuery<LaboratorioDominio> query = em.createQuery(comando, LaboratorioDominio.class);
           laboratorios = query.getResultList();
           return laboratorios;
       }catch(Exception ex){
           System.out.println("Error en consultar LaboratoriosDAO: " +ex.getMessage());
       }finally{
           ConexionBD.cerrar();
       }
        
//        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
//
//        CriteriaQuery criteriaQuery = criteriaBuilder.createQuery(LaboratorioDominio.class);
//
//        List<LaboratorioDominio> laboratorios = em.createQuery(criteriaQuery).getResultList();
//
//        for (LaboratorioDominio laboratorio : laboratorios) {
//            System.out.println(laboratorio.getNombreLaboratorio());
//            System.out.println(laboratorio.getHoraInicio());
//            System.out.println(laboratorio.getHoraFin());
//        }
//
//        em.close();
//        fabrica.close();

        return laboratorios;
    }

    @Override
    public LaboratorioDominio consultarLaboratorioId(Long idLaboratorio) {
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("LaboratorioComputo");
        EntityManager em = fabrica.createEntityManager();

        LaboratorioDominio laboratorio = em.find(LaboratorioDominio.class, idLaboratorio);

        em.close();
        fabrica.close();

        return laboratorio;
    }

    @Override
    public LaboratorioDominio editarLaboratorio(Long idLaboratorio, AgregarLaboratorioDTO dto) {
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("LaboratorioComputo");
        EntityManager em = fabrica.createEntityManager();

        LaboratorioDominio laboratorio = em.find(LaboratorioDominio.class, idLaboratorio);

        if (laboratorio != null) {
            laboratorio.setNombreLaboratorio(dto.getNombre());
            laboratorio.setHoraInicio(dto.getHoraInicio());
            laboratorio.setHoraFin(dto.getHoraFin());
            laboratorio.setUnidadAcademica(dto.getUnidadAcademica());
        }
        em.getTransaction().commit();
        em.close();
        fabrica.close();
        
        return laboratorio;
    }

    @Override
    public List<LaboratorioDominio> consultarLaboratoriosUnidadAcademica(Long idUnidadAcademica) {
        EntityManager em = ConexionBD.getEntityManager();
        
        CriteriaBuilder builder = em.getCriteriaBuilder();
        
        CriteriaQuery<LaboratorioDominio> query = builder.createQuery(LaboratorioDominio.class);
        
        Root<LaboratorioDominio> root = query.from(LaboratorioDominio.class);
        
        query.select(root).where(builder.equal(root.get("idLaboratorio"),idUnidadAcademica));
    
        TypedQuery<LaboratorioDominio> typedQuery = em.createQuery(query);
        List<LaboratorioDominio> laboratorios = typedQuery.getResultList();
        
        return laboratorios;
    }   
}
