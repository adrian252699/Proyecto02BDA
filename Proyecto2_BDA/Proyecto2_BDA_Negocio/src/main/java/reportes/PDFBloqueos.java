/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reportes;

import DAOs.BloqueoDAO;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.properties.UnitValue;
import entidades.BloqueoDominio;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 *
 * @author Sandra
 */
public class PDFBloqueos {
    private final BloqueoDAO bloqueoDAO;
    private List<BloqueoDominio> bloqueosReporte;

    public PDFBloqueos() {
        this.bloqueoDAO = BloqueoDAO.getInstanciaDAO();
    }

    public void generarReporte(String rutaArchivo) {
        try {
            PdfWriter writer = new PdfWriter(new File(rutaArchivo));
            PdfDocument pdf = new PdfDocument(writer);
            Document document = new Document(pdf);

            // Título
            document.add(new Paragraph("                  Reporte de Bloqueos de Computadoras").setFontSize(16));

            // Crear tabla
            Table table = new Table(UnitValue.createPercentArray(new float[]{4, 3, 3, 4})).useAllAvailableWidth();
            table.addHeaderCell("Alumno");
            table.addHeaderCell("Fecha de Bloqueo");
            table.addHeaderCell("Fecha de Liberación");
            table.addHeaderCell("Motivo");

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

            for (BloqueoDominio bloqueo : bloqueosReporte) {
                String nombre = bloqueo.getAlumno().getNombreCompleto();
                String fechaBloqueo = sdf.format(bloqueo.getFechaBloqueo().getTime());
                String fechaLiberacion = (bloqueo.getFechaLiberacion() != null)
                        ? sdf.format(bloqueo.getFechaLiberacion().getTime())
                        : "N/A";
                String motivo = bloqueo.getMotivo();

                table.addCell(nombre);
                table.addCell(fechaBloqueo);
                table.addCell(fechaLiberacion);
                table.addCell(motivo);
            }

            document.add(table);
            document.close();
            System.out.println("Reporte generado en: " + rutaArchivo);

        } catch (IOException e) {
            throw new RuntimeException("Error al generar el PDF", e);
        }
    }

    public void setBloqueosReporte(List<BloqueoDominio> bloqueos) {
        this.bloqueosReporte = bloqueos;
    }
    
    
}
