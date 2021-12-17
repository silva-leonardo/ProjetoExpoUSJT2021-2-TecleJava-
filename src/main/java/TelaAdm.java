
public class TelaAdm extends javax.swing.JFrame {

    public TelaAdm() {
        initComponents();
        setLocationRelativeTo(null);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        button4 = new java.awt.Button();
        button5 = new java.awt.Button();
        button6 = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        button9 = new java.awt.Button();
        filaDeVacinacaoJbutton = new java.awt.Button();
        button2 = new java.awt.Button();
        button1 = new java.awt.Button();
        button3 = new java.awt.Button();
        button7 = new java.awt.Button();
        button8 = new java.awt.Button();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        button4.setBackground(new java.awt.Color(255, 255, 255));
        button4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        button4.setLabel("Remover Pessoa");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        jPanel1.add(button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 160, 20));

        button5.setBackground(new java.awt.Color(255, 255, 255));
        button5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        button5.setLabel("Remover Atendente");
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });
        jPanel1.add(button5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 160, 20));

        button6.setBackground(new java.awt.Color(255, 255, 255));
        button6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        button6.setLabel("Remover Adm's");
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });
        jPanel1.add(button6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 160, 20));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 330, -1));

        button9.setBackground(new java.awt.Color(255, 255, 255));
        button9.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        button9.setLabel("Gerar Relatório");
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });
        jPanel1.add(button9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 160, -1));

        filaDeVacinacaoJbutton.setBackground(new java.awt.Color(255, 255, 255));
        filaDeVacinacaoJbutton.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        filaDeVacinacaoJbutton.setLabel("Fila de Vacinação");
        filaDeVacinacaoJbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filaDeVacinacaoJbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(filaDeVacinacaoJbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 160, -1));

        button2.setBackground(new java.awt.Color(255, 255, 255));
        button2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        button2.setLabel("Registrar Pessoa");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        jPanel1.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 161, -1));

        button1.setBackground(new java.awt.Color(255, 255, 255));
        button1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        button1.setLabel("Registrar Atendente");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jPanel1.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 161, -1));

        button3.setBackground(new java.awt.Color(255, 255, 255));
        button3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        button3.setLabel("Registrar Novo ADM");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        jPanel1.add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 161, -1));

        button7.setBackground(new java.awt.Color(204, 204, 204));
        button7.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        button7.setForeground(new java.awt.Color(255, 0, 0));
        button7.setLabel("Sair");
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });
        jPanel1.add(button7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 70, -1));

        button8.setBackground(new java.awt.Color(255, 255, 255));
        button8.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        button8.setLabel("Visualizar Vacinados");
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });
        jPanel1.add(button8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 160, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\guilh\\OneDrive\\Projetos Netbeans\\Projeto3\\src\\main\\java\\Imagens\\PlanoDeFundoAdmMestre.jpg")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 750, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        TelaDeCadastro TelaCadPessoa = new TelaDeCadastro();
        TelaCadPessoa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button2ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        TelaDeCadastroDeAtendente TelaDeLogin = new TelaDeCadastroDeAtendente();

        TelaDeLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button1ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        TelaDeCadastroADM TelaCadAdm = new TelaDeCadastroADM();
        TelaCadAdm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button3ActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
        GeraeRelatorio relatorioAdm = new GeraeRelatorio();
        relatorioAdm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button9ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        TelaDeLogin sairTelaAdm = new TelaDeLogin();
        sairTelaAdm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button7ActionPerformed

    private void filaDeVacinacaoJbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filaDeVacinacaoJbuttonActionPerformed
        FilaDeVacinacaoAdm VacinaçãoMestre = new FilaDeVacinacaoAdm();
        VacinaçãoMestre.setVisible(true);
        setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_filaDeVacinacaoJbuttonActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        ListaDeAtendentes sairTelaAdm = new ListaDeAtendentes();
        sairTelaAdm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button5ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        ApagarPessoaAM apAdm = new ApagarPessoaAM();
        setLocationRelativeTo(null);
        apAdm.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_button4ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        ApagarAdmSecs apagarPessoa = new ApagarAdmSecs();
        apagarPessoa.setLocationRelativeTo(null);
        apagarPessoa.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_button6ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        TelaDeVacinadosAdmMestre telaVaciMestre = new TelaDeVacinadosAdmMestre();
        telaVaciMestre.setVisible(true);
        setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_button8ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private java.awt.Button button5;
    private java.awt.Button button6;
    private java.awt.Button button7;
    private java.awt.Button button8;
    private java.awt.Button button9;
    private java.awt.Button filaDeVacinacaoJbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
