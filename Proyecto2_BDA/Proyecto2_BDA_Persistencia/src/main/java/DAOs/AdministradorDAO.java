/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import DTOs.NuevoAdministradorDTO;
import entidades.AdministradorDominio;
import interfaces.IAdministradorDAO;
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
public class AdministradorDAO implements IAdministradorDAO {

    @Override
    public AdministradorDominio agregarAdministrador(NuevoAdministradorDTO nuevoAdministrador) {
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("LaboratorioComputo");
        EntityManager em = fabrica.createEntityManager();

        em.getTransaction().begin();

        AdministradorDominio administradorGuardar = new AdministradorDominio(nuevoAdministrador.getClaveAdministrador());

        em.getTransaction().commit();

        em.close();
        fabrica.close();

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

}
