/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package BOs;

import DAOs.AlumnoDAO;
import DTOs.NuevoAlumnoDTO;
import DTOs.ReservarAlumnoComputadoraDTO;
import java.util.List;
import Interfacez.IAlumnoBO;
import entidades.AlumnoDominio;
import interfaces.IAlumnoDAO;

/**
 *
 * @author $Luis Carlos Manjarrez Gonzalez
 */
public class AlumnoBO implements IAlumnoBO{
    //ICreadorDAO creadorDAO = IAlumnoDAO;
    //
    
    private IAlumnoDAO daoAlumno;

    public AlumnoBO(IAlumnoDAO daoAlumno) {
        this.daoAlumno = daoAlumno;
    }
    
    
    
    @Override
    public AlumnoDominio consultarEstudiantePorId(Long id) {
        return daoAlumno.consultarAlumnoId(id);
    }

    @Override
    public List<AlumnoDominio> consultarEstudiantes() {
        return daoAlumno.consultarAlumnos();
    }

    @Override
    public AlumnoDominio agregarAlumno(NuevoAlumnoDTO nuevoAlumno) {
        return daoAlumno.agregarAlumno(nuevoAlumno);
    }

    @Override
    public AlumnoDominio reservarComputadora(ReservarAlumnoComputadoraDTO alumnoComputadora) {
        return daoAlumno.reservarComputadora(alumnoComputadora);
    }
    
    
    
    
}
