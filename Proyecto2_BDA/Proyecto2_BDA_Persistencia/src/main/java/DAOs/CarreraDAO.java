/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import DTOs.AgregarCarreraDTO;
import entidades.CarreraDominio;
import interfaces.ICarreraDAO;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author jalt2
 */
public class CarreraDAO implements ICarreraDAO{
    
    private static CarreraDAO instanciaCarreraDAO;

        public static CarreraDAO getInstanciaDAO() {
            if (instanciaCarreraDAO == null) {
                instanciaCarreraDAO = new CarreraDAO();
            }
            return instanciaCarreraDAO;
        }
        
    @Override
    public CarreraDominio agregarCarrera(AgregarCarreraDTO nuevaCarrera) {
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("LaboratorioComputo");
        EntityManager em = fabrica.createEntityManager();
        
        em.getTransaction().begin();
        
        CarreraDominio carreraGuardar = new CarreraDominio(nuevaCarrera.getNombre(), nuevaCarrera.getTiempoMax());
        
        em.persist(carreraGuardar);
        
        em.getTransaction().commit();
        
        em.close();
        fabrica.close();
        
        return carreraGuardar;
    }

    @Override
    public CarreraDominio consultarCarreraId(Long id) {
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("LaboratorioComputo");
        EntityManager em = fabrica.createEntityManager();
        
        CarreraDominio carrera = em.find(CarreraDominio.class, id);
        
        em.close();
        fabrica.close();
        
        return carrera;
    }

    public List<CarreraDominio> consultarCarreras() {
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("LaboratorioComputo");
        EntityManager em = fabrica.createEntityManager();

        List<CarreraDominio> carreras = new ArrayList<>();
        try {
            String jpql = "SELECT c FROM CarreraDominio c";
            carreras = em.createQuery(jpql, CarreraDominio.class).getResultList();
        } catch (Exception e) {
            System.out.println("Error al consultar todas las carreras: " + e.getMessage());
        } finally {
            em.close();
            fabrica.close();
        }

        return carreras;
    } 
}
