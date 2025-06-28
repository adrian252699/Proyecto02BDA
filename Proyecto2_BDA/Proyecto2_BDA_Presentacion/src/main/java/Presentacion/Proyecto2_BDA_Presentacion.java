/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Presentacion;

import Conexion.ConexionBD;
import ControlNavegacion.ControlFlujoApartar;
import ControlNavegacion.ControlAdmin;
import DTOs.AgregarCarreraDTO;
import javax.persistence.EntityManager;

/**
 *
 * @author jalt2
 */
public class Proyecto2_BDA_Presentacion {

    public static void main(String[] args) {
        //crear BD
//        EntityManager manejador = ConexionBD.getEntityManager();
        
//        ControlAdmin prueba = new ControlAdmin();
        ControlFlujoApartar prueba = new ControlFlujoApartar();
        
        prueba.valoresDefault();
    }
}
