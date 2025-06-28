/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import Conexion.ConexionBD;
import entidades.BloqueoDominio;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Sandra
 */
public class BloqueoDAO {
     private static BloqueoDAO instanciaBloqueoDAO;

    public static BloqueoDAO getInstanciaDAO() {
        if (instanciaBloqueoDAO == null) {
            instanciaBloqueoDAO = new BloqueoDAO();
        }
        return instanciaBloqueoDAO;
    }


    public List<BloqueoDominio> consultarBloqueos() {
        List<BloqueoDominio> bloqueos = new ArrayList<>();

        try {
            EntityManager em = ConexionBD.crearConexion();
            String comando = "SELECT b FROM BloqueoDominio b";
            TypedQuery<BloqueoDominio> query = em.createQuery(comando, BloqueoDominio.class);
            bloqueos = query.getResultList();
        } catch (Exception ex) {
            System.out.println("Error en consultar bloqueos: " + ex.getMessage());
        } finally {
            ConexionBD.cerrar();
        }

        return bloqueos;
    }
}
