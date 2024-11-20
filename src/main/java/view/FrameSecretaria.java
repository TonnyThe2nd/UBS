package view;

import java.awt.Color;


public class FrameSecretaria extends javax.swing.JFrame {

    private static String nomeFuncionario;
    public FrameSecretaria(String nome) {
        this.nomeFuncionario = nome;
        initComponents();
        bemVindoLB.setText("Bem vindo, "+this.nomeFuncionario+"!");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        agendarConsultaBT = new javax.swing.JLabel();
        agendamentosBT = new javax.swing.JLabel();
        cadastroPacienteBT = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pesquisarFuncionarioBT = new javax.swing.JLabel();
        cadastrarFuncionarioBT = new javax.swing.JLabel();
        gerenciarAgendamentoBT = new javax.swing.JLabel();
        pesquisarPacienteBT = new javax.swing.JLabel();
        bemVindoLB = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Início");
        setMinimumSize(new java.awt.Dimension(860, 526));
        setPreferredSize(new java.awt.Dimension(860, 526));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(57, 49, 133));

        agendarConsultaBT.setBackground(new java.awt.Color(255, 255, 255));
        agendarConsultaBT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        agendarConsultaBT.setText("AGENDAMENTO DE CONSULTA");
        agendarConsultaBT.setOpaque(true);
        agendarConsultaBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agendarConsultaBTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                agendarConsultaBTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                agendarConsultaBTMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                agendarConsultaBTMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                agendarConsultaBTMouseReleased(evt);
            }
        });

        agendamentosBT.setBackground(new java.awt.Color(255, 255, 255));
        agendamentosBT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        agendamentosBT.setText("TELA DE AGENDAMENTOS");
        agendamentosBT.setOpaque(true);
        agendamentosBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agendamentosBTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                agendamentosBTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                agendamentosBTMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                agendamentosBTMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                agendamentosBTMouseReleased(evt);
            }
        });

        cadastroPacienteBT.setBackground(new java.awt.Color(255, 255, 255));
        cadastroPacienteBT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cadastroPacienteBT.setText("CADASTRO DE PACIENTES");
        cadastroPacienteBT.setOpaque(true);
        cadastroPacienteBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastroPacienteBTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cadastroPacienteBTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cadastroPacienteBTMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cadastroPacienteBTMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cadastroPacienteBTMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(agendamentosBT, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(cadastroPacienteBT, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(agendarConsultaBT, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agendarConsultaBT, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agendamentosBT, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastroPacienteBT, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 120));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new java.awt.GridLayout(1, 5, 1, 10));

        pesquisarFuncionarioBT.setBackground(new java.awt.Color(255, 255, 255));
        pesquisarFuncionarioBT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pesquisarFuncionarioBT.setText("PESQUISAR FUNCIONÁRIOS");
        pesquisarFuncionarioBT.setOpaque(true);
        pesquisarFuncionarioBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pesquisarFuncionarioBTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pesquisarFuncionarioBTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pesquisarFuncionarioBTMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pesquisarFuncionarioBTMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pesquisarFuncionarioBTMouseReleased(evt);
            }
        });
        jPanel2.add(pesquisarFuncionarioBT);

        cadastrarFuncionarioBT.setBackground(new java.awt.Color(255, 255, 255));
        cadastrarFuncionarioBT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cadastrarFuncionarioBT.setText("CADASTRAR FUCIONÁRIOS");
        cadastrarFuncionarioBT.setOpaque(true);
        cadastrarFuncionarioBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrarFuncionarioBTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cadastrarFuncionarioBTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cadastrarFuncionarioBTMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cadastrarFuncionarioBTMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cadastrarFuncionarioBTMouseReleased(evt);
            }
        });
        jPanel2.add(cadastrarFuncionarioBT);

        gerenciarAgendamentoBT.setBackground(new java.awt.Color(255, 255, 255));
        gerenciarAgendamentoBT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gerenciarAgendamentoBT.setText("GERENCIAR AGENDAMENTOS");
        gerenciarAgendamentoBT.setOpaque(true);
        gerenciarAgendamentoBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gerenciarAgendamentoBTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gerenciarAgendamentoBTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gerenciarAgendamentoBTMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                gerenciarAgendamentoBTMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                gerenciarAgendamentoBTMouseReleased(evt);
            }
        });
        jPanel2.add(gerenciarAgendamentoBT);

        pesquisarPacienteBT.setBackground(new java.awt.Color(255, 255, 255));
        pesquisarPacienteBT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pesquisarPacienteBT.setText("PESQUISAR PACIENTES");
        pesquisarPacienteBT.setOpaque(true);
        pesquisarPacienteBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pesquisarPacienteBTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pesquisarPacienteBTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pesquisarPacienteBTMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pesquisarPacienteBTMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pesquisarPacienteBTMouseReleased(evt);
            }
        });
        jPanel2.add(pesquisarPacienteBT);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 850, 30));

        bemVindoLB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bemVindoLB.setText("Bem vindo, usuário!");
        getContentPane().add(bemVindoLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        jPanel3.setLayout(new java.awt.GridLayout(7, 0));

        jLabel2.setText("* Acesse a tela de agendamentos para verificar os pacientes que serão atendidos.");
        jPanel3.add(jLabel2);

        jLabel3.setText("* Cadastre novos pacientes.");
        jPanel3.add(jLabel3);

        jLabel4.setText("* Agende consulta para os pacientes que já possuem cadastro.");
        jPanel3.add(jLabel4);

        jLabel5.setText("* Pesquise por funcionários do hospital.");
        jPanel3.add(jLabel5);

        jLabel6.setText("* Cadastre novos funcionários.");
        jPanel3.add(jLabel6);

        jLabel8.setText("* Pesquise por pacientes cadastrados.");
        jPanel3.add(jLabel8);

        jLabel7.setText("* Gerencie os agendamentos existentes.");
        jPanel3.add(jLabel7);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 460, 220));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void agendamentosBTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agendamentosBTMouseEntered
        agendamentosBT.setBackground(new Color(230,230,230));
    }//GEN-LAST:event_agendamentosBTMouseEntered

    private void agendamentosBTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agendamentosBTMouseExited
        agendamentosBT.setBackground(Color.WHITE);
    }//GEN-LAST:event_agendamentosBTMouseExited

    private void agendamentosBTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agendamentosBTMousePressed
        agendamentosBT.setBackground(new Color(210,210,210));
    }//GEN-LAST:event_agendamentosBTMousePressed

    private void agendamentosBTMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agendamentosBTMouseReleased
        agendamentosBT.setBackground(new Color(230,230,230));
    }//GEN-LAST:event_agendamentosBTMouseReleased

    private void cadastroPacienteBTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastroPacienteBTMouseEntered
        cadastroPacienteBT.setBackground(new Color(230,230,230));
    }//GEN-LAST:event_cadastroPacienteBTMouseEntered

    private void cadastroPacienteBTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastroPacienteBTMouseExited
        cadastroPacienteBT.setBackground(Color.WHITE);
    }//GEN-LAST:event_cadastroPacienteBTMouseExited

    private void cadastroPacienteBTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastroPacienteBTMousePressed
        cadastroPacienteBT.setBackground(new Color(210,210,210));
    }//GEN-LAST:event_cadastroPacienteBTMousePressed

    private void cadastroPacienteBTMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastroPacienteBTMouseReleased
        cadastroPacienteBT.setBackground(new Color(230,230,230));
    }//GEN-LAST:event_cadastroPacienteBTMouseReleased

    private void agendarConsultaBTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agendarConsultaBTMouseEntered
        agendarConsultaBT.setBackground(new Color(230,230,230));
    }//GEN-LAST:event_agendarConsultaBTMouseEntered

    private void agendarConsultaBTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agendarConsultaBTMouseExited
        agendarConsultaBT.setBackground(Color.WHITE);
    }//GEN-LAST:event_agendarConsultaBTMouseExited

    private void agendarConsultaBTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agendarConsultaBTMousePressed
        agendarConsultaBT.setBackground(new Color(210,210,210));
    }//GEN-LAST:event_agendarConsultaBTMousePressed

    private void agendarConsultaBTMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agendarConsultaBTMouseReleased
        agendarConsultaBT.setBackground(new Color(230,230,230));
    }//GEN-LAST:event_agendarConsultaBTMouseReleased

    private void pesquisarFuncionarioBTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesquisarFuncionarioBTMouseEntered
        pesquisarFuncionarioBT.setBackground(new Color(230,230,230));
    }//GEN-LAST:event_pesquisarFuncionarioBTMouseEntered

    private void pesquisarFuncionarioBTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesquisarFuncionarioBTMouseExited
        pesquisarFuncionarioBT.setBackground(Color.WHITE);
    }//GEN-LAST:event_pesquisarFuncionarioBTMouseExited

    private void pesquisarFuncionarioBTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesquisarFuncionarioBTMousePressed
        pesquisarFuncionarioBT.setBackground(new Color(210,210,210));
    }//GEN-LAST:event_pesquisarFuncionarioBTMousePressed

    private void pesquisarFuncionarioBTMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesquisarFuncionarioBTMouseReleased
        pesquisarFuncionarioBT.setBackground(new Color(230,230,230));
    }//GEN-LAST:event_pesquisarFuncionarioBTMouseReleased

    private void cadastrarFuncionarioBTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarFuncionarioBTMouseEntered
        cadastrarFuncionarioBT.setBackground(new Color(230,230,230));
    }//GEN-LAST:event_cadastrarFuncionarioBTMouseEntered

    private void cadastrarFuncionarioBTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarFuncionarioBTMouseExited
        cadastrarFuncionarioBT.setBackground(Color.WHITE);
    }//GEN-LAST:event_cadastrarFuncionarioBTMouseExited

    private void cadastrarFuncionarioBTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarFuncionarioBTMousePressed
        cadastrarFuncionarioBT.setBackground(new Color(210,210,210));
    }//GEN-LAST:event_cadastrarFuncionarioBTMousePressed

    private void cadastrarFuncionarioBTMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarFuncionarioBTMouseReleased
        cadastrarFuncionarioBT.setBackground(new Color(230,230,230));
    }//GEN-LAST:event_cadastrarFuncionarioBTMouseReleased

    private void gerenciarAgendamentoBTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerenciarAgendamentoBTMouseEntered
        gerenciarAgendamentoBT.setBackground(new Color(230,230,230));
    }//GEN-LAST:event_gerenciarAgendamentoBTMouseEntered

    private void gerenciarAgendamentoBTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerenciarAgendamentoBTMouseExited
        gerenciarAgendamentoBT.setBackground(Color.WHITE);
    }//GEN-LAST:event_gerenciarAgendamentoBTMouseExited

    private void gerenciarAgendamentoBTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerenciarAgendamentoBTMousePressed
        gerenciarAgendamentoBT.setBackground(new Color(210,210,210));
    }//GEN-LAST:event_gerenciarAgendamentoBTMousePressed

    private void gerenciarAgendamentoBTMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerenciarAgendamentoBTMouseReleased
        gerenciarAgendamentoBT.setBackground(new Color(230,230,230));
    }//GEN-LAST:event_gerenciarAgendamentoBTMouseReleased

    private void pesquisarPacienteBTMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesquisarPacienteBTMouseReleased
        pesquisarPacienteBT.setBackground(new Color(230,230,230));
    }//GEN-LAST:event_pesquisarPacienteBTMouseReleased

    private void pesquisarPacienteBTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesquisarPacienteBTMousePressed
        pesquisarPacienteBT.setBackground(new Color(210,210,210));
    }//GEN-LAST:event_pesquisarPacienteBTMousePressed

    private void pesquisarPacienteBTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesquisarPacienteBTMouseExited
        pesquisarPacienteBT.setBackground(Color.WHITE);
    }//GEN-LAST:event_pesquisarPacienteBTMouseExited

    private void pesquisarPacienteBTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesquisarPacienteBTMouseEntered
        pesquisarPacienteBT.setBackground(new Color(230,230,230));
    }//GEN-LAST:event_pesquisarPacienteBTMouseEntered

    private void cadastroPacienteBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastroPacienteBTMouseClicked
        new CadastroPaciente().setVisible(true);  
    }//GEN-LAST:event_cadastroPacienteBTMouseClicked

    private void cadastrarFuncionarioBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarFuncionarioBTMouseClicked
        new CadastroFuncionario().setVisible(true);       
    }//GEN-LAST:event_cadastrarFuncionarioBTMouseClicked

    private void pesquisarFuncionarioBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesquisarFuncionarioBTMouseClicked
        new PesquisarFuncionario().setVisible(true);       
    }//GEN-LAST:event_pesquisarFuncionarioBTMouseClicked

    private void pesquisarPacienteBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesquisarPacienteBTMouseClicked
        new PesquisarPaciente().setVisible(true);       
    }//GEN-LAST:event_pesquisarPacienteBTMouseClicked

    private void gerenciarAgendamentoBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerenciarAgendamentoBTMouseClicked
        new PesquisarAgendamento().setVisible(true);
    }//GEN-LAST:event_gerenciarAgendamentoBTMouseClicked

    private void agendarConsultaBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agendarConsultaBTMouseClicked
        new AgendamentoFrame().setVisible(true);
    }//GEN-LAST:event_agendarConsultaBTMouseClicked

    private void agendamentosBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agendamentosBTMouseClicked
        new TelaAgendamentos().setVisible(true);
    }//GEN-LAST:event_agendamentosBTMouseClicked

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
            java.util.logging.Logger.getLogger(FrameSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameSecretaria(nomeFuncionario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agendamentosBT;
    private javax.swing.JLabel agendarConsultaBT;
    private javax.swing.JLabel bemVindoLB;
    private javax.swing.JLabel cadastrarFuncionarioBT;
    private javax.swing.JLabel cadastroPacienteBT;
    private javax.swing.JLabel gerenciarAgendamentoBT;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel pesquisarFuncionarioBT;
    private javax.swing.JLabel pesquisarPacienteBT;
    // End of variables declaration//GEN-END:variables
}
