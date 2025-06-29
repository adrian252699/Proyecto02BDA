/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfacez;

import entidades.UnidadAcademicaDominio;
import java.util.List;

/**
 *
 * @author HP
 */
public interface IUnidadAcademicaBO {
    public UnidadAcademicaDominio consultarUnidadAcademicaPorId(Long idUnidadAcademica);
    public List<UnidadAcademicaDominio> consultarUnidades();
}
