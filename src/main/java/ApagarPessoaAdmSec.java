
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class ApagarPessoaAdmSec extends javax.swing.JFrame {

    public ApagarPessoaAdmSec() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        voltarButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        label14 = new java.awt.Label();
        label15 = new java.awt.Label();
        apagarCpfTextField = new javax.swing.JTextField();
        excliurButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        voltarButton.setText("Voltar");
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(voltarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, 30));

        jPanel2.setBackground(new java.awt.Color(124, 7, 7));

        label14.setAlignment(java.awt.Label.CENTER);
        label14.setBackground(new java.awt.Color(124, 7, 7));
        label14.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        label14.setForeground(new java.awt.Color(255, 255, 255));
        label14.setText("CPF:");

        label15.setAlignment(java.awt.Label.CENTER);
        label15.setBackground(new java.awt.Color(124, 7, 7));
        label15.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        label15.setForeground(new java.awt.Color(255, 255, 255));
        label15.setText("Remover Pessoa");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(excliurButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label15, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(apagarCpfTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(label14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(apagarCpfTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(excliurButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 260, 230));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\guilh\\OneDrive\\Projetos Netbeans\\Projeto3\\src\\main\\java\\Imagens\\PlanoDeFundo_RemoverAtendente.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void apagarCpfTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarCpfTextFieldActionPerformed

    }//GEN-LAST:event_apagarCpfTextFieldActionPerformed

    private void excliurButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excliurButtonActionPerformed
        String cpf = apagarCpfTextField.getText();
        if (cpf.length() < 8) {
            JOptionPane.showMessageDialog(null, "Dados incorretos ou faltantes.");
        } else {
            String nome = null, telefone = null, endereco = null, cep = null, numero = null;
            Pessoa p = new Pessoa(nome, cpf, telefone);
            int idade;
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
                JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados");
            }
            int select = JOptionPane.showConfirmDialog(null, "Deseja efetuar uma nova remoção?");

            if (select == 0) {
                ApagarPessoaAdmSec novaRemoçãoPessoaM = new ApagarPessoaAdmSec();
                novaRemoçãoPessoaM.setVisible(true);
                this.dispose();

            } else {
                TelaAdmSec telaAdmsec = new TelaAdmSec();
                telaAdmsec.setVisible(true);
                setLocationRelativeTo(null);
                this.dispose();
            }
        }
    }//GEN-LAST:event_excliurButtonActionPerformed

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        TelaAdmSec telaAdmaaa = new TelaAdmSec();
        telaAdmaaa.setVisible(true);
        setLocationRelativeTo(null);

        this.dispose();
    }//GEN-LAST:event_voltarButtonActionPerformed

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
                new ApagarPessoaAdmSec().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apagarCpfTextField;
    private javax.swing.JButton excliurButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private java.awt.Label label14;
    private java.awt.Label label15;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
