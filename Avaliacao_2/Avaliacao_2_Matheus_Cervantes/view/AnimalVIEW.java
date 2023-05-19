package br.com.avaliacao_2.view;

import java.awt.Dimension;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import br.com.avaliacao_2.dto.AnimalDTO;
import br.com.avaliacao_2.ctr.AnimalCTR;
import br.com.avaliacao_2.dto.PessoaDTO;
import br.com.avaliacao_2.ctr.PessoaCTR;
import java.text.SimpleDateFormat;

public class AnimalVIEW extends javax.swing.JInternalFrame {

    SimpleDateFormat data_format = new SimpleDateFormat("dd/mm/yyyy");

    AnimalCTR animalCTR = new AnimalCTR();
    AnimalDTO animalDTO = new AnimalDTO();
    PessoaDTO pessoaDTO = new PessoaDTO();
    PessoaCTR pessoaCTR = new PessoaCTR();

    int gravar_alterar;

    ResultSet rs;
    DefaultTableModel modelo_jtl_consultar_proprietario;
    DefaultTableModel modelo_jtl_consultar_animal;

    public AnimalVIEW() {
        initComponents();
        liberaCampos(false);
        liberaBotoes(true, false, false, false, true);
        modelo_jtl_consultar_animal = (DefaultTableModel) jtl_consultar_animal.getModel();
        modelo_jtl_consultar_proprietario = (DefaultTableModel) jtl_consultar_proprietario.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        btnexcluir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnsalvar = new javax.swing.JButton();
        btnnovo = new javax.swing.JButton();
        btnsair = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtl_consultar_animal = new javax.swing.JTable();
        nome_animal = new javax.swing.JTextField();
        tipo_animal = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        proprietario_animal = new javax.swing.JTextField();
        btnPesquisarProprietario = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtl_consultar_proprietario = new javax.swing.JTable();
        dtanasc_animal = new javax.swing.JFormattedTextField();
        nome_consulta_animal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setText(" Consultar Animal");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, -1, -1));

        btnexcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao_2/view/imagens/excluir.png"))); // NOI18N
        btnexcluir.setText("Excluir");
        btnexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnexcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 402, -1, -1));

        jLabel2.setText("Data Nascimento:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 64, -1, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setText("Animal");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 7, -1, -1));

        btnsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao_2/view/imagens/salvar.png"))); // NOI18N
        btnsalvar.setText("Salvar");
        btnsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnsalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 402, -1, -1));

        btnnovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao_2/view/imagens/novo.png"))); // NOI18N
        btnnovo.setText("Novo");
        btnnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnovoActionPerformed(evt);
            }
        });
        getContentPane().add(btnnovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 402, -1, -1));

        btnsair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao_2/view/imagens/sair.png"))); // NOI18N
        btnsair.setText("Sair");
        btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsairActionPerformed(evt);
            }
        });
        getContentPane().add(btnsair, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 402, -1, -1));

        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao_2/view/imagens/cancelar.png"))); // NOI18N
        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btncancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 402, -1, -1));

        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 39, -1, -1));

        jtl_consultar_animal.setModel(new javax.swing.table.DefaultTableModel(
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
        jtl_consultar_animal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtl_consultar_animalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtl_consultar_animal);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 88, 280, 296));
        getContentPane().add(nome_animal, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 37, 432, -1));
        getContentPane().add(tipo_animal, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 62, 172, -1));

        jLabel11.setText("Tipo:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 64, -1, -1));

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao_2/view/imagens/pesquisar.png"))); // NOI18N
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, 59, -1));

        jLabel3.setText("Nome:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 67, -1, -1));

        jLabel4.setText("Proprietário:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 87, -1, -1));
        getContentPane().add(proprietario_animal, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 87, 365, -1));

        btnPesquisarProprietario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao_2/view/imagens/pesquisar.png"))); // NOI18N
        btnPesquisarProprietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarProprietarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisarProprietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 87, 59, -1));

        jtl_consultar_proprietario.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jtl_consultar_proprietario);
        if (jtl_consultar_proprietario.getColumnModel().getColumnCount() > 0) {
            jtl_consultar_proprietario.getColumnModel().getColumn(0).setResizable(false);
            jtl_consultar_proprietario.getColumnModel().getColumn(1).setResizable(false);
        }

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 135, 430, 249));

        try {
            dtanasc_animal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(dtanasc_animal, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 62, 150, -1));
        getContentPane().add(nome_consulta_animal, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 160, -1));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluirActionPerformed
        excluir();
        limpaCampos();
        liberaCampos(false);
        liberaBotoes(true, false, false, false, true);
        modelo_jtl_consultar_animal.setNumRows(0);
    }//GEN-LAST:event_btnexcluirActionPerformed

    private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarActionPerformed
        if (gravar_alterar == 1) {
            gravar();
            gravar_alterar = 0;
        } else {
            if (gravar_alterar == 2) {
                alterar();
                gravar_alterar = 0;
            } else {
                JOptionPane.showMessageDialog(null, "Erro no Sistema!!!");
            }
        }

        limpaCampos();
        liberaCampos(false);
        liberaBotoes(true, false, false, false, true);
    }//GEN-LAST:event_btnsalvarActionPerformed

    private void btnnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnovoActionPerformed
        liberaCampos(true);
        liberaBotoes(false, true, true, false, true);
        gravar_alterar = 1;
    }//GEN-LAST:event_btnnovoActionPerformed

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnsairActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        limpaCampos();
        liberaCampos(false);
        modelo_jtl_consultar_animal.setNumRows(0);
        liberaBotoes(true, false, false, false, true);
        gravar_alterar = 0;
    }//GEN-LAST:event_btncancelarActionPerformed

    private void jtl_consultar_animalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtl_consultar_animalMouseClicked
        preencheCamposAnimal(Integer.parseInt(String.valueOf(
                jtl_consultar_animal.getValueAt(
                        jtl_consultar_animal.getSelectedRow(), 0))));
        liberaBotoes(false, true, true, true, true);
    }//GEN-LAST:event_jtl_consultar_animalMouseClicked

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        preencheTabelaAnimal(nome_consulta_animal.getText());
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnPesquisarProprietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarProprietarioActionPerformed
        preencheTabelaProprietario(proprietario_animal.getText());
    }//GEN-LAST:event_btnPesquisarProprietarioActionPerformed

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    private void gravar() {
        try {
            animalDTO.setNome_animal(nome_animal.getText());
            animalDTO.setTipo_animal(tipo_animal.getText());
            animalDTO.setDatanasc_animal(data_format.parse(dtanasc_animal.getText()));
            pessoaDTO.setId_pessoa(Integer.parseInt(String.valueOf(
                    jtl_consultar_proprietario.getValueAt(
                            jtl_consultar_proprietario.getSelectedRow(), 0))));

            JOptionPane.showMessageDialog(null,
                    animalCTR.inserirAnimal(animalDTO, pessoaDTO)
            );
        } catch (Exception e) {
            System.out.println("Erro ao Gravar" + e.getMessage());
        }
    }

    private void alterar() {
        try {
            animalDTO.setNome_animal(nome_animal.getText());
            animalDTO.setTipo_animal(tipo_animal.getText());
            animalDTO.setDatanasc_animal(data_format.parse(dtanasc_animal.getText()));
            pessoaDTO.setId_pessoa(Integer.parseInt(String.valueOf(
                    jtl_consultar_proprietario.getValueAt(
                            jtl_consultar_proprietario.getSelectedRow(), 0))));

            JOptionPane.showMessageDialog(null,
                    animalCTR.alterarAnimal(animalDTO, pessoaDTO)
            );
        } catch (Exception e) {
            System.out.println("Erro ao Alterar" + e.getMessage());
        }
    }

    private void excluir() {
        if (JOptionPane.showConfirmDialog(null, "Deseja Realmente excluir o cadastro do Animal?", "Aviso",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null,
                    animalCTR.excluirAnimal(animalDTO)
            );
        }
    }

    private void liberaCampos(boolean a) {
        nome_animal.setEnabled(a);
        tipo_animal.setEnabled(a);
        dtanasc_animal.setEnabled(a);
        proprietario_animal.setEnabled(a);
        btnPesquisarProprietario.setEnabled(a);
        jtl_consultar_proprietario.setEnabled(a);
    }

    private void liberaBotoes(boolean a, boolean b, boolean c, boolean d, boolean e) {
        btnnovo.setEnabled(a);
        btnsalvar.setEnabled(b);
        btncancelar.setEnabled(c);
        btnexcluir.setEnabled(d);
        btnsair.setEnabled(e);
    }

    private void limpaCampos() {
        nome_animal.setText("");
        tipo_animal.setText("");
        dtanasc_animal.setText("");
        proprietario_animal.setText("");
        modelo_jtl_consultar_proprietario.setNumRows(0);
    }

    private void preencheTabelaAnimal(String nome_animal) {
        try {
            modelo_jtl_consultar_animal.setNumRows(0);
            animalDTO.setNome_animal(nome_animal);
            rs = animalCTR.consultarAnimal(animalDTO, 1);
            while (rs.next()) {
                modelo_jtl_consultar_animal.addRow(new Object[]{
                    rs.getString("id_animal"),
                    rs.getString("nome_animal"),});
            }
        } catch (Exception erTab) {
            System.out.println("Erro SQL: " + erTab);
        } finally {
            animalCTR.CloseDB();
        }
    }

    private void preencheCamposAnimal(int id_animal) {
        try {
            animalDTO.setId_animal(id_animal);
            rs = animalCTR.consultarAnimal(animalDTO, 2);
            if (rs.next()) {
                limpaCampos();

                nome_animal.setText(rs.getString("nome_animal"));
                tipo_animal.setText(rs.getString("tipo_animal"));
                dtanasc_animal.setText(rs.getString("nasc_animal"));

                modelo_jtl_consultar_proprietario.setNumRows(0);
                modelo_jtl_consultar_proprietario.addRow(new Object[]{rs.getInt("id_pessoa"), rs.getString("nome_pessoa"),});
                jtl_consultar_proprietario.setRowSelectionInterval(0, 0);

                gravar_alterar = 2;
                liberaCampos(true);
            }
        } catch (Exception erTab) {
            System.out.println("Erro SQL: " + erTab);
        } finally {
            animalCTR.CloseDB();
        }
    }

    private void preencheTabelaProprietario(String nome_pessoa) {
        try {
            modelo_jtl_consultar_proprietario.setNumRows(0);
            pessoaDTO.setNome_pessoa(nome_pessoa);
            rs = pessoaCTR.consultarPessoa(pessoaDTO, 1);
            while (rs.next()) {
                modelo_jtl_consultar_proprietario.addRow(new Object[]{
                    rs.getString("id_pessoa"),
                    rs.getString("nome_pessoa"),});
            }
        } catch (Exception erTab) {
            System.out.println("Erro SQL: " + erTab);
        } finally {
            animalCTR.CloseDB();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnPesquisarProprietario;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnexcluir;
    private javax.swing.JButton btnnovo;
    private javax.swing.JButton btnsair;
    private javax.swing.JButton btnsalvar;
    private javax.swing.JFormattedTextField dtanasc_animal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jtl_consultar_animal;
    private javax.swing.JTable jtl_consultar_proprietario;
    private javax.swing.JTextField nome_animal;
    private javax.swing.JTextField nome_consulta_animal;
    private javax.swing.JTextField proprietario_animal;
    private javax.swing.JTextField tipo_animal;
    // End of variables declaration//GEN-END:variables
}