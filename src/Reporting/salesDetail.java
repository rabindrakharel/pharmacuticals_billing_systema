/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * salesDetail.java
 *
 * Created on Dec 22, 2012, 9:18:36 AM
 */
package Reporting;

import Model.PurchaseModel;
import Model.SalesModel;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author paradise lost
 */
public class salesDetail extends javax.swing.JPanel {
    private final GraphPanel graphPanel;
    /** Creates new form salesDetail */
    public salesDetail() throws SQLException {
         monthsVal=new HashMap();
        String months="Jan Feb Mar Apr May Jun Jul Aug Sept Oct Nov Dec";
        String[] monthsList = months.split(" ");
        int mthCount=1;
        
        for(String mthVal:monthsList)
        { String mth="1";
            if(mthCount<10)
             mth="0"+mthCount;
        else  mth=mthCount+"";
            monthsVal.put(mthVal,mth);
        mthCount++;
                    }
      dft=new DefaultTableModel();
        dft.addColumn("Date");
        dft.addColumn("Bill No.");
        dft.addColumn("Sales Man");
        dft.addColumn("Item");
        dft.addColumn("Quantity");
        dft.addColumn("Rate");
        dft.addColumn("Amount");
        SalesModel sm = new SalesModel();       
        Vector<Vector<String>> resultSet=sm.getAllDetails();
        for(Vector<String> list : resultSet)
        {
            dft.addRow(list);
        }
        
        usr=new DefaultTableModel();
        usr.addColumn("User Name");
        usr.addColumn("Amount(NRS)");
       Calendar currentDate = Calendar.getInstance(); //Get the current date
       SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd"); //format it as per your requirement
       String dateStr = formatter.format(currentDate.getTime());
       resultSet=sm.userSalesRecord(dateStr);
        for(Vector<String> list : resultSet)
        {
            usr.addRow(list);
        }      
initComponents();
graphPanel=new GraphPanel();      
graphPanel.setBackground(new java.awt.Color(204, 204, 204));
this.add(graphPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340,700,350));
this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        yearChoice = new java.awt.Choice();
        monthChoice = new java.awt.Choice();
        viewButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        totalPurAmt = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        highPurDay = new javax.swing.JLabel();
        salesRateChange = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        userSalesDtl = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setForeground(new java.awt.Color(204, 204, 255));
        setFont(new java.awt.Font("Tahoma", 0, 10));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(dft);
        jScrollPane2.setViewportView(jTable2);

        jScrollPane3.setViewportView(jScrollPane2);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 570, 660));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel1.setText("Sales Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 9, -1, -1));

        yearChoice.setFont(new java.awt.Font("Academy Engraved LET", 0, 14));
        add(yearChoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 75, -1));
        yearChoice.add("All");
        yearChoice.add("2012");
        yearChoice.add("2013");
        yearChoice.add("2014");
        yearChoice.add("2015");
        yearChoice.add("2016");
        yearChoice.add("2017");
        yearChoice.add("2018");
        yearChoice.add("2019");
        yearChoice.add("2020");
        yearChoice.add("2021");
        yearChoice.add("2022");
        yearChoice.add("2023");
        yearChoice.add("2024");

        monthChoice.setFont(new java.awt.Font("Academy Engraved LET", 0, 14));
        add(monthChoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, 75, -1));
        monthChoice.add("All");
        monthChoice.add("Jan");
        monthChoice.add("Feb");
        monthChoice.add("Mar");
        monthChoice.add("Apr");
        monthChoice.add("May");
        monthChoice.add("Jun");
        monthChoice.add("Jul");
        monthChoice.add("Aug");
        monthChoice.add("Sept");
        monthChoice.add("Oct");
        monthChoice.add("Nov");
        monthChoice.add("Dec");

        viewButton.setFont(new java.awt.Font("Tahoma", 0, 14));
        viewButton.setText("View");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });
        add(viewButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 40, 71, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel2.setText("Total  Sales Amount : ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, -1, 22));

        totalPurAmt.setFont(new java.awt.Font("Tahoma", 0, 14));
        totalPurAmt.setText("O.O NRS");
        add(totalPurAmt, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 90, 108, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, 290, 10));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, 290, 11));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel6.setText("Highest Transaction Record :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 200, 22));

        highPurDay.setFont(new java.awt.Font("Tahoma", 0, 14));
        add(highPurDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 130, 170, 30));

        salesRateChange.setFont(new java.awt.Font("Tahoma", 0, 14));
        salesRateChange.setForeground(new java.awt.Color(0, 0, 255));
        salesRateChange.setText("Action Page");
        salesRateChange.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salesRateChangeMouseClicked(evt);
            }
        });
        add(salesRateChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, -1, 20));

        jLabel7.setText("Change sales rate ");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 4, 110, 30));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, 230, 0));

        userSalesDtl.setModel(usr);
        jScrollPane1.setViewportView(userSalesDtl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, 270, 130));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel3.setText("Todays Sale");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    
    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
      
        try {
            PurchaseModel pm=new PurchaseModel();
                    if("All".equals(yearChoice.getSelectedItem()))
            {
                
                if("All".equals(monthChoice.getSelectedItem()))
            {
               String resArr[]=pm.AllYearAllMonth().split(",");
               totalPurAmt.setText(resArr[0]);
               highPurDay.setText(resArr[1]);
            }
                else
                {
                String resArr[]=pm.AllYearAMonth(monthsVal.get(monthChoice.getSelectedItem()+"")+"").split(",");
               totalPurAmt.setText(resArr[0]);
               highPurDay.setText(resArr[1]);
                }
           
            }
            else { 
                if("All".equals(monthChoice.getSelectedItem()))
            {
               String resArr[]=pm.AYearAllMonth(yearChoice.getSelectedItem()+"").split(",");
               totalPurAmt.setText(resArr[0]);
               highPurDay.setText(resArr[1]);
            }
                else
                {
 
                    String resArr[]=pm.AYearAMonth(yearChoice.getSelectedItem()+"",monthsVal.get(monthChoice.getSelectedItem())+"").split(",");
               totalPurAmt.setText(resArr[0]);
               highPurDay.setText(resArr[1]);
               
                }
             totalPurAmt.setVisible(false);
             totalPurAmt.setVisible(true);
             highPurDay.setVisible(false);
             highPurDay.setVisible(true);

            }
                    
                    
                    // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(salesDetail.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_viewButtonActionPerformed

    private void salesRateChangeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesRateChangeMouseClicked
        try {
            Runtime.getRuntime().exec( "cmd.exe /c start file:///C:/pharmacuticals_billing_systema/changes%20and%20view.html");
            
            // TODO add your handling code here:
        } catch (IOException ex) {
            Logger.getLogger(salesDetail.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
}//GEN-LAST:event_salesRateChangeMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel highPurDay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable2;
    private java.awt.Choice monthChoice;
    private javax.swing.JLabel salesRateChange;
    private javax.swing.JLabel totalPurAmt;
    private javax.swing.JTable userSalesDtl;
    private javax.swing.JButton viewButton;
    private java.awt.Choice yearChoice;
    // End of variables declaration//GEN-END:variables
DefaultTableModel dft;
DefaultTableModel usr;
HashMap monthsVal;
}
