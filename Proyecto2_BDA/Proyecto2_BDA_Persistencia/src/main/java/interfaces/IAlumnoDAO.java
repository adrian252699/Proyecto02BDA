/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import DTOs.NuevoAlumnoDTO;
import entidades.AlumnoDominio;

/**
 *
 * @author jalt2
 */
public interface IAlumnoDAO {
    public AlumnoDominio consultarAlumnoId(Long idAlumno);
    public AlumnoDominio agregarAlumno(NuevoAlumnoDTO nuevoAlumno);
}
