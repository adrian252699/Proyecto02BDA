/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reportes;

import DAOs.CarreraDAO;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.properties.UnitValue;
import entidades.CarreraDominio;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Sandra
 */
public class PDFCarreras {
     private final CarreraDAO carreraDAO;
    private List<CarreraDominio> carrerasReporte;

    public PDFCarreras() {
        this.carreraDAO = CarreraDAO.getInstanciaDAO();
    }

    public void generarReporte(String rutaArchivo) {
        try {
            PdfWriter writer = new PdfWriter(new File(rutaArchivo));
            PdfDocument pdf = new PdfDocument(writer);
            Document document = new Document(pdf);

            // Título
            document.add(new Paragraph("                        Reporte de Carreras").setFontSize(16));

            // Crear tabla con 2 columnas
            Table table = new Table(UnitValue.createPercentArray(new float[]{4, 2})).useAllAvailableWidth();
            table.addHeaderCell("Nombre de la Carrera");
            table.addHeaderCell("Tiempo Máximo (min)");

            List<CarreraDominio> carreras = carrerasReporte;

            for (CarreraDominio carrera : carreras) {
                table.addCell(carrera.getNombreCarrera());
                table.addCell(String.valueOf(carrera.getTiempoMax()));
            }

            document.add(table);
            document.close();
            System.out.println("Reporte generado en: " + rutaArchivo);

        } catch (IOException e) {
            throw new RuntimeException("Error al generar el PDF", e);
        }
    }

    public void setCarrerasReporte(List<CarreraDominio> carreras) {
        this.carrerasReporte = carreras;
    }
}
