
package lista03_questão03;

public class Interface extends javax.swing.JFrame {

    public Interface() {
        initComponents();
        jB_enviar.setEnabled(false);
        Formulario.setVisible(false);
        setSize(420,230);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jT_Idade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jL_Reultado = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Formulario = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jT_Nome = new javax.swing.JTextField();
        jT_Endereco = new javax.swing.JTextField();
        jT_Cidade = new javax.swing.JTextField();
        Sim = new javax.swing.JRadioButton();
        Não = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jT_Estado = new javax.swing.JTextField();
        jB_Cancelar = new javax.swing.JButton();
        jB_enviar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Verificador de Alistamento Militar");

        jLabel2.setText("Idade:");

        jT_Idade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_IdadeActionPerformed(evt);
            }
        });

        jLabel3.setText("Você está:");

        jL_Reultado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jL_Reultado.setText("<resposta>");

        jLabel6.setText("ao alistamento militar");

        jLabel7.setText("Nome:");

        jLabel8.setText("Endereço:");

        jLabel9.setText("Cidade:");

        buttonGroup1.add(Sim);
        Sim.setText("Voluntário");

        buttonGroup1.add(Não);
        Não.setText("Não Voluntário");

        jLabel10.setText("Estado:");

        javax.swing.GroupLayout FormularioLayout = new javax.swing.GroupLayout(Formulario);
        Formulario.setLayout(FormularioLayout);
        FormularioLayout.setHorizontalGroup(
            FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormularioLayout.createSequentialGroup()
                        .addComponent(Sim)
                        .addGap(18, 18, 18)
                        .addComponent(Não)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(FormularioLayout.createSequentialGroup()
                        .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jT_Nome)
                            .addGroup(FormularioLayout.createSequentialGroup()
                                .addComponent(jT_Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jT_Estado, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                            .addComponent(jT_Endereco))))
                .addContainerGap())
        );
        FormularioLayout.setVerticalGroup(
            FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jT_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jT_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jT_Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jT_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sim)
                    .addComponent(Não))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jB_Cancelar.setText("Cancel");
        jB_Cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_CancelarMouseClicked(evt);
            }
        });

        jB_enviar.setText("Enviar");
        jB_enviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_enviarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Formulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jT_Idade))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jL_Reultado)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jB_Cancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jB_enviar)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jT_Idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jL_Reultado)
                    .addComponent(jLabel6))
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(Formulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_Cancelar)
                    .addComponent(jB_enviar))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jT_IdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_IdadeActionPerformed
        String str_idade = jT_Idade.getText();
        int idade = Integer.parseInt(str_idade);
        
        if (idade >= 17)
        {
          jL_Reultado.setText("APTO");
          jB_enviar.setEnabled(true);
          Formulario.setVisible(true);
          setSize(420, 380);
        }
        else
        {
          jL_Reultado.setText("NÃO APTO");
          jB_enviar.setEnabled(false);
          Formulario.setVisible(false);
          jT_Idade.setText("");
          setSize(420,230);
        }    
    }//GEN-LAST:event_jT_IdadeActionPerformed

    private void jB_enviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_enviarMouseClicked
          String nome = jT_Nome.getText();
          String endereço = jT_Endereco.getText();
          String cidade = jT_Cidade.getText();
          String estado = jT_Estado.getText();

          String voluntario = "";
          if(Sim.isSelected())//se a opção de não voluntário foi selecionado apresente o não foi selecionado
          {
              voluntario = "Não";
          }
          if(Não.isSelected())
          {
              voluntario = "Sim";
          }
        
          System.out.println("Nome: "+nome);
          System.out.println("Endereço: "+endereço);
          System.out.println("Cidade: "+cidade);
          System.out.println("Estado: "+estado);
          System.out.println("É Voluntário? "+voluntario);
    }//GEN-LAST:event_jB_enviarMouseClicked

    private void jB_CancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_CancelarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jB_CancelarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Formulario;
    private javax.swing.JRadioButton Não;
    private javax.swing.JRadioButton Sim;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jB_Cancelar;
    private javax.swing.JButton jB_enviar;
    private javax.swing.JLabel jL_Reultado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jT_Cidade;
    private javax.swing.JTextField jT_Endereco;
    private javax.swing.JTextField jT_Estado;
    private javax.swing.JTextField jT_Idade;
    private javax.swing.JTextField jT_Nome;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
