/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reportes;

import DAOs.LaboratorioDAO;
import entidades.LaboratorioDominio;
import java.util.List;


/**
 *
 * @author Sandra
 */
public class ReporteCentroComputo {

    private final LaboratorioDAO laboratorioDAO;

    public ReporteCentroComputo() {
        this.laboratorioDAO = new LaboratorioDAO();
    }

    /**
     * Obtiene todas los laboratorios en formato DTO.
     */
    public List<LaboratorioDominio> obtenerTodosLaboratorios() {
        return laboratorioDAO.consultarLaboratorios();

    }
}
