/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package DAOs;

import DTOs.AgregarLaboratorioDTO;
import interfaces.ILaboratorioDAO;
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
    @Test
    public void testAgregarLaboratorio() {
        Calendar horaInicio = Calendar.getInstance();
        Calendar horaFin = Calendar.getInstance();
        
        horaInicio.set(Calendar.HOUR_OF_DAY, 8);
        horaInicio.set(Calendar.MINUTE,0);
        horaInicio.set(Calendar.SECOND,0);
        horaInicio.set(Calendar.MILLISECOND,0);
        
        horaFin.set(Calendar.HOUR_OF_DAY, 20);
        horaFin.set(Calendar.MINUTE,0);
        horaFin.set(Calendar.SECOND,0);
        horaFin.set(Calendar.MILLISECOND,0);
        
        AgregarLaboratorioDTO nuevoLaboratorio = new  AgregarLaboratorioDTO("Cisco", horaInicio, horaFin);
        
        ILaboratorioDAO dao = new LaboratorioDAO();
        
        dao.agregarLaboratorio(nuevoLaboratorio);
    }
    
}
