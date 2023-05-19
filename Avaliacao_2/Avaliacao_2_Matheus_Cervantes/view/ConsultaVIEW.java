package br.com.avaliacao_2.view;

import java.awt.Dimension;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import br.com.avaliacao_2.dto.VeterinarioDTO;
import br.com.avaliacao_2.ctr.VeterinarioCTR;
import br.com.avaliacao_2.dto.AnimalDTO;
import br.com.avaliacao_2.ctr.AnimalCTR;
import br.com.avaliacao_2.dto.ConsultaDTO;
import br.com.avaliacao_2.ctr.ConsultaCTR;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class ConsultaVIEW extends javax.swing.JInternalFrame {
    SimpleDateFormat data_format = new SimpleDateFormat("dd/mm/yyyy");
    SimpleDateFormat hora_format = new SimpleDateFormat("hh:mm:ss");
    
    VeterinarioCTR veterinarioCTR = new VeterinarioCTR();
    VeterinarioDTO veterinarioDTO = new VeterinarioDTO();
    AnimalCTR animalCTR = new AnimalCTR();
    AnimalDTO animalDTO = new AnimalDTO();
    ConsultaCTR consultaCTR = new ConsultaCTR();
    ConsultaDTO consultaDTO = new ConsultaDTO();            
    
    int gravar_alterar;
    ResultSet rs;
    DefaultTableModel modelo_jtl_consultar_veterinario;
    DefaultTableModel modelo_jtl_consultar_animal;
    DefaultTableModel modelo_jtl_consultar_consulta;
    
    public ConsultaVIEW() {
        initComponents();
        liberaCampos(false);
        liberaBotoes(true, false, false, false, true);
        modelo_jtl_consultar_veterinario = (DefaultTableModel) jtl_consultar_veterinario.getModel();
        modelo_jtl_consultar_animal = (DefaultTableModel) jtl_consultar_animal.getModel();
        modelo_jtl_consultar_consulta = (DefaultTableModel) jtl_consultar_consulta.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        nome_animal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnpesquisaranimal = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtl_consultar_animal = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtl_consultar_veterinario = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        nome_veterinario = new javax.swing.JTextField();
        btnpesquisarvet = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnnovo = new javax.swing.JButton();
        btnsalvar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        btnsair = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        descricao_consulta = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        data_consulta = new javax.swing.JFormattedTextField();
        hora_consulta = new javax.swing.JFormattedTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtl_consultar_consulta = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        nome_veterinario_pesquisar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        nome_animal_pesquisar = new javax.swing.JTextField();
        btnpesquisarvetconsultaveterinario = new javax.swing.JButton();
        btnpesquisaranimalconsultaanimal = new javax.swing.JButton();
        btnexcluir = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Consulta")));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Animal"));

        jLabel3.setText("Nome:");

        btnpesquisaranimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao_2/view/imagens/pesquisar.png"))); // NOI18N
        btnpesquisaranimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesquisaranimalActionPerformed(evt);
            }
        });

        jtl_consultar_animal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Dono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtl_consultar_animal);
        if (jtl_consultar_animal.getColumnModel().getColumnCount() > 0) {
            jtl_consultar_animal.getColumnModel().getColumn(0).setResizable(false);
            jtl_consultar_animal.getColumnModel().getColumn(1).setResizable(false);
            jtl_consultar_animal.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nome_animal, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnpesquisaranimal)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnpesquisaranimal)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nome_animal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Veteriniário")));

        jtl_consultar_veterinario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtl_consultar_veterinario);
        if (jtl_consultar_veterinario.getColumnModel().getColumnCount() > 0) {
            jtl_consultar_veterinario.getColumnModel().getColumn(0).setResizable(false);
            jtl_consultar_veterinario.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel2.setText("Nome:");

        btnpesquisarvet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao_2/view/imagens/pesquisar.png"))); // NOI18N
        btnpesquisarvet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesquisarvetActionPerformed(evt);
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
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nome_veterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnpesquisarvet))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(nome_veterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnpesquisarvet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Consulta");

        btnnovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao_2/view/imagens/novo.png"))); // NOI18N
        btnnovo.setText("Novo");
        btnnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnovoActionPerformed(evt);
            }
        });

        btnsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao_2/view/imagens/salvar.png"))); // NOI18N
        btnsalvar.setText("Salvar");
        btnsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvarActionPerformed(evt);
            }
        });

        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao_2/view/imagens/cancelar.png"))); // NOI18N
        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        btnsair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao_2/view/imagens/sair.png"))); // NOI18N
        btnsair.setText("Sair");
        btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsairActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));

        descricao_consulta.setColumns(20);
        descricao_consulta.setRows(5);
        jScrollPane3.setViewportView(descricao_consulta);

        jLabel4.setText("Descrição:");

        jLabel5.setText("Data:");

        jLabel6.setText("Hora:");

        try {
            data_consulta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            hora_consulta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(data_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hora_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(data_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hora_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(81, 81, 81))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));

        jtl_consultar_consulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Vet", "Animal", "Data", "Hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtl_consultar_consulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtl_consultar_consultaMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jtl_consultar_consulta);
        if (jtl_consultar_consulta.getColumnModel().getColumnCount() > 0) {
            jtl_consultar_consulta.getColumnModel().getColumn(0).setResizable(false);
            jtl_consultar_consulta.getColumnModel().getColumn(1).setResizable(false);
            jtl_consultar_consulta.getColumnModel().getColumn(2).setResizable(false);
            jtl_consultar_consulta.getColumnModel().getColumn(3).setResizable(false);
            jtl_consultar_consulta.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel7.setText("Veterinário:");

        jLabel8.setText("Animal:");

        nome_animal_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_animal_pesquisarActionPerformed(evt);
            }
        });

        btnpesquisarvetconsultaveterinario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao_2/view/imagens/pesquisar.png"))); // NOI18N
        btnpesquisarvetconsultaveterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesquisarvetconsultaveterinarioActionPerformed(evt);
            }
        });

        btnpesquisaranimalconsultaanimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao_2/view/imagens/pesquisar.png"))); // NOI18N
        btnpesquisaranimalconsultaanimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesquisaranimalconsultaanimalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nome_veterinario_pesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                            .addComponent(nome_animal_pesquisar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnpesquisarvetconsultaveterinario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnpesquisaranimalconsultaanimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nome_veterinario_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nome_animal_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnpesquisarvetconsultaveterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnpesquisaranimalconsultaanimal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        btnexcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/avaliacao_2/view/imagens/excluir.png"))); // NOI18N
        btnexcluir.setText("Excluir");
        btnexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(358, 358, 358)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(btnnovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnsalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnexcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnsair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 239, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncancelar)
                    .addComponent(btnsair)
                    .addComponent(btnsalvar)
                    .addComponent(btnnovo)
                    .addComponent(btnexcluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnpesquisarvetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesquisarvetActionPerformed
        preencheTabelaVeterinario(nome_veterinario.getText());
    }//GEN-LAST:event_btnpesquisarvetActionPerformed

    private void btnnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnovoActionPerformed
        preencheDataHora();
        liberaCampos(true);
        liberaBotoes(false, true, true, false, true);
        gravar_alterar = 1;
    }//GEN-LAST:event_btnnovoActionPerformed

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

    private void btnpesquisaranimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesquisaranimalActionPerformed
        preencheTabelaAnimal(nome_animal.getText());
    }//GEN-LAST:event_btnpesquisaranimalActionPerformed

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnsairActionPerformed

    private void btnpesquisarvetconsultaveterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesquisarvetconsultaveterinarioActionPerformed
        preencheTabelaConsultaVeterinario(nome_veterinario_pesquisar.getText());
    }//GEN-LAST:event_btnpesquisarvetconsultaveterinarioActionPerformed

    private void nome_animal_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_animal_pesquisarActionPerformed
        
    }//GEN-LAST:event_nome_animal_pesquisarActionPerformed

    private void btnpesquisaranimalconsultaanimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesquisaranimalconsultaanimalActionPerformed
        preencheTabelaConsultaAnimal(nome_animal_pesquisar.getText());
    }//GEN-LAST:event_btnpesquisaranimalconsultaanimalActionPerformed

    private void jtl_consultar_consultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtl_consultar_consultaMouseClicked
        preencheCamposConsulta(Integer.parseInt(String.valueOf(
                jtl_consultar_consulta.getValueAt(
                        jtl_consultar_consulta.getSelectedRow(), 0))));
        liberaBotoes(false, true, true, true, true);
    }//GEN-LAST:event_jtl_consultar_consultaMouseClicked

    private void btnexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluirActionPerformed
        excluir();
        limpaCampos();
        liberaCampos(false);
        liberaBotoes(true, false, false, false, true);
        modelo_jtl_consultar_consulta.setNumRows(0);
    }//GEN-LAST:event_btnexcluirActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        limpaCampos();
        liberaCampos(false);
        modelo_jtl_consultar_consulta.setNumRows(0);
        liberaBotoes(true, false, false, false, true);
        gravar_alterar=0;
    }//GEN-LAST:event_btncancelarActionPerformed
    
    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2); 
    }
    
    private void liberaCampos(boolean a) {
        nome_veterinario.setEnabled(a);
        btnpesquisarvet.setEnabled(a);
        jtl_consultar_veterinario.setEnabled(a);
        nome_animal.setEnabled(a);
        btnpesquisaranimal.setEnabled(a);
        jtl_consultar_animal.setEnabled(a);
        descricao_consulta.setEnabled(a);
        data_consulta.setEnabled(a);
        hora_consulta.setEnabled(a);
                
    }

    private void liberaBotoes(boolean a, boolean b, boolean c, boolean d, boolean e) {
        btnnovo.setEnabled(a);
        btnsalvar.setEnabled(b);
        btncancelar.setEnabled(c);
        btnexcluir.setEnabled(d);
        btnsair.setEnabled(e);
    }
    
    private void limpaCampos() {
        nome_veterinario.setText("");
        btnpesquisarvet.setText("");
        nome_animal.setText("");
        btnpesquisaranimal.setText("");
        modelo_jtl_consultar_animal.setNumRows(0);
        modelo_jtl_consultar_veterinario.setNumRows(0);
        descricao_consulta.setText("");
        data_consulta.setText("");
        hora_consulta.setText("");
    }
    
    private void preencheTabelaVeterinario(String nome_vet) {
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
    
    private void preencheTabelaAnimal(String nome_animal) {
        try {
            modelo_jtl_consultar_animal.setNumRows(0);
            animalDTO.setNome_animal(nome_animal);
            rs = consultaCTR.consultarAnimal(animalDTO);
            while (rs.next()) {
                modelo_jtl_consultar_animal.addRow(new Object[]{
                    rs.getString("id_animal"),
                    rs.getString("nome_animal"),
                    rs.getString("nome_pessoa"),});
            }
        } catch (Exception erTab) {
            System.out.println("Erro SQL: " + erTab);
        } finally {
            consultaCTR.CloseDB();
        }
    }
    
    private void preencheTabelaConsultaVeterinario(String nome_vet) {
        try {
            modelo_jtl_consultar_consulta.setNumRows(0);
            veterinarioDTO.setNome_vet(nome_vet);
            rs = consultaCTR.consultarConsulta(consultaDTO, veterinarioDTO, animalDTO, 1);
            while (rs.next()) {
                modelo_jtl_consultar_consulta.addRow(new Object[]{
                    rs.getString("id_consulta"),
                    rs.getString("nome_vet"),
                    rs.getString("nome_animal"),
                    rs.getString("data_consulta"),
                    rs.getString("hora_consulta")});
            }
        } catch (Exception erTab) {
            System.out.println("Erro SQL: " + erTab);
        } finally {
            consultaCTR.CloseDB();
        }
    }
    
    private void preencheTabelaConsultaAnimal(String nome_animal) {
        try {
            modelo_jtl_consultar_consulta.setNumRows(0);
            animalDTO.setNome_animal(nome_animal);
            rs = consultaCTR.consultarConsulta(consultaDTO, veterinarioDTO, animalDTO, 2);
            while (rs.next()) {
                modelo_jtl_consultar_consulta.addRow(new Object[]{
                    rs.getString("id_consulta"),
                    rs.getString("nome_vet"),
                    rs.getString("nome_animal"),
                    rs.getString("data_consulta"),
                    rs.getString("hora_consulta")});
            }
        } catch (Exception erTab) {
            System.out.println("Erro SQL: " + erTab);
        } finally {
            consultaCTR.CloseDB();
        }
    }
    
    private void preencheCamposConsulta(int id_consulta) {
        try {
            consultaDTO.setId_consulta(id_consulta);
            rs = consultaCTR.consultarConsulta(consultaDTO, veterinarioDTO, animalDTO, 3);
            if (rs.next()) {
                limpaCampos();

                descricao_consulta.setText(rs.getString("descricao_consulta"));
                data_consulta.setText(rs.getString("datConsulta"));
                hora_consulta.setText(rs.getString("hora_consulta"));

                modelo_jtl_consultar_animal.setNumRows(0);
                modelo_jtl_consultar_veterinario.setNumRows(0);
                modelo_jtl_consultar_veterinario.addRow(new Object[]{
                    rs.getString("id_vet"),
                    rs.getString("nome_vet"),});
                modelo_jtl_consultar_animal.addRow(new Object[]{
                    rs.getString("id_animal"),
                    rs.getString("nome_animal"),
                    rs.getString("nome_pessoa"),});
                jtl_consultar_animal.setRowSelectionInterval(0, 0);
                jtl_consultar_veterinario.setRowSelectionInterval(0, 0);
                
                gravar_alterar = 2;
                liberaCampos(true);
            }
        } catch (Exception erTab) {
            System.out.println("Erro SQL: " + erTab);
        } finally {
            animalCTR.CloseDB();
        }
    }
    
    private void preencheDataHora () {
        LocalTime horaAtual = LocalTime.now();
        DateTimeFormatter hora_formato = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horaFormatada = horaAtual.format(hora_formato);
        hora_consulta.setText(horaFormatada);
    
        LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter data_formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = dataAtual.format(data_formato);
        data_consulta.setText(dataFormatada);
    }
    
    private void gravar() {
        try {
            consultaDTO.setDescricao(descricao_consulta.getText());
            consultaDTO.setData_consulta(data_format.parse(data_consulta.getText()));
            consultaDTO.setHora_consultada(hora_format.parse(hora_consulta.getText()));
            veterinarioDTO.setId_vet(Integer.parseInt(String.valueOf(
                    jtl_consultar_veterinario.getValueAt(
                            jtl_consultar_veterinario.getSelectedRow(), 0))));
            animalDTO.setId_animal(Integer.parseInt(String.valueOf(
                    jtl_consultar_animal.getValueAt(
                            jtl_consultar_animal.getSelectedRow(), 0))));

            JOptionPane.showMessageDialog(null,
                    consultaCTR.inserirConsulta(consultaDTO, animalDTO, veterinarioDTO)
            );
        } catch (Exception e) {
            System.out.println("Erro ao Gravar" + e.getMessage());
        }
    }
    
    private void alterar() {
        try {
            consultaDTO.setDescricao(descricao_consulta.getText());
            consultaDTO.setData_consulta(data_format.parse(data_consulta.getText()));
            consultaDTO.setHora_consultada(hora_format.parse(hora_consulta.getText()));
            veterinarioDTO.setId_vet(Integer.parseInt(String.valueOf(
                    jtl_consultar_veterinario.getValueAt(
                            jtl_consultar_veterinario.getSelectedRow(), 0))));
            animalDTO.setId_animal(Integer.parseInt(String.valueOf(
                    jtl_consultar_animal.getValueAt(
                            jtl_consultar_animal.getSelectedRow(), 0))));

            JOptionPane.showMessageDialog(null,
                    consultaCTR.alterarConsulta(consultaDTO, animalDTO, veterinarioDTO)
            );
        } catch (Exception e) {
            System.out.println("Erro ao Gravar" + e.getMessage());
        }
    }
    
    private void excluir() {
        if (JOptionPane.showConfirmDialog(null, "Deseja Realmente excluir o cadastro desta Consulta?", "Aviso",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null,
                    consultaCTR.excluirConsulta(consultaDTO)
            );
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnexcluir;
    private javax.swing.JButton btnnovo;
    private javax.swing.JButton btnpesquisaranimal;
    private javax.swing.JButton btnpesquisaranimalconsultaanimal;
    private javax.swing.JButton btnpesquisarvet;
    private javax.swing.JButton btnpesquisarvetconsultaveterinario;
    private javax.swing.JButton btnsair;
    private javax.swing.JButton btnsalvar;
    private javax.swing.JFormattedTextField data_consulta;
    private javax.swing.JTextArea descricao_consulta;
    private javax.swing.JFormattedTextField hora_consulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jtl_consultar_animal;
    private javax.swing.JTable jtl_consultar_consulta;
    private javax.swing.JTable jtl_consultar_veterinario;
    private javax.swing.JTextField nome_animal;
    private javax.swing.JTextField nome_animal_pesquisar;
    private javax.swing.JTextField nome_veterinario;
    private javax.swing.JTextField nome_veterinario_pesquisar;
    // End of variables declaration//GEN-END:variables
}