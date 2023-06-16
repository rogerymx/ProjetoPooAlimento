/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetoze;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Listas_Tabelas extends javax.swing.JFrame {

    private static Listas_Tabelas listTab;

    public static Listas_Tabelas getListas_Tabelas() {
        if (listTab == null) {
            listTab = new Listas_Tabelas();
        }
        return listTab;
    }

    private Listas_Tabelas() {
        initComponents();
        setLocationRelativeTo(null);
        preencheTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaHamb = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaPizza = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelaPastel = new javax.swing.JTable();
        botaoSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText("Pizza");

        tabelaHamb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "ID Venda", "Cliente", "Valor Total", "Carne", "Unidade", "Quantidade", "CarneExtra", "QtdCarne", "Tipo de Pão"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Boolean.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        }
    );
    jScrollPane2.setViewportView(tabelaHamb);

    jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
    jLabel3.setText("Hamburguer");

    tabelaPizza.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {},
        new String [] {
            "ID Venda", "Cliente", "Valor Total", "Sabor", "ValUnidade", "Quantidade", "Recheio Extra", "Tamanho", "Borda"
        }
    ) {
        Class[] types = new Class [] {
            java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Boolean.class, java.lang.String.class, java.lang.Boolean.class
        };

        public Class getColumnClass(int columnIndex) {
            return types [columnIndex];
        }
    }
    );
    jScrollPane3.setViewportView(tabelaPizza);

    jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
    jLabel4.setText("Pastel");

    tabelaPastel.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {},
        new String [] {
            "ID Venda", "Cliente", "Valor Total", "Recheio", "Unidade", "Quantidade", "Recheio Extra", "SaborMassa", "Tipo"
        }
    ) {
        Class[] types = new Class [] {
            java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Boolean.class, java.lang.String.class, java.lang.String.class
        };

        public Class getColumnClass(int columnIndex) {
            return types [columnIndex];
        }
    }
    );
    jScrollPane4.setViewportView(tabelaPastel);

    botaoSair.setBackground(new java.awt.Color(255, 153, 153));
    botaoSair.setText("Sair");
    botaoSair.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            botaoSairActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(63, 63, 63)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createSequentialGroup()
                    .addGap(498, 498, 498)
                    .addComponent(jLabel3))
                .addGroup(layout.createSequentialGroup()
                    .addGap(568, 568, 568)
                    .addComponent(jLabel1))
                .addGroup(layout.createSequentialGroup()
                    .addGap(562, 562, 562)
                    .addComponent(jLabel4))
                .addGroup(layout.createSequentialGroup()
                    .addGap(55, 55, 55)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(412, 412, 412)
                    .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(78, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(19, 19, 19)
            .addComponent(jLabel3)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(41, 41, 41)
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel4)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(34, 34, 34)
            .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(93, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente fechar a janela?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_botaoSairActionPerformed

    /**
     * @param args the command line arguments
     */
    

    private void preencheTable() {
        DefaultTableModel modeloTabela = (DefaultTableModel) tabelaHamb.getModel();
        modeloTabela.setRowCount(0);
        for (Hamburguer h : BD.getBD().getBdHamb()) {
            Object[] linha = {
                h.getVenda().getIdVenda(),
                h.getVenda().getNomeCliente(),
                h.getVenda().getValorTotal(),
                h.getRecheio(),
                h.getPrecoUn(),
                h.getQuantidade(),
                h.isExtra(),
                h.getQtdCarne(),
                h.getTipoPao()
            };
            modeloTabela.addRow(linha);
        }

        DefaultTableModel modeloTabela2 = (DefaultTableModel) tabelaPizza.getModel();
        modeloTabela2.setRowCount(0);
        for (Pizza pizza : BD.getBD().getBdPizza()) {
            Object[] linha = {
                pizza.getVenda().getIdVenda(),
                pizza.getVenda().getNomeCliente(),
                pizza.getVenda().getValorTotal(),
                pizza.getRecheio(),
                pizza.getPrecoUn(),
                pizza.getQuantidade(),
                pizza.isExtra(),
                pizza.getTamanho(),
                pizza.isBordaRecheada()
            };
            modeloTabela2.addRow(linha);
        }
        
        DefaultTableModel modeloTabela3 = (DefaultTableModel) tabelaPastel.getModel();
        modeloTabela3.setRowCount(0);
        for (Pastel pastel : BD.getBD().getBdPastel()) {
            Object[] linha = {
                pastel.getVenda().getIdVenda(),
                pastel.getVenda().getNomeCliente(),
                pastel.getVenda().getValorTotal(),
                pastel.getRecheio(),
                pastel.getPrecoUn(),
                pastel.getQuantidade(),
                pastel.isExtra(),
                pastel.getMassaSabor(),
                pastel.getTipoCozimento()
            };
            modeloTabela3.addRow(linha);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tabelaHamb;
    private javax.swing.JTable tabelaPastel;
    private javax.swing.JTable tabelaPizza;
    // End of variables declaration//GEN-END:variables
}
