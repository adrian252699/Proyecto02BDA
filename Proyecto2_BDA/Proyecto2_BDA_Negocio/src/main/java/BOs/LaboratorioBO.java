/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package BOs;

import Interfacez.ILaboratorioBO;
import entidades.LaboratorioDominio;
import interfaces.ILaboratorioDAO;
import java.util.List;

/**
 *
 * @author $Luis Carlos Manjarrez Gonzalez
 */
public class LaboratorioBO implements ILaboratorioBO{
    ILaboratorioDAO daoLaboratorio;

    public LaboratorioBO(ILaboratorioDAO daoLaboratorio) {
        this.daoLaboratorio = daoLaboratorio;
    }

    @Override
    public List<LaboratorioDominio> consultarLaboratoriosUnidadAcademica(Long idUnidadAcademica) {
        return this.daoLaboratorio.consultarLaboratoriosUnidadAcademica(idUnidadAcademica);
    }
    
}
