/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PurchaseForm.java
 *
 * Created on Nov 14, 2012, 8:56:27 PM
 */
package pharmacuticals_billing_systema;

import Model.InventoryModel;
import Model.PurchaseModel;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author paradise lost
 */
public class PurchaseForm extends javax.swing.JPanel {

 
    public PurchaseForm() {
        initComponents();
    } // constructor 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PurchaseFrame = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        dealerNameField = new javax.swing.JTextField();
        dealerLocationField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dateField = new javax.swing.JTextField();
        totalAmountLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        printButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        particularField = new javax.swing.JTextField();
        quantityField = new javax.swing.JTextField();
        purRate = new javax.swing.JTextField();
        amountField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ParticularList = new javax.swing.JList();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dealerNameLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        quantityList = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        amountList = new javax.swing.JList();
        pushButton = new javax.swing.JButton();
        warningLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        successLabel = new javax.swing.JLabel();
        automaticRadioButton = new javax.swing.JRadioButton();
        Product1 = new javax.swing.JLabel();
        Product2 = new javax.swing.JLabel();
        Product3 = new javax.swing.JLabel();
        Product4 = new javax.swing.JLabel();
        Product5 = new javax.swing.JLabel();
        Product6 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 123), new java.awt.Dimension(0, 123), new java.awt.Dimension(32767, 123));
        jLabel15 = new javax.swing.JLabel();
        disButton = new javax.swing.JRadioButton();
        Product7 = new javax.swing.JLabel();
        Product8 = new javax.swing.JLabel();
        Product9 = new javax.swing.JLabel();
        disField = new javax.swing.JTextField();
        upqLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        slsRate = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();

        PurchaseFrame.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PurchaseFrame.setForeground(new java.awt.Color(204, 0, 204));
        PurchaseFrame.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Charge : ");
        PurchaseFrame.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 550, -1, 60));

        dealerNameField.setFont(new java.awt.Font("Calibri", 0, 18));
        dealerNameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dealerNameFieldMouseExited(evt);
            }
        });
        dealerNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dealerNameFieldActionPerformed(evt);
            }
        });
        dealerNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dealerNameFieldFocusLost(evt);
            }
        });
        dealerNameField.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                dealerNameFieldTextChanged(evt);
            }
        });
        dealerNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dealerNameFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dealerNameFieldKeyTypedHandeler(evt);
            }
        });
        dealerNameField.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                dealerNameFieldTextValuechanged(evt);
            }
        });
        PurchaseFrame.add(dealerNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 370, 30));

        dealerLocationField.setFont(new java.awt.Font("Calibri", 0, 18));
        dealerLocationField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dealerLocationFieldMouseExited(evt);
            }
        });
        dealerLocationField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dealerLocationFieldActionPerformed(evt);
            }
        });
        dealerLocationField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dealerLocationFieldKeyTyped(evt);
            }
        });
        PurchaseFrame.add(dealerLocationField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 370, 30));
        PurchaseFrame.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18));
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Name of Dealer");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        PurchaseFrame.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, 36));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18));
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Place  ");
        PurchaseFrame.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, 36));

        dateField.setFont(new java.awt.Font("Calibri", 0, 18));
        dateField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dateFieldDateMouseExited(evt);
            }
        });
        dateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateFieldActionPerformed(evt);
            }
        });
        dateField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dateFieldFocusLost(evt);
            }
        });
        dateField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dateFieldKeyTypedForDate(evt);
            }
        });
        PurchaseFrame.add(dateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 370, 30));
        SimpleDateFormat d = new SimpleDateFormat("yyyy/MM/dd");
        dateField.setText(d.format(new Date()));

        totalAmountLabel.setFont(new java.awt.Font("Calibri", 0, 48));
        totalAmountLabel.setText("00.00 NRS");
        PurchaseFrame.add(totalAmountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 600, 350, 50));

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 18));
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setText("Date ");
        PurchaseFrame.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, 36));

        printButton.setFont(new java.awt.Font("Calibri", 0, 18));
        printButton.setForeground(new java.awt.Color(0, 51, 204));
        printButton.setText("Save");
        printButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });
        PurchaseFrame.add(printButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, 80, 30));

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 18));
        jLabel11.setForeground(new java.awt.Color(0, 0, 204));
        jLabel11.setText("Amount");
        PurchaseFrame.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 70, 30));

        particularField.setFont(new java.awt.Font("Calibri", 0, 18));
        particularField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                particularFieldParticularMouseExited(evt);
            }
        });
        particularField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                particularFieldActionPerformed(evt);
            }
        });
        particularField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                particularFieldFocusLost(evt);
            }
        });
        particularField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                particularFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                particularFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                particularFieldparticularKeyTyped(evt);
            }
        });
        PurchaseFrame.add(particularField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 210, 30));

        quantityField.setFont(new java.awt.Font("Calibri", 0, 18));
        quantityField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                quantityFieldQuantityMouseExited(evt);
            }
        });
        quantityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityFieldActionPerformed(evt);
            }
        });
        quantityField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                quantityFieldFocusLost(evt);
            }
        });
        quantityField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quantityFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantityFieldQuantityKeyTyped(evt);
            }
        });
        PurchaseFrame.add(quantityField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 70, 30));

        purRate.setFont(new java.awt.Font("Calibri", 0, 18));
        purRate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                purRateRateMouseExited(evt);
            }
        });
        purRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purRateActionPerformed(evt);
            }
        });
        purRate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                purRateFocusLost(evt);
            }
        });
        purRate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                purRateKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                purRateRateKeyTyped(evt);
            }
        });
        PurchaseFrame.add(purRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 70, 30));

        amountField.setFont(new java.awt.Font("Calibri", 0, 18));
        amountField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                amountFieldAmountMouseExited(evt);
            }
        });
        amountField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountFieldActionPerformed(evt);
            }
        });
        amountField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                amountFieldFocusLost(evt);
            }
        });
        amountField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                amountFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                amountFieldAmountKeyTyped(evt);
            }
        });
        PurchaseFrame.add(amountField, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 70, 30));

        jLabel13.setFont(new java.awt.Font("Calibri", 0, 18));
        jLabel13.setForeground(new java.awt.Color(0, 0, 204));
        jLabel13.setText("Particulars");
        PurchaseFrame.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 130, -1));

        jLabel14.setFont(new java.awt.Font("Calibri", 0, 18));
        jLabel14.setForeground(new java.awt.Color(0, 0, 204));
        jLabel14.setText("Qty");
        PurchaseFrame.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 70, 30));

        ParticularList.setBackground(new java.awt.Color(204, 204, 204));
        ParticularList.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(), null));
        ParticularList.setFont(new java.awt.Font("Segoe UI", 0, 14));
        ParticularList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = {  };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(ParticularList);

        PurchaseFrame.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, 210, 280));

        jLabel16.setBackground(new java.awt.Color(0, 153, 102));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jLabel16.setForeground(new java.awt.Color(0, 0, 204));
        jLabel16.setText("Particulars");
        PurchaseFrame.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 230, -1, -1));

        jLabel17.setBackground(new java.awt.Color(0, 153, 102));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jLabel17.setForeground(new java.awt.Color(0, 0, 204));
        jLabel17.setText("Quantity");
        PurchaseFrame.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 230, -1, -1));
        PurchaseFrame.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 400, 10));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jLabel18.setForeground(new java.awt.Color(0, 0, 204));
        jLabel18.setText("Date : ");
        PurchaseFrame.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, 60, -1));

        dateLabel.setFont(new java.awt.Font("Calibri", 0, 12));
        PurchaseFrame.add(dateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, 190, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("Dealer  :  ");
        PurchaseFrame.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 70, 20));

        dealerNameLabel.setFont(new java.awt.Font("Calibri", 0, 12));
        PurchaseFrame.add(dealerNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 170, 170, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jLabel10.setForeground(new java.awt.Color(0, 0, 204));
        jLabel10.setText("Uma Ayurveda Bhawan/Lokman Pharma");
        PurchaseFrame.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 140, -1, -1));

        jLabel19.setBackground(new java.awt.Color(0, 153, 102));
        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jLabel19.setForeground(new java.awt.Color(0, 0, 204));
        jLabel19.setText("Amount");
        PurchaseFrame.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 230, -1, -1));

        quantityList.setBackground(new java.awt.Color(204, 204, 204));
        quantityList.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(), javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder()))));
        quantityList.setFont(new java.awt.Font("Segoe UI", 0, 14));
        quantityList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(quantityList);

        PurchaseFrame.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 250, 50, 280));

        amountList.setBackground(new java.awt.Color(204, 204, 204));
        amountList.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(), null));
        amountList.setFont(new java.awt.Font("Segoe UI", 0, 14));
        amountList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = {""};
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(amountList);

        PurchaseFrame.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 250, 70, 280));

        pushButton.setFont(new java.awt.Font("Calibri", 0, 18));
        pushButton.setForeground(new java.awt.Color(0, 0, 204));
        pushButton.setText("Enter");
        pushButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pushButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pushButtonActionPerformed(evt);
            }
        });
        PurchaseFrame.add(pushButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 60, 30));

        warningLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
        warningLabel.setForeground(new java.awt.Color(255, 0, 51));
        PurchaseFrame.add(warningLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 350, 30));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14));
        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setText("New");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        PurchaseFrame.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 50, 20));

        successLabel.setBackground(new java.awt.Color(153, 153, 153));
        successLabel.setFont(new java.awt.Font("Tahoma", 0, 14));
        successLabel.setForeground(new java.awt.Color(255, 0, 51));
        successLabel.setText("* Successful");
        PurchaseFrame.add(successLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 100, 20));
        successLabel.setVisible(false);

        automaticRadioButton.setBackground(new java.awt.Color(204, 204, 204));
        automaticRadioButton.setFont(new java.awt.Font("Tahoma", 0, 14));
        automaticRadioButton.setForeground(new java.awt.Color(0, 0, 255));
        automaticRadioButton.setText("Auto");
        automaticRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                automaticRadioButtonActionPerformed(evt);
            }
        });
        PurchaseFrame.add(automaticRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 20));

        Product1.setBackground(new java.awt.Color(204, 204, 255));
        Product1.setFont(new java.awt.Font("Calibri", 0, 18));
        Product1.setForeground(new java.awt.Color(0, 51, 204));
        Product1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Product1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Product1MouseClicked(evt);
            }
        });
        PurchaseFrame.add(Product1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 210, 30));
        Product1.setVisible(false);

        Product2.setBackground(new java.awt.Color(204, 204, 255));
        Product2.setFont(new java.awt.Font("Calibri", 0, 18));
        Product2.setForeground(new java.awt.Color(0, 51, 204));
        Product2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Product2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Product2MouseClicked(evt);
            }
        });
        PurchaseFrame.add(Product2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 210, 30));
        Product2.setVisible(false);

        Product3.setBackground(new java.awt.Color(204, 204, 255));
        Product3.setFont(new java.awt.Font("Calibri", 0, 18));
        Product3.setForeground(new java.awt.Color(0, 51, 204));
        Product3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Product3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Product3MouseClicked(evt);
            }
        });
        PurchaseFrame.add(Product3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 210, 30));
        Product3.setVisible(false);

        Product4.setBackground(new java.awt.Color(204, 204, 255));
        Product4.setFont(new java.awt.Font("Calibri", 0, 18));
        Product4.setForeground(new java.awt.Color(0, 51, 204));
        Product4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Product4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Product4MouseClicked(evt);
            }
        });
        PurchaseFrame.add(Product4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 210, 30));
        Product4.setVisible(false);

        Product5.setBackground(new java.awt.Color(204, 204, 255));
        Product5.setFont(new java.awt.Font("Calibri", 0, 18));
        Product5.setForeground(new java.awt.Color(0, 51, 204));
        Product5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Product5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Product5MouseClicked(evt);
            }
        });
        PurchaseFrame.add(Product5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 210, 30));
        Product5.setVisible(false);

        Product6.setBackground(new java.awt.Color(204, 204, 255));
        Product6.setFont(new java.awt.Font("Calibri", 0, 18));
        Product6.setForeground(new java.awt.Color(0, 51, 204));
        Product6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Product6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Product6MouseClicked(evt);
            }
        });
        PurchaseFrame.add(Product6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 210, 30));
        Product6.setVisible(false);

        filler1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PurchaseFrame.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 10, 680));

        jLabel15.setFont(new java.awt.Font("Calibri", 0, 18));
        jLabel15.setForeground(new java.awt.Color(0, 0, 204));
        jLabel15.setText("Pur Rate");
        PurchaseFrame.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 70, 30));

        disButton.setBackground(new java.awt.Color(204, 204, 204));
        disButton.setFont(new java.awt.Font("Tahoma", 0, 14));
        disButton.setForeground(new java.awt.Color(0, 0, 255));
        disButton.setText("Discount");
        disButton.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                disButtonStateChanged(evt);
            }
        });
        disButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disButtonActionPerformed(evt);
            }
        });
        PurchaseFrame.add(disButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, -1, 20));

        Product7.setBackground(new java.awt.Color(204, 204, 255));
        Product7.setFont(new java.awt.Font("Calibri", 0, 18));
        Product7.setForeground(new java.awt.Color(0, 51, 204));
        Product7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Product7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Product7MouseClicked(evt);
            }
        });
        PurchaseFrame.add(Product7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 210, 30));
        Product7.setVisible(false);

        Product8.setBackground(new java.awt.Color(204, 204, 255));
        Product8.setFont(new java.awt.Font("Calibri", 0, 18));
        Product8.setForeground(new java.awt.Color(0, 51, 204));
        Product8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Product8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Product8MouseClicked(evt);
            }
        });
        PurchaseFrame.add(Product8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 210, 30));
        Product8.setVisible(false);

        Product9.setBackground(new java.awt.Color(204, 204, 255));
        Product9.setFont(new java.awt.Font("Calibri", 0, 18));
        Product9.setForeground(new java.awt.Color(0, 51, 204));
        Product9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Product9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Product9MouseClicked(evt);
            }
        });
        PurchaseFrame.add(Product9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 210, 30));
        Product9.setVisible(false);

        disField.setFont(new java.awt.Font("Calibri", 0, 18));
        disField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                disFieldMouseExited(evt);
            }
        });
        disField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disFieldActionPerformed(evt);
            }
        });
        disField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                disFieldFocusLost(evt);
            }
        });
        PurchaseFrame.add(disField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 100, 30));
        upqLabel.setVisible(false);
        disField.setVisible(false);

        upqLabel.setFont(new java.awt.Font("Calibri", 0, 18));
        upqLabel.setForeground(new java.awt.Color(0, 0, 204));
        upqLabel.setText("Discount");
        PurchaseFrame.add(upqLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 80, 40));

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 18));
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setText("Purchase Record Keeping  ");
        PurchaseFrame.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, -1, 36));

        slsRate.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        slsRate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                slsRateRateMouseExited(evt);
            }
        });
        slsRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slsRateActionPerformed(evt);
            }
        });
        slsRate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                slsRateFocusLost(evt);
            }
        });
        slsRate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                slsRateKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                slsRateRateKeyTyped(evt);
            }
        });
        PurchaseFrame.add(slsRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 70, 30));

        jLabel20.setFont(new java.awt.Font("Calibri", 0, 18));
        jLabel20.setForeground(new java.awt.Color(0, 0, 204));
        jLabel20.setText("Sls Rate");
        PurchaseFrame.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 70, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PurchaseFrame, javax.swing.GroupLayout.DEFAULT_SIZE, 1020, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PurchaseFrame, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pushButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pushButtonActionPerformed
