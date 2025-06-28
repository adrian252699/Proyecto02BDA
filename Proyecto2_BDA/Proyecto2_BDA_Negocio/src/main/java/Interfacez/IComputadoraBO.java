/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfacez;

import entidades.ComputadoraDominio;
import entidades.LaboratorioDominio;
import java.util.List;

/**
 *
 * @author jalt2
 */
public interface IComputadoraBO {
    public List<ComputadoraDominio> consultarComputadorasPorLaboratorio(LaboratorioDominio laboratorio);
    
}
