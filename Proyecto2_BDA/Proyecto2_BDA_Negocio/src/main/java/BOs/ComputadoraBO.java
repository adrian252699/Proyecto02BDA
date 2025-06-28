/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package BOs;

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
    
    
}
