/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bbms;

import com.mysql.cj.x.protobuf.MysqlxCrud.Update;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



/**
 *
 * @author Acer
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public HomePage() {
        initComponents();
             
    }

    public static void changePanel(JPanel objPanel){
         
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ExitBtn = new javax.swing.JButton();
        AllDonar = new javax.swing.JButton();
        stock = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        addDonar = new javax.swing.JButton();
        LOGOUT = new javax.swing.JButton();
        BACKGROUND = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1130));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
        jLabel2.setText("BLOOD BANK MANAGEMENT SYSTEM");

        ExitBtn.setBackground(new java.awt.Color(255, 204, 204));
        ExitBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ExitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/close.png"))); // NOI18N
        ExitBtn.setText("Exit");
        ExitBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ExitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(492, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 874, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(264, 264, 264))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ExitBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1630, -1));

        AllDonar.setBackground(new java.awt.Color(255, 153, 153));
        AllDonar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AllDonar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/AllDonar.png"))); // NOI18N
        AllDonar.setText("ALL DONAR");
        AllDonar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        AllDonar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AllDonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllDonarActionPerformed(evt);
            }
        });
        getContentPane().add(AllDonar, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 214, 150, -1));

        stock.setBackground(new java.awt.Color(255, 153, 153));
        stock.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        stock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Stock.png"))); // NOI18N
        stock.setText("STOCK");
        stock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        stock.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockActionPerformed(evt);
            }
        });
        getContentPane().add(stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 271, 150, -1));

        jButton1.setBackground(new java.awt.Color(255, 153, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Request.png"))); // NOI18N
        jButton1.setText("REQUEST");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, 150, -1));

        Delete.setBackground(new java.awt.Color(255, 153, 153));
        Delete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/delete.png"))); // NOI18N
        Delete.setText("DELETE DONAR");
        Delete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        getContentPane().add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 160, -1));

        Update.setBackground(new java.awt.Color(255, 153, 153));
        Update.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/updated.png"))); // NOI18N
        Update.setText("UPDATE");
        Update.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        getContentPane().add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 394, 150, -1));

        addDonar.setBackground(new java.awt.Color(255, 153, 153));
        addDonar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addDonar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/add.png"))); // NOI18N
        addDonar.setText("ADD DONAR");
        addDonar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        addDonar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addDonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDonarActionPerformed(evt);
            }
        });
        getContentPane().add(addDonar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 150, -1));

        LOGOUT.setBackground(new java.awt.Color(255, 153, 153));
        LOGOUT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LOGOUT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/logout.png"))); // NOI18N
        LOGOUT.setText("LOGOUT");
        LOGOUT.setBorder(new javax.swing.border.MatteBorder(null));
        LOGOUT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LOGOUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGOUTActionPerformed(evt);
            }
        });
        getContentPane().add(LOGOUT, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 160, 100, 40));

        BACKGROUND.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Background.png"))); // NOI18N
        getContentPane().add(BACKGROUND, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -40, 2020, 1170));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addDonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDonarActionPerformed
        new Adddonar().setVisible(true);
        
    }//GEN-LAST:event_addDonarActionPerformed

    private void AllDonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllDonarActionPerformed
new AllDonarDetails().setVisible(true);
    }//GEN-LAST:event_AllDonarActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_DeleteActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        new UpdateDetails().setVisible(true);
        
    }//GEN-LAST:event_UpdateActionPerformed

    private void LOGOUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGOUTActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null,"Are you sure you want to LOGOUT","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            this.setVisible(false);
            new LoginPage().setVisible(true);
        }
    }//GEN-LAST:event_LOGOUTActionPerformed

    private void stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockActionPerformed
        // TODO add your handling code here:
       new Stock().setVisible(true);
    }//GEN-LAST:event_stockActionPerformed

    private void ExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBtnActionPerformed
        int a=JOptionPane.showConfirmDialog(null, "Do You really want to Close Application","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            System.exit(0);
        } 
    }//GEN-LAST:event_ExitBtnActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AllDonar;
    private javax.swing.JLabel BACKGROUND;
    private javax.swing.JButton Delete;
    private javax.swing.JButton ExitBtn;
    private javax.swing.JButton LOGOUT;
    private javax.swing.JButton Update;
    private javax.swing.JButton addDonar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton stock;
    // End of variables declaration//GEN-END:variables
}
