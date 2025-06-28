/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reportes;

import DAOs.CarreraDAO;
import entidades.CarreraDominio;
import java.util.List;

/**
 *
 * @author Sandra
 */
public class ReporteCarreras {
    private final CarreraDAO carreraDAO;

    public ReporteCarreras() {
        this.carreraDAO = new CarreraDAO();
    }

    /**
     * Obtiene todas las carreras en formato DTO.
     */
    public List<CarreraDominio> obtenerTodosLaboratorios() {
        return carreraDAO.consultarCarreras();

    }
    
}
