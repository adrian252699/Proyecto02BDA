/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reportes;


import DTOs.LaboratorioDTO;
import entidades.LaboratorioDominio;
import DAOs.LaboratorioDAO;
import com.itextpdf.kernel.pdf.*;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.*;
import com.itextpdf.layout.properties.UnitValue;
import java.io.File;
import java.io.IOException;
import java.util.List;
/**
 *
 * @author Sandra
 */
public class PDFCentroComputo {
     private final LaboratorioDAO laboratorioDAO;
    private List<LaboratorioDominio> laboratoriosReporte;

    public PDFCentroComputo() {
        this.laboratorioDAO = LaboratorioDAO.getInstanciaDAO();
    }

    public void generarReporte(String rutaArchivo) {
        try {
            PdfWriter writer = new PdfWriter(new File(rutaArchivo));
            PdfDocument pdf = new PdfDocument(writer);
            Document document = new Document(pdf);

            // Título
            document.add(new Paragraph("                    Reporte de Centro de computo").setFontSize(16));

            // Crear tabla con 4 columnas
            Table table = new Table(UnitValue.createPercentArray(new float[]{3, 3, 3, 3})).useAllAvailableWidth();
            table.addHeaderCell("Nombre"); 
            table.addHeaderCell("Unidad Académica");
            table.addHeaderCell("Hora de Inicio");
            table.addHeaderCell("Hora de Fin");
           

            List<LaboratorioDominio> laboratorios = laboratoriosReporte;

            for (LaboratorioDominio lab : laboratorios) {
                table.addCell(lab.getNombreLaboratorio());
                table.addCell(formatHora(lab.getHoraInicio()));
                table.addCell(formatHora(lab.getHoraFin()));
                table.addCell(lab.getUnidadAcademica().getNombreUnidad());
            }

            document.add(table);
            document.close();
            System.out.println("Reporte generado en: " + rutaArchivo);

        } catch (IOException e) {
            throw new RuntimeException("Error al generar el PDF: "+ e.getLocalizedMessage());
        }
    }

    // Puedes usar este método para pasarle los datos desde fuera si quieres
    public void setLaboratoriosReporte(List<LaboratorioDominio> laboratorios) {
        this.laboratoriosReporte = laboratorios;
    }

    // Formato simple de hora
    private String formatHora(java.util.Calendar hora) {
        int h = hora.get(java.util.Calendar.HOUR_OF_DAY);
        int m = hora.get(java.util.Calendar.MINUTE);
        return String.format("%02d:%02d", h, m);
    }
}
