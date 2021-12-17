
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FilaVacAtendente extends javax.swing.JFrame {

    public FilaVacAtendente() {
        initComponents();
        try {
            Connection cn = SqlConnection.obterConexao();
            PreparedStatement ps = cn.prepareStatement("SELECT * FROM  p_pendente1dose where prioridade =1 ORDER BY idade DESC");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel tm = (DefaultTableModel) filaJTable.getModel();
            tm.setRowCount(0);

            while (rs.next()) {
                Object o[] = {rs.getString("nome"), rs.getString("cpf"), rs.getInt("idade"), rs.getInt("prioridade")};

                tm.addRow(o);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Connection cn = SqlConnection.obterConexao();
            PreparedStatement ps = cn.prepareStatement("SELECT * FROM  p_pendente1dose where prioridade = 2 ORDER BY idade DESC");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel tm = (DefaultTableModel) filaJTable.getModel();

            while (rs.next()) {
                Object o[] = {rs.getString("nome"), rs.getString("cpf"), rs.getInt("idade"), rs.getInt("prioridade")};

                tm.addRow(o);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Connection cn = SqlConnection.obterConexao();
            PreparedStatement ps = cn.prepareStatement("SELECT * FROM  p_pendente1dose where prioridade = 3 ORDER BY idade DESC");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel tm = (DefaultTableModel) filaJTable.getModel();

            while (rs.next()) {
                Object o[] = {rs.getString("nome"), rs.getString("cpf"), rs.getInt("idade"), rs.getInt("prioridade")};

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
        jButton2 = new javax.swing.JButton();
        button1 = new java.awt.Button();
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
                "Nome", "CPF", "Idade", "Prioridade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(filaJTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 610, 270));

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
        jPanel1.add(cpfFormatTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 200, 30));

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(new java.awt.Color(7, 12, 61));
        label1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(204, 204, 204));
        label1.setText("FILA DE VACINAÇÃO");
        jPanel1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 630, -1));

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 80, -1));

        button1.setBackground(new java.awt.Color(204, 204, 204));
        button1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        button1.setLabel("Voltar");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jPanel1.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 60, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\guilh\\OneDrive\\Projetos Netbeans\\Projeto3\\src\\main\\java\\Imagens\\PlanoDeFundoFilaDeVacinacao.jpg")); // NOI18N
        jLabel1.setAutoscrolls(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String cpf = cpfFormatTextField.getText();
        String compare = "   .   .   -  ";

        if (cpf.equals(compare)) {
            JOptionPane.showMessageDialog(null, "Dados incorretos ou faltantes.");
        } else {
            try {
                Connection cn = SqlConnection.obterConexao();
                PreparedStatement ps = cn.prepareStatement("SELECT * FROM  p_pendente1dose where cpf= ?");

                ps.setString(1, cpf);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {   //Talvez o objeto "o" possa ser retirado
                    Object o[] = {rs.getString("Nome"), rs.getInt("idade"), rs.getString("Nome")};
                    String nome = rs.getString("Nome");
                    int idade = rs.getInt("Idade");
                    String cpf2 = rs.getString("cpf");
                    int prioridade = rs.getInt("prioridade");
                    String endereco = rs.getString("Endereço");
                    String cep = rs.getString("cep");
                    String numero = rs.getString("numero");
                    String bairro = rs.getString("bairro");
                    String complemento = rs.getString("complemento");
                    String telefone = rs.getString("telefone");
                    String sexo = rs.getString("sexo");

                    Pessoa paciente = new Pessoa(nome, idade, cpf, prioridade, endereco, cep, numero, bairro, complemento, telefone, sexo);

                    TelaPesquisaVacinadosAtendente pesquisa = new TelaPesquisaVacinadosAtendente(paciente);
                    pesquisa.setVisible(true);
                    setLocationRelativeTo(null);
                    this.dispose();

                }
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao buscar paciente, tente novamente. Se o erro persistir, entre em contato com o suporte");
            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void cpfFormatTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfFormatTextFieldActionPerformed

    }//GEN-LAST:event_cpfFormatTextFieldActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        TelaAtendente voltarFilaAtendente = new TelaAtendente();
        voltarFilaAtendente.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button1ActionPerformed

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
                new FilaVacAtendente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.JFormattedTextField cpfFormatTextField;
    private javax.swing.JTable filaJTable;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