if(amountField.getText().matches("[0-9][0-9]*\\.?[0-9]*"))
{
String productName=" ";
String amtVal="0";
String purRateVal="0";
String slsRateVal="0";
String qtyVal="0";
String upqVal="0";
if(!"".equals(amountField.getText().trim()))
amtVal=amountField.getText();
if(!"".equals(particularField.getText().trim()))
productName=particularField.getText();
if(!"".equals(disField.getText().trim()))
upqVal=disField.getText();
if(!"".equals(purRate.getText().trim()))
{ 
    purRateVal=purRate.getText();
    purRateVal=new Float(purRate.getText()).toString();
 }
if(!"".equals(slsRate.getText().trim()))
{ 
    slsRateVal=slsRate.getText();
     purRateVal=new Float(slsRate.getText()).toString();
  
 }
if(!"".equals(quantityField.getText().trim()))
{
qtyVal=quantityField.getText();
if(isPack)
{
Float qtyVa=new Float(qtyVal)*new Float(upqVal);
qtyVal=qtyVa.toString();
}
  
}

if(!"".equals(particularField.getText().trim()+amountField.getText().trim()))
{       ArrayList<String> smallBill=new ArrayList<String>(); 
        smallBill.add(0,row_wid);
        smallBill.add(1,productName); // add the product name to list 
        smallBill.add(2,qtyVal);   // product quantity to the list
        smallBill.add(3,purRateVal);
        smallBill.add(4,slsRateVal);//  product value to the list 
        smallBill.add(5,amtVal); // product amount to the list
        
        System.out.println(purRateVal+":"+smallBill.get(3));
         totalAmount+=new Float(amtVal); 
        NumberFormat formatter = NumberFormat.getInstance(new Locale("en_US"));
        BigDecimal bd = new BigDecimal(Math.round(totalAmount*100.0)/100.0);
        System.out.println(bd.floatValue());
        totalAmountLabel.setText(formatter.format(bd.floatValue())+" NRS");  
        billData.add(smallBill);                        // add to the big bill 
        ArrayList<String> illusion1=new ArrayList<String>();
        ArrayList<String> illusion2=new ArrayList<String>();
        ArrayList<String> illusion3=new ArrayList<String>();
        int sn=0;
        for( ArrayList<String> smallBil : billData) {
            illusion1.add(++sn+"."+smallBil.get(1));
            illusion2.add(smallBil.get(2));
            illusion3.add(smallBil.get(5));
        }        
        ParticularList.setListData(illusion1.toArray());
        ParticularList.setVisible(false); // printing the list on the bill 
        ParticularList.setVisible(true);
        quantityList.setListData(illusion2.toArray());
        quantityList.setVisible(false);
        quantityList.setVisible(true);
        amountList.setListData(illusion3.toArray());
        amountList.setVisible(false);
        amountList.setVisible(true);
        System.out.println(billData);
}
        
        particularField.setText("");// reset the field after push
        purRate.setText("");
        quantityField.setText("");
        amountField.setText("");
        slsRate.setText("");
         row_wid="";
}
}//GEN-LAST:event_pushButtonActionPerformed

    private void amountFieldAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountFieldAmountKeyTyped
        // TODO add your handling code here:
}//GEN-LAST:event_amountFieldAmountKeyTyped

    private void amountFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountFieldActionPerformed
    if(!amountField.getText().matches("[0-9][0-9]*\\.?[0-9]*")) {
            warningLabel.setText("Invalid Amount !!! ");
            warningLabel.setVisible(false);
            warningLabel.setVisible(true);
        } else {    warningLabel.setText(" ");
        warningLabel.setVisible(false);
        warningLabel.setVisible(true);}     
}//GEN-LAST:event_amountFieldActionPerformed

    private void amountFieldAmountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_amountFieldAmountMouseExited
 if(!amountField.getText().matches("[0-9][0-9]*\\.?[0-9]*")) {
            warningLabel.setText("Invalid Amount !!! ");
            warningLabel.setVisible(false);
            warningLabel.setVisible(true);
        } else {    warningLabel.setText(" ");
        warningLabel.setVisible(false);
        warningLabel.setVisible(true);}        // TODO add your handling code here:
}//GEN-LAST:event_amountFieldAmountMouseExited

    private void purRateRateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_purRateRateKeyTyped
        
}//GEN-LAST:event_purRateRateKeyTyped

    private void purRateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_purRateFocusLost
        if(!purRate.getText().matches("[0-9][0-9]*\\.?[0-9]*")) {
            warningLabel.setText("Invalid Rate !!!!!! ");
            warningLabel.setVisible(false);
            warningLabel.setVisible(true);
        } 
        else {
     float qty=0;
     float rate=0;
     if(!"".equals(quantityField.getText().trim()))
      qty=new Float(quantityField.getText());
      if(!"".equals(purRate.getText().trim()))
      rate=new Float(purRate.getText());
            Float amount=rate*qty;
            amountField.setText(amount.toString());
            warningLabel.setText(" ");
            warningLabel.setVisible(false);
            warningLabel.setVisible(true);// TODO add your handling code here:
            } 
        // TODO add your handling code here:
}//GEN-LAST:event_purRateFocusLost

    private void purRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purRateActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_purRateActionPerformed

    private void purRateRateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purRateRateMouseExited
        if(!purRate.getText().matches("[0-9][0-9]*\\.?[0-9]*")) {
            warningLabel.setText("Invalid Rate !!!!!! ");
            warningLabel.setVisible(false);
            warningLabel.setVisible(true);
        } else {  
     float qty=0;
     float rate=0;
     if(!"".equals(quantityField.getText()))
      qty=new Float(quantityField.getText());
      if(!"".equals(purRate.getText()))
      rate=new Float(purRate.getText());
            Float amount=rate*qty;
            amountField.setText(amount.toString());
            warningLabel.setText(" ");
            warningLabel.setVisible(false);
            warningLabel.setVisible(true);
        warningLabel.setText(" ");
        warningLabel.setVisible(false);
        warningLabel.setVisible(true);}// TODO add your handling code here:
}//GEN-LAST:event_purRateRateMouseExited

    private void quantityFieldQuantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityFieldQuantityKeyTyped
  
}//GEN-LAST:event_quantityFieldQuantityKeyTyped

    private void quantityFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quantityFieldFocusLost
  if(!quantityField.getText().matches("[0-9][0-9]*\\.?[0-9]*")) {
            warningLabel.setText("Invalid Quantity !!! ");
            warningLabel.setVisible(false);
            warningLabel.setVisible(true);
        }            // TODO add your handling code here:
}//GEN-LAST:event_quantityFieldFocusLost

    private void quantityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityFieldActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_quantityFieldActionPerformed

    private void quantityFieldQuantityMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quantityFieldQuantityMouseExited
        
        if(!quantityField.getText().matches("[0-9][0-9]*\\.?[0-9]*"))
        {
            warningLabel.setText("Invalid Quantity");
            warningLabel.setVisible(false);
            warningLabel.setVisible(true);
        } 
        else {
            warningLabel.setText(" ");
            warningLabel.setVisible(false);
            warningLabel.setVisible(true);// TODO add your handling code here:
              }
}//GEN-LAST:event_quantityFieldQuantityMouseExited

    private void particularFieldparticularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_particularFieldparticularKeyTyped
           
}//GEN-LAST:event_particularFieldparticularKeyTyped

    private void particularFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_particularFieldActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_particularFieldActionPerformed

    private void particularFieldParticularMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_particularFieldParticularMouseExited
        
}//GEN-LAST:event_particularFieldParticularMouseExited

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        try {
            PurchaseModel pm=new PurchaseModel();
            InventoryModel im=new InventoryModel();
            String pur_id=pm.lastPurId();
            for(ArrayList<String> list: billData)   
            {
            if("".equals(list.get(0)))// if it is not recorded in PROD_DIM table
            {
            pm.insertProducDim(list.get(1),list.get(3),list.get(4));          
            String prod_wid=pm.lastProId(); 
            im.addInventory((new Integer(prod_wid)-1)+"");// get the prod id
            pm.insertPurFact(prod_wid,list.get(2),list.get(5),pur_id); 
            im.addInventory((new Integer(prod_wid)-1)+"",list.get(2));
            }
            else 
            {
            pm.insertPurFact(list.get(0),list.get(2),list.get(4),pur_id); 
            im.addInventory(list.get(0),list.get(2));// insert in purchase fact with already acquised PROD_WID
            }
            }
            if(disField.getText().matches("[0-9][0-9]*\\.?[0-9]*"))
            totalAmount=totalAmount-new Float(disField.getText());
            else 
                warningLabel.setText("Invalid Discount");
            pm.insertPurTranxDtl(pur_id,dealerNameField.getText(),dealerLocationField.getText(),dateField.getText(),totalAmount.toString());
           //insert in Pur_Tranx_Detail
               // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseForm.class.getName()).log(Level.SEVERE, null, ex);
        }
