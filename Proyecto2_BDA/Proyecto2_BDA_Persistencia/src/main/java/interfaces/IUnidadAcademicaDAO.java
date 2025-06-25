/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import DTOs.NuevaUnidadAcademicaDTO;
import entidades.UnidadAcademicaDominio;
import java.util.List;

/**
 *
 * @author jalt2
 */
public interface IUnidadAcademicaDAO {
    public UnidadAcademicaDominio agregarUnidadAcademica(NuevaUnidadAcademicaDTO nuevaUnidad);
    public List<UnidadAcademicaDominio> consultarUnidadesAcademicas();
    public UnidadAcademicaDominio consultarUnidadesAcademicasId(Long id);
}
