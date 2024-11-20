package view;

import dao.FuncionarioDAO;
import java.awt.Color;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Login extends javax.swing.JFrame {

    public Login() {
        setTitle("Login");
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        emailTF = new javax.swing.JTextField();
        entrarBT = new javax.swing.JLabel();
        cancelarBT = new javax.swing.JLabel();
        senhaTF = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(57, 49, 133));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(237, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("E-MAIL:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("SENHA:");

        emailTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        entrarBT.setBackground(new java.awt.Color(57, 49, 133));
        entrarBT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        entrarBT.setForeground(new java.awt.Color(255, 255, 255));
        entrarBT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        entrarBT.setText("ENTRAR");
        entrarBT.setOpaque(true);
        entrarBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrarBTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                entrarBTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                entrarBTMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                entrarBTMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                entrarBTMouseReleased(evt);
            }
        });

        cancelarBT.setBackground(new java.awt.Color(57, 49, 133));
        cancelarBT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cancelarBT.setForeground(new java.awt.Color(255, 255, 255));
        cancelarBT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelarBT.setText("CANCELAR");
        cancelarBT.setOpaque(true);
        cancelarBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarBTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelarBTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelarBTMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cancelarBTMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cancelarBTMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 238, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(entrarBT, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(cancelarBT, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailTF)
                    .addComponent(senhaTF))
                .addGap(215, 215, 215))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entrarBT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarBT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 428, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void entrarBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarBTMouseClicked
        FuncionarioDAO fd = new FuncionarioDAO();
        fd.loginFuncionario(emailTF.getText(),criptografarSenha(String.valueOf(senhaTF.getPassword())));
        if(fd.login){
            dispose();
        }
    }//GEN-LAST:event_entrarBTMouseClicked
    private String criptografarSenha(String senha) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] senhaByte = md.digest(senha.getBytes());
            StringBuilder bd = new StringBuilder();
            for (byte b : senhaByte) {
                bd.append(String.format("%02x", b));
            }
            return bd.toString();
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(CadastroFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    private void entrarBTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarBTMouseEntered
        entrarBT.setBackground(new Color(163, 185, 250));
    }//GEN-LAST:event_entrarBTMouseEntered

    private void entrarBTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarBTMouseExited
        entrarBT.setBackground(new Color(57, 49, 133));
    }//GEN-LAST:event_entrarBTMouseExited

    private void entrarBTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarBTMousePressed
        entrarBT.setBackground(new Color(163, 110, 255));
    }//GEN-LAST:event_entrarBTMousePressed

    private void entrarBTMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarBTMouseReleased
        entrarBT.setBackground(new Color(163, 185, 250));
    }//GEN-LAST:event_entrarBTMouseReleased

    private void cancelarBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarBTMouseClicked
        new Inicio().setVisible(true);
        dispose();
    }//GEN-LAST:event_cancelarBTMouseClicked

    private void cancelarBTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarBTMouseEntered
        cancelarBT.setBackground(new Color(163, 185, 250));
    }//GEN-LAST:event_cancelarBTMouseEntered

    private void cancelarBTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarBTMouseExited
        cancelarBT.setBackground(new Color(57, 49, 133));
    }//GEN-LAST:event_cancelarBTMouseExited

    private void cancelarBTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarBTMousePressed
        cancelarBT.setBackground(new Color(163, 110, 255));
    }//GEN-LAST:event_cancelarBTMousePressed

    private void cancelarBTMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarBTMouseReleased
        cancelarBT.setBackground(new Color(163, 185, 250));
    }//GEN-LAST:event_cancelarBTMouseReleased

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cancelarBT;
    private javax.swing.JTextField emailTF;
    private javax.swing.JLabel entrarBT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField senhaTF;
    // End of variables declaration//GEN-END:variables
}
