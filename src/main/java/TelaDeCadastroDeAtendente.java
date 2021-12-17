
import javax.swing.JOptionPane;

public class TelaDeCadastroDeAtendente extends javax.swing.JFrame {

    public TelaDeCadastroDeAtendente() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        idadeTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        label6 = new java.awt.Label();
        senhaTextField4 = new java.awt.TextField();
        funcaoTextField = new javax.swing.JTextField();
        nomeTextField = new javax.swing.JTextField();
        label8 = new java.awt.Label();
        jPanel3 = new javax.swing.JPanel();
        salvarButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        psdTextField = new javax.swing.JTextField();
        idadeTextField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        femCheckBox = new javax.swing.JRadioButton();
        telefoneTextField1 = new javax.swing.JFormattedTextField();
        label12 = new java.awt.Label();
        label13 = new java.awt.Label();
        label11 = new java.awt.Label();
        jLabel5 = new javax.swing.JLabel();
        label9 = new java.awt.Label();
        label7 = new java.awt.Label();
        cpfTextField = new javax.swing.JFormattedTextField();
        chTextField = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        idadeTextField1.setBackground(new java.awt.Color(255, 255, 255));
        idadeTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela De Cadastro");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(new java.awt.Color(7, 87, 117));
        label1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Idade:");
        jPanel1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 200, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel12.setBackground(new java.awt.Color(7, 87, 117));
        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel12.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N

        label6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        label6.setForeground(new java.awt.Color(255, 255, 255));
        label6.setText("Senha :");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(senhaTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 123, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(senhaTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 200, -1));

