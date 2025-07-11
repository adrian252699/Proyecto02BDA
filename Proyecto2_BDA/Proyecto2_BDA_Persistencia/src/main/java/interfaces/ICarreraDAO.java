/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import DTOs.AgregarCarreraDTO;
import entidades.CarreraDominio;
import java.util.List;

/**
 *
 * @author jalt2
 */
public interface ICarreraDAO {
    public CarreraDominio agregarCarrera(AgregarCarreraDTO nuevaCarrera);
    public CarreraDominio consultarCarreraId(Long id);
    public List<CarreraDominio> consultarCarreras();
}
