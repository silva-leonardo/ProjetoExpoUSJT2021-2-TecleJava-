
import javax.swing.JOptionPane;

public class TelaDeCadastroAdmSec extends javax.swing.JFrame {

    public TelaDeCadastroAdmSec() {
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
        jPanel2 = new javax.swing.JPanel();
        fmRadioButton = new javax.swing.JRadioButton();
        fsRadioButton = new javax.swing.JRadioButton();
        nomeTextField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        ssRadioButton = new javax.swing.JRadioButton();
        nsRadioButton = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        label2 = new java.awt.Label();
        numeroTextField = new javax.swing.JTextField();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        enderecoTextField = new javax.swing.JTextField();
        bairroTextField = new javax.swing.JTextField();
        complementoTextField = new javax.swing.JTextField();
        label10 = new java.awt.Label();
        cepTextField = new javax.swing.JFormattedTextField();
        jButton2 = new javax.swing.JButton();
        telefoneTextField = new javax.swing.JFormattedTextField();
        cpfTextField = new javax.swing.JFormattedTextField();
        idadeTextField = new javax.swing.JTextField();
        label1 = new java.awt.Label();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();
        label8 = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela De Cadastro");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Pessoas");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 795, 36));

        jPanel2.setBackground(new java.awt.Color(7, 87, 117));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sexo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N

        fmRadioButton.setBackground(new java.awt.Color(7, 87, 117));
        buttonGroup1.add(fmRadioButton);
        fmRadioButton.setText("Masculino");
        fmRadioButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        fmRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fmRadioButtonActionPerformed(evt);
            }
        });

        fsRadioButton.setBackground(new java.awt.Color(7, 87, 117));
        buttonGroup1.add(fsRadioButton);
        fsRadioButton.setText("Feminino");
        fsRadioButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        fsRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fsRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fmRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(fsRadioButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fsRadioButton)
                .addGap(11, 11, 11)
                .addComponent(fmRadioButton)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 180, 90));

        nomeTextField.setBackground(new java.awt.Color(255, 255, 255));
        nomeTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nomeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(nomeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 200, 30));

        jPanel3.setBackground(new java.awt.Color(7, 87, 117));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 400, -1, 50));

        jPanel5.setBackground(new java.awt.Color(7, 87, 117));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Trabalha na Área Da Saúde?", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 1, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        ssRadioButton.setBackground(new java.awt.Color(7, 87, 117));
        buttonGroup2.add(ssRadioButton);
        ssRadioButton.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        ssRadioButton.setText("Sim");
        ssRadioButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ssRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ssRadioButtonActionPerformed(evt);
            }
        });

        nsRadioButton.setBackground(new java.awt.Color(7, 87, 117));
        buttonGroup2.add(nsRadioButton);
        nsRadioButton.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        nsRadioButton.setSelected(true);
        nsRadioButton.setText("Não");
        nsRadioButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ssRadioButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nsRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ssRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(nsRadioButton)
                .addContainerGap())
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, -1, 90));

        jPanel6.setBackground(new java.awt.Color(7, 87, 117));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        label2.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("Numero:");

        numeroTextField.setBackground(new java.awt.Color(255, 255, 255));
        numeroTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
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

        enderecoTextField.setBackground(new java.awt.Color(255, 255, 255));
        enderecoTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        enderecoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoTextFieldActionPerformed(evt);
            }
        });

        bairroTextField.setBackground(new java.awt.Color(255, 255, 255));
        bairroTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bairroTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bairroTextFieldActionPerformed(evt);
            }
        });

        complementoTextField.setBackground(new java.awt.Color(255, 255, 255));
        complementoTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        complementoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complementoTextFieldActionPerformed(evt);
            }
        });

        label10.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        label10.setForeground(new java.awt.Color(255, 255, 255));
        label10.setText("Complemento:");

        cepTextField.setBackground(new java.awt.Color(255, 255, 255));
        try {
            cepTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cepTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cepTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bairroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(complementoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 52, 406, 210));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        telefoneTextField.setBackground(new java.awt.Color(255, 255, 255));
        try {
            telefoneTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefoneTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(telefoneTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 200, 30));

        cpfTextField.setBackground(new java.awt.Color(255, 255, 255));
        try {
            cpfTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpfTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(cpfTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 200, 30));

        idadeTextField.setBackground(new java.awt.Color(255, 255, 255));
        idadeTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(idadeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 200, 30));

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(new java.awt.Color(7, 87, 117));
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Idade");
        jPanel1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 200, -1));

        label6.setAlignment(java.awt.Label.CENTER);
        label6.setBackground(new java.awt.Color(7, 87, 117));
        label6.setForeground(new java.awt.Color(255, 255, 255));
        label6.setText("Nome");
        jPanel1.add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 200, -1));

        label7.setAlignment(java.awt.Label.CENTER);
        label7.setBackground(new java.awt.Color(7, 87, 117));
        label7.setForeground(new java.awt.Color(255, 255, 255));
        label7.setText("CPF");
        jPanel1.add(label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 200, -1));

        label8.setAlignment(java.awt.Label.CENTER);
        label8.setBackground(new java.awt.Color(7, 87, 117));
        label8.setForeground(new java.awt.Color(255, 255, 255));
        label8.setText("Telefone");
        jPanel1.add(label8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 200, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\guilh\\OneDrive\\Projetos Netbeans\\Projeto3\\src\\main\\java\\Imagens\\logo.png")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, 30, 430, 250));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\guilh\\OneDrive\\Projetos Netbeans\\Projeto3\\src\\main\\java\\Imagens\\TelaDeCadastroGeral.jpg")); // NOI18N
        jLabel7.setToolTipText("");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void complementoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complementoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_complementoTextFieldActionPerformed

    private void bairroTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bairroTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bairroTextFieldActionPerformed

    private void enderecoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoTextFieldActionPerformed

    private void numeroTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroTextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nome = null, cpf = null, endereco = null, numero = null, cep = null, bairro = null, complemento = null, telefone = null, sexo = null;
        int idade = 0, prioridade = 0, saude = 0;
        nome = nomeTextField.getText();
        idade = Integer.parseInt(idadeTextField.getText());
        cpf = cpfTextField.getText();
        endereco = enderecoTextField.getText();
        numero = numeroTextField.getText();
        cep = cepTextField.getText();
        bairro = cepTextField.getText();
        complemento = complementoTextField.getText();
        telefone = telefoneTextField.getText();
        idade = Integer.parseInt(idadeTextField.getText());
        //Seleção de sexo
        if (fsRadioButton.isSelected()) {
            sexo = "feminino";
        } else {
            sexo = "masculino";
        }

        //Trabalha na saúde
        if (ssRadioButton.isSelected()) {
            saude = 1;
        } else {
            saude = 0;
        }

        if (idade >= 70) {
            prioridade = 1;
        } else if (saude == 1) {
            prioridade = 2;
        } else {
            prioridade = 3;
        }

        try {
            Pessoa p = new Pessoa(nome, idade, cpf, prioridade, saude, endereco, cep, numero, bairro, complemento, telefone, sexo);
            DAO dao = new DAO();
            dao.inserirPaciente1Dose(nome, idade, saude, cpf, endereco, cep, numero, bairro, complemento, telefone, prioridade, sexo);

        } catch (Exception e) {
            e.printStackTrace();

        }

        int result = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outra pessoa?", null, JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            TelaDeCadastroAdmSec telaNovoCadastro = new TelaDeCadastroAdmSec();
            telaNovoCadastro.setVisible(true);
            setLocationRelativeTo(null);
            this.dispose();
        } else {
            TelaAdmSec voltaPainelAdmSec = new TelaAdmSec();
            voltaPainelAdmSec.setVisible(true);
            this.dispose();
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void nomeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTextFieldActionPerformed

    private void fsRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fsRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fsRadioButtonActionPerformed

    private void fmRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fmRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fmRadioButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TelaAdmSec VoltarAdmSec = new TelaAdmSec();

        VoltarAdmSec.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ssRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ssRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ssRadioButtonActionPerformed

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
                new TelaDeCadastro().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bairroTextField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JFormattedTextField cepTextField;
    private javax.swing.JTextField complementoTextField;
    private javax.swing.JFormattedTextField cpfTextField;
    private javax.swing.JTextField enderecoTextField;
    private javax.swing.JRadioButton fmRadioButton;
    private javax.swing.JRadioButton fsRadioButton;
    private javax.swing.JTextField idadeTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private java.awt.Label label1;
    private java.awt.Label label10;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JRadioButton nsRadioButton;
    private javax.swing.JTextField numeroTextField;
    private javax.swing.JRadioButton ssRadioButton;
    private javax.swing.JFormattedTextField telefoneTextField;
    // End of variables declaration//GEN-END:variables
}