particularField.setText("");
dealerNameLabel.setText("");
dealerNameField.setText("");
warningLabel.setText("");
purRate.setText("");
ArrayList<String> a=new ArrayList<String>();
a.add(" ");
disField.setText("");
ParticularList.setListData(a.toArray());
amountList.setListData(a.toArray());
quantityList.setListData(a.toArray());
billData =new ArrayList<ArrayList<String>>();
successLabel.setVisible(true);
}//GEN-LAST:event_printButtonActionPerformed

    private void dateFieldKeyTypedForDate(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dateFieldKeyTypedForDate
        // TODO add your handling code here:
}//GEN-LAST:event_dateFieldKeyTypedForDate

    private void dateFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dateFieldFocusLost
        date=dateField.getText();
        dateLabel.setText(date);
        dateLabel.setVisible(false);
        dateLabel.setVisible(true);         // TODO add your handling code here:
}//GEN-LAST:event_dateFieldFocusLost

    private void dateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateFieldActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_dateFieldActionPerformed

    private void dateFieldDateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateFieldDateMouseExited
if(!"".equals(dateField.getText().trim()))
{
        date=dateField.getText();
        dateLabel.setText(date);
}
        
        dateLabel.setVisible(false);
        dateLabel.setVisible(true);        // TODO add your handling code here:
}//GEN-LAST:event_dateFieldDateMouseExited

    private void dealerLocationFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dealerLocationFieldActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_dealerLocationFieldActionPerformed

    private void dealerNameFieldTextValuechanged(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_dealerNameFieldTextValuechanged
        // TODO add your handling code here:
}//GEN-LAST:event_dealerNameFieldTextValuechanged

    private void dealerNameFieldKeyTypedHandeler(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dealerNameFieldKeyTypedHandeler
      
}//GEN-LAST:event_dealerNameFieldKeyTypedHandeler

    private void dealerNameFieldTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_dealerNameFieldTextChanged
        // TODO add your handling code here:
}//GEN-LAST:event_dealerNameFieldTextChanged

    private void dealerNameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dealerNameFieldFocusLost
        customerName=dealerNameField.getText();
        System.out.println(customerName);
        dealerNameLabel.setText(customerName);
        dealerNameLabel.setVisible(false);
        dealerNameLabel.setVisible(true);        // TODO add your handling code here:
}//GEN-LAST:event_dealerNameFieldFocusLost

    private void dealerNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dealerNameFieldActionPerformed
        
        //customerNameLabel.repaint();
        // TODO add your handling code here:
}//GEN-LAST:event_dealerNameFieldActionPerformed

    private void dealerNameFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dealerNameFieldMouseExited
        if(!"".equals(dealerNameField.getText()))
        {
        customerName=dealerNameField.getText();
        }
        dealerNameLabel.setText(customerName);
        dealerNameLabel.setVisible(false);
        dealerNameLabel.setVisible(true);// TODO add your handling code here:
}//GEN-LAST:event_dealerNameFieldMouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
       // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void particularFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_particularFieldKeyPressed
                     // TODO add your handling code here:
    }//GEN-LAST:event_particularFieldKeyPressed

    private void particularFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_particularFieldKeyReleased
