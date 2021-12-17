
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class TelaDeCadastroADM extends javax.swing.JFrame {

    public TelaDeCadastroADM() {
        initComponents();
        setLocationRelativeTo(null);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        label3 = new java.awt.Label();
        label12 = new java.awt.Label();
        label1 = new java.awt.Label();
        label4 = new java.awt.Label();
        label2 = new java.awt.Label();
        nomeTextField = new javax.swing.JTextField();
        senhaTextField = new java.awt.TextField();
        jButton2 = new javax.swing.JButton();
        salvarButton = new javax.swing.JButton();
        cpfTextField1 = new javax.swing.JFormattedTextField();
        telefoneTextField = new javax.swing.JFormattedTextField();
        idadeTextField = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela De Cadastro");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Administrador");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 540, 36));

        label3.setAlignment(java.awt.Label.CENTER);
        label3.setBackground(new java.awt.Color(7, 87, 117));
        label3.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setName("Nome:"); // NOI18N
        label3.setText("Nome:");
        jPanel1.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 200, 20));

        label12.setAlignment(java.awt.Label.CENTER);
        label12.setBackground(new java.awt.Color(7, 87, 117));
        label12.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        label12.setForeground(new java.awt.Color(255, 255, 255));
        label12.setText("CPF:");
        jPanel1.add(label12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 200, 20));

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(new java.awt.Color(7, 87, 117));
        label1.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Idade:");
        jPanel1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 200, 20));

        label4.setAlignment(java.awt.Label.CENTER);
        label4.setBackground(new java.awt.Color(7, 87, 117));
        label4.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setText("Telefone:");
        jPanel1.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 200, 20));

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setBackground(new java.awt.Color(7, 87, 117));
        label2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("Senha :");
        jPanel1.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 180, 30));

        nomeTextField.setBackground(new java.awt.Color(255, 255, 255));
        nomeTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nomeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(nomeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 200, 30));

        senhaTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(senhaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 180, 30));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jButton2.setText("Voltar");
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, 30));

        salvarButton.setBackground(new java.awt.Color(204, 204, 204));
        salvarButton.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        salvarButton.setText("Salvar");
        salvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButtonActionPerformed(evt);
            }
        });
        jPanel1.add(salvarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, -1, 30));

        cpfTextField1.setBackground(new java.awt.Color(255, 255, 255));
        try {
            cpfTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpfTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cpfTextField1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cpfTextField1MouseMoved(evt);
            }
        });
        cpfTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cpfTextField1MouseReleased(evt);
            }
        });
        cpfTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(cpfTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 200, 30));

        telefoneTextField.setBackground(new java.awt.Color(255, 255, 255));
        try {
            telefoneTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefoneTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        telefoneTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telefoneTextFieldMouseClicked(evt);
            }
        });
        jPanel1.add(telefoneTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 200, 30));

        idadeTextField.setBackground(new java.awt.Color(255, 255, 255));
        try {
            idadeTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        idadeTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(idadeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 200, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 240, 210));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\guilh\\OneDrive\\Projetos Netbeans\\Projeto3\\src\\main\\java\\Imagens\\TelaDeCadastroGeral.jpg")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TelaAdm VoltarADM = new TelaAdm();

        VoltarADM.setVisible(true);
        setLocationRelativeTo(null);
        this.dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed

        String nome = nomeTextField.getText();
        String telefone = telefoneTextField.getText();
        String cpf = cpfTextField1.getText();
        int idade = Integer.parseInt(idadeTextField.getText());
        String senha = senhaTextField.getText();

        String compare = "   .   .   -  ";
        if (cpf.equals(compare)) {
            JOptionPane.showMessageDialog(null, "Dados incorretos ou faltantes.");
        } else {
            Admin_secundario a = new Admin_secundario(nome, idade, cpf, telefone, senha);
            DAO dao = new DAO();
            dao.inserirAdmSec(nome, cpf, senha, telefone, idade);

            TelaAdm VoltarADM = new TelaAdm();
            VoltarADM.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_salvarButtonActionPerformed

    private void nomeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTextFieldActionPerformed

    private void cpfTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfTextField1ActionPerformed


    }//GEN-LAST:event_cpfTextField1ActionPerformed

    private void telefoneTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telefoneTextFieldMouseClicked

    }//GEN-LAST:event_telefoneTextFieldMouseClicked

    private void cpfTextField1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpfTextField1MouseReleased

    }//GEN-LAST:event_cpfTextField1MouseReleased

    private void cpfTextField1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpfTextField1MouseMoved

    }//GEN-LAST:event_cpfTextField1MouseMoved

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
            java.util.logging.Logger.getLogger(TelaDeCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeCadastroADM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JFormattedTextField cpfTextField1;
    private javax.swing.JFormattedTextField idadeTextField;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label label1;
    private java.awt.Label label12;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JButton salvarButton;
    private java.awt.TextField senhaTextField;
    private javax.swing.JFormattedTextField telefoneTextField;
    // End of variables declaration//GEN-END:variables
}
