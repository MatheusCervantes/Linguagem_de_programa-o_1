package br.com.avaliacao_1.view;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import br.com.avaliacao_1.dto.CarroDTO;
import br.com.avaliacao_1.ctr.CarroCTR;

public class CarroVIEW extends javax.swing.JInternalFrame {

    
    CarroDTO carroDTO = new CarroDTO();
    CarroCTR carroCTR = new CarroCTR();
    
    int gravar_alterar;
    ResultSet rs;
    DefaultTableModel modelo_jtl_consultar_carro;
   
    public CarroVIEW() {
        initComponents();
        liberaCampos(false);
        liberaBotoes(true, false, false, false, true);
        modelo_jtl_consultar_carro = (DefaultTableModel) jtl_consultar_carro.getModel();
    }
    
    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }
    
    private void liberaCampos (boolean a) { //boolean com true(libera) false (bloqueia)
        renavam.setEnabled(a);
        modelo.setEnabled(a);
        chassi.setEnabled(a);
        ano.setEnabled(a);
        placa.setEnabled(a);
        cor.setEnabled(a);
        estado.setEnabled(a);
        proprietario.setEnabled(a);
        endereco.setEnabled(a);         
        cidade.setEnabled(a);
        bairro.setEnabled(a);
        cpf.setEnabled(a);
        cnh.setEnabled(a);
    }
    
    private void limpaCampos() {
        renavam.setText("");
        modelo.setText("");
        chassi.setText("");
        ano.setText("");
        placa.setText("");
        cor.setText("");
        proprietario.setText("");
        endereco.setText("");         
        cidade.setText("");
        bairro.setText("");
        cpf.setText("");
        cnh.setText("");
    }
    
    private void liberaBotoes (boolean a, boolean b, boolean c, boolean d, boolean e) {
        btnnovo.setEnabled(a);
        btnsalvar.setEnabled(b);
        btncancelar.setEnabled(c);
        btnexcluir.setEnabled(d);
        btnsair.setEnabled(e);
    }
    
    private void gravar() {
        try{
            carroDTO.setRenavam_car(renavam.getText());
            carroDTO.setModelo_car(modelo.getText());
            carroDTO.setChassi_car(chassi.getText());
            carroDTO.setAno_car(Integer.parseInt(ano.getText()));
            carroDTO.setPlaca_car(placa.getText());
            carroDTO.setCor_car(cor.getText());
            carroDTO.setPropietario_car(proprietario.getText());
            carroDTO.setEndereco_car(endereco.getText());
            carroDTO.setCidade_car(cidade.getText());
            carroDTO.setEstado_car(estado.getSelectedItem().toString());
            carroDTO.setBairro_car(bairro.getText());
            carroDTO.setCpf_car(cpf.getText());
            carroDTO.setCnh_car(cnh.getText());
            
            JOptionPane.showMessageDialog(null, carroCTR.inserircarro(carroDTO));
        }
        catch (Exception e) {
            System.out.println("Erro ao Gravar " + e.getMessage());
        }
    }
    
    private void preencherTabela(String renavam_car) {
        try {
            modelo_jtl_consultar_carro.setNumRows(0);
            carroDTO.setRenavam_car(renavam_car);
            rs = carroCTR.consultarcarro(carroDTO, 1);
            while (rs.next()) {
                modelo_jtl_consultar_carro.addRow(new Object[] {
                    rs.getString("id_car"),
                    rs.getString("renavam_car"),
                    rs.getString("modelo_car"),
                });
            }
        }
        catch (Exception erTab) {
            System.out.println("Erro SQL: " + erTab);
        }
        finally {
                carroCTR.CloseDB();;
        }
    }
    
    private void preencherCampos (int id_carro) {
        try {
            carroDTO.setId_car(id_carro);
            rs = carroCTR.consultarcarro(carroDTO, 2);
            if(rs.next()) {
                limpaCampos();
                renavam.setText(rs.getString("renavam_car"));
                modelo.setText(rs.getString("modelo_car"));
                chassi.setText(rs.getString("chassi_car"));               
                ano.setText(rs.getString("ano_car"));
                placa.setText(rs.getString("placa_car"));
                cor.setText(rs.getString("cor_car"));
                proprietario.setText(rs.getString("proprietario_car"));
                endereco.setText(rs.getString("endereco_car"));
                cidade.setText(rs.getString("cidade_car"));
                estado.setSelectedItem(rs.getString("estado_car"));
                bairro.setText(rs.getString("bairro_car"));
                cpf.setText(rs.getString("cpf_car"));
                cnh.setText(rs.getString("cnh_car"));
                
                gravar_alterar = 2;
                liberaCampos(true);
            }   
        }
        catch (Exception erTab) {
            System.out.println("Erro SQL: " + erTab);
        }
        finally {
            carroCTR.CloseDB();
        }
    }
    
    public void alterar () {
        try {
            carroDTO.setRenavam_car(renavam.getText());
            carroDTO.setModelo_car(modelo.getText());
            carroDTO.setChassi_car(chassi.getText());
            carroDTO.setAno_car(Integer.parseInt(ano.getText()));
            carroDTO.setPlaca_car(placa.getText());
            carroDTO.setCor_car(cor.getText());
            carroDTO.setPropietario_car(proprietario.getText());
            carroDTO.setEndereco_car(endereco.getText());
            carroDTO.setCidade_car(cidade.getText());
            carroDTO.setEstado_car(estado.getSelectedItem().toString());
            carroDTO.setBairro_car(bairro.getText());
            carroDTO.setCpf_car(cpf.getText());
            carroDTO.setCnh_car(cnh.getText());
            
            JOptionPane.showMessageDialog(null, carroCTR.alterarcarro(carroDTO));
        }
        catch (Exception e) {
            System.out.println("Erro ao Alterar " + e.getMessage());
        }
    }
    
    private void excluir() {
        if(JOptionPane.showConfirmDialog(null, "Deseja Realmente excluir o carro ? ", "Aviso",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            carroCTR.excluircarro(carroDTO);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnnovo = new javax.swing.JButton();
        btnsalvar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btncancelar = new javax.swing.JButton();
        modelo = new javax.swing.JTextField();
        btnsair = new javax.swing.JButton();
        chassi = new javax.swing.JTextField();
        btnexcluir = new javax.swing.JButton();
        ano = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        proprietario = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        renavampesquisa = new javax.swing.JTextField();
        cor = new javax.swing.JTextField();
        btnok = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtl_consultar_carro = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        endereco = new javax.swing.JTextField();
        bairro = new javax.swing.JTextField();
        cidade = new javax.swing.JTextField();
        cpf = new javax.swing.JTextField();
        cnh = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        estado = new javax.swing.JComboBox<>();
        renavam = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        placa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        btnnovo.setText("Novo");
        btnnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnovoActionPerformed(evt);
            }
        });

        btnsalvar.setText("Salvar");
        btnsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvarActionPerformed(evt);
            }
        });

        jLabel6.setText("Ano:");

        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        btnsair.setText("Sair");
        btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsairActionPerformed(evt);
            }
        });

        btnexcluir.setText("Excluir");
        btnexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcluirActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel15.setText("Consulta");

        jLabel16.setText("RENAVAM:");

        jLabel7.setText("Proprietário:");

        btnok.setText("OK");
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });

        jLabel8.setText("Endereço:");

        jtl_consultar_carro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "RENAVAM", "MODELO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtl_consultar_carro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtl_consultar_carroMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtl_consultar_carro);

        jLabel10.setText("Bairro:");

        jLabel11.setText("Cidade:");

        jLabel17.setText("CPF:");

        jLabel12.setText("Estado:");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Carro");

        estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        jLabel13.setText("CNH:");

        jLabel2.setText("RENAVAM:");

        jLabel14.setText("Placa:");

        jLabel3.setText("Cor:");

        jLabel4.setText("Chassi:");

        jLabel5.setText("Modelo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel14)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel10))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel13)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cnh)
                                    .addComponent(bairro)))
                            .addComponent(endereco)
                            .addComponent(proprietario)
                            .addComponent(cidade, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(renavam, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                            .addComponent(chassi)
                                            .addComponent(placa))
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel6)))
                                            .addComponent(jLabel5))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cor, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnsalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnexcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnsair, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addGap(91, 91, 91))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(renavampesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnok))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(renavam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(chassi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(renavampesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnok))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(cor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(proprietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(cnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnnovo)
                            .addComponent(btnsalvar)
                            .addComponent(btncancelar)
                            .addComponent(btnsair)
                            .addComponent(btnexcluir)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnovoActionPerformed
        liberaCampos(true);
        liberaBotoes(false, true, true, false, true);
        gravar_alterar = 1;
    }//GEN-LAST:event_btnnovoActionPerformed

    private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarActionPerformed
        if (gravar_alterar == 1) {
        gravar();
        gravar_alterar = 0;
        }
    else if (gravar_alterar==2) {
        alterar();
        gravar_alterar = 0;
    }
    else
        JOptionPane.showMessageDialog(null, "Erro no Sistema!!!");
    
        limpaCampos();
        liberaCampos(false);
        liberaBotoes(true, false, false, false, true);
    }//GEN-LAST:event_btnsalvarActionPerformed
    
    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        limpaCampos();
        liberaCampos(false);
        modelo_jtl_consultar_carro.setNumRows(0);
        liberaBotoes(true, false, false, false, true);
        gravar_alterar = 0;
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btnexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluirActionPerformed
        excluir();
        limpaCampos();
        liberaCampos(false);
        liberaBotoes(true, false, false, false, true);
        modelo_jtl_consultar_carro.setNumRows(0);
    }//GEN-LAST:event_btnexcluirActionPerformed

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnsairActionPerformed

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
        preencherTabela(renavampesquisa.getText());
    }//GEN-LAST:event_btnokActionPerformed

    private void jtl_consultar_carroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtl_consultar_carroMouseClicked
        preencherCampos(Integer.parseInt(String.valueOf(
                jtl_consultar_carro.getValueAt(
                jtl_consultar_carro.getSelectedRow(), 0))));
        liberaBotoes(false, true, true, true, true);
    }//GEN-LAST:event_jtl_consultar_carroMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ano;
    private javax.swing.JTextField bairro;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnexcluir;
    private javax.swing.JButton btnnovo;
    private javax.swing.JButton btnok;
    private javax.swing.JButton btnsair;
    private javax.swing.JButton btnsalvar;
    private javax.swing.JTextField chassi;
    private javax.swing.JTextField cidade;
    private javax.swing.JTextField cnh;
    private javax.swing.JTextField cor;
    private javax.swing.JTextField cpf;
    private javax.swing.JTextField endereco;
    private javax.swing.JComboBox<String> estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtl_consultar_carro;
    private javax.swing.JTextField modelo;
    private javax.swing.JTextField placa;
    private javax.swing.JTextField proprietario;
    private javax.swing.JTextField renavam;
    private javax.swing.JTextField renavampesquisa;
    // End of variables declaration//GEN-END:variables
}
