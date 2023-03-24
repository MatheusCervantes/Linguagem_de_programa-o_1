package br.com.avaliacao_1.view;

import javax.swing.JOptionPane;

public class PrincipalVIEW extends javax.swing.JFrame {

    public PrincipalVIEW() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        menuCarro = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuCadastro.setMnemonic('f');
        menuCadastro.setText("Cadastro");

        menuCarro.setMnemonic('o');
        menuCarro.setText("Carro");
        menuCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCarroActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCarro);

        menuBar.add(menuCadastro);

        menuSair.setMnemonic('e');
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSairMouseClicked
        sair();
    }//GEN-LAST:event_menuSairMouseClicked

    private void menuCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCarroActionPerformed
        abreCarroVIEW();
    }//GEN-LAST:event_menuCarroActionPerformed
    
    private void sair() {
        Object[] options = {"Sair", "Cancelar" };
        if (JOptionPane.showOptionDialog(null, "Deseja Sair do Sistema", "Informação ", JOptionPane.DEFAULT_OPTION, 
                JOptionPane.WARNING_MESSAGE, null, options, options[0]) == 0) 
            System.exit(0);
    }
    
    private void abreCarroVIEW(){
        CarroVIEW carroVIEW = new CarroVIEW();
        this.desktopPane.add(carroVIEW);
        carroVIEW.setVisible(true);
        carroVIEW.setPosicao();
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalVIEW().setVisible(true);
            }
        });
    }  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenuItem menuCarro;
    private javax.swing.JMenu menuSair;
    // End of variables declaration//GEN-END:variables

}