try {
             PurchaseModel pm=new PurchaseModel();
             Product1.setVisible(false);
             Product2.setVisible(false);
             Product3.setVisible(false);
              Product4.setVisible(false);
              Product5.setVisible(false);
              Product6.setVisible(false);
              Product7.setVisible(false);  
              Product8.setVisible(false);  
              Product9.setVisible(false);
            if(particularField.getText().trim().length()>0)
            {
            ArrayList<String> productList=pm.getProductName(particularField.getText());
            
              if(productList.size()>=9)
              {
              
              Product1.setText(productList.get(0));
              Product1.setVisible(true);              
              Product2.setText(productList.get(1));
              Product2.setVisible(true);              
              Product3.setText(productList.get(2));
              Product3.setVisible(true);
              Product4.setText(productList.get(3));
              Product4.setVisible(true);
              Product5.setText(productList.get(4));
              Product5.setVisible(true);
              Product6.setText(productList.get(5));
              Product6.setVisible(true);
              Product7.setText(productList.get(6));
              Product7.setVisible(true);
              Product8.setText(productList.get(7));
              Product8.setVisible(true);
              Product9.setText(productList.get(8));
              Product9.setVisible(true);
              
              }
              else if(productList.size()>=8)
              {
              
              Product1.setText(productList.get(0));
              Product1.setVisible(true);              
              Product2.setText(productList.get(1));
              Product2.setVisible(true);              
              Product3.setText(productList.get(2));
              Product3.setVisible(true);
              Product4.setText(productList.get(3));
              Product4.setVisible(true);
              Product5.setText(productList.get(4));
              Product5.setVisible(true);
              Product6.setText(productList.get(5));
              Product6.setVisible(true);
              Product7.setText(productList.get(6));
              Product7.setVisible(true);
              Product8.setText(productList.get(7));
              Product8.setVisible(true);
              }
                      
                      else if(productList.size()>=7)
              {
              
              Product1.setText(productList.get(0));
              Product1.setVisible(true);              
              Product2.setText(productList.get(1));
              Product2.setVisible(true);              
              Product3.setText(productList.get(2));
              Product3.setVisible(true);
              Product4.setText(productList.get(3));
              Product4.setVisible(true);
              Product5.setText(productList.get(4));
              Product5.setVisible(true);
              Product6.setText(productList.get(5));
              Product6.setVisible(true);
              Product7.setText(productList.get(5));
              Product7.setVisible(true);
              Product7.setText(productList.get(6));
              Product7.setVisible(true);
              }
                              else if(productList.size()>=6)
              {
              
              Product1.setText(productList.get(0));
              Product1.setVisible(true);              
              Product2.setText(productList.get(1));
              Product2.setVisible(true);              
              Product3.setText(productList.get(2));
              Product3.setVisible(true);
              Product4.setText(productList.get(3));
              Product4.setVisible(true);
              Product5.setText(productList.get(4));
              Product5.setVisible(true);
              Product6.setText(productList.get(5));
              Product6.setVisible(true);
              }
              
             else if(productList.size()>=5)
              {
              
              Product1.setText(productList.get(0));
              Product1.setVisible(true);              
              Product2.setText(productList.get(1));
              Product2.setVisible(true);              
              Product3.setText(productList.get(2));
              Product3.setVisible(true);
              Product4.setText(productList.get(3));
              Product4.setVisible(true);
              Product5.setText(productList.get(4));
              Product5.setVisible(true);
              
              }
              
               else if(productList.size()>=4)
              {
              
              Product1.setText(productList.get(0));
              Product1.setVisible(true);              
              Product2.setText(productList.get(1));
              Product2.setVisible(true);              
              Product3.setText(productList.get(2));
              Product3.setVisible(true);
              Product4.setText(productList.get(3));
              Product4.setVisible(true);
              }
               else if(productList.size()>=3)
              {
              
              Product1.setText(productList.get(0));
              Product1.setVisible(true);              
              Product2.setText(productList.get(1));
              Product2.setVisible(true);              
              Product3.setText(productList.get(2));
              Product3.setVisible(true);
              }
               else if(productList.size()>=2)
              {
              
              Product1.setText(productList.get(0));
              Product1.setVisible(true);              
              Product2.setText(productList.get(1));
              Product2.setVisible(true);           
              }
               else if(productList.size()>=1)
              {
              
              Product1.setText(productList.get(0));
             if(automaticRadioButton.isSelected())
              {
              String[] arrStr=productList.get(0).split("#");
              particularField.setText(arrStr[0]);
              String[] name=Product1.getText().split("#"); 
              particularField.setText(name[0]);
   //uncomment if you want to automate : recommended for old databases
              ArrayList<String> list=pm.getProductRow(name[0],name[1]); 
              purRate.setText(list.get(2));
              row_wid=list.get(0);        
              }
               Product1.setVisible(true); 
              }
               else {}
              
              }
        
        
        
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseForm.class.getName()).log(Level.SEVERE, null, ex);
        
        
        }
        
                // TODO add your handling code here:
    }//GEN-LAST:event_particularFieldKeyReleased

    private void particularFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_particularFieldFocusLost
            Product1.setVisible(false);
             Product2.setVisible(false);
             Product3.setVisible(false);
              Product4.setVisible(false);
              Product5.setVisible(false);
              Product6.setVisible(false);
               Product7.setVisible(false);  
              Product8.setVisible(false);  
              Product9.setVisible(false); // TODO add your handling code here:
    }//GEN-LAST:event_particularFieldFocusLost

    private void dealerNameFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dealerNameFieldKeyReleased
  customerName=dealerNameField.getText();
        System.out.println(customerName);
        dealerNameLabel.setText(customerName);
        dealerNameLabel.setVisible(false);
        dealerNameLabel.setVisible(true);        
        date=dateField.getText();
        System.out.println(date);
        SimpleDateFormat d = new SimpleDateFormat("yyyy/MM/dd");
        dateField.setText(d.format(new Date()));        // TODO add your handling code here:
    }//GEN-LAST:event_dealerNameFieldKeyReleased

    private void dealerLocationFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dealerLocationFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_dealerLocationFieldKeyTyped

    private void purRateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_purRateKeyReleased
