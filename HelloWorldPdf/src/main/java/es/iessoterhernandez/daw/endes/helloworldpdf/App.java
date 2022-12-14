package es.iessoterhernandez.daw.endes.HelloWorldPdf;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      try {  Document d = new Document();
        OutputStream os = new FileOutputStream(new File("C:\\Windows\\Temp\\Test.pdf"));
        PdfWriter.getInstance(d, os);
        d.open();
        d.add(new Paragraph("Hola Mundo"+" este es un archivo"));
        d.close();
        os.close();
        System.out.println("pdf hecho bien");
    }catch(Exception e) {
    	e.printStackTrace();}
    }
}
