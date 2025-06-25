/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOs;

import java.util.List;

/**
 *
 * @author jalt2
 */
public class AgregarComputadoraDTO {
    private Long id;
    private String numero;
    private String direccionIP;
    private String estatus;
    private List<String> listaSoftWare;

    public AgregarComputadoraDTO() {
    }

    public AgregarComputadoraDTO(Long id, String numero, String direccionIP, String estatus, List<String> listaSoftWare) {
        this.id = id;
        this.numero = numero;
        this.direccionIP = direccionIP;
        this.estatus = estatus;
        this.listaSoftWare = listaSoftWare;
    }
    
    
    
    public AgregarComputadoraDTO(String numero, String direccionIP, String estatus, List<String> listaSoftWare) {
        this.numero = numero;
        this.direccionIP = direccionIP;
        this.estatus = estatus;
        this.listaSoftWare = listaSoftWare;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDireccionIP() {
        return direccionIP;
    }

    public void setDireccionIP(String direccionIP) {
        this.direccionIP = direccionIP;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public List<String> getListaSoftWare() {
        return listaSoftWare;
    }

    public void setListaSoftWare(List<String> listaSoftWare) {
        this.listaSoftWare = listaSoftWare;
    }
    
    
    
}
