/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package DTOs;

import java.util.ArrayList;

/**
 *
 * @author $Luis Carlos Manjarrez Gonzalez
 */
public class ComputadoraDTO {
    private String IP, estatus,numero;
    // o sera int (el numero) por si otra escuela le Quiere poner A2... etc
    private ArrayList<String> listaSoftwares;

    public ComputadoraDTO() {
    }

    public ComputadoraDTO(String IP, String estatus, String numero, ArrayList<String> listaSoftwares) {
        this.IP = IP;
        this.estatus = estatus;
        this.numero = numero;
        this.listaSoftwares = listaSoftwares;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public ArrayList<String> getListaSoftwares() {
        return listaSoftwares;
    }

    public void setListaSoftwares(ArrayList<String> listaSoftwares) {
        this.listaSoftwares = listaSoftwares;
    }

    @Override
    public String toString() {
        return "ComputadoraDTO{" + "IP=" + IP + ", estatus=" + estatus + ", numero=" + numero + ", listaSoftwares=" + listaSoftwares + '}';
    }
    
}
