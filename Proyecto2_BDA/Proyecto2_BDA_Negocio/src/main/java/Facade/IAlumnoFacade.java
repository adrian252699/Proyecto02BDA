/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Facade;

import Excepciones.NegocioException;
import entidades.AlumnoDominio;
import java.util.List;

/**
 *
 * @author HP
 */
public interface IAlumnoFacade {
    public List<AlumnoDominio> consultarAlumnoPorId(Long id) throws NegocioException;
    
}
