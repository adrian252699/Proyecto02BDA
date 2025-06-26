/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOs;

import entidades.AlumnoDominio;
import entidades.LaboratorioDominio;
import java.util.List;

/**
 *
 * @author jalt2
 */
public class AgregarComputadoraDTO {
    private String numero;
    private String direccionIP;
    private String estatus;
    private List<String> listaSoftWare;
    private LaboratorioDominio laboratorio;
    private AlumnoDominio alumno;

    public AgregarComputadoraDTO() {
    }

    public AgregarComputadoraDTO(String numero, String direccionIP, String estatus, List<String> listaSoftWare, LaboratorioDominio laboratorio) {
        this.numero = numero;
        this.direccionIP = direccionIP;
        this.estatus = estatus;
        this.listaSoftWare = listaSoftWare;
        this.laboratorio = laboratorio;
    }
    
    
    
    public AgregarComputadoraDTO(String numero, String direccionIP, String estatus, List<String> listaSoftWare, LaboratorioDominio laboratorio, AlumnoDominio alumno) {
        this.numero = numero;
        this.direccionIP = direccionIP;
        this.estatus = estatus;
        this.listaSoftWare = listaSoftWare;
        this.laboratorio = laboratorio;
        this.alumno = alumno;
    }

    public AgregarComputadoraDTO(String numero, String direccionIP, String estatus, List<String> listaSoftWare) {
        this.numero = numero;
        this.direccionIP = direccionIP;
        this.estatus = estatus;
        this.listaSoftWare = listaSoftWare;
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

    public LaboratorioDominio getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(LaboratorioDominio laboratorio) {
        this.laboratorio = laboratorio;
    }

    public AlumnoDominio getAlumno() {
        return alumno;
    }

    public void setAlumno(AlumnoDominio alumno) {
        this.alumno = alumno;
    }
    
    
    
}
