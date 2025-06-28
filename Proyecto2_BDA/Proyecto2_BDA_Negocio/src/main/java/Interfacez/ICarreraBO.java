/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfacez;

import DTOs.AgregarCarreraDTO;
import Excepciones.NegocioException;
import entidades.CarreraDominio;
import java.util.List;

/**
 *
 * @author HP
 */
public interface ICarreraBO {
//  public List<NuevoAlumnoDTO> consultarEstudianteConFiltro(FiltroDTO filtro); lo dejare para mas tarde primero el flujo de 
    public List<CarreraDominio> consultarCarreras();
    public CarreraDominio agregarCarrera(AgregarCarreraDTO nuevaCarrera) throws NegocioException;
//    public CarreraDominio eliminarCarrera(ReservarAlumnoComputadoraDTO alumnoComputadora);
}