        funcaoTextField.setBackground(new java.awt.Color(255, 255, 255));
        funcaoTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        funcaoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcaoTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(funcaoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 210, 30));

        nomeTextField.setBackground(new java.awt.Color(255, 255, 255));
        nomeTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nomeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(nomeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 200, 30));

        label8.setBackground(new java.awt.Color(7, 87, 117));
        label8.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        label8.setForeground(new java.awt.Color(255, 255, 255));
        label8.setText("Postinho de Saúde Destinado:");
        jPanel1.add(label8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 210, -1));

        jPanel3.setBackground(new java.awt.Color(7, 87, 117));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        salvarButton.setBackground(new java.awt.Color(204, 204, 204));
        salvarButton.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        salvarButton.setText("Salvar");
        salvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(salvarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(salvarButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 350, -1, -1));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        psdTextField.setBackground(new java.awt.Color(255, 255, 255));
        psdTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(psdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 210, 30));

        idadeTextField.setBackground(new java.awt.Color(255, 255, 255));
        idadeTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(idadeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 200, 30));

        jPanel2.setBackground(new java.awt.Color(7, 87, 117));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sexo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N

        jRadioButton1.setBackground(new java.awt.Color(7, 87, 117));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setForeground(new java.awt.Color(204, 204, 204));
        jRadioButton1.setText("Masculino");
        jRadioButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        femCheckBox.setBackground(new java.awt.Color(7, 87, 117));
        buttonGroup1.add(femCheckBox);
        femCheckBox.setForeground(new java.awt.Color(204, 204, 204));
        femCheckBox.setText("Feminino");
        femCheckBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        femCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                        .addGap(69, 69, 69))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(femCheckBox)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(femCheckBox)
                .addGap(11, 11, 11)
                .addComponent(jRadioButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 210, 90));

        telefoneTextField1.setBackground(new java.awt.Color(255, 255, 255));
        try {
            telefoneTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefoneTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(telefoneTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 200, 30));

        label12.setAlignment(java.awt.Label.CENTER);
        label12.setBackground(new java.awt.Color(7, 87, 117));
        label12.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        label12.setForeground(new java.awt.Color(255, 255, 255));
        label12.setText("Função:");
        jPanel1.add(label12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 210, -1));

        label13.setAlignment(java.awt.Label.CENTER);
        label13.setBackground(new java.awt.Color(7, 87, 117));
        label13.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        label13.setForeground(new java.awt.Color(255, 255, 255));
        label13.setText("Carga Horaria:");
        jPanel1.add(label13, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 210, -1));

        label11.setAlignment(java.awt.Label.CENTER);
        label11.setBackground(new java.awt.Color(7, 87, 117));
        label11.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        label11.setForeground(new java.awt.Color(255, 255, 255));
        label11.setText("CPF:");
        jPanel1.add(label11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 200, -1));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Cadastro de Atendentes");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 790, 40));

        label9.setAlignment(java.awt.Label.CENTER);
        label9.setBackground(new java.awt.Color(7, 87, 117));
        label9.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        label9.setForeground(new java.awt.Color(255, 255, 255));
        label9.setText("Telefone");
        jPanel1.add(label9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 200, -1));

        label7.setAlignment(java.awt.Label.CENTER);
        label7.setBackground(new java.awt.Color(7, 87, 117));
        label7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        label7.setForeground(new java.awt.Color(255, 255, 255));
        label7.setText("Nome");
        jPanel1.add(label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 200, -1));

        cpfTextField.setBackground(new java.awt.Color(255, 255, 255));
        try {
            cpfTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpfTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(cpfTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 200, 30));

        chTextField.setBackground(new java.awt.Color(255, 255, 255));
        try {
            chTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        chTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        chTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(chTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 210, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\guilh\\OneDrive\\Projetos Netbeans\\Projeto3\\src\\main\\java\\Imagens\\logo.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 210, 190));

        jLabel1.setForeground(new java.awt.Color(7, 87, 117));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\guilh\\OneDrive\\Projetos Netbeans\\Projeto3\\src\\main\\java\\Imagens\\TelaDeCadastroGeral.jpg")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 791, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void funcaoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcaoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_funcaoTextFieldActionPerformed

    private void nomeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTextFieldActionPerformed

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed
        boolean empty = funcaoTextField.getText().isEmpty();
        boolean nomeEmpty = nomeTextField.getText().isBlank();
        String sexo = null;
        if (femCheckBox.isSelected()) {
            sexo = "Feminino";
        } else {
            sexo = "Masculino";
        }
        if (nomeEmpty == true || empty == true) {
            JOptionPane.showMessageDialog(null, "Dados incorretos ou faltantes.");

        } else {
            String nome = nomeTextField.getText();
            String cpf = cpfTextField.getText();
            String telefone = telefoneTextField1.getText();
            int idade = Integer.parseInt(idadeTextField.getText());
            String senha = senhaTextField4.getText();
            String cargahoraria = chTextField.getText();
            String psd = psdTextField.getText();
            String funcao = funcaoTextField.getText();
            String horario = chTextField.getText();
            Atendente b = new Atendente(nome, cpf, telefone, idade, senha, horario, psd, funcao, sexo);
            DAO dao = new DAO();
            dao.inserirAtendente(nome, cpf, telefone, idade, senha, horario, psd, funcao, sexo);

            TelaAdm VoltarADM = new TelaAdm();
            VoltarADM.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_salvarButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TelaAdm Voltar = new TelaAdm();

        Voltar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void femCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femCheckBoxActionPerformed

    private void chTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chTextFieldActionPerformed

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
                new TelaDeCadastroDeAtendente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFormattedTextField chTextField;
    private javax.swing.JFormattedTextField cpfTextField;
    private javax.swing.JRadioButton femCheckBox;
    private javax.swing.JTextField funcaoTextField;
    private javax.swing.JTextField idadeTextField;
    private javax.swing.JTextField idadeTextField1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private java.awt.Label label1;
    private java.awt.Label label11;
    private java.awt.Label label12;
    private java.awt.Label label13;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JTextField psdTextField;
    private javax.swing.JButton salvarButton;
    private java.awt.TextField senhaTextField4;
    private javax.swing.JFormattedTextField telefoneTextField1;
    // End of variables declaration//GEN-END:variables
}
