/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Conexion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author $Luis Carlos Manjarrez Gonzalez
 */
public class ConexionBD {
    //static para q sea solo una conexion en toda la aplicacion
    private static final EntityManagerFactory manager = Persistence.createEntityManagerFactory("laboratrioComputo"); //aqui pondremos el nombre de la bd que tenemos en el pom
    
    public static EntityManager crearConexion() {
        return manager.createEntityManager();
    } 
    
    public static void cerrar() {
        if (manager.isOpen()) {
            manager.close();
        }
    }
}
