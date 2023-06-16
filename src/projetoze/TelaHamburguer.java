//VERSÃO UTILIZADA: NetBeans IDE 17
//Aluno: Roger Yoshiaki Motoyama / ra:2418355
package projetoze;

import javax.swing.JOptionPane;

public class TelaHamburguer extends javax.swing.JFrame {

    private static TelaHamburguer telaHamb;
    private Hamburguer h = new Hamburguer();

    private TelaHamburguer() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public static TelaHamburguer getTelaHamburguer() {
        if (telaHamb == null) {
            telaHamb = new TelaHamburguer();
        }
        return telaHamb;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupPao = new javax.swing.ButtonGroup();
        buttonGroupCarne = new javax.swing.ButtonGroup();
        txtTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmpIdVenda = new javax.swing.JTextField();
        cmpNomeCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        botaoFrances = new javax.swing.JRadioButton();
        botaoGergelim = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        botaoPicanha = new javax.swing.JRadioButton();
        botaoFigado = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        botaoSair = new javax.swing.JButton();
        botaoCadastra = new javax.swing.JButton();
        spinnerQtdLanches = new javax.swing.JSpinner();
        spinnerQtdCarnes = new javax.swing.JSpinner();
        botaoEdita = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(654, 420));

        txtTitulo.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        txtTitulo.setText("Hamburguer");

        jLabel1.setText("ID Venda (6 dígitos de num. inteiros)");

        jLabel2.setText("Nome do Cliente (20 a 45 caracteres)");

