/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfacez;

import DTOs.NuevoAlumnoDTO;
import java.util.List;

/**
 *
 * @author HP
 */
public interface IAlumnoBO {
    public List<NuevoAlumnoDTO> consultarEstudiantePorId(Long id);
//    public List<NuevoAlumnoDTO> consultarEstudianteConFiltro(FiltroDTO filtro); lo dejare para mas tarde primero el flujo de 
//    public List<NuevoAlumnoDTO> consultarEstudiantePorId(Long id);
    
}
