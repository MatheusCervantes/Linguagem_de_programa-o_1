package br.com.avaliacao_2.view;

import java.awt.Dimension;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import br.com.avaliacao_2.dto.VeterinarioDTO;
import br.com.avaliacao_2.ctr.VeterinarioCTR;

public class VeterinarioVIEW extends javax.swing.JInternalFrame {

    VeterinarioDTO veterinarioDTO = new VeterinarioDTO();
    VeterinarioCTR veterinarioCTR = new VeterinarioCTR();

    int gravar_alterar;
    ResultSet rs;
    DefaultTableModel modelo_jtl_consultar_veterinario;
    
    
    public VeterinarioVIEW() {
        initComponents();
        liberaCampos(false);
        liberaBotoes(true, false, false, false, true);
        modelo_jtl_consultar_veterinario = (DefaultTableModel) jtl_consultar_veterinario.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel13 = new javax.swing.JLabel();
        btnexcluir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        crmv_vet = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnnovo = new javax.swing.JButton();
        btnsair = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtl_consultar_veterinario = new javax.swing.JTable();
        nome_vet = new javax.swing.JTextField();
        logradouro_vet = new javax.swing.JTextField();
        numero_vet = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        bairro_vet = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cidade_vet = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        estado_vet = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnsalvar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        pesquisa_nome_vet = new javax.swing.JTextField();
        rg_vet = new javax.swing.JFormattedTextField();
        cep_vet = new javax.swing.JFormattedTextField();

        jLabel13.setText("jLabel13");

        setMinimumSize(new java.awt.Dimension(757, 276));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnexcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao_2/view/imagens/excluir.png"))); // NOI18N
        btnexcluir.setText("Excluir");
        btnexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnexcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, -1, -1));

        jLabel2.setText("Logradouro:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 62, -1, -1));

        jLabel9.setText("RG:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 169, -1, -1));
        getContentPane().add(crmv_vet, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 167, 99, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setText("Veterinário");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, -1, -1));

        btnnovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao_2/view/imagens/novo.png"))); // NOI18N
        btnnovo.setText("Novo");
        btnnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnovoActionPerformed(evt);
            }
        });
        getContentPane().add(btnnovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        btnsair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao_2/view/imagens/sair.png"))); // NOI18N
        btnsair.setText("Sair");
        btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsairActionPerformed(evt);
            }
        });
        getContentPane().add(btnsair, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, -1, -1));

        jLabel3.setText("Número:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 89, -1, -1));

        jtl_consultar_veterinario.setModel(new javax.swing.table.DefaultTableModel(
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
        jtl_consultar_veterinario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtl_consultar_veterinarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtl_consultar_veterinario);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 90, 310, 100));

        nome_vet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_vetActionPerformed(evt);
            }
        });
        getContentPane().add(nome_vet, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 35, 322, -1));
        getContentPane().add(logradouro_vet, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 60, 322, -1));
        getContentPane().add(numero_vet, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 87, 99, -1));

        jLabel11.setText("Nome:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, -1, -1));

        jLabel4.setText("Bairro:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 89, -1, -1));

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao_2/view/imagens/pesquisar.png"))); // NOI18N
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 50, 59, -1));
        getContentPane().add(bairro_vet, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 87, 167, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setText(" Consultar Veterinário");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, -1, -1));

        jLabel5.setText("Cidade:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 114, -1, -1));
        getContentPane().add(cidade_vet, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 112, 322, -1));

        jLabel6.setText("Estado:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 139, -1, -1));

        estado_vet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        getContentPane().add(estado_vet, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 137, 163, -1));

        jLabel7.setText("CEP:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 139, -1, -1));

        jLabel8.setText("CRMV:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 169, -1, -1));

        btnsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao_2/view/imagens/salvar.png"))); // NOI18N
        btnsalvar.setText("Salvar");
        btnsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnsalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));

        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao_2/view/imagens/cancelar.png"))); // NOI18N
        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btncancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, -1, -1));

        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 37, -1, -1));
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));
        getContentPane().add(pesquisa_nome_vet, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 200, -1));

        try {
            rg_vet.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(rg_vet, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 169, 161, -1));

        try {
            cep_vet.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(cep_vet, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 139, 99, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluirActionPerformed
        excluir();
        limpaCampos();
        liberaCampos(false);
        liberaBotoes(true, false, false, false, true);
        modelo_jtl_consultar_veterinario.setNumRows(0);
    }//GEN-LAST:event_btnexcluirActionPerformed

    private void btnnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnovoActionPerformed
        liberaCampos(true);
        liberaBotoes(false, true, true, false, true);
        gravar_alterar = 1;
    }//GEN-LAST:event_btnnovoActionPerformed

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnsairActionPerformed

    private void jtl_consultar_veterinarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtl_consultar_veterinarioMouseClicked
        preencheCampos(Integer.parseInt(String.valueOf(
                jtl_consultar_veterinario.getValueAt(
                jtl_consultar_veterinario.getSelectedRow(), 0))));
        liberaBotoes(false, true, true, true, true);
    }//GEN-LAST:event_jtl_consultar_veterinarioMouseClicked

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        preencheTabela(pesquisa_nome_vet.getText()); 
    }//GEN-LAST:event_btnPesquisarActionPerformed

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
        modelo_jtl_consultar_veterinario.setNumRows(0);
        liberaBotoes(true, false, false, false, true);
        gravar_alterar=0;
    }//GEN-LAST:event_btncancelarActionPerformed

    private void nome_vetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_vetActionPerformed
       
    }//GEN-LAST:event_nome_vetActionPerformed
    
    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    private void gravar() {
        try {
            veterinarioDTO.setNome_vet(nome_vet.getText());
            veterinarioDTO.setLogradouro_vet(logradouro_vet.getText());
            veterinarioDTO.setNumero_vet(Integer.parseInt(numero_vet.getText()));
            veterinarioDTO.setBairro_vet(bairro_vet.getText());
            veterinarioDTO.setCidade_vet(cidade_vet.getText());
            veterinarioDTO.setEstado_vet(estado_vet.getSelectedItem().toString());
            veterinarioDTO.setCep_vet(cep_vet.getText());
            veterinarioDTO.setCrmv_vet(crmv_vet.getText());
            veterinarioDTO.setRg_vet(rg_vet.getText());

            JOptionPane.showMessageDialog(null,
                    veterinarioCTR.inserirVeterinario(veterinarioDTO)
            );
        } catch (Exception e) {
            System.out.println("Erro ao Gravar" + e.getMessage());
        }
    }
    
    private void alterar() {
        try {
            veterinarioDTO.setNome_vet(nome_vet.getText());
            veterinarioDTO.setLogradouro_vet(logradouro_vet.getText());
            veterinarioDTO.setNumero_vet(Integer.parseInt(numero_vet.getText()));
            veterinarioDTO.setBairro_vet(bairro_vet.getText());
            veterinarioDTO.setCidade_vet(cidade_vet.getText());
            veterinarioDTO.setEstado_vet(estado_vet.getSelectedItem().toString());
            veterinarioDTO.setCep_vet(cep_vet.getText());
            veterinarioDTO.setCrmv_vet(crmv_vet.getText());
            veterinarioDTO.setRg_vet(rg_vet.getText());

            JOptionPane.showMessageDialog(null,
                    veterinarioCTR.alterarVeterinario(veterinarioDTO)
            );
        } catch (Exception e) {
            System.out.println("Erro ao Gravar" + e.getMessage());
        }
    }
    
    private void excluir() {
        if (JOptionPane.showConfirmDialog(null, "Deseja Realmente excluir o cadastro deste Veterinário?", "Aviso",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null,
                    veterinarioCTR.excluirVeterinario(veterinarioDTO)
            );
        }
    }
    
    private void liberaCampos(boolean a) {
        nome_vet.setEnabled(a);
        logradouro_vet.setEnabled(a);
        numero_vet.setEnabled(a);
        bairro_vet.setEnabled(a);
        cidade_vet.setEnabled(a);
        estado_vet.setEnabled(a);
        cep_vet.setEnabled(a);
        crmv_vet.setEnabled(a);
        rg_vet.setEnabled(a);
    }
    
    private void liberaBotoes(boolean a, boolean b, boolean c, boolean d, boolean e) {
        btnnovo.setEnabled(a);
        btnsalvar.setEnabled(b);
        btncancelar.setEnabled(c);
        btnexcluir.setEnabled(d);
        btnsair.setEnabled(e);
    }

    private void limpaCampos() {
        nome_vet.setText("");
        logradouro_vet.setText("");
        numero_vet.setText("");
        bairro_vet.setText("");
        cidade_vet.setText("");
        cep_vet.setText("");
        crmv_vet.setText("");
        rg_vet.setText("");
    }
    
    private void preencheTabela(String nome_vet) {
        try {
            modelo_jtl_consultar_veterinario.setNumRows(0);
            veterinarioDTO.setNome_vet(nome_vet);
            rs = veterinarioCTR.consultarVeterinario(veterinarioDTO, 1);
            while (rs.next()) {
                modelo_jtl_consultar_veterinario.addRow(new Object[]{
                    rs.getString("id_vet"),
                    rs.getString("nome_vet"),});
            }
        } catch (Exception erTab) {
            System.out.println("Erro SQL: " + erTab);
        } finally {
            veterinarioCTR.CloseDB();
        }
    }
    
    private void preencheCampos(int id_vet) {
        try {
            veterinarioDTO.setId_vet(id_vet);
            rs = veterinarioCTR.consultarVeterinario(veterinarioDTO, 2); //2 = é a pesquisa no id na classe DAO
            if (rs.next()) {
                limpaCampos();

                nome_vet.setText(rs.getString("nome_vet"));
                logradouro_vet.setText(rs.getString("logradouro_vet"));
                numero_vet.setText(rs.getString("numero_vet"));
                bairro_vet.setText(rs.getString("bairro_vet"));
                cidade_vet.setText(rs.getString("cidade_vet"));
                estado_vet.setSelectedItem(rs.getString("estado_vet"));
                cep_vet.setText(rs.getString("cep_vet"));
                crmv_vet.setText(rs.getString("crmv_vet"));
                rg_vet.setText(rs.getString("rg_vet"));

                gravar_alterar = 2;
                liberaCampos(true);
            }
        }
        catch (Exception erTab) {
            System.out.println("Erro SQL: " + erTab);
        } finally {
            veterinarioCTR.CloseDB();
        }
    }
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bairro_vet;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnexcluir;
    private javax.swing.JButton btnnovo;
    private javax.swing.JButton btnsair;
    private javax.swing.JButton btnsalvar;
    private javax.swing.JFormattedTextField cep_vet;
    private javax.swing.JTextField cidade_vet;
    private javax.swing.JTextField crmv_vet;
    private javax.swing.JComboBox<String> estado_vet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtl_consultar_veterinario;
    private javax.swing.JTextField logradouro_vet;
    private javax.swing.JTextField nome_vet;
    private javax.swing.JTextField numero_vet;
    private javax.swing.JTextField pesquisa_nome_vet;
    private javax.swing.JFormattedTextField rg_vet;
    // End of variables declaration//GEN-END:variables
}