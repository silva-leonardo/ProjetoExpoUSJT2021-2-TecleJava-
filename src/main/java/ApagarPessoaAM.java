
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class ApagarPessoaAM extends javax.swing.JFrame {

    public ApagarPessoaAM() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        voltarButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        label11 = new java.awt.Label();
        label12 = new java.awt.Label();
        apagarCpfTextField = new javax.swing.JTextField();
        excliurButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        voltarButton.setText("Voltar");
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(voltarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, 30));

        jPanel1.setBackground(new java.awt.Color(124, 7, 7));

        label11.setAlignment(java.awt.Label.CENTER);
        label11.setBackground(new java.awt.Color(124, 7, 7));
        label11.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        label11.setForeground(new java.awt.Color(255, 255, 255));
        label11.setText("CPF:");

        label12.setAlignment(java.awt.Label.CENTER);
        label12.setBackground(new java.awt.Color(124, 7, 7));
        label12.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        label12.setForeground(new java.awt.Color(255, 255, 255));
        label12.setText("Remover Pessoa");

        apagarCpfTextField.setBackground(new java.awt.Color(255, 255, 255));
        apagarCpfTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarCpfTextFieldActionPerformed(evt);
            }
        });

        excliurButton.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        excliurButton.setText("Excluir");
        excliurButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excliurButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label12, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apagarCpfTextField)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(excliurButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apagarCpfTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(excliurButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 260, 260));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\guilh\\OneDrive\\Projetos Netbeans\\Projeto3\\src\\main\\java\\Imagens\\PlanoDeFundo_RemoverAtendente.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void apagarCpfTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarCpfTextFieldActionPerformed

    }//GEN-LAST:event_apagarCpfTextFieldActionPerformed

    private void excliurButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excliurButtonActionPerformed
        String cpf = apagarCpfTextField.getText();
        String nome = null, telefone = null, endereco = null, cep = null, numero = null;

        int idade;
        if (cpf.length() < 8) {
            JOptionPane.showMessageDialog(null, "Dados incorretos ou faltantes");
        } else {
            try {
                Connection cn = SqlConnection.obterConexao();
                PreparedStatement ps = cn.prepareStatement("SELECT * FROM p_pendente1dose where CPF= ?");

                ps.setString(1, cpf);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {

                    nome = rs.getString("Nome");
                    telefone = rs.getString("telefone");
                    idade = rs.getInt("Idade");
                    endereco = rs.getString("Endereço");
                    cep = rs.getString("cep");
                    numero = rs.getString("numero");
                    Pessoa p2 = new Pessoa(nome, cpf, idade, telefone, endereco, cep, numero);
                    DAO dao = new DAO();
                    dao.inserirecluirPessoa(nome, cpf, telefone, endereco, cep, numero, idade);

                }
            } catch (Exception e) {

            }
            try {
                DAO dao = new DAO();
                Pessoa q = new Pessoa(cpf);
                dao.apagarPessoa(cpf);

            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados.");
            }
            int select = JOptionPane.showConfirmDialog(null, "Deseja efetuar uma nova remoção?");

            if (select == 0) {
                ApagarPessoaAM novaRemoçãoPessoa = new ApagarPessoaAM();
                novaRemoçãoPessoa.setVisible(true);
                this.dispose();

            } else {
                TelaAdm telaAdm = new TelaAdm();
                telaAdm.setVisible(true);
                setLocationRelativeTo(null);
                this.dispose();
            }
        }
    }//GEN-LAST:event_excliurButtonActionPerformed

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        TelaAdm telaAdm = new TelaAdm();
        telaAdm.setVisible(true);
        setLocationRelativeTo(null);

        this.dispose();
    }//GEN-LAST:event_voltarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ApagarAtendente_ADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApagarAtendente_ADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApagarAtendente_ADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApagarAtendente_ADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApagarAtendente_ADM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apagarCpfTextField;
    private javax.swing.JButton excliurButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label label11;
    private java.awt.Label label12;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
