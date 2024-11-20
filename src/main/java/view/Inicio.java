/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        getContentPane().setBackground(new Color(240,240,240));
        setTitle("Página inicial");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        acessoBT = new javax.swing.JLabel();
        loginBTTN = new javax.swing.JLabel();
        susDigitalBT = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        acessoBT.setBackground(new java.awt.Color(51, 102, 255));
        acessoBT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        acessoBT.setForeground(new java.awt.Color(255, 255, 255));
        acessoBT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acessoBT.setText("ACESSE O SITE");
        acessoBT.setOpaque(true);
        acessoBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acessoBTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                acessoBTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                acessoBTMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                acessoBTMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                acessoBTMouseReleased(evt);
            }
        });
        jPanel1.add(acessoBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 250, 50));

        loginBTTN.setBackground(new java.awt.Color(51, 102, 255));
        loginBTTN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        loginBTTN.setForeground(new java.awt.Color(255, 255, 255));
        loginBTTN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginBTTN.setText("ENTRAR");
        loginBTTN.setOpaque(true);
        loginBTTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBTTNMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginBTTNMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginBTTNMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginBTTNMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                loginBTTNMouseReleased(evt);
            }
        });
        jPanel1.add(loginBTTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 250, 50));

        susDigitalBT.setBackground(new java.awt.Color(51, 102, 255));
        susDigitalBT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        susDigitalBT.setForeground(new java.awt.Color(255, 255, 255));
        susDigitalBT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        susDigitalBT.setText("SUS DIGITAL");
        susDigitalBT.setOpaque(true);
        susDigitalBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                susDigitalBTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                susDigitalBTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                susDigitalBTMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                susDigitalBTMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                susDigitalBTMouseReleased(evt);
            }
        });
        jPanel1.add(susDigitalBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 250, 50));

        jPanel2.setBackground(new java.awt.Color(57, 49, 133));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 570));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 247, 560));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\isaor\\OneDrive\\Documentos\\NetBeansProjects\\UBS\\src\\main\\java\\imagens\\sus-sistema-unico-de-saude.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 600, 290));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginBTTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBTTNMouseClicked
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_loginBTTNMouseClicked

    private void loginBTTNMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBTTNMouseEntered
        loginBTTN.setBackground(new Color(163,185,250));
    }//GEN-LAST:event_loginBTTNMouseEntered

    private void loginBTTNMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBTTNMouseExited
        loginBTTN.setBackground(new Color(51,102,255));
    }//GEN-LAST:event_loginBTTNMouseExited

    private void loginBTTNMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBTTNMousePressed
        loginBTTN.setBackground(new Color(163,110,255));
    }//GEN-LAST:event_loginBTTNMousePressed

    private void loginBTTNMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBTTNMouseReleased
        loginBTTN.setBackground(new Color(163,185,250));
    }//GEN-LAST:event_loginBTTNMouseReleased

    private void acessoBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acessoBTMouseClicked
        try {
            String site = "https://www.gov.br/saude/pt-br/sus";
            if(Desktop.isDesktopSupported()){
                Desktop.getDesktop().browse(new URI(site));
            }
        } catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_acessoBTMouseClicked

    private void acessoBTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acessoBTMouseEntered
        acessoBT.setBackground(new Color(163,185,250));
    }//GEN-LAST:event_acessoBTMouseEntered

    private void acessoBTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acessoBTMouseExited
        acessoBT.setBackground(new Color(51,102,255));
    }//GEN-LAST:event_acessoBTMouseExited

    private void acessoBTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acessoBTMousePressed
        acessoBT.setBackground(new Color(163,110,255));
    }//GEN-LAST:event_acessoBTMousePressed

    private void acessoBTMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acessoBTMouseReleased
        acessoBT.setBackground(new Color(163,185,250));
    }//GEN-LAST:event_acessoBTMouseReleased

    private void susDigitalBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_susDigitalBTMouseClicked
        try {
            String siteSusDigital = "https://meususdigital.saude.gov.br/";
            if(Desktop.isDesktopSupported()){
                Desktop.getDesktop().browse(new URI(siteSusDigital));
            }
        } catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_susDigitalBTMouseClicked

    private void susDigitalBTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_susDigitalBTMouseEntered
        susDigitalBT.setBackground(new Color(163,185,250));
    }//GEN-LAST:event_susDigitalBTMouseEntered

    private void susDigitalBTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_susDigitalBTMouseExited
        susDigitalBT.setBackground(new Color(51,102,255));
    }//GEN-LAST:event_susDigitalBTMouseExited

    private void susDigitalBTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_susDigitalBTMousePressed
        susDigitalBT.setBackground(new Color(163,110,255));
    }//GEN-LAST:event_susDigitalBTMousePressed

    private void susDigitalBTMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_susDigitalBTMouseReleased
        susDigitalBT.setBackground(new Color(163,185,250));
    }//GEN-LAST:event_susDigitalBTMouseReleased

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acessoBT;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel loginBTTN;
    private javax.swing.JLabel susDigitalBT;
    // End of variables declaration//GEN-END:variables
}
