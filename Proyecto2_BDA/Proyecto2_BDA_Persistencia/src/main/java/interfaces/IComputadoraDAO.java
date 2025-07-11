/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import DTOs.AgregarComputadoraDTO;
import entidades.ComputadoraDominio;
import entidades.LaboratorioDominio;
import java.util.List;

/**
 *
 * @author jalt2
 */
public interface IComputadoraDAO {
    public ComputadoraDominio agregarComputadora(AgregarComputadoraDTO nuevaComputadora);
    public List<ComputadoraDominio> consultarComputadoras();
    public List<ComputadoraDominio> consultarComputadorasPorLab(LaboratorioDominio laboratorio);
    public ComputadoraDominio consultarComputadoraId(Long id);
    
}
