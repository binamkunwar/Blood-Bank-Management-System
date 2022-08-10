/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bbms;

/**
 *
 * @author Acer
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class Adddonar extends javax.swing.JFrame {

    /**
     * Creates new form Adddonar
     */
    public Adddonar() {
        initComponents();
       try{
     
            Connection con=dbConnection.getCon();
             Statement stmt=con.createStatement();
             
       
        ResultSet rs= stmt.executeQuery("select count(id) from adddonar");
        if(rs.next())
        {
            int id=rs.getInt(1);
            id= id+1;
            String str= String.valueOf(id);
            idText.setText(str);
            
        }
        else
            idText.setText("1");
        
        } 
        catch(Exception e)
        {
         JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Heading = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        idL = new javax.swing.JLabel();
        idText = new javax.swing.JLabel();
        FullName = new javax.swing.JLabel();
        FatherName = new javax.swing.JLabel();
        MotherName = new javax.swing.JLabel();
        Age = new javax.swing.JLabel();
        MobileNumber = new javax.swing.JLabel();
        Gender = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        Province = new javax.swing.JLabel();
        BloodGroup = new javax.swing.JLabel();
        CompleteAddress = new javax.swing.JLabel();
        FText = new javax.swing.JTextField();
        FaText = new javax.swing.JTextField();
        MoText = new javax.swing.JTextField();
        AgeText = new javax.swing.JTextField();
        MpText = new javax.swing.JTextField();
        EText = new javax.swing.JTextField();
        BText = new javax.swing.JComboBox<>();
        PText = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        CoText = new javax.swing.JTextArea();
        MBtn = new javax.swing.JRadioButton();
        FBtn = new javax.swing.JRadioButton();
        OBtn = new javax.swing.JRadioButton();
        jSeparator2 = new javax.swing.JSeparator();
        SaveBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        ExitBtn = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setLocation(new java.awt.Point(370, 200));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Heading.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
        Heading.setText("Add New Donar");
        getContentPane().add(Heading, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 6, 454, -1));

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 76, 788, -1));

        idL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        idL.setText("Donar Id");
        getContentPane().add(idL, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 104, 60, -1));

        idText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(idText, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 78, 33));

        FullName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        FullName.setText("FullName");
        getContentPane().add(FullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 153, 82, -1));

        FatherName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        FatherName.setText("FatherName");
        getContentPane().add(FatherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 203, -1, -1));

        MotherName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MotherName.setText("MotherName");
        getContentPane().add(MotherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 247, 98, -1));

        Age.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Age.setText("Age");
        getContentPane().add(Age, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 304, 37, -1));

        MobileNumber.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MobileNumber.setText("MobileNumber");
        getContentPane().add(MobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 357, 115, -1));

        Gender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Gender.setText("Gender");
        getContentPane().add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 406, 75, -1));

        Email.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Email.setText("Email");
        getContentPane().add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 136, -1, -1));

        Province.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Province.setText("Province");
        getContentPane().add(Province, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 221, 78, -1));

        BloodGroup.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BloodGroup.setText("BloodGroup");
        getContentPane().add(BloodGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 177, 93, -1));

        CompleteAddress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CompleteAddress.setText("Complete Address");
        getContentPane().add(CompleteAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 275, 133, -1));

        FText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(FText, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 150, 139, -1));

        FaText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(FaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 200, 139, -1));

        MoText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(MoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 244, 139, -1));

        AgeText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(AgeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 301, 139, -1));

        MpText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(MpText, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 354, 139, -1));

        EText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(EText, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 130, 143, -1));

        BText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BText.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        getContentPane().add(BText, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 174, 143, -1));

        PText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PText.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bagmati", "Gandaki", "Lumbini", "Karnali", "Sudurpashchim", "Madhesh", "Province 1", " " }));
        PText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PTextActionPerformed(evt);
            }
        });
        getContentPane().add(PText, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 218, -1, -1));

        CoText.setColumns(20);
        CoText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CoText.setRows(5);
        jScrollPane1.setViewportView(CoText);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 301, -1, -1));

        buttonGroup1.add(MBtn);
        MBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MBtn.setText("Male");
        getContentPane().add(MBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 416, 98, -1));

        buttonGroup1.add(FBtn);
        FBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        FBtn.setText("Female");
        getContentPane().add(FBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 416, 98, -1));

        buttonGroup1.add(OBtn);
        OBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        OBtn.setText("Others");
        getContentPane().add(OBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 416, 98, -1));

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 458, 788, -1));

        SaveBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SaveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/save.png"))); // NOI18N
        SaveBtn.setText("Save");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });
        getContentPane().add(SaveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 506, -1, -1));

        ResetBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ResetBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/reset.png"))); // NOI18N
        ResetBtn.setText("Reset");
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ResetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 506, -1, -1));

        ExitBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ExitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/cancel.png"))); // NOI18N
        ExitBtn.setText("Exit");
        ExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ExitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(713, 6, -1, -1));

        Background.setBackground(new java.awt.Color(255, 51, 153));
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/bg.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown

    private void PTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PTextActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        // TODO add your handling code here:
        String fullName=FText.getText();
        String fatherName=FaText.getText();
        String motherName=MoText.getText();
        String age=AgeText.getText();

        String number=MpText.getText();
        String Gender = null ;
        if(MBtn.isSelected()){
            Gender="male";
        }
        else if(FBtn.isSelected()){
            Gender="female";
        }
        else if(OBtn.isSelected()){
            Gender="other";
        }
        String email=EText.getText();
        String bloodgrp=(String)BText.getSelectedItem();
        String province=(String)PText.getSelectedItem();
        String coAddr=CoText.getText();
        
        try{

            Connection con=dbConnection.getCon();
             Statement stmt=con.createStatement();
           
            JOptionPane.showMessageDialog(null, "Connected");

         stmt.executeUpdate("insert into bloodbankmanagement.adddonar(FullName,FatherName,MotherName,Age,Mobile,Gender,Email,BloodGroup,Province,Address) values('"+fullName+"','"+fatherName+"','"+motherName+"','"+age+"','"+number+"','"+Gender+"','"+email+"','"+bloodgrp+"','"+province+"','"+coAddr+"')");
                 JOptionPane.showMessageDialog(null, "added sucessfully");
        }
        catch(Exception ex){
           System.out.println(ex);
                        JOptionPane.showMessageDialog(null, "Error adding donar");
                }
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void ExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_ExitBtnActionPerformed

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
//         TODO add your handling code here:
//        DefaultTableModel model1 = (DefaultTableModel)table.getModel();
//            model1.setRowCount(0);
//            Adddonar();
    }//GEN-LAST:event_ResetBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Adddonar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adddonar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adddonar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adddonar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adddonar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Age;
    private javax.swing.JTextField AgeText;
    private javax.swing.JComboBox<String> BText;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel BloodGroup;
    private javax.swing.JTextArea CoText;
    private javax.swing.JLabel CompleteAddress;
    private javax.swing.JTextField EText;
    private javax.swing.JLabel Email;
    private javax.swing.JButton ExitBtn;
    private javax.swing.JRadioButton FBtn;
    private javax.swing.JTextField FText;
    private javax.swing.JTextField FaText;
    private javax.swing.JLabel FatherName;
    private javax.swing.JLabel FullName;
    private javax.swing.JLabel Gender;
    private javax.swing.JLabel Heading;
    private javax.swing.JRadioButton MBtn;
    private javax.swing.JTextField MoText;
    private javax.swing.JLabel MobileNumber;
    private javax.swing.JLabel MotherName;
    private javax.swing.JTextField MpText;
    private javax.swing.JRadioButton OBtn;
    private javax.swing.JComboBox<String> PText;
    private javax.swing.JLabel Province;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JButton SaveBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel idL;
    private javax.swing.JLabel idText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
