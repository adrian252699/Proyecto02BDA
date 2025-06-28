/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfacez;

import DTOs.AgregarLaboratorioDTO;
import entidades.LaboratorioDominio;
import java.util.List;

/**
 *
 * @author jalt2
 */
public interface ILaboratorioBO {
    public List<LaboratorioDominio> consultarLaboratoriosUnidadAcademica(Long idUnidadAcademica);
    public List<LaboratorioDominio> consultarLaboratorios();
    public LaboratorioDominio agregarLaboratorio(AgregarLaboratorioDTO laboratorio);
}
