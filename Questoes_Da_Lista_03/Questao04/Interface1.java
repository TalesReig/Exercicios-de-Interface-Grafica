
package lista03_questão05;

public class Interface1 extends javax.swing.JFrame {

    int qntMax;
    int acumulador;
    double valorFinal;
    
    public Interface1() {
        valorFinal = 0;
        initComponents();
        DesabilitarCheckB();
        DesabilitarCheckBorda();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        rb_pequena = new javax.swing.JRadioButton();
        rb_media = new javax.swing.JRadioButton();
        rb_grande = new javax.swing.JRadioButton();
        rb_gigante = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        Panel_Sabores = new javax.swing.JPanel();
        Sabor1 = new javax.swing.JCheckBox();
        Sabor2 = new javax.swing.JCheckBox();
        Sabor3 = new javax.swing.JCheckBox();
        Sabor4 = new javax.swing.JCheckBox();
        Sabor5 = new javax.swing.JCheckBox();
        Sabor6 = new javax.swing.JCheckBox();
        Sabor7 = new javax.swing.JCheckBox();
        Sabor8 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jRb_borda1 = new javax.swing.JRadioButton();
        jRb_borda2 = new javax.swing.JRadioButton();
        jRb_borda3 = new javax.swing.JRadioButton();
        jRb_borda4 = new javax.swing.JRadioButton();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Suco = new javax.swing.JRadioButton();
        Refri = new javax.swing.JRadioButton();
        nada = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setHorizontalScrollBar(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Albi's Pizzaria");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Sistema de Pedidos Online");

        buttonGroup1.add(rb_pequena);
        rb_pequena.setText("Pequena (R$ 25,00)");
        rb_pequena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_pequenaMouseClicked(evt);
            }
        });

        buttonGroup1.add(rb_media);
        rb_media.setText("Média (R$ 45,00)");
        rb_media.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_mediaMouseClicked(evt);
            }
        });

        buttonGroup1.add(rb_grande);
        rb_grande.setText("Grande (R$ 60,00)");
        rb_grande.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_grandeMouseClicked(evt);
            }
        });

        buttonGroup1.add(rb_gigante);
        rb_gigante.setText("Gigante (R$ 75,00)");
        rb_gigante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_giganteMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Escolha Os Sabores:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb_media)
                    .addComponent(rb_pequena)
                    .addComponent(jLabel4)
                    .addComponent(rb_grande)
                    .addComponent(rb_gigante))
                .addGap(55, 266, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addComponent(rb_pequena)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rb_media)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rb_grande)
                .addGap(5, 5, 5)
                .addComponent(rb_gigante))
        );

        Sabor1.setText("Alho e Óleo");
        Sabor1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Sabor1ItemStateChanged(evt);
            }
        });

        Sabor2.setText("Calabresa");
        Sabor2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Sabor2ItemStateChanged(evt);
            }
        });

        Sabor3.setText("Coração");
        Sabor3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Sabor3ItemStateChanged(evt);
            }
        });

        Sabor4.setText("4 Queijos");
        Sabor4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Sabor4ItemStateChanged(evt);
            }
        });

        Sabor5.setText("Frango com Catupiry");
        Sabor5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Sabor5ItemStateChanged(evt);
            }
        });

        Sabor6.setText("Camrão (+R$ 10.00)");
        Sabor6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Sabor6ItemStateChanged(evt);
            }
        });

        Sabor7.setText("Salmão (+R$ 15.00)");
        Sabor7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Sabor7ItemStateChanged(evt);
            }
        });

        Sabor8.setText("Filé (+R$ 20.00)");
        Sabor8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Sabor8ItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Escolha Os Sabores:");

        javax.swing.GroupLayout Panel_SaboresLayout = new javax.swing.GroupLayout(Panel_Sabores);
        Panel_Sabores.setLayout(Panel_SaboresLayout);
        Panel_SaboresLayout.setHorizontalGroup(
            Panel_SaboresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_SaboresLayout.createSequentialGroup()
                .addGroup(Panel_SaboresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_SaboresLayout.createSequentialGroup()
                        .addGroup(Panel_SaboresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Sabor1)
                            .addComponent(Sabor2)
                            .addComponent(Sabor3)
                            .addComponent(Sabor4))
                        .addGap(82, 82, 82)
                        .addGroup(Panel_SaboresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Sabor8)
                            .addComponent(Sabor7)
                            .addComponent(Sabor6)
                            .addComponent(Sabor5)))
                    .addComponent(jLabel3))
                .addGap(0, 144, Short.MAX_VALUE))
        );
        Panel_SaboresLayout.setVerticalGroup(
            Panel_SaboresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_SaboresLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_SaboresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sabor1)
                    .addComponent(Sabor5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_SaboresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sabor2)
                    .addComponent(Sabor6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_SaboresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sabor3)
                    .addComponent(Sabor7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_SaboresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sabor4)
                    .addComponent(Sabor8)))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Escolha a BORDA: (+R$ 8,00)");

        buttonGroup2.add(jRb_borda1);
        jRb_borda1.setText("Catupiry");
        jRb_borda1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRb_borda1ItemStateChanged(evt);
            }
        });

        buttonGroup2.add(jRb_borda2);
        jRb_borda2.setText("Cheedar");
        jRb_borda2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRb_borda2ItemStateChanged(evt);
            }
        });

        buttonGroup2.add(jRb_borda3);
        jRb_borda3.setText("Chocolate");
        jRb_borda3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRb_borda3ItemStateChanged(evt);
            }
        });

        buttonGroup2.add(jRb_borda4);
        jRb_borda4.setText("Sem Borda");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jRb_borda2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRb_borda4))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jRb_borda1)
                            .addGap(73, 73, 73)
                            .addComponent(jRb_borda3))))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRb_borda1)
                    .addComponent(jRb_borda3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRb_borda4)
                    .addComponent(jRb_borda2))
                .addGap(20, 20, 20))
        );

        jLabel6.setText("Escolha a BEBIDA: ");

        buttonGroup3.add(Suco);
        Suco.setText("Suco (+ R$ 5,00)");
        Suco.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                SucoItemStateChanged(evt);
            }
        });

        buttonGroup3.add(Refri);
        Refri.setText("Refrigerante 2L (+RS 8,00)");
        Refri.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                RefriItemStateChanged(evt);
            }
        });

        buttonGroup3.add(nada);
        nada.setText("Nenhuma");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Refri)
                    .addComponent(nada)
                    .addComponent(Suco))
                .addContainerGap(228, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Refri)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Suco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nada))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Panel_Sabores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel_Sabores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        jButton1.setText("ENVIAR PEDIDO");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel7.setText("Total a Pagar:");

        total.setText("0.0 R$");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton1))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(total))
                .addGap(15, 15, 15)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rb_pequenaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_pequenaMouseClicked
        qntMax = 1;
        DesmarcarTodos();
        HabilitarCheckB();
        HabilitarCheckBorda();
        valorFinal = 25;
        String str_valorFinal = String.valueOf(valorFinal);
        total.setText(str_valorFinal);
    }//GEN-LAST:event_rb_pequenaMouseClicked

    private void rb_mediaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_mediaMouseClicked
        qntMax = 2;
        DesmarcarTodos();
        HabilitarCheckB();
        HabilitarCheckBorda();
        valorFinal = 45;
        String str_valorFinal = String.valueOf(valorFinal);
        total.setText(str_valorFinal);
    }//GEN-LAST:event_rb_mediaMouseClicked

    private void rb_grandeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_grandeMouseClicked
        qntMax = 3;
        DesmarcarTodos();
        HabilitarCheckB();
        HabilitarCheckBorda();
        valorFinal = 60;
        String str_valorFinal = String.valueOf(valorFinal);
        total.setText(str_valorFinal);
    }//GEN-LAST:event_rb_grandeMouseClicked

    
    private void Sabor1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Sabor1ItemStateChanged
        if(Sabor1.isSelected()== true){
            acumulador++;
        }else if(Sabor1.isSelected()== false){
            acumulador--;
        }
        if(acumulador == qntMax){
            DesabilitarCheckB();
        }
    }//GEN-LAST:event_Sabor1ItemStateChanged

    private void Sabor2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Sabor2ItemStateChanged
        if(Sabor2.isSelected()== true){
            acumulador++;
        }else if(Sabor2.isSelected()== false){
            acumulador--;
        }

        if(acumulador == qntMax){
            DesabilitarCheckB();
        }
    }//GEN-LAST:event_Sabor2ItemStateChanged

    private void Sabor3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Sabor3ItemStateChanged
        if(Sabor3.isSelected()== true){
            acumulador++;
        }else if(Sabor3.isSelected()== false){
            acumulador--;
        }
        if(acumulador == qntMax){
            DesabilitarCheckB();
        }
    }//GEN-LAST:event_Sabor3ItemStateChanged

    private void Sabor4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Sabor4ItemStateChanged
        if(Sabor4.isSelected()== true){
            acumulador++;
        }else if(Sabor4.isSelected()== false){
            acumulador--;
        }
        if(acumulador == qntMax){
            DesabilitarCheckB();
        }
    }//GEN-LAST:event_Sabor4ItemStateChanged

    private void Sabor5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Sabor5ItemStateChanged
        if(Sabor5.isSelected()== true){
            acumulador++;
        }else if(Sabor5.isSelected()== false){
            acumulador--;
        }
        if(acumulador == qntMax){
            DesabilitarCheckB();
        }
    }//GEN-LAST:event_Sabor5ItemStateChanged

    private void Sabor6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Sabor6ItemStateChanged
        if(Sabor6.isSelected()== true){
            acumulador++;
            valorFinal = valorFinal + 10;
        }else if(Sabor6.isSelected()== false){
            acumulador--;
        }
        if(acumulador == qntMax){
            DesabilitarCheckB();
        }
        String str_valorFinal = String.valueOf(valorFinal);
        total.setText(str_valorFinal);
    }//GEN-LAST:event_Sabor6ItemStateChanged

    private void Sabor7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Sabor7ItemStateChanged
        if(Sabor7.isSelected()== true){
            acumulador++;
             valorFinal = valorFinal + 15;
        }else if(Sabor7.isSelected()== false){
            acumulador--;
        }
        if(acumulador == qntMax){
            DesabilitarCheckB();
        }
        String str_valorFinal = String.valueOf(valorFinal);
        total.setText(str_valorFinal);
    }//GEN-LAST:event_Sabor7ItemStateChanged

    private void Sabor8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Sabor8ItemStateChanged
        if(Sabor8.isSelected()== true){
            acumulador++;
             valorFinal = valorFinal + 20;
        }else if(Sabor8.isSelected()== false){
            acumulador--;
        }
        if(acumulador == qntMax){
            DesabilitarCheckB();
        }
        String str_valorFinal = String.valueOf(valorFinal);
        total.setText(str_valorFinal);
    }//GEN-LAST:event_Sabor8ItemStateChanged

    private void rb_giganteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_giganteMouseClicked
        valorFinal = 75;                                   
        qntMax = 4;
        DesmarcarTodos();
        HabilitarCheckB();
        HabilitarCheckBorda();
        String str_valorFinal = String.valueOf(valorFinal);
        total.setText(str_valorFinal);
    }//GEN-LAST:event_rb_giganteMouseClicked

    private void jRb_borda1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRb_borda1ItemStateChanged
        if(jRb_borda1.isSelected()== true){
            valorFinal = valorFinal + 8;
        }else if(jRb_borda1.isSelected()== false){
            valorFinal = valorFinal - 8;
        }
        String str_valorFinal = String.valueOf(valorFinal);
        total.setText(str_valorFinal);
    }//GEN-LAST:event_jRb_borda1ItemStateChanged

    private void jRb_borda2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRb_borda2ItemStateChanged
        if(jRb_borda2.isSelected()== true){
            valorFinal = valorFinal + 8;
        }else if(jRb_borda2.isSelected()== false){
            valorFinal = valorFinal - 8;
        }
        String str_valorFinal = String.valueOf(valorFinal);
        total.setText(str_valorFinal);
    }//GEN-LAST:event_jRb_borda2ItemStateChanged

    private void jRb_borda3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRb_borda3ItemStateChanged
        if(jRb_borda3.isSelected()== true){
            valorFinal = valorFinal + 8;
        }else if(jRb_borda3.isSelected()== false){
            valorFinal = valorFinal - 8;
        }
        String str_valorFinal = String.valueOf(valorFinal);
        total.setText(str_valorFinal);
    }//GEN-LAST:event_jRb_borda3ItemStateChanged

    private void RefriItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_RefriItemStateChanged
        if(Refri.isSelected()== true){
            valorFinal = valorFinal + 8;
        }else if(Refri.isSelected()== false){
            valorFinal = valorFinal - 8;
        }
        String str_valorFinal = String.valueOf(valorFinal);
        total.setText(str_valorFinal);
    }//GEN-LAST:event_RefriItemStateChanged

    private void SucoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_SucoItemStateChanged
        if(Suco.isSelected()== true){
            valorFinal = valorFinal + 5;
        }else if(Suco.isSelected()== false){
            valorFinal = valorFinal - 5;
        }
        String str_valorFinal = String.valueOf(valorFinal);
        total.setText(str_valorFinal);
    }//GEN-LAST:event_SucoItemStateChanged

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String tamanho = RetornaTamanhoDaPizza();
        String Sabores = RetornaSaboresDaPizza();
        String Borda = RetornaBordaDaPizza();
        String Bebida = RetornaBebidaEscolhida();
        
        System.out.println("Tamanho da Pizza: "+tamanho);
        System.out.println("Sabores da Pizza:"+Sabores);
        System.out.println("Borda da Pizza:" +Borda);
        System.out.println("Bebida escolhida: "+Bebida);
        System.out.println("Valor Final: "+valorFinal);

              
    }//GEN-LAST:event_jButton1MouseClicked
    
    private String RetornaTamanhoDaPizza(){
        
        if(rb_pequena.isSelected()){
             return "Pequena"; 
          } else if(rb_media.isSelected()){
              return "Média"; 
          } else if(rb_grande.isSelected()){
              return "Grande"; 
          }else if(rb_gigante.isSelected()){
              return "Gigante"; 
          }
        
        return null;
    }
    
    private String RetornaSaboresDaPizza(){
        String Sabores = " ";
        if(Sabor1.isSelected())
            Sabores = Sabores +", "+ Sabor1.getText();
        if(Sabor2.isSelected())
            Sabores = Sabores +", "+ Sabor2.getText();
        
        if(Sabor3.isSelected())
            Sabores = Sabores +", "+Sabor3.getText();
        
        if(Sabor4.isSelected())
            Sabores = Sabores +", "+Sabor4.getText();
        
        if(Sabor5.isSelected())
            Sabores = Sabores +", "+Sabor5.getText();
        
        if(Sabor6.isSelected())
            Sabores = Sabores +", "+Sabor6.getText();
        
        if(Sabor7.isSelected())
            Sabores = Sabores+", "+Sabor7.getText();
        
        if(Sabor8.isSelected())
            Sabores = Sabores +", "+Sabor8.getText();
        
        return Sabores+".";
    }
    
    private String RetornaBordaDaPizza(){
        if(jRb_borda1.isSelected()){
             return "Catupiry"; 
          } else if(jRb_borda2.isSelected()){
              return "Cheedar"; 
          } else if(jRb_borda3.isSelected()){
              return "Chocolate"; 
          }else if(jRb_borda4.isSelected()){
              return "Nenhuma";
          }
        return null;
    }
    
    private String RetornaBebidaEscolhida(){
        if(Refri.isSelected()){
            return "Refri";
        }else if(Suco.isSelected()){
            return "Suco";
        }else if(nada.isSelected()){
            return "Nenhuma";
        }
        return null;
    }
    
    private void DesabilitarCheckB(){
        Sabor1.setEnabled(false);
        Sabor2.setEnabled(false);
        Sabor3.setEnabled(false);
        Sabor4.setEnabled(false);
        Sabor5.setEnabled(false);
        Sabor6.setEnabled(false);
        Sabor7.setEnabled(false);
        Sabor8.setEnabled(false);
    }
    
    private void DesabilitarCheckBorda(){
        jRb_borda1.setEnabled(false);
        jRb_borda2.setEnabled(false);
        jRb_borda3.setEnabled(false);
        jRb_borda4.setEnabled(false);     
    }
    
    private void HabilitarCheckBorda(){
        jRb_borda1.setEnabled(true);
        jRb_borda2.setEnabled(true);
        jRb_borda3.setEnabled(true);
        jRb_borda4.setEnabled(true);     
    }
        
    private void HabilitarCheckB(){
        Sabor1.setEnabled(true);
        Sabor2.setEnabled(true);
        Sabor3.setEnabled(true);
        Sabor4.setEnabled(true);
        Sabor5.setEnabled(true);
        Sabor6.setEnabled(true);
        Sabor7.setEnabled(true);
        Sabor8.setEnabled(true);
    }
        
    public void DesmarcarTodos(){
        Sabor1.setSelected(false);
        Sabor2.setSelected(false);
        Sabor3.setSelected(false);
        Sabor4.setSelected(false);
        Sabor5.setSelected(false);
        Sabor6.setSelected(false);
        Sabor7.setSelected(false);
        Sabor8.setSelected(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_Sabores;
    private javax.swing.JRadioButton Refri;
    private javax.swing.JCheckBox Sabor1;
    private javax.swing.JCheckBox Sabor2;
    private javax.swing.JCheckBox Sabor3;
    private javax.swing.JCheckBox Sabor4;
    private javax.swing.JCheckBox Sabor5;
    private javax.swing.JCheckBox Sabor6;
    private javax.swing.JCheckBox Sabor7;
    private javax.swing.JCheckBox Sabor8;
    private javax.swing.JRadioButton Suco;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRb_borda1;
    private javax.swing.JRadioButton jRb_borda2;
    private javax.swing.JRadioButton jRb_borda3;
    private javax.swing.JRadioButton jRb_borda4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JRadioButton nada;
    private javax.swing.JRadioButton rb_gigante;
    private javax.swing.JRadioButton rb_grande;
    private javax.swing.JRadioButton rb_media;
    private javax.swing.JRadioButton rb_pequena;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
