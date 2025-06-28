/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package DAOs;

import DTOs.AgregarLaboratorioDTO;
import entidades.UnidadAcademicaDominio;
import interfaces.ILaboratorioDAO;
import interfaces.IUnidadAcademicaDAO;
import java.util.Calendar;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jalt2
 */
public class LaboratorioDAOTest {
    
    public LaboratorioDAOTest() {
    }

    /**
     * Test of agregarLaboratorio method, of class LaboratorioDAO.
     */
//    @Test
//    public void testAgregarLaboratorio() {
//        Calendar horaInicio = Calendar.getInstance();
//        Calendar horaFin = Calendar.getInstance();
//        
//        ILaboratorioDAO dao = new LaboratorioDAO();
//        IUnidadAcademicaDAO daoUnidad = new UnidadAcademicaDAO();
//        
//        horaInicio.set(Calendar.HOUR_OF_DAY, 8);
//        horaInicio.set(Calendar.MINUTE,0);
//        horaInicio.set(Calendar.SECOND,0);
//        horaInicio.set(Calendar.MILLISECOND,0);
//        
//        horaFin.set(Calendar.HOUR_OF_DAY, 20);
//        horaFin.set(Calendar.MINUTE,0);
//        horaFin.set(Calendar.SECOND,0);
//        horaFin.set(Calendar.MILLISECOND,0);
//        int cont =0;
//        String nombreLab0 ="CISCO ";
//        String nombreLab1 ="Laboratorio 2";
//        String nombreLab2 ="Laboratorio 1";
//        for (UnidadAcademicaDominio unidad : daoUnidad.consultarUnidadesAcademicas()) {
//                System.out.println("Unidad: " + unidad.getNombreUnidad() + " | ID: " + unidad.getId());
//           }
//        String nombre = nombreLab0;
//        for(UnidadAcademicaDominio dominio: daoUnidad.consultarUnidadesAcademicas()){
//            
//            AgregarLaboratorioDTO nuevoLaboratorio = new  AgregarLaboratorioDTO();
//            nuevoLaboratorio.setNombre(nombre);
//            nuevoLaboratorio.setHoraInicio(horaInicio);
//            nuevoLaboratorio.setHoraFin(horaFin);
//            nuevoLaboratorio.setUnidadAcademica(dominio);
//            cont++;
//            if (cont == 1) {
//                nombre= nombreLab1;
//            }else if(cont== 2){
//                nombre= nombreLab2;
//            }
//            dao.agregarLaboratorio(nuevoLaboratorio);
//            System.out.println("Se agrego el laboratorio en la BD:" + nuevoLaboratorio.toString());
//        }  
//        
//    }
//    
    }

