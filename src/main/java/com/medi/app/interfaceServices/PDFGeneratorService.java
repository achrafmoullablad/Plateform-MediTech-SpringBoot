//package com.medi.app.interfaceServices;
//
//public interface PDFGeneratorService {
//
//}
package com.medi.app.interfaceServices;

import com.lowagie.text.*;
import com.lowagie.text.pdf.PdfWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Service
public class PDFGeneratorService {
	@Autowired
	private IconsultationService service;
    public void export(HttpServletResponse response,int id) throws IOException {
    	
        Document document = new Document(PageSize.A4);
        PdfWriter.getInstance(document, response.getOutputStream());

        document.open();
        Font fontTitle = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
        fontTitle.setSize(18);
        Font fontParagraph = FontFactory.getFont(FontFactory.HELVETICA);
        fontParagraph.setSize(12);
        Paragraph paragraphx = new Paragraph("Rabat le : "+service.findconbyid(id).getDate().toString(),fontParagraph);
        paragraphx.setAlignment(Paragraph.ALIGN_LEFT);
        Paragraph paragraph = new Paragraph("Consulatation" , fontTitle);
        paragraph.setAlignment(Paragraph.ALIGN_CENTER);

    

        Paragraph paragraph2 = new Paragraph("Dr : "+ service.findconbyid(id).getMedecin().getNom()+" "+service.findconbyid(id).getMedecin().getPrenom(), fontParagraph);
        paragraph2.setAlignment(Paragraph.ALIGN_LEFT);
        Paragraph paragraph7 = new Paragraph(service.findconbyid(id).getMedecin().getAdresse(), fontParagraph);
        paragraph7.setAlignment(Paragraph.ALIGN_LEFT);
        Paragraph paragraph5 = new Paragraph(service.findconbyid(id).getMedecin().getTelephone(), fontParagraph);
        paragraph5.setAlignment(Paragraph.ALIGN_LEFT);
        Paragraph paragraph3 = new Paragraph(service.findconbyid(id).getPatient().getNom() +" "+service.findconbyid(id).getPatient().getPrenom(), fontParagraph);
        paragraph3.setAlignment(Paragraph.ALIGN_RIGHT);
        Paragraph paragraph4= new Paragraph(service.findconbyid(id).getMedicament().getNom() +"----------- "+service.findconbyid(id).getMedicament().getLaboratoire(), fontParagraph);
        paragraph4.setAlignment(Paragraph.ROW);
        document.add(paragraphx);
        document.add(paragraph);
        document.add(paragraph2);
        document.add(paragraph7);
        document.add(paragraph5);
        
        document.add(paragraph3);
        document.add(paragraph4);
        document.close();
    }
}