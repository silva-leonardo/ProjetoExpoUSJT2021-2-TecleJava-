
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListaDeAtendentesAdm2 extends javax.swing.JFrame {

    public ListaDeAtendentesAdm2() {
        initComponents();
        try {
            Connection cn = SqlConnection.obterConexao();
            PreparedStatement ps = cn.prepareStatement("SELECT * FROM atendente");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel tm = (DefaultTableModel) filaJTable.getModel();
            tm.setRowCount(0);

            while (rs.next()) {
                Object o[] = {rs.getString("nome"), rs.getString("cpf")};

                tm.addRow(o);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        setVisible(true);
        setLocationRelativeTo(null);

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        filaJTable = new javax.swing.JTable();
        cpfFormatTextField = new javax.swing.JFormattedTextField();
        label1 = new java.awt.Label();
        button2 = new java.awt.Button();
        removerButao = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        filaJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(filaJTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 600, 270));

        cpfFormatTextField.setBackground(new java.awt.Color(255, 255, 255));
        try {
            cpfFormatTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpfFormatTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cpfFormatTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfFormatTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(cpfFormatTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 180, 30));

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(new java.awt.Color(7, 12, 61));
        label1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("LISTA ATENDENTES");
        jPanel1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, -1));

        button2.setLabel("Voltar");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        jPanel1.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 80, 30));

        removerButao.setText("Remover");
        removerButao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerButaoActionPerformed(evt);
            }
        });
        jPanel1.add(removerButao, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 80, 30));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 30, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 40, 50));

        jLabel1.setAutoscrolls(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        TelaAdmSec telaadms = new TelaAdmSec();
        setVisible(true);
        this.dispose();


    }//GEN-LAST:event_button2ActionPerformed

    private void removerButaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerButaoActionPerformed
        String cpf = cpfFormatTextField.getText();
        String nome = null, telefone = null;
        String compare = "   .   .   -  ";
        if (cpf.equals(compare)) {
            JOptionPane.showMessageDialog(null, "Dados incorretos ou faltantes");
        } else {
            Atendente a = new Atendente(nome, cpf, telefone);
            DAO dao = new DAO();
            try {
                Connection cn = SqlConnection.obterConexao();
                PreparedStatement ps = cn.prepareStatement("SELECT * FROM atendente where CPF= ?");

                ps.setString(1, cpf);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {

                    nome = rs.getString("Nome");

                    String cpf2 = rs.getString("cpf");

                    telefone = rs.getString("telefone");
                    Atendente a2 = new Atendente(nome, cpf, telefone);

                    dao.inserirecluirAtendente(nome, cpf, telefone);

                }
            } catch (Exception e) {

            }

            try {
                DAO dao2 = new DAO();
                Atendente b = new Atendente(cpf);
                dao2.apagarAtendente2(cpf);

            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados");

            }
            TelaAdmSec telaAdminSec = new TelaAdmSec();
            telaAdminSec.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_removerButaoActionPerformed

    private void cpfFormatTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfFormatTextFieldActionPerformed

    }//GEN-LAST:event_cpfFormatTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(FilaDeVacinacaoAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FilaDeVacinacaoAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FilaDeVacinacaoAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FilaDeVacinacaoAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaDeAtendentesAdm2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button2;
    private javax.swing.JFormattedTextField cpfFormatTextField;
    private javax.swing.JTable filaJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label label1;
    private javax.swing.JButton removerButao;
    // End of variables declaration//GEN-END:variables
}
