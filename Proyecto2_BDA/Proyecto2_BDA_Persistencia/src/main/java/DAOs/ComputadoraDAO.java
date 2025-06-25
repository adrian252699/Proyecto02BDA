/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import DTOs.AgregarComputadoraDTO;
import entidades.ComputadoraDominio;
import interfaces.IComputadoraDAO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
        
        ComputadoraDominio computadoraGuardar = new ComputadoraDominio(nuevaComputadora.getId(), nuevaComputadora.getDireccionIP(), nuevaComputadora.getNumero(), nuevaComputadora.getEstatus());
        
        em.persist(computadoraGuardar);
        
        em.getTransaction().commit();
        
        em.close();
        
        fabrica.close();
        
        return computadoraGuardar;
    }
    
}