        cmpIdVenda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmpIdVendaFocusGained(evt);
            }
        });
        cmpIdVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmpIdVendaActionPerformed(evt);
            }
        });

        cmpNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmpNomeClienteActionPerformed(evt);
            }
        });

        jLabel3.setText("Tipo de pão (Obrigatório)");

        buttonGroupPao.add(botaoFrances);
        botaoFrances.setText("Francês");
        botaoFrances.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFrancesActionPerformed(evt);
            }
        });

        buttonGroupPao.add(botaoGergelim);
        botaoGergelim.setText("Gergelim");

        jLabel4.setText("Quantidade de carnes (1 a 5)");

        jLabel5.setText("Carne (Obrigatório)");

        buttonGroupCarne.add(botaoPicanha);
        botaoPicanha.setText("Picanha");
        botaoPicanha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPicanhaActionPerformed(evt);
            }
        });

        buttonGroupCarne.add(botaoFigado);
        botaoFigado.setText("Figado de boi");

        jLabel6.setText("Quantidade de lanches (1 a 10)");

        botaoSair.setBackground(new java.awt.Color(204, 204, 204));
        botaoSair.setText("Sair");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        botaoCadastra.setBackground(new java.awt.Color(153, 255, 153));
        botaoCadastra.setText("Cadastrar");
        botaoCadastra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastraActionPerformed(evt);
            }
        });

        spinnerQtdLanches.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        spinnerQtdCarnes.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        spinnerQtdCarnes.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerQtdCarnesStateChanged(evt);
            }
        });

        botaoEdita.setBackground(new java.awt.Color(255, 255, 153));
        botaoEdita.setText("Editar");
        botaoEdita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditaActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 153, 153));
        jButton1.setText("Excluir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Obs: edição e exclusão é feita pela busca da ID Venda de um hambúrguer já cadastrado.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1)
                        .addGap(187, 187, 187)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(cmpIdVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(260, 260, 260)
                        .addComponent(cmpNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(270, 270, 270)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoPicanha)
                            .addComponent(botaoFigado))
                        .addGap(285, 285, 285)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoFrances, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoGergelim, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel6)
                        .addGap(218, 218, 218)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(spinnerQtdLanches, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(330, 330, 330)
                        .addComponent(spinnerQtdCarnes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(botaoCadastra, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(botaoEdita, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(txtTitulo)))
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtTitulo)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmpIdVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmpNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoPicanha)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(botaoFigado))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoFrances, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(botaoGergelim)))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spinnerQtdLanches, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerQtdCarnes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoCadastra, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoEdita, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoFrancesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFrancesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoFrancesActionPerformed

    private void cmpNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmpNomeClienteActionPerformed

    private void botaoPicanhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPicanhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoPicanhaActionPerformed

    private void cmpIdVendaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmpIdVendaFocusGained

    }//GEN-LAST:event_cmpIdVendaFocusGained

    private void cmpIdVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpIdVendaActionPerformed

    }//GEN-LAST:event_cmpIdVendaActionPerformed

    private void botaoCadastraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastraActionPerformed
        if (validarCampos()) {
            insertHamburg();
        }
    }//GEN-LAST:event_botaoCadastraActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente fechar a janela?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_botaoSairActionPerformed

    private void spinnerQtdCarnesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerQtdCarnesStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_spinnerQtdCarnesStateChanged

    private void botaoEditaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditaActionPerformed
        if (validarCampos()) {
            editHamburg();
        }
    }//GEN-LAST:event_botaoEditaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        excluHamb();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void excluHamb() {
        h = new Hamburguer();
        h.getVenda().setIdVenda(Integer.parseInt(cmpIdVenda.getText()));

        h = BD.getBD().delHamb(h);

        if (h != null) {
            JOptionPane.showMessageDialog(
                    null,
                    "Nenhum ID encontrado para exclusão",
                    "Erro de exclusão",
                    0
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "ID da venda do hamburguer excluida com sucesso!",
                    "Sucesso na exclusão!",
                    1
            );
        }
        limpar();
    }

    private boolean validarCampos() {
        if (cmpIdVenda.getText().length() != 6) {
            JOptionPane.showMessageDialog(null, "A id de venda precisa de 6 dígitos", "Erro tamanho id", 0);
            cmpIdVenda.setText("");
            cmpIdVenda.requestFocus();
            return (false);
        } else if (!cmpIdVenda.getText().matches("[0-9]*")) {
            JOptionPane.showMessageDialog(null, "A id de venda só aceita números inteiros!", "Erro formatação id", 0);
            cmpIdVenda.setText("");
            cmpIdVenda.requestFocus();
            return (false);
        } else if (cmpNomeCliente.getText().length() < 20 || cmpNomeCliente.getText().length() > 45) {
            JOptionPane.showMessageDialog(null, "O nome do cliente necessita de 20 a 45 dígitos", "Erro tamanho nome", 0);
            cmpNomeCliente.requestFocus();
            return (false);
        } else if (buttonGroupCarne.getSelection() == null) {
            JOptionPane.showMessageDialog(null, "Por favor selecione uma das opções de carne", "Erro nenhuma carne selecionada", 0);
            return (false);
        } else if (buttonGroupPao.getSelection() == null) {
            JOptionPane.showMessageDialog(null, "Por favor selecione uma das opções de Pão", "Erro nenhum pão selecionado", 0);
            return (false);
        }
        return (true);
    }

    private void insertHamburg() {
        h = new Hamburguer();

        try {
            h.getVenda().setIdVenda(Integer.parseInt(cmpIdVenda.getText()));
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Por favor, campo de ID venda é permitido apenas números inteiros", "Erro de formato de ID", JOptionPane.ERROR_MESSAGE);
            return; // Retorna imediatamente em caso de erro
        }

        h.getVenda().setNomeCliente(cmpNomeCliente.getText());
        h.setQuantidade((int) spinnerQtdLanches.getValue());

        int qtdCarnes = (int) spinnerQtdCarnes.getValue();
        h.setExtra(qtdCarnes > 1);
        h.setQtdCarne(qtdCarnes);

        if (botaoPicanha.isSelected()) {
            h.setRecheio("Picanha");
            float precoBase = 30.00f;
            float precoAdicional = (qtdCarnes > 1) ? 15.00f * (qtdCarnes - 1) : 0;
            h.setPrecoUn(precoBase + precoAdicional);
            h.getVenda().setValorTotal(h.getQuantidade() * (precoBase + precoAdicional));
        } else {
            h.setRecheio("Fígado de boi");
            float precoBase = 10.00f;
            float precoAdicional = (qtdCarnes > 1) ? 3.00f * (qtdCarnes - 1) : 0;
            h.setPrecoUn(precoBase + precoAdicional);
            h.getVenda().setValorTotal(h.getQuantidade() * (precoBase + precoAdicional));
        }

        if (botaoFrances.isSelected()) {
            h.setTipoPao("Francês");
        } else {
            h.setTipoPao("Gergelim");
        }

        h = BD.getBD().insHamb(h);
        if (h != null) {
            JOptionPane.showMessageDialog(null, "Venda de hamburguer cadastrado com sucesso!", "Cadastro de venda", JOptionPane.INFORMATION_MESSAGE);
            limpar();
        } else {
            JOptionPane.showMessageDialog(null, "Já existe uma venda de hamburguer cadastrada com este ID", "Erro cadastro de venda", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void editHamburg() {
        h = new Hamburguer();
        try {
            h.getVenda().setIdVenda(Integer.parseInt(cmpIdVenda.getText()));
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Por favor, campo de ID venda é permitido apenas números inteiros", "Erro de formato de ID", JOptionPane.ERROR_MESSAGE);
            return;
        }
        h = BD.getBD().consultaIdHamb(h);

        if (h != null) {
            h.getVenda().setNomeCliente(cmpNomeCliente.getText());
            h.setQuantidade((int) spinnerQtdLanches.getValue());

            int qtdCarnes = (int) spinnerQtdCarnes.getValue();
            h.setExtra(qtdCarnes > 1);
            h.setQtdCarne(qtdCarnes);

            if (botaoPicanha.isSelected()) {
                h.setRecheio("Picanha");
                float precoBase = 30.00f;
                float precoAdicional = (qtdCarnes > 1) ? 15.00f * (qtdCarnes - 1) : 0;
                h.setPrecoUn(precoBase + precoAdicional);
                h.getVenda().setValorTotal(h.getQuantidade() * (precoBase + precoAdicional));
            } else {
                h.setRecheio("Fígado de boi");
                float precoBase = 10.00f;
                float precoAdicional = (qtdCarnes > 1) ? 3.00f * (qtdCarnes - 1) : 0;
                h.setPrecoUn(precoBase + precoAdicional);
                h.getVenda().setValorTotal(h.getQuantidade() * (precoBase + precoAdicional));
            }
            JOptionPane.showMessageDialog(null, "Id encontrado e alterado !", "Alteração de hamburguer", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma venda de hamburguer cadastrada com este ID", "Erro edição de venda", JOptionPane.ERROR_MESSAGE);
        }
        limpar();
    }


    /*private void insertHamburg(){
        h = new Hamburguer();
        try{
            h.getVenda().setIdVenda(Integer.parseInt(cmpIdVenda.getText()));
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"Por favor, campo de ID venda é permitido apenas números inteiros","Erro de formato de ID",0);
        }
        h.getVenda().setNomeCliente(cmpNomeCliente.getText());
        h.setQuantidade((int)spinnerQtdLanches.getValue());
        if((int)spinnerQtdCarnes.getValue() == 1){
            h.setExtra(false);
            h.setQtdCarne(1);
        }else{
            h.setExtra(true);
            h.setQtdCarne((int)spinnerQtdCarnes.getValue());
        }
        
        if(botaoPicanha.isSelected()){
            h.setRecheio("Picanha");
            else(h.getQtdCarne() == 1){
                h.getVenda().setValorTotal(h.getQuantidade() * 30.00f );
            }else{
                h.getVenda().setValorTotal(h.getQuantidade() * (30.00f + (15.00f * h.getQtdCarne())));
                h.setPrecoUn(30.00f);
        }else{
            h.setRecheio("Fígado de boi");
            h.setPrecoUn(10.00f);
        }
               
        h = BD.getBD().insHamb(h);
        if(h != null){
            JOptionPane.showMessageDialog(null,"Venda de hamburguer cadastrado com sucesso!","Cadastro de venda",1);
            limpar();
        }else{
            JOptionPane.showMessageDialog(null,"Já existe uma venda de hamburguer cadastrada com este ID","Erro cadastro de venda",0);
        }
    }*/
    private void limpar() {
        cmpIdVenda.setText("");
        cmpNomeCliente.setText("");
        buttonGroupCarne.clearSelection();
        buttonGroupPao.clearSelection();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastra;
    private javax.swing.JButton botaoEdita;
    private javax.swing.JRadioButton botaoFigado;
    private javax.swing.JRadioButton botaoFrances;
    private javax.swing.JRadioButton botaoGergelim;
    private javax.swing.JRadioButton botaoPicanha;
    private javax.swing.JButton botaoSair;
    private javax.swing.ButtonGroup buttonGroupCarne;
    private javax.swing.ButtonGroup buttonGroupPao;
    private javax.swing.JTextField cmpIdVenda;
    private javax.swing.JTextField cmpNomeCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSpinner spinnerQtdCarnes;
    private javax.swing.JSpinner spinnerQtdLanches;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
