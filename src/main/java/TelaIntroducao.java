
public class TelaIntroducao extends javax.swing.JFrame {

    public TelaIntroducao() {
        initComponents();
        setLocationRelativeTo(null);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextPane2.setBackground(new java.awt.Color(7, 87, 117));
        jTextPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextPane2.setForeground(new java.awt.Color(255, 255, 255));
        jTextPane2.setText("Queremos agradecer especialemnte nossos professores tutores :   Andrea Machion, Rodrigo Bossini e Hamilton Machiti. Pelo apoio, pasciência e ______.\n");
        jScrollPane2.setViewportView(jTextPane2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 330, 70));

        jTextPane3.setBackground(new java.awt.Color(7, 87, 117));
        jTextPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextPane3.setForeground(new java.awt.Color(255, 255, 255));
        jTextPane3.setText("      A tecleJa(va) foi um projeto idealizado por 8 alunos da Universidade Sao Judas Tadeu. Ela nasceu com o proposito de solucionar e  ajudar profissionais da saúde  trazendo maior facilidade, visibilidade e eficiência. O Software é constituido de um Banco de dados (MYSQL) no qual, somente os administradores tem acesso. O banco de dados, ira armazenar somente as informações necessárias como: Nome, CPF,  idade, Telefone, Endereço, sexo e se trabalha na area da saúde. O Software terá ligação direta com o SGBD.\n");
        jScrollPane3.setViewportView(jTextPane3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 330, 150));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 0, 330, 170));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\OneDrive\\Projetos Netbeans\\Projeto3\\src\\main\\java\\Imagens\\virus bonito.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaIntroducao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaIntroducao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaIntroducao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaIntroducao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaIntroducao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    // End of variables declaration//GEN-END:variables
}
