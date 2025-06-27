/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import DTOs.NuevoAdministradorDTO;
import Conexion.ConexionBD;
import entidades.AdministradorDominio;
import interfaces.IAdministradorDAO;
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
public class AdministradorDAO implements IAdministradorDAO {
    
    private static AdministradorDAO instanciaAdministradoDAO;
    
    public static AdministradorDAO getInstanciaDAO() {
        if (instanciaAdministradoDAO == null) {
            instanciaAdministradoDAO = new AdministradorDAO();
        }
        return instanciaAdministradoDAO;
    }
    @Override
    public AdministradorDominio agregarAdministrador(NuevoAdministradorDTO nuevoAdministrador) {
        EntityManager em = ConexionBD.crearConexion();
        em.getTransaction().begin();

        AdministradorDominio administradorGuardar = new AdministradorDominio(nuevoAdministrador.getClaveAdministrador());

        em.getTransaction().commit();

        em.close();
        ConexionBD.cerrar();

        return administradorGuardar;
    }

    public List<AdministradorDominio> consultarAdministradores() {
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("LaboratorioComputo");
        EntityManager em = fabrica.createEntityManager();

        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<AdministradorDominio> criteriaQuery = criteriaBuilder.createQuery(AdministradorDominio.class);
        criteriaQuery.from(AdministradorDominio.class);

        List<AdministradorDominio> administradores = em.createQuery(criteriaQuery).getResultList();

        for (AdministradorDominio administrador : administradores) {
            System.out.println("ID: " + administrador.getId());
            System.out.println("Clave Admin: " + administrador.getClaveAdmin());
        }

        em.close();
        fabrica.close();

        return administradores;
    }

    public AdministradorDominio consultarAdministradorId(Long id) {
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("LaboratorioComputo");
        EntityManager em = fabrica.createEntityManager();

        AdministradorDominio administrador = em.find(AdministradorDominio.class, id);

        em.close();
        fabrica.close();

        return administrador;
    }

    @Override
    public AdministradorDominio consultarAdinistrador(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
