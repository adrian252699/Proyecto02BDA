/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import DTOs.AgregarLaboratorioDTO;
import entidades.LaboratorioDominio;
import java.util.List;

/**
 *
 * @author jalt2
 */
public interface ILaboratorioDAO {
    public LaboratorioDominio agregarLaboratorio(AgregarLaboratorioDTO nuevoLaboratorio);
    public List<LaboratorioDominio> consultarLaboratorios();
    public LaboratorioDominio consultarLaboratorioId(Long idLaboratorio);
    public LaboratorioDominio editarLaboratorio(Long idLaboratorio, AgregarLaboratorioDTO dto);
    public List<LaboratorioDominio> consultarLaboratoriosUnidadAcademica(Long idUnidadAcademica);
    public LaboratorioDominio buscarPorNombre(String Nombre);
}
