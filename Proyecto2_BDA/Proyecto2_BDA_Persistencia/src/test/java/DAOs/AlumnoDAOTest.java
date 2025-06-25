/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package DAOs;

import DTOs.NuevoAlumnoDTO;
import interfaces.IAlumnoDAO;
import interfaces.ICarreraDAO;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jalt2
 */
public class AlumnoDAOTest {
    
    public AlumnoDAOTest() {
    }

    /**
     * Test of consultarAlumnoId method, of class AlumnoDAO.
     */
    @Test
    public void testConsultarAlumnoId() {
    }

    /**
     * Test of agregarAlumno method, of class AlumnoDAO.
     */
    @Test
    public void testAgregarAlumno() {
        IAlumnoDAO dao = new AlumnoDAO();
        ICarreraDAO daoCarrera = new CarreraDAO();
        
        NuevoAlumnoDTO nuevoAlumno = new NuevoAlumnoDTO("Adrian", "12345", daoCarrera.consultarCarreraId(1L));
        
        dao.agregarAlumno(nuevoAlumno);
    }
    
}
