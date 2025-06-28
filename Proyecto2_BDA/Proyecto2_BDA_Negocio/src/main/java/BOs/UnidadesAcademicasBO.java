/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package BOs;

import DAOs.UnidadAcademicaDAO;
import entidades.UnidadAcademicaDominio;
import java.util.List;
import Interfacez.IUnidadAcademicaBO;
import interfaces.IUnidadAcademicaDAO;

/**
 *
 * @author $Luis Carlos Manjarrez Gonzalez
 */
public class UnidadesAcademicasBO implements IUnidadAcademicaBO{
    private IUnidadAcademicaDAO unidadDAO;
    
    public UnidadesAcademicasBO(IUnidadAcademicaDAO unidadDAO){
        this.unidadDAO = unidadDAO;
    }
    
    @Override
    public List<UnidadAcademicaDominio> consultarLaboratorios() {
        return unidadDAO.consultarUnidadesAcademicas();
    }

}
