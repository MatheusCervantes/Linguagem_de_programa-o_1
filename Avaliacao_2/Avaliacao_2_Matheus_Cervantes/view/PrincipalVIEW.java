package br.com.avaliacao_2.view;

import javax.swing.JOptionPane;
import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import br.com.avaliacao_2.dto.FuncionarioDTO;

public class PrincipalVIEW extends javax.swing.JFrame {

    public PrincipalVIEW(FuncionarioDTO funcionarioDTO) {
        initComponents();
        this.setLocationRelativeTo(null);
        if(funcionarioDTO.getTipo_fun().equalsIgnoreCase("COMUM")) {
            itemMenuFuncionario.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon imageIcon = new ImageIcon(getClass().getResource("imagens/tela_inicial.jpg"));
        Image image = imageIcon.getImage();
        desktopPane = new javax.swing.JDesktopPane() {
            public void paintComponent (Graphics graphics) {
                graphics.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        menuBar = new javax.swing.JMenuBar();
        helpMenu = new javax.swing.JMenu();
        itemMenuPessoa = new javax.swing.JMenuItem();
        itemMenuAnimal = new javax.swing.JMenuItem();
        itemMenuVeterinario = new javax.swing.JMenuItem();
        itemMenuFuncionario = new javax.swing.JMenuItem();
        menuConsulta = new javax.swing.JMenu();
        menuDeslogar = new javax.swing.JMenu();
        menuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Cadastro");

        itemMenuPessoa.setMnemonic('c');
        itemMenuPessoa.setText("Pessoa");
        itemMenuPessoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemMenuPessoaMouseClicked(evt);
            }
        });
        itemMenuPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuPessoaActionPerformed(evt);
            }
        });
        helpMenu.add(itemMenuPessoa);

        itemMenuAnimal.setText("Animal");
        itemMenuAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuAnimalActionPerformed(evt);
            }
        });
        helpMenu.add(itemMenuAnimal);

        itemMenuVeterinario.setMnemonic('a');
        itemMenuVeterinario.setText("Veterinario");
        itemMenuVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuVeterinarioActionPerformed(evt);
            }
        });
        helpMenu.add(itemMenuVeterinario);

        itemMenuFuncionario.setText("Funcionário");
        itemMenuFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuFuncionarioActionPerformed(evt);
            }
        });
        helpMenu.add(itemMenuFuncionario);

        menuBar.add(helpMenu);

        menuConsulta.setText("Consulta");
        menuConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuConsultaMouseClicked(evt);
            }
        });
        menuConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultaActionPerformed(evt);
            }
        });
        menuBar.add(menuConsulta);

        menuDeslogar.setText("Deslogar");
        menuDeslogar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuDeslogarMouseClicked(evt);
            }
        });
        menuBar.add(menuDeslogar);

        menuSair.setText("Sair");
        menuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSairMouseClicked(evt);
            }
        });
        menuBar.add(menuSair);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 977, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSairMouseClicked
        sair();
    }//GEN-LAST:event_menuSairMouseClicked

    private void itemMenuPessoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMenuPessoaMouseClicked

    }//GEN-LAST:event_itemMenuPessoaMouseClicked

    private void itemMenuPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuPessoaActionPerformed
        abrePessoaVIEW();
    }//GEN-LAST:event_itemMenuPessoaActionPerformed

    private void itemMenuVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuVeterinarioActionPerformed
        abreVeterinarioVIEW();
    }//GEN-LAST:event_itemMenuVeterinarioActionPerformed

    private void itemMenuAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuAnimalActionPerformed
        abreAnimalVIEW();
    }//GEN-LAST:event_itemMenuAnimalActionPerformed

    private void menuConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultaActionPerformed

    }//GEN-LAST:event_menuConsultaActionPerformed

    private void menuConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuConsultaMouseClicked
        abreConsultaVIEW();
    }//GEN-LAST:event_menuConsultaMouseClicked

    private void itemMenuFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuFuncionarioActionPerformed
        abreFuncionarioVIEW();
    }//GEN-LAST:event_itemMenuFuncionarioActionPerformed

    private void menuDeslogarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuDeslogarMouseClicked
        deslogar();
    }//GEN-LAST:event_menuDeslogarMouseClicked
  
    private void sair(){
        Object[] options = { "Sair", "Cancelar" };
        if(JOptionPane.showOptionDialog(null, "Deseja Sair do Sistema", "Informação", 
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]) == 0){
            System.exit(0);
        } 
    } 
    
    private void deslogar(){
        Object[] options = { "Deslogar", "Cancelar" };
        if(JOptionPane.showOptionDialog(null, "Deseja Deslogar do Sistema", "Informação", 
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]) == 0){
            this.dispose();
            abreLoginVIEW();
        } 
    } 
    
    private void abrePessoaVIEW(){
        PessoaVIEW pessoaVIEW = new PessoaVIEW();
        this.desktopPane.add(pessoaVIEW);
        pessoaVIEW.setVisible(true); 
        pessoaVIEW.setPosicao();
    }
    
    private void abreVeterinarioVIEW(){
        VeterinarioVIEW veterinarioVIEW = new VeterinarioVIEW();
        this.desktopPane.add(veterinarioVIEW);
        veterinarioVIEW.setVisible(true); 
        veterinarioVIEW.setPosicao();
    }
    
    private void abreAnimalVIEW(){
        AnimalVIEW animalVIEW = new AnimalVIEW();
        this.desktopPane.add(animalVIEW);
        animalVIEW.setVisible(true); 
        animalVIEW.setPosicao();
    }
    
    private void abreConsultaVIEW(){
        ConsultaVIEW consultaVIEW = new ConsultaVIEW();
        this.desktopPane.add(consultaVIEW);
        consultaVIEW.setVisible(true);
        consultaVIEW.setPosicao();
    }
    
    private void abreFuncionarioVIEW(){
        FuncionarioVIEW funcionarioVIEW = new FuncionarioVIEW();
        this.desktopPane.add(funcionarioVIEW);
        funcionarioVIEW.setVisible(true);
        funcionarioVIEW.setPosicao();
    }
    
    private void abreLoginVIEW(){
        LoginVIEW loginVIEW = new LoginVIEW();
        loginVIEW.setVisible(true);
    }
    
    /*public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalVIEW().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem itemMenuAnimal;
    private javax.swing.JMenuItem itemMenuFuncionario;
    private javax.swing.JMenuItem itemMenuPessoa;
    private javax.swing.JMenuItem itemMenuVeterinario;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuConsulta;
    private javax.swing.JMenu menuDeslogar;
    private javax.swing.JMenu menuSair;
    // End of variables declaration//GEN-END:variables

}