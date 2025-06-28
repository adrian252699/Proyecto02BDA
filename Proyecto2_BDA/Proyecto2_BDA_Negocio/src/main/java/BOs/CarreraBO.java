/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package BOs;

import DTOs.AgregarCarreraDTO;
import Exception.PersistenciaException;
import Interfacez.ICarreraBO;
import entidades.CarreraDominio;
import interfaces.ICarreraDAO;
import java.util.List;

/**
 *
 * @author $Luis Carlos Manjarrez Gonzalez
 */
public class CarreraBO implements ICarreraBO{
    private ICarreraDAO carreraDAO;
    
    public CarreraBO(ICarreraDAO carreraDAO){
        this.carreraDAO = carreraDAO;
    }
    
    @Override
    public List<CarreraDominio> consultarCarreras() {
        return carreraDAO.consultarCarreras();
    }

    //creo que este metodo no se ocupa
    
    @Override
    public CarreraDominio agregarCarrera(AgregarCarreraDTO nuevaCarrera) {
        //deberiamos agregar las excepciones en los metodos de las DAO, en el catch de las DAO sera una SQLException o Exception en general y que tire una PersistenciaException 
        // y aqui controlamos la excepcion
//        try{
            carreraDAO.agregarCarrera(nuevaCarrera);
            CarreraDominio carreraAgregada = new CarreraDominio(nuevaCarrera.getNombre(), nuevaCarrera.getTiempoMax());
            return carreraAgregada;
//        }catch(PersistenciaException ex){
            
//        }
    }
    
}
