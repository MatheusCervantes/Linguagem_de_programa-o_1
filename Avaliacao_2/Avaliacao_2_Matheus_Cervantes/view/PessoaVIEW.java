package br.com.avaliacao_2.view;

import java.awt.Dimension;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import br.com.avaliacao_2.dto.PessoaDTO;
import br.com.avaliacao_2.ctr.PessoaCTR;

public class PessoaVIEW extends javax.swing.JInternalFrame {

    PessoaDTO pessoaDTO = new PessoaDTO();
    PessoaCTR pessoaCTR = new PessoaCTR();

    int gravar_alterar;
    ResultSet rs;
    DefaultTableModel modelo_jtl_consultar_pessoa;

    public PessoaVIEW() {
        initComponents();
        liberaCampos(false);
        liberaBotoes(true, false, false, false, true);
        modelo_jtl_consultar_pessoa = (DefaultTableModel) jtl_consultar_pessoa.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnsalvar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnexcluir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnsair = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtl_consultar_pessoa = new javax.swing.JTable();
        nome_pessoa = new javax.swing.JTextField();
        logradouro_pessoa = new javax.swing.JTextField();
        numero_pessoa = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        pesquisa_nome_pessoa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        bairro_pessoa = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cidade_pessoa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        estado_pessoa = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cep_pessoa = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rg_pessoa = new javax.swing.JTextField();
        cpf_pessoa = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnnovo = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao_2/view/imagens/salvar.png"))); // NOI18N
        btnsalvar.setText("Salvar");
        btnsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnsalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 204, -1, -1));

        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao_2/view/imagens/cancelar.png"))); // NOI18N
        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btncancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 204, -1, -1));

        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 49, -1, -1));

        btnexcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao_2/view/imagens/excluir.png"))); // NOI18N
        btnexcluir.setText("Excluir");
        btnexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnexcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 204, -1, -1));

        jLabel2.setText("Logradouro:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 74, -1, -1));

        btnsair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao_2/view/imagens/sair.png"))); // NOI18N
        btnsair.setText("Sair");
        btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsairActionPerformed(evt);
            }
        });
        getContentPane().add(btnsair, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 204, -1, -1));

        jLabel3.setText("Número:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 99, -1, -1));

        jtl_consultar_pessoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtl_consultar_pessoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtl_consultar_pessoaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtl_consultar_pessoa);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 97, 284, 144));
        getContentPane().add(nome_pessoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 47, 440, -1));
        getContentPane().add(logradouro_pessoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 72, 440, -1));
        getContentPane().add(numero_pessoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 97, 87, -1));

        jLabel11.setText("Nome:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 66, -1, -1));
        getContentPane().add(pesquisa_nome_pessoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(596, 64, 177, -1));

        jLabel4.setText("Bairro:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 99, -1, -1));

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao_2/view/imagens/pesquisar.png"))); // NOI18N
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(779, 46, 59, -1));
        getContentPane().add(bairro_pessoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 97, 297, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setText("Consulta");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 32, -1, -1));

        jLabel5.setText("Cidade:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 127, -1, -1));
        getContentPane().add(cidade_pessoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 125, 281, -1));

        jLabel6.setText("Estado:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 127, -1, -1));

        estado_pessoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        getContentPane().add(estado_pessoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 122, 93, -1));

        jLabel7.setText("CEP:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 154, -1, -1));
        getContentPane().add(cep_pessoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 152, 86, -1));

        jLabel8.setText("CPF:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 154, -1, -1));

        jLabel9.setText("RG:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 154, -1, -1));
        getContentPane().add(rg_pessoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 152, 93, -1));
        getContentPane().add(cpf_pessoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 152, 137, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setText("Pessoa");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 12, -1, -1));

        btnnovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao_2/view/imagens/novo.png"))); // NOI18N
        btnnovo.setText("Novo");
        btnnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnovoActionPerformed(evt);
            }
        });
        getContentPane().add(btnnovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 204, -1, -1));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarActionPerformed
        if(gravar_alterar == 1){
            gravar();
            gravar_alterar = 0;
        }
        else{
            if(gravar_alterar == 2){
                alterar();
                gravar_alterar = 0;
            }
            else{
                JOptionPane.showMessageDialog(null, "Erro no Sistema!!!");
            }
        }
          
        limpaCampos();
        liberaCampos(false);
        liberaBotoes(true, false, false, false, true);
    }//GEN-LAST:event_btnsalvarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        limpaCampos();
        liberaCampos(false);
        modelo_jtl_consultar_pessoa.setNumRows(0);
        liberaBotoes(true, false, false, false, true);
        gravar_alterar=0;
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btnexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluirActionPerformed
        excluir();
        limpaCampos();
        liberaCampos(false);
        liberaBotoes(true, false, false, false, true);
        modelo_jtl_consultar_pessoa.setNumRows(0);
    }//GEN-LAST:event_btnexcluirActionPerformed

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnsairActionPerformed

    private void jtl_consultar_pessoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtl_consultar_pessoaMouseClicked
        preencheCampos(Integer.parseInt(String.valueOf(
                jtl_consultar_pessoa.getValueAt(
                jtl_consultar_pessoa.getSelectedRow(), 0))));
        liberaBotoes(false, true, true, true, true);
    }//GEN-LAST:event_jtl_consultar_pessoaMouseClicked

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        preencheTabela(pesquisa_nome_pessoa.getText()); 
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnovoActionPerformed
        liberaCampos(true);
        liberaBotoes(false, true, true, false, true);
        gravar_alterar = 1;
    }//GEN-LAST:event_btnnovoActionPerformed

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    private void gravar() {
        try {
            pessoaDTO.setNome_pessoa(nome_pessoa.getText());
            pessoaDTO.setLogradouro_pessoa(logradouro_pessoa.getText());
            pessoaDTO.setNumero_pessoa(Integer.parseInt(numero_pessoa.getText()));
            pessoaDTO.setBairro_pessoa(bairro_pessoa.getText());
            pessoaDTO.setCidade_pessoa(cidade_pessoa.getText());
            pessoaDTO.setEstado_pessoa(estado_pessoa.getSelectedItem().toString());
            pessoaDTO.setCep_pessoa(cep_pessoa.getText());
            pessoaDTO.setCpf_pessoa(cpf_pessoa.getText());
            pessoaDTO.setRg_pessoa(rg_pessoa.getText());

            JOptionPane.showMessageDialog(null,
                    pessoaCTR.inserirPessoa(pessoaDTO)
            );
        } catch (Exception e) {
            System.out.println("Erro ao Gravar" + e.getMessage());
        }
    }

    private void alterar() {
        try {
            pessoaDTO.setNome_pessoa(nome_pessoa.getText());
            pessoaDTO.setLogradouro_pessoa(logradouro_pessoa.getText());
            pessoaDTO.setNumero_pessoa(Integer.parseInt(numero_pessoa.getText()));
            pessoaDTO.setBairro_pessoa(bairro_pessoa.getText());
            pessoaDTO.setCidade_pessoa(cidade_pessoa.getText());
            pessoaDTO.setEstado_pessoa(estado_pessoa.getSelectedItem().toString());
            pessoaDTO.setCep_pessoa(cep_pessoa.getText());
            pessoaDTO.setCpf_pessoa(cpf_pessoa.getText());
            pessoaDTO.setRg_pessoa(rg_pessoa.getText());

            JOptionPane.showMessageDialog(null,
                    pessoaCTR.alterarPessoa(pessoaDTO)
            );
        } catch (Exception e) {
            System.out.println("Erro ao Alterar" + e.getMessage());
        }
    }

    private void excluir() {
        if (JOptionPane.showConfirmDialog(null, "Deseja Realmente excluir o cadastro desta Pessoa?", "Aviso",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null,
                    pessoaCTR.excluirPessoa(pessoaDTO)
            );
        }
    }

    private void liberaCampos(boolean a) {
        nome_pessoa.setEnabled(a);
        logradouro_pessoa.setEnabled(a);
        numero_pessoa.setEnabled(a);
        bairro_pessoa.setEnabled(a);
        cidade_pessoa.setEnabled(a);
        estado_pessoa.setEnabled(a);
        cep_pessoa.setEnabled(a);
        cpf_pessoa.setEnabled(a);
        rg_pessoa.setEnabled(a);
    }

    private void liberaBotoes(boolean a, boolean b, boolean c, boolean d, boolean e) {
        btnnovo.setEnabled(a);
        btnsalvar.setEnabled(b);
        btncancelar.setEnabled(c);
        btnexcluir.setEnabled(d);
        btnsair.setEnabled(e);
    }

    private void limpaCampos() {
        nome_pessoa.setText("");
        logradouro_pessoa.setText("");
        numero_pessoa.setText("");
        bairro_pessoa.setText("");
        cidade_pessoa.setText("");
        cep_pessoa.setText("");
        cpf_pessoa.setText("");
        rg_pessoa.setText("");
    }

    private void preencheTabela(String nome_pessoa) {
        try {
            modelo_jtl_consultar_pessoa.setNumRows(0);
            pessoaDTO.setNome_pessoa(nome_pessoa);
            rs = pessoaCTR.consultarPessoa(pessoaDTO, 1);
            while (rs.next()) {
                modelo_jtl_consultar_pessoa.addRow(new Object[]{
                    rs.getString("id_pessoa"),
                    rs.getString("nome_pessoa"),});
            }
        } catch (Exception erTab) {
            System.out.println("Erro SQL: " + erTab);
        } finally {
            pessoaCTR.CloseDB();
        }
    }

    private void preencheCampos(int id_pessoa) {
        try {
            pessoaDTO.setId_pessoa(id_pessoa);
            rs = pessoaCTR.consultarPessoa(pessoaDTO, 2);
            if (rs.next()) {
                limpaCampos();

                nome_pessoa.setText(rs.getString("nome_pessoa"));
                logradouro_pessoa.setText(rs.getString("logradouro_pessoa"));
                numero_pessoa.setText(rs.getString("numero_pessoa"));
                bairro_pessoa.setText(rs.getString("bairro_pessoa"));
                cidade_pessoa.setText(rs.getString("cidade_pessoa"));
                estado_pessoa.setSelectedItem(rs.getString("estado_pessoa"));
                cep_pessoa.setText(rs.getString("cep_pessoa"));
                cpf_pessoa.setText(rs.getString("cpf_pessoa"));
                rg_pessoa.setText(rs.getString("rg_pessoa"));

                gravar_alterar = 2;
                liberaCampos(true);
            }
        }
        catch (Exception erTab) {
            System.out.println("Erro SQL: " + erTab);
        } finally {
            pessoaCTR.CloseDB();
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bairro_pessoa;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnexcluir;
    private javax.swing.JButton btnnovo;
    private javax.swing.JButton btnsair;
    private javax.swing.JButton btnsalvar;
    private javax.swing.JTextField cep_pessoa;
    private javax.swing.JTextField cidade_pessoa;
    private javax.swing.JTextField cpf_pessoa;
    private javax.swing.JComboBox<String> estado_pessoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtl_consultar_pessoa;
    private javax.swing.JTextField logradouro_pessoa;
    private javax.swing.JTextField nome_pessoa;
    private javax.swing.JTextField numero_pessoa;
    private javax.swing.JTextField pesquisa_nome_pessoa;
    private javax.swing.JTextField rg_pessoa;
    // End of variables declaration//GEN-END:variables
}
