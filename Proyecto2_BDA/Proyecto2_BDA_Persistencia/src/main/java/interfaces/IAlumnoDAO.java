/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import DTOs.NuevoAlumnoDTO;
import DTOs.ReservarAlumnoComputadoraDTO;
import entidades.AlumnoDominio;
import java.util.List;

/**
 *
 * @author jalt2
 */
public interface IAlumnoDAO {
    public AlumnoDominio consultarAlumnoId(Long idAlumno);
    public AlumnoDominio agregarAlumno(NuevoAlumnoDTO nuevoAlumno);
    public List<AlumnoDominio> consultarAlumnos();
    public AlumnoDominio reservarComputadora(ReservarAlumnoComputadoraDTO alumnoComputadora);
    
}