if(!purRate.getText().matches("[0-9]*\\.?[0-9]*")) {
            warningLabel.setText("Invalid  Rate !!!!!! ");
            warningLabel.setVisible(false);
            warningLabel.setVisible(true);
        } else {    warningLabel.setText(" ");
        warningLabel.setVisible(false);
        warningLabel.setVisible(true);};        // TODO add your handling code here:
    }//GEN-LAST:event_purRateKeyReleased

    private void quantityFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityFieldKeyReleased
      if(!quantityField.getText().matches("[0-9]*\\.?[0-9]*")) {
            warningLabel.setText("Invalid  Quantity !!!!!! ");
            warningLabel.setVisible(false);
            warningLabel.setVisible(true);
        } else {
            warningLabel.setText(" ");
            warningLabel.setVisible(false);
            warningLabel.setVisible(true);}        // TODO add your handling code here:
    }//GEN-LAST:event_quantityFieldKeyReleased

    private void automaticRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_automaticRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_automaticRadioButtonActionPerformed

    private void Product1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product1MouseClicked
        try {
            String[] name=Product1.getText().split("#");
            particularField.setText(name[0]);
            PurchaseModel pm=new PurchaseModel();
            ArrayList<String> list=pm.getProductRow(name[0],name[1]);
            purRate.setText(list.get(2));
            row_wid=list.get(0);
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseForm.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_Product1MouseClicked

    private void Product2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product2MouseClicked
        try {
            String[] name=Product2.getText().split("#");
            particularField.setText(name[0]);
            PurchaseModel pm=new PurchaseModel();
            ArrayList<String> list=pm.getProductRow(name[0],name[1]);
            purRate.setText(list.get(2));
            row_wid=list.get(0);
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseForm.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
}//GEN-LAST:event_Product2MouseClicked

    private void Product3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product3MouseClicked
        try {
            String[] name=Product3.getText().split("#");
            particularField.setText(name[0]);
            PurchaseModel pm=new PurchaseModel();
            ArrayList<String> list=pm.getProductRow(name[0],name[1]);
            purRate.setText(list.get(2));
            row_wid=list.get(0);
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseForm.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
}//GEN-LAST:event_Product3MouseClicked

    private void Product4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product4MouseClicked
        try {
            String[] name=Product4.getText().split("#");
            particularField.setText(name[0]);
            PurchaseModel pm=new PurchaseModel();
            ArrayList<String> list=pm.getProductRow(name[0],name[1]);
            purRate.setText(list.get(2));
            row_wid=list.get(0);
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseForm.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
}//GEN-LAST:event_Product4MouseClicked

    private void Product5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product5MouseClicked
        try {
            String[] name=Product5.getText().split("#");
            particularField.setText(name[0]);
            PurchaseModel pm=new PurchaseModel();
            ArrayList<String> list=pm.getProductRow(name[0],name[1]);
            purRate.setText(list.get(2));
            row_wid=list.get(0);
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseForm.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
}//GEN-LAST:event_Product5MouseClicked

    private void Product6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product6MouseClicked
        try {
            String[] name=Product6.getText().split("#");
            particularField.setText(name[0]);
            PurchaseModel pm=new PurchaseModel();
            ArrayList<String> list=pm.getProductRow(name[0],name[1]);
            purRate.setText(list.get(2));
            row_wid=list.get(0);
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseForm.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
}//GEN-LAST:event_Product6MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        particularField.setText(""); 
        dealerNameLabel.setText("");
        dealerNameField.setText("");
        warningLabel.setText("");
        purRate.setText("");
        dealerLocationField.setText("");
        totalAmountLabel.setText(" 0.0 NRS");
        
        ArrayList<String> a=new ArrayList<String>();
        a.add(" ");
        ParticularList.setListData(a.toArray());
        amountList.setListData(a.toArray());
        quantityList.setListData(a.toArray());
        totalAmount=new Float(0);
        billData =new ArrayList<ArrayList<String>>();
        successLabel.setVisible(false);
        disField.setText("");
        // TODO add your handling code here:
}//GEN-LAST:event_jButton1ActionPerformed

    private void Product7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product7MouseClicked
        try {
            String[] name=Product7.getText().split("#");
            particularField.setText(name[0]);
            PurchaseModel pm=new PurchaseModel();
            ArrayList<String> list=pm.getProductRow(name[0],name[1]);
            purRate.setText(list.get(2));
            row_wid=list.get(0);
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseForm.class.getName()).log(Level.SEVERE, null, ex);
        }   // TODO add your handling code here:
    }//GEN-LAST:event_Product7MouseClicked

    private void Product8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product8MouseClicked
      try {
            String[] name=Product8.getText().split("#");
            particularField.setText(name[0]);
            PurchaseModel pm=new PurchaseModel();
            ArrayList<String> list=pm.getProductRow(name[0],name[1]);
            purRate.setText(list.get(2));
            row_wid=list.get(0);
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseForm.class.getName()).log(Level.SEVERE, null, ex);
        }     // TODO add your handling code here:
    }//GEN-LAST:event_Product8MouseClicked

    private void Product9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product9MouseClicked
      try {
            String[] name=Product9.getText().split("#");
            particularField.setText(name[0]);
            PurchaseModel pm=new PurchaseModel();
            ArrayList<String> list=pm.getProductRow(name[0],name[1]);
            purRate.setText(list.get(2));
            row_wid=list.get(0);
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseForm.class.getName()).log(Level.SEVERE, null, ex);
        }     // TODO add your handling code here:
    }//GEN-LAST:event_Product9MouseClicked

    private void dealerLocationFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dealerLocationFieldMouseExited
