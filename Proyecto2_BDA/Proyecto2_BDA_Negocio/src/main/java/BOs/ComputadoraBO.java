/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package BOs;

import DTOs.AgregarComputadoraDTO;
import Interfacez.IComputadoraBO;
import entidades.ComputadoraDominio;
import entidades.LaboratorioDominio;
import interfaces.IComputadoraDAO;
import java.util.List;

/**
 *
 * @author $Luis Carlos Manjarrez Gonzalez
 */
public class ComputadoraBO implements IComputadoraBO{
    IComputadoraDAO daoComputadora;

    public ComputadoraBO(IComputadoraDAO daoComputadora) {
        this.daoComputadora = daoComputadora;
    }

    @Override
    public List<ComputadoraDominio> consultarComputadorasPorLaboratorio(LaboratorioDominio laboratorio) {
        return this.daoComputadora.consultarComputadorasPorLab(laboratorio);
    }
    @Override
    public ComputadoraDominio agregarComputadora(AgregarComputadoraDTO computadora){
        daoComputadora.agregarComputadora(computadora);
        ComputadoraDominio pcAgregada = new ComputadoraDominio(computadora.getDireccionIP(), computadora.getNumero(), computadora.getEstatus(), computadora.getAlumno(), computadora.getLaboratorio());
        return pcAgregada;
    }
    @Override
    public List<ComputadoraDominio> consultarComputadoras(){
        return daoComputadora.consultarComputadoras();
    }
    
    
}
