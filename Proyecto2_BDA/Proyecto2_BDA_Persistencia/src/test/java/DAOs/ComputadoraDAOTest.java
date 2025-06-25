/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package DAOs;

import DTOs.AgregarComputadoraDTO;
import entidades.ComputadoraDominio;
import interfaces.IComputadoraDAO;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jalt2
 */
public class ComputadoraDAOTest {
    
    public ComputadoraDAOTest() {
    }

    /**
     * Test of agregarComputadora method, of class ComputadoraDAO.
     */
//    @org.junit.jupiter.api.Test
//    public void testAgregarComputadora() {
//        
//        List<String> listaSoftware = new ArrayList();
//        
//        listaSoftware.add("Excel");
//        listaSoftware.add("Chrome");
//        listaSoftware.add("Word");
//        
//        AgregarComputadoraDTO nuevaComputadora = new AgregarComputadoraDTO("01", "123.123.123.123", "Disponible", listaSoftware);
//        
//        
//        IComputadoraDAO dao = new ComputadoraDAO();
//        
//        dao.agregarComputadora(nuevaComputadora);
//        
//    }
    
    @org.junit.jupiter.api.Test
    public void testConsultarComputadoras() {
        IComputadoraDAO dao = new ComputadoraDAO();
        
        dao.consultarComputadoras();
        
    }
    
}