if(!"".equals(dealerLocationField.getText().trim()))
{
    if(!"".equals(dealerLocationField.getText().trim())) 
    customerLocation=dealerLocationField.getText(); 
}// TODO add your handling code here:
    }//GEN-LAST:event_dealerLocationFieldMouseExited

    private void disButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_disButtonActionPerformed

    private void amountFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountFieldKeyReleased
if(!amountField.getText().matches("[0-9][0-9]*\\.?[0-9]*")) {
            warningLabel.setText("Invalid Amount !!! ");
            warningLabel.setVisible(false);
            warningLabel.setVisible(true);
        } else {    warningLabel.setText(" ");
        warningLabel.setVisible(false);
        warningLabel.setVisible(true);}         // TODO add your handling code here:
    }//GEN-LAST:event_amountFieldKeyReleased

    private void amountFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_amountFieldFocusLost
if(!amountField.getText().matches("[0-9][0-9]*\\.?[0-9]*")) {
            warningLabel.setText("Invalid Amount !!! ");
            warningLabel.setVisible(false);
            warningLabel.setVisible(true);
        } 
         else {    
        warningLabel.setText(" ");
        warningLabel.setVisible(false);
        warningLabel.setVisible(true);}          // TODO add your handling code here:
    }//GEN-LAST:event_amountFieldFocusLost

    private void disFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_disFieldActionPerformed

    private void disButtonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_disButtonStateChanged
