
public class TelaAdmSec extends javax.swing.JFrame {

    public TelaAdmSec() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();
        button4 = new java.awt.Button();
        button5 = new java.awt.Button();
        button6 = new java.awt.Button();
        button7 = new java.awt.Button();
        button8 = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        button1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        button1.setLabel("Cadastrar Atendente");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jPanel1.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 130, 30));

        button2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        button2.setLabel("Cadastrar Pessoa");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        jPanel1.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 130, 30));

        button3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        button3.setLabel("Remover Atendente ");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        jPanel1.add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 130, 30));

        button4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        button4.setLabel("Remover Pessoa");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        jPanel1.add(button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 130, 30));

        button5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        button5.setLabel("Gerar Relatório");
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });
        jPanel1.add(button5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 130, 30));

        button6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        button6.setLabel("Visualizar Fila");
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });
        jPanel1.add(button6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 130, 30));

        button7.setBackground(new java.awt.Color(204, 204, 204));
        button7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        button7.setForeground(new java.awt.Color(255, 0, 0));
        button7.setLabel("Sair");
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });
        jPanel1.add(button7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 60, 20));

        button8.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        button8.setLabel("Visualizar Vacinados");
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });
        jPanel1.add(button8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 130, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\guilh\\OneDrive\\Projetos Netbeans\\Projeto3\\src\\main\\java\\Imagens\\PlanoDeFundoAdmSec.jpg")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        ApagarPessoaAdmSec adc = new ApagarPessoaAdmSec();
        adc.setVisible(true);
        setLocationRelativeTo(null);
        this.dispose();

    }//GEN-LAST:event_button4ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        TelaDeLogin sairTelaAdmSec = new TelaDeLogin();

        sairTelaAdmSec.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button7ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        TelaDeCadastroDeAtendenteAdmSec telaCadastroAtendenteAdmSec = new TelaDeCadastroDeAtendenteAdmSec();

        telaCadastroAtendenteAdmSec.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        TelaDeCadastroAdmSec TelaCadPessoaAdmSec = new TelaDeCadastroAdmSec();
        TelaCadPessoaAdmSec.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button2ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        GeraeRelatorioAdmSecD relatorioAdmSecA = new GeraeRelatorioAdmSecD();
        relatorioAdmSecA.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button5ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        FilaDeVacinacaoAdmSec filaAdmSec = new FilaDeVacinacaoAdmSec();
        filaAdmSec.setVisible(true);
        setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_button6ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        ListaDeAtendentesAdm2 apagar = new ListaDeAtendentesAdm2();
        apagar.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_button3ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        TelaDeVacinadosAdmSec telaVisuAdmSec = new TelaDeVacinadosAdmSec();
        telaVisuAdmSec.setVisible(true);
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
            java.util.logging.Logger.getLogger(TelaAdmSec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdmSec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdmSec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdmSec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdmSec().setVisible(true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
