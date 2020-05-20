/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author D P Mohanta
 */



import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.export.ooxml.JRDocxExporter;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.export.ExporterInput;
import net.sf.jasperreports.export.OutputStreamExporterOutput;
import net.sf.jasperreports.export.SimpleDocxExporterConfiguration;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimplePdfExporterConfiguration;

public class ReportGenerator {
    
   // public static String OUT_PUT = "your_output_file_path/myreport.docx";
   //     public static String reportSrcFile = "dist/test.jrxml";

   public void genarateReport
        (String reportPath,String query,
        Map<String, Object> map, 
        Connection con) throws SQLException 
        {
            
            try {
     //   String reportSrcFile = "dist/test.jrxml";
         // for dynamic report generation
      
      JasperDesign jd = JRXmlLoader.load(reportPath);
      JRDesignQuery newQuery =new JRDesignQuery();
      newQuery.setText(query);
      jd.setQuery(newQuery);
     
     // dynamic report generation ends
     

        // First, compile jrxml file.
        JasperReport jasperReport =    JasperCompileManager.compileReport(jd);
 
        //Connection conn = MySQLConnUtils.getMySQLConnection();
         Connection conn = javaconnect.connecrDb();
        // Parameters for report
      //  Map<String, Object> parameters = new HashMap<String, Object>();
 
        JasperPrint print = JasperFillManager.fillReport(jasperReport,
               map , conn);
 
        // Make sure the output directory exists.
      //  File outDir = new File("E:/jasperoutput");
        //outDir.mkdirs();
  
        // PDF Exportor.
        JRPdfExporter exporter = new JRPdfExporter();
         ExporterInput exporterInput = new SimpleExporterInput(print);
        // ExporterInput
        exporter.setExporterInput(exporterInput);
         // ExporterOutput
      //  OutputStreamExporterOutput exporterOutput = new SimpleOutputStreamExporterOutput( "dist/pdfReport.pdf");
         OutputStreamExporterOutput exporterOutput = new SimpleOutputStreamExporterOutput( "E:\\pdfReport.pdf");
            //    "E:/jasperoutput/FirstJasperReport.pdf");
               // Output
        exporter.setExporterOutput(exporterOutput);
         SimplePdfExporterConfiguration configuration = new SimplePdfExporterConfiguration();
        exporter.setConfiguration(configuration);
        exporter.exportReport();
             
        JOptionPane.showMessageDialog(null, "Output generated in pdf");
        // doc exporter
        
        JRDocxExporter exporter1 = new JRDocxExporter();
        // ExporterInput exporterInput = new SimpleExporterInput(print);
        // ExporterInput
        exporter1.setExporterInput(exporterInput);
         // ExporterOutput
      // OutputStreamExporterOutput exporterOutput1 = new SimpleOutputStreamExporterOutput( "dist/docxReport.docx");
         OutputStreamExporterOutput exporterOutput1 = new SimpleOutputStreamExporterOutput( "E:\\docxReport.docx");
            //    "E:/jasperoutput/FirstJasperReport.pdf");
               // Output
        exporter1.setExporterOutput(exporterOutput1);
         SimpleDocxExporterConfiguration configuration1 = new SimpleDocxExporterConfiguration();
        exporter1.setConfiguration(configuration1);
        exporter1.exportReport();
             
        JOptionPane.showMessageDialog(null, "Output generated in docx");


    try {
        
        
         
         Process p = Runtime.getRuntime()
                .exec("rundll32 url.dll,FileProtocolHandler E:\\pdfReport.pdf");
        p.waitFor();
        } catch (IOException | InterruptedException e) {
            
            JOptionPane.showMessageDialog(null, e);
        } 
           
     
      conn.close();
    } catch (JRException ex) {
        Logger.getLogger(Second.class.getName()).log(Level.SEVERE, null, ex);
        
        JOptionPane.showMessageDialog(null, ex  );
    } 
     
    
        }

    

}
