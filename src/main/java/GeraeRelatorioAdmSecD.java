
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GeraeRelatorioAdmSecD extends javax.swing.JFrame {

    public GeraeRelatorioAdmSecD() {
        initComponents();
        setLocationRelativeTo(null);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        jPanel3 = new javax.swing.JPanel();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        dataIniTextField = new javax.swing.JFormattedTextField();
        dataFinalTextField = new javax.swing.JFormattedTextField();
        media4TextField = new java.awt.TextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        vacinadosJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        media1TextField = new java.awt.TextField();
        media2TextFIeld = new java.awt.TextField();
        media3TextField = new java.awt.TextField();
        button1 = new java.awt.Button();
        button3 = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();

        popupMenu1.setLabel("popupMenu1");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 5, 52));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(new java.awt.Color(0, 5, 52));
        label1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Relatório");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        label2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        label2.setText("Data:");

        label3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        label3.setText("Média de Vacinação Diária:");

        try {
            dataIniTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dataIniTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dataIniTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataIniTextFieldActionPerformed(evt);
            }
        });

        try {
            dataFinalTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dataFinalTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dataFinalTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataFinalTextFieldActionPerformed(evt);
            }
        });

        media4TextField.setEditable(false);
        media4TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                media4TextFieldActionPerformed(evt);
            }
        });

        vacinadosJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ">=90", ">=70 <90", ">=50 <70", "<50"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        vacinadosJTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(vacinadosJTable);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Até");

        media1TextField.setEditable(false);
        media1TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                media1TextFieldActionPerformed(evt);
            }
        });

        media2TextFIeld.setEditable(false);
        media2TextFIeld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                media2TextFIeldActionPerformed(evt);
            }
        });

        media3TextField.setEditable(false);
        media3TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                media3TextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(dataIniTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(dataFinalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(70, 70, 70))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(media1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(media2TextFIeld, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(media3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(media4TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)))
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dataIniTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(dataFinalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(media3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(media4TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(media2TextFIeld, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(media1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 500, 320));

        button1.setLabel("Voltar");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jPanel1.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 80, 30));

        button3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        button3.setLabel("Gerar Relatorio");
        button3.setName(""); // NOI18N
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        jPanel1.add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 100, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\guilh\\OneDrive\\Projetos Netbeans\\Projeto3\\src\\main\\java\\Imagens\\PlanoDeFundoRelatorio.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 0, 860, 400));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        TelaAdmSec voltarRelatorioAdmSec = new TelaAdmSec();
        voltarRelatorioAdmSec.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button1ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed

        double diascontados = 0;
        double contadorPrio1 = 0, contadorPrio2 = 0, contadorPrio3 = 0, contadorPrio4 = 0;
        //Contador prio 1
        try {

            String data1 = dataIniTextField.getText();
            String data2 = dataFinalTextField.getText();

            String dataini = "\"" + data1 + "\"";
            String datfin = "\"" + data2 + "\"";
            String sql = ("SELECT * FROM p_vacinadas where Data_da_Vacinação BETWEEN" + dataini + "AND" + datfin + "AND idade >=90");
            Connection cn = SqlConnection.obterConexao();

            PreparedStatement ps = cn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                contadorPrio1++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        //Contador prio 2
        try {

            String data1 = dataIniTextField.getText();
            String data2 = dataFinalTextField.getText();

            String dataini = "\"" + data1 + "\"";
            String datfim = "\"" + data2 + "\"";
            String sql = ("SELECT * FROM p_vacinadas where Data_da_Vacinação BETWEEN" + dataini + "AND" + datfim + " AND idade >=70 <90");
            Connection cn = SqlConnection.obterConexao();

            PreparedStatement ps = cn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                contadorPrio2++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        try {

            String data1 = dataIniTextField.getText();
            String data2 = dataFinalTextField.getText();

            String dataini = "\"" + data1 + "\"";
            String datfin = "\"" + data2 + "\"";
            String sql = ("SELECT * FROM p_vacinadas where Data_da_Vacinação BETWEEN" + dataini + "AND" + datfin + " AND idade >=50 <70");
            Connection cn = SqlConnection.obterConexao();

            PreparedStatement ps = cn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                contadorPrio3++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        try {

            String data1 = dataIniTextField.getText();
            String data2 = dataFinalTextField.getText();

            String dataini = "\"" + data1 + "\"";
            String datfin = "\"" + data2 + "\"";
            String sql = ("SELECT * FROM p_vacinadas where Data_da_Vacinação BETWEEN" + dataini + "AND" + datfin + " AND idade <50");
            Connection cn = SqlConnection.obterConexao();

            PreparedStatement ps = cn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                contadorPrio4++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {

            String data1 = dataIniTextField.getText();
            String data2 = dataFinalTextField.getText();

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Calendar data1In = Calendar.getInstance();
            Calendar data2Fim = Calendar.getInstance();

            try {
                data1In.setTime(sdf.parse(dataIniTextField.getText()));
                data2Fim.setTime(sdf.parse(dataFinalTextField.getText()));

            } catch (Exception e) {
            }
            diascontados = data2Fim.get(Calendar.DAY_OF_YEAR) - data1In.get(Calendar.DAY_OF_YEAR);

        } catch (Exception e) {

        }

        double media1 = (contadorPrio1 / diascontados);
        double media2 = (contadorPrio2 / diascontados);
        double media3 = (contadorPrio3 / diascontados);
        double media4 = (contadorPrio4 / diascontados);
        media1TextField.setText(Double.toString(media1));
        media2TextFIeld.setText(Double.toString(media2));
        media3TextField.setText(Double.toString(media3));
        media4TextField.setText(Double.toString(media4));

    }//GEN-LAST:event_button3ActionPerformed

    private void dataIniTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataIniTextFieldActionPerformed

    }//GEN-LAST:event_dataIniTextFieldActionPerformed

    private void dataFinalTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataFinalTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataFinalTextFieldActionPerformed

    private void media4TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_media4TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_media4TextFieldActionPerformed

    private void media1TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_media1TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_media1TextFieldActionPerformed

    private void media2TextFIeldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_media2TextFIeldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_media2TextFIeldActionPerformed

    private void media3TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_media3TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_media3TextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(GeraeRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeraeRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeraeRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeraeRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GeraeRelatorioAdmSecD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button3;
    private javax.swing.JFormattedTextField dataFinalTextField;
    private javax.swing.JFormattedTextField dataIniTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.TextField media1TextField;
    private java.awt.TextField media2TextFIeld;
    private java.awt.TextField media3TextField;
    private java.awt.TextField media4TextField;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JTable vacinadosJTable;
    // End of variables declaration//GEN-END:variables
}
