
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ApagarAdmSecs extends javax.swing.JFrame {

    public ApagarAdmSecs() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        label14 = new java.awt.Label();
        label15 = new java.awt.Label();
        jLabel7 = new javax.swing.JLabel();
        excliurButton1 = new javax.swing.JButton();
        apagarCpfTextField1 = new javax.swing.JTextField();
        voltarButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        label16 = new java.awt.Label();
        label17 = new java.awt.Label();
        jLabel8 = new javax.swing.JLabel();
        apagarCpfTextField = new javax.swing.JTextField();
        excliurButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

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
        label15.setText("Remover ADM");

        excliurButton1.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        excliurButton1.setText("Excluir");
        excliurButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excliurButton1ActionPerformed(evt);
            }
        });

        apagarCpfTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarCpfTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(apagarCpfTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(label14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(excliurButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(label14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(apagarCpfTextField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(excliurButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        voltarButton.setText("Voltar");
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(voltarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, 30));

        jPanel3.setBackground(new java.awt.Color(124, 7, 7));

        label16.setAlignment(java.awt.Label.CENTER);
        label16.setBackground(new java.awt.Color(124, 7, 7));
        label16.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        label16.setForeground(new java.awt.Color(255, 255, 255));
        label16.setText("CPF:");

        label17.setAlignment(java.awt.Label.CENTER);
        label17.setBackground(new java.awt.Color(124, 7, 7));
        label17.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        label17.setForeground(new java.awt.Color(255, 255, 255));
        label17.setText("Remover ADM");

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(apagarCpfTextField)
                .addGap(27, 27, 27))
            .addComponent(label17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(excliurButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(label16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(apagarCpfTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addComponent(excliurButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 260, 240));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 20, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\guilh\\OneDrive\\Projetos Netbeans\\Projeto3\\src\\main\\java\\Imagens\\PlanoDeFundo_RemoverAtendente.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void excliurButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excliurButtonActionPerformed
        String cpf = apagarCpfTextField.getText();
        String nome = null, telefone = null;

        if (cpf.length() < 14 || cpf.length() > 14) {
            JOptionPane.showMessageDialog(null, "Dados incorretos ou faltantes");
        } else {
            Admin_secundario admSec = new Admin_secundario(nome, cpf, telefone);
            DAO dao = new DAO();
            //1° passo para remoção
            try {
                dao.removerAdmSec1(cpf);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            //2° passo para remoção
            try {
                DAO dao2 = new DAO();
                dao2.removerAdmSec2(cpf);
            } catch (Exception e) {
                e.printStackTrace();
            }
            TelaAdm painelAdm = new TelaAdm();
            painelAdm.setVisible(true);
            this.dispose();
        }


    }//GEN-LAST:event_excliurButtonActionPerformed

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        TelaAdm telaAdm = new TelaAdm();
        telaAdm.setVisible(true);
        setLocationRelativeTo(null);

        this.dispose();
    }//GEN-LAST:event_voltarButtonActionPerformed

    private void excliurButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excliurButton1ActionPerformed
        /*
        String cpf = jFormattedTextField1.getText();

        try {
            Atendente b = new Atendente(cpf);
            b.apagarAtendente();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados");

        }
         */
    }//GEN-LAST:event_excliurButton1ActionPerformed

    private void apagarCpfTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarCpfTextField1ActionPerformed

    }//GEN-LAST:event_apagarCpfTextField1ActionPerformed

    private void apagarCpfTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarCpfTextFieldActionPerformed

    }//GEN-LAST:event_apagarCpfTextFieldActionPerformed

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
                new ApagarAdmSecs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apagarCpfTextField;
    private javax.swing.JTextField apagarCpfTextField1;
    private javax.swing.JButton excliurButton;
    private javax.swing.JButton excliurButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private java.awt.Label label14;
    private java.awt.Label label15;
    private java.awt.Label label16;
    private java.awt.Label label17;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
