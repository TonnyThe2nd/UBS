/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.PacienteDAO;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import model.DadoPaciente;

public class CadastroPaciente extends javax.swing.JFrame {

    private static final String EMAIL_REGEX = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    private static final Pattern pattern = Pattern.compile(EMAIL_REGEX);

    public static boolean validarEmail(String email) {
        return email != null && pattern.matcher(email).matches();
    }

    public CadastroPaciente() {
        setTitle("Cadastro de Paciente");
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        logradouroTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nomeTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cidadeTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        nroTF = new javax.swing.JTextField();
        cartaoTF5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        emailTF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        cadastrarBT = new javax.swing.JLabel();
        telefoneTF = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CADASTRO DE PACIENTES");
        setMaximumSize(new java.awt.Dimension(822, 600));
        setPreferredSize(new java.awt.Dimension(828, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(57, 49, 133));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CADASTRO DE PACIENTES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 822, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("CARTÃO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 122, 80, -1));

        logradouroTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(logradouroTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 300, 33));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("NOME");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 122, 80, -1));

        nomeTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(nomeTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 153, 460, 33));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("LOGRADOURO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 133, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("CIDADE");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 133, -1));

        cidadeTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(cidadeTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 360, 33));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("NRO");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 133, -1));

        nroTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(nroTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 85, 33));

        cartaoTF5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(cartaoTF5, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 153, 300, 33));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("DATA DE NASCIMENTO");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 200, -1));

        emailTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(emailTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 300, 33));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("E-MAIL");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 80, -1));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, 210, 33));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("TELEFONE");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 90, -1));

        cadastrarBT.setBackground(new java.awt.Color(57, 49, 133));
        cadastrarBT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cadastrarBT.setForeground(new java.awt.Color(255, 255, 255));
        cadastrarBT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cadastrarBT.setText("CADASTRAR");
        cadastrarBT.setOpaque(true);
        cadastrarBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrarBTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cadastrarBTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cadastrarBTMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cadastrarBTMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cadastrarBTMouseReleased(evt);
            }
        });
        getContentPane().add(cadastrarBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 160, 40));

        try {
            telefoneTF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####- ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefoneTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        telefoneTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneTFActionPerformed(evt);
            }
        });
        getContentPane().add(telefoneTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 240, 33));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarBTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarBTMouseEntered
        cadastrarBT.setBackground(new Color(163, 185, 250));
    }//GEN-LAST:event_cadastrarBTMouseEntered

    private void cadastrarBTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarBTMousePressed
        cadastrarBT.setBackground(new Color(163, 110, 255));
    }//GEN-LAST:event_cadastrarBTMousePressed

    private void cadastrarBTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarBTMouseExited
        cadastrarBT.setBackground(new Color(57, 49, 133));
    }//GEN-LAST:event_cadastrarBTMouseExited

    private void cadastrarBTMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarBTMouseReleased
        cadastrarBT.setBackground(new Color(163, 185, 250));
    }//GEN-LAST:event_cadastrarBTMouseReleased

    private void telefoneTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneTFActionPerformed

    }//GEN-LAST:event_telefoneTFActionPerformed

    private void cadastrarBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarBTMouseClicked
        DadoPaciente dp;
        try {
            if (cartaoTF5.getText() == null || cartaoTF5.getText().trim().isEmpty()
                    || nomeTF.getText() == null || nomeTF.getText().trim().isEmpty()
                    || logradouroTF.getText() == null || logradouroTF.getText().trim().isEmpty()
                    || cidadeTF.getText() == null || cidadeTF.getText().trim().isEmpty()
                    || nroTF.getText() == null || nroTF.getText().trim().isEmpty()
                    || emailTF.getText() == null || emailTF.getText().trim().isEmpty()
                    || telefoneTF.getText() == null || telefoneTF.getText().trim().isEmpty()
                    || jDateChooser1.getDate() == null) {
                JOptionPane.showMessageDialog(null, "Dados insuficientes!", "Erro", 0);
            } else {
                if (validarEmail(emailTF.getText())) {
                    dp = new DadoPaciente(Integer.valueOf(cartaoTF5.getText()), nomeTF.getText(), logradouroTF.getText(), cidadeTF.getText(),
                            Integer.valueOf(nroTF.getText()), emailTF.getText(), telefoneTF.getText().replaceAll("[^0-9]", ""), formatarData(jDateChooser1.getDate()));
                    PacienteDAO pd = new PacienteDAO();
                    pd.novoPaciente(dp);
                    limparCampos();
                } else {
                    JOptionPane.showMessageDialog(null, "E-mail inválido!", "Erro", 0);
                }
            }

        } catch (ParseException ex) {
            Logger.getLogger(CadastroPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cadastrarBTMouseClicked
    private void limparCampos() {
        cartaoTF5.setText("");          
        nomeTF.setText("");             
        logradouroTF.setText("");     
        cidadeTF.setText("");           
        nroTF.setText("");              
        emailTF.setText("");           
        telefoneTF.setText("");         
        jDateChooser1.setDate(null);           
    }

    private String formatarData(Date data) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(data);

    }

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
            java.util.logging.Logger.getLogger(CadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cadastrarBT;
    private javax.swing.JTextField cartaoTF5;
    private javax.swing.JTextField cidadeTF;
    private javax.swing.JTextField emailTF;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField logradouroTF;
    private javax.swing.JTextField nomeTF;
    private javax.swing.JTextField nroTF;
    private javax.swing.JFormattedTextField telefoneTF;
    // End of variables declaration//GEN-END:variables
}
