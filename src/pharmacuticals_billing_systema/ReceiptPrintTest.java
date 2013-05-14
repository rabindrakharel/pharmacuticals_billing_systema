/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacuticals_billing_systema;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.OrientationRequested;


public class ReceiptPrintTest implements Printable {

    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {

      if (pageIndex < 0 || pageIndex >= 1) {
            return Printable.NO_SUCH_PAGE;
        }

        Graphics2D g2d = (Graphics2D) graphics;
        g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

        Font font = new Font("Arial",Font.PLAIN, 8);

        g2d.setFont(font);
        g2d.drawString("1234567890abcdefgeeeeeeeeeeeeeeeeeeeeee", 5, 70);

        g2d.drawRect(0, 0, 100, 50);

        return Printable.PAGE_EXISTS;
    }
    
    
    
public static void main(String[] args) {
   PageFormat format = new PageFormat();
   Paper paper = new Paper();

   double paperWidth = 3.2;
   double paperHeight = 11.69;
   double leftMargin = 0.2;
   double rightMargin = 0.2;
   double topMargin = 0;
   double bottomMargin = 0.01;

   paper.setSize(paperWidth * 72.0, paperHeight * 72.0);
   paper.setImageableArea(leftMargin * 72.0, topMargin * 72.0,
        (paperWidth - leftMargin - rightMargin) * 72.0,
        (paperHeight - topMargin - bottomMargin) * 72.0);
   format.setPaper(paper);
   PrintRequestAttributeSet aset = new HashPrintRequestAttributeSet();
   aset.add(OrientationRequested.PORTRAIT);
   PrinterJob printerJob = PrinterJob.getPrinterJob();
   Printable printable = new ReceiptPrintTest();
   format = printerJob.validatePage(format);
   printerJob.setPrintable(printable, format);
   try {
      printerJob.print(aset);
   }
   catch (Exception e) {
       e.printStackTrace();
   }
}
}