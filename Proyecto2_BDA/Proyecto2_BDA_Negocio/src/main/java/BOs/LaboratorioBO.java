/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package BOs;

import DTOs.AgregarLaboratorioDTO;
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
    @Override
    public LaboratorioDominio agregarLaboratorio(AgregarLaboratorioDTO laboratorio){
        System.out.println("Lab que entra a la BO:  " + laboratorio.toString());
        daoLaboratorio.agregarLaboratorio(laboratorio);
        LaboratorioDominio labAgregado = new LaboratorioDominio(laboratorio.getNombre(), laboratorio.getHoraInicio(), laboratorio.getHoraFin(), laboratorio.getUnidadAcademica());
        return labAgregado;
    }
    @Override
    public List<LaboratorioDominio> consultarLaboratorios(){
        return daoLaboratorio.consultarLaboratorios();
    }
    
}
