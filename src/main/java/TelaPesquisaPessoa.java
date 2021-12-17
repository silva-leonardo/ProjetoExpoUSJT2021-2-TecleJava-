
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class TelaPesquisaPessoa extends javax.swing.JFrame {

    public TelaPesquisaPessoa() {
        initComponents();
        setLocationRelativeTo(null);

    }
    //Auto preencher info

    public TelaPesquisaPessoa(Pessoa paciente) {
        initComponents();
        enderecoTextField.setText(paciente.getEndereco());
        nomeTextField1.setText(paciente.getNome());
        cpfTextField.setText(paciente.getCpf());
        telefoneTextField.setText(paciente.getTelefone());
        String idade2 = Integer.toString(paciente.getIdade());
        idadeTextField3.setText(idade2);
        sexoTextFIeld.setText(paciente.getSexo());
        String prioridade2 = Integer.toString(paciente.getPrioridade());
        prioridadeTextField.setText(prioridade2);
        enderecoTextField.setText(paciente.getEndereco());
        numeroTextField.setText(paciente.getNumero());
        cepTextField.setText(paciente.getCep());
        bairroTextField.setText(paciente.getBairro());
        complementoTextField.setText(paciente.getComplemento());
        configurarDataVacinacao();
        setLocationRelativeTo(null);

    }
    //Horario e confirmacao de Vac

    private void configurarDataVacinacao() {
        Date agora = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String s = sdf.format(agora);
        dataVacinacaoTextField.setText(s);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        prioridadeTextField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        label2 = new java.awt.Label();
        numeroTextField = new javax.swing.JTextField();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        enderecoTextField = new javax.swing.JTextField();
        cepTextField = new javax.swing.JTextField();
        bairroTextField = new javax.swing.JTextField();
        complementoTextField = new javax.swing.JTextField();
        label10 = new java.awt.Label();
        jPanel7 = new javax.swing.JPanel();
        label7 = new java.awt.Label();
        label8 = new java.awt.Label();
        data1CheckBox = new javax.swing.JCheckBox();
        dataVacinacaoTextField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        idadeTextField3 = new javax.swing.JTextField();
        sexoTextFIeld = new javax.swing.JTextField();
        cpfTextField = new javax.swing.JFormattedTextField();
        telefoneTextField = new javax.swing.JFormattedTextField();
        nomeTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        sexoTextField1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela De Cadastro");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CPF:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        jLabel1.setBackground(new java.awt.Color(7, 87, 117));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Visualização de cadastro");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 795, 36));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefone:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        prioridadeTextField.setEditable(false);
        prioridadeTextField.setBackground(new java.awt.Color(255, 255, 255));
        prioridadeTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        prioridadeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prioridadeTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(prioridadeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 200, 30));

        jPanel3.setBackground(new java.awt.Color(7, 87, 117));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 420, -1, 50));

        jPanel6.setBackground(new java.awt.Color(7, 87, 117));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        label2.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("Numero:");

        numeroTextField.setEditable(false);
        numeroTextField.setBackground(new java.awt.Color(255, 255, 255));
        numeroTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroTextFieldActionPerformed(evt);
            }
        });

        label3.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("Bairro:");

        label4.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setText("CEP:");

        label5.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        label5.setForeground(new java.awt.Color(255, 255, 255));
        label5.setText("Endereço:");

        enderecoTextField.setEditable(false);
        enderecoTextField.setBackground(new java.awt.Color(255, 255, 255));
        enderecoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoTextFieldActionPerformed(evt);
            }
        });

        cepTextField.setEditable(false);
        cepTextField.setBackground(new java.awt.Color(255, 255, 255));
        cepTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cepTextFieldActionPerformed(evt);
            }
        });

        bairroTextField.setEditable(false);
        bairroTextField.setBackground(new java.awt.Color(255, 255, 255));
        bairroTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bairroTextFieldActionPerformed(evt);
            }
        });

        complementoTextField.setEditable(false);
        complementoTextField.setBackground(new java.awt.Color(255, 255, 255));
        complementoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complementoTextFieldActionPerformed(evt);
            }
        });

        label10.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        label10.setForeground(new java.awt.Color(255, 255, 255));
        label10.setText("Complemento:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bairroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(complementoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label5, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(numeroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enderecoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                            .addComponent(cepTextField))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enderecoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(numeroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cepTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bairroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addComponent(complementoTextField)))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 406, -1));

        jPanel7.setBackground(new java.awt.Color(7, 87, 117));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        label7.setAlignment(java.awt.Label.CENTER);
        label7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        label7.setForeground(new java.awt.Color(255, 255, 255));
        label7.setText("DATA DE VACINAÇÃO:");

        label8.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        label8.setForeground(new java.awt.Color(255, 255, 255));
        label8.setText("Data");

        data1CheckBox.setBackground(new java.awt.Color(7, 87, 117));
        data1CheckBox.setForeground(new java.awt.Color(255, 255, 255));
        data1CheckBox.setText("Vacina aplicada");
        data1CheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data1CheckBoxActionPerformed(evt);
            }
        });

        dataVacinacaoTextField.setBackground(new java.awt.Color(255, 255, 255));
        dataVacinacaoTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dataVacinacaoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataVacinacaoTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dataVacinacaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(data1CheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addComponent(label7, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(data1CheckBox)
                        .addComponent(dataVacinacaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89))
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 410, 80));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        idadeTextField3.setEditable(false);
        idadeTextField3.setBackground(new java.awt.Color(255, 255, 255));
        idadeTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        idadeTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idadeTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(idadeTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 200, 30));

        sexoTextFIeld.setEditable(false);
        sexoTextFIeld.setBackground(new java.awt.Color(255, 255, 255));
        sexoTextFIeld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexoTextFIeldActionPerformed(evt);
            }
        });
        jPanel1.add(sexoTextFIeld, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 200, 30));

        cpfTextField.setEditable(false);
        cpfTextField.setBackground(new java.awt.Color(255, 255, 255));
        try {
            cpfTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(cpfTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 200, 30));

        telefoneTextField.setEditable(false);
        telefoneTextField.setBackground(new java.awt.Color(255, 255, 255));
        try {
            telefoneTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(telefoneTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 200, 30));

        nomeTextField1.setEditable(false);
        nomeTextField1.setBackground(new java.awt.Color(255, 255, 255));
        nomeTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(nomeTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 200, 25));

        jLabel6.setBackground(new java.awt.Color(255, 255, 204));
        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Idade:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Prioridade");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Sexo:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, -1));

        sexoTextField1.setBackground(new java.awt.Color(0, 0, 0));
        sexoTextField1.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        sexoTextField1.setForeground(new java.awt.Color(255, 255, 255));
        sexoTextField1.setIcon(new javax.swing.ImageIcon("C:\\Users\\guilh\\OneDrive\\Projetos Netbeans\\Projeto3\\src\\main\\java\\Imagens\\Virus central.jpg")); // NOI18N
        jPanel1.add(sexoTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void complementoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complementoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_complementoTextFieldActionPerformed

    private void bairroTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bairroTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bairroTextFieldActionPerformed

    private void cepTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cepTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cepTextFieldActionPerformed

    private void enderecoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoTextFieldActionPerformed

    private void numeroTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroTextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Confirmar vacinação e ajustar dados no BD
        String endereco = enderecoTextField.getText();
        String nome = nomeTextField1.getText();
        String cpf = cpfTextField.getText();
        String telefone = telefoneTextField.getText();
        int idade = Integer.parseInt(idadeTextField3.getText());
        String sexo = sexoTextFIeld.getText();
        int prioridade = Integer.parseInt(prioridadeTextField.getText());
        String numero = numeroTextField.getText();
        String cep = cepTextField.getText();
        String bairro = bairroTextField.getText();
        String complemento = complementoTextField.getText();
        String data;
        if (data1CheckBox.isSelected()) {
            data = dataVacinacaoTextField.getText();
            Pessoa p = new Pessoa(nome, idade, endereco, data, prioridade, sexo, cep,
                    numero, bairro, complemento, telefone, cpf);

            try {
                p.inserirPacienteVacinado();
                //Necessário outro método para remover da fila antiga do BD
                DAO dao = new DAO();
                dao.apagarPessoaVacinada(cpf);
                FilaDeVacinacaoAdm filaadm = new FilaDeVacinacaoAdm();
                filaadm.setVisible(true);
                setLocationRelativeTo(null);
                this.dispose();
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Falha na conexão com o banco de dados");
            }
        } else {
            data = "Não vacinado";
            JOptionPane.showMessageDialog(null, "Por favor, confirme a vacinação (CheckBox) ou retorne a fila de vacinação para cancelar.");
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void prioridadeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prioridadeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prioridadeTextFieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        FilaDeVacinacaoAdm voltarFichaAdmMestre = new FilaDeVacinacaoAdm();

        voltarFichaAdmMestre.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void nomeTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTextField1ActionPerformed

    private void idadeTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idadeTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idadeTextField3ActionPerformed

    private void dataVacinacaoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataVacinacaoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataVacinacaoTextFieldActionPerformed

    private void data1CheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data1CheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_data1CheckBoxActionPerformed

    private void sexoTextFIeldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexoTextFIeldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexoTextFIeldActionPerformed

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
                new TelaPesquisaPessoa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bairroTextField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JTextField cepTextField;
    private javax.swing.JTextField complementoTextField;
    private javax.swing.JFormattedTextField cpfTextField;
    private javax.swing.JCheckBox data1CheckBox;
    private javax.swing.JTextField dataVacinacaoTextField;
    private javax.swing.JTextField enderecoTextField;
    private javax.swing.JTextField idadeTextField3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private java.awt.Label label10;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private javax.swing.JTextField nomeTextField1;
    private javax.swing.JTextField numeroTextField;
    private javax.swing.JTextField prioridadeTextField;
    private javax.swing.JTextField sexoTextFIeld;
    private javax.swing.JLabel sexoTextField1;
    private javax.swing.JFormattedTextField telefoneTextField;
    // End of variables declaration//GEN-END:variables
}