if(disButton.isSelected())
{upqLabel.setVisible(true);
 disField.setVisible(true);
 isPack=true;
}
else 
    {upqLabel.setVisible(false);
 disField.setVisible(false);
 isPack=false;
}

// TODO add your handling code here:
    }//GEN-LAST:event_disButtonStateChanged

    private void disFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_disFieldFocusLost
 if(disField.getText().matches("[0-9][0-9]*\\.?[0-9]*"))
totalAmountLabel.setText((totalAmount-new Float(disField.getText()))+" NRS");
 else warningLabel.setText("Invalid Discount");
totalAmountLabel.setVisible(false);
totalAmountLabel.setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_disFieldFocusLost

    private void disFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disFieldMouseExited
if(disField.getText().matches("[0-9][0-9]*\\.?[0-9]*"))
totalAmountLabel.setText((totalAmount-new Float(disField.getText()))+" NRS");
else warningLabel.setText("Invalid Discount");
totalAmountLabel.setVisible(false);
totalAmountLabel.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_disFieldMouseExited

    private void slsRateRateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slsRateRateMouseExited
  if(!slsRate.getText().matches("[0-9][0-9]*\\.?[0-9]*")) {
            warningLabel.setText("Invalid Sales Rate !!!!!! ");
            warningLabel.setVisible(false);
            warningLabel.setVisible(true);
        }         // TODO add your handling code here:
    }//GEN-LAST:event_slsRateRateMouseExited

    private void slsRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slsRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_slsRateActionPerformed

    private void slsRateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_slsRateFocusLost
       if(!slsRate.getText().matches("[0-9][0-9]*\\.?[0-9]*")) {
            warningLabel.setText("Invalid Sales Rate !!!!!! ");
            warningLabel.setVisible(false);
            warningLabel.setVisible(true);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_slsRateFocusLost

    private void slsRateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_slsRateKeyReleased
if(!slsRate.getText().matches("[0-9]*\\.?[0-9]*")) {
            warningLabel.setText("Invalid Sales Rate !!!!!! ");
            warningLabel.setVisible(false);
            warningLabel.setVisible(true);
        } 
else {  warningLabel.setText(" ");
        warningLabel.setVisible(false);
        warningLabel.setVisible(true);};         // TODO add your handling code here:
    }//GEN-LAST:event_slsRateKeyReleased

    private void slsRateRateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_slsRateRateKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_slsRateRateKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList ParticularList;
    private javax.swing.JLabel Product1;
    private javax.swing.JLabel Product2;
    private javax.swing.JLabel Product3;
    private javax.swing.JLabel Product4;
    private javax.swing.JLabel Product5;
    private javax.swing.JLabel Product6;
    private javax.swing.JLabel Product7;
    private javax.swing.JLabel Product8;
    private javax.swing.JLabel Product9;
    private javax.swing.JPanel PurchaseFrame;
    private javax.swing.JTextField amountField;
    private javax.swing.JList amountList;
    private javax.swing.JRadioButton automaticRadioButton;
    private javax.swing.JTextField dateField;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTextField dealerLocationField;
    private javax.swing.JTextField dealerNameField;
    private javax.swing.JLabel dealerNameLabel;
    private javax.swing.JRadioButton disButton;
    private javax.swing.JTextField disField;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField particularField;
    private javax.swing.JButton printButton;
    private javax.swing.JTextField purRate;
    private javax.swing.JButton pushButton;
    private javax.swing.JTextField quantityField;
    private javax.swing.JList quantityList;
    private javax.swing.JTextField slsRate;
    private javax.swing.JLabel successLabel;
    private javax.swing.JLabel totalAmountLabel;
    private javax.swing.JLabel upqLabel;
    private javax.swing.JLabel warningLabel;
    // End of variables declaration//GEN-END:variables
    
private String customerName="UK";
private String date="4444-44-44";
private String customerLocation="UK";
private ArrayList<ArrayList<String>> billData =new ArrayList<ArrayList<String>>();
Float totalAmount=new Float(0);
String row_wid="";
String factTableName;
boolean isPack=false;
}
