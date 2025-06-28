/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package BOs;

import Interfacez.IComputadoraBO;
import interfaces.IComputadoraDAO;

/**
 *
 * @author $Luis Carlos Manjarrez Gonzalez
 */
public class ComputadoraBO implements IComputadoraBO{
    IComputadoraDAO daoComputadora;

    public ComputadoraBO(IComputadoraDAO daoComputadora) {
        this.daoComputadora = daoComputadora;
    }
    
    
}
