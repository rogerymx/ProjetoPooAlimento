//VERSÃO UTILIZADA: NetBeans IDE 17
//Aluno: Roger Yoshiaki Motoyama / ra:2418355
package projetoze;

import javax.swing.JOptionPane;

public class TelaPizza extends javax.swing.JFrame {

    private static TelaPizza telaPizza;
    private Pizza pizza = new Pizza();

    private TelaPizza() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public static TelaPizza getTelaPizza() {
        if (telaPizza == null) {
            telaPizza = new TelaPizza();
        }
        return telaPizza;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupTamanho = new javax.swing.ButtonGroup();
        buttongroupRecheio = new javax.swing.ButtonGroup();
        txtTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmpIdVenda = new javax.swing.JTextField();
        cmpNomeCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        botaoGrande = new javax.swing.JRadioButton();
        botaoMedia = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        botaoCalabresa = new javax.swing.JRadioButton();
        botaoFrango = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        botaoSair = new javax.swing.JButton();
        botaoCadastra = new javax.swing.JButton();
        spinnerQtdPizza = new javax.swing.JSpinner();
        botaoEdita = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        botaoPequena = new javax.swing.JRadioButton();
        checkExtra = new javax.swing.JCheckBox();
        checkBorda = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(659, 420));

        txtTitulo.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        txtTitulo.setText("Pizza");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("ID Venda (6 dígitos de num. inteiros)");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
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

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Tamanho da pizza(Obrigatório)");

        buttonGroupTamanho.add(botaoGrande);
        botaoGrande.setText("Grande");
        botaoGrande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoGrandeActionPerformed(evt);
            }
        });

        buttonGroupTamanho.add(botaoMedia);
        botaoMedia.setText("Média");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Recheio (Obrigatório)");

        buttongroupRecheio.add(botaoCalabresa);
        botaoCalabresa.setText("Calabresa");
        botaoCalabresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCalabresaActionPerformed(evt);
            }
        });

        buttongroupRecheio.add(botaoFrango);
        botaoFrango.setText("Frango e catupiry");
        botaoFrango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFrangoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Quantidade de pizzas (1 a 10)");

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

        spinnerQtdPizza.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

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

        jLabel7.setText("Obs: edição e exclusão é feita pela busca da ID Venda de uma pizza já cadastrada.");

        buttonGroupTamanho.add(botaoPequena);
        botaoPequena.setText("Pequena");
        botaoPequena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPequenaActionPerformed(evt);
            }
        });

        checkExtra.setText("Recheio extra");
        checkExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkExtraActionPerformed(evt);
            }
        });

        checkBorda.setText("Borda recheada");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Opcionais:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(txtTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1)
                        .addGap(177, 177, 177)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(cmpIdVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(260, 260, 260)
                        .addComponent(cmpNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel5)
                        .addGap(100, 100, 100)
                        .addComponent(jLabel3)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoFrango)
                            .addComponent(botaoCalabresa))
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoGrande, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoPequena, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkBorda, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(spinnerQtdPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGap(100, 100, 100)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtTitulo)
                .addGap(11, 11, 11)
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
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(botaoFrango))
                    .addComponent(botaoCalabresa)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoGrande, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoMedia)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(botaoPequena))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkBorda)
                        .addGap(0, 0, 0)
                        .addComponent(checkExtra)))
                .addGap(19, 19, 19)
                .addComponent(jLabel6)
                .addGap(4, 4, 4)
                .addComponent(spinnerQtdPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoCadastra, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoEdita, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        setBounds(0, 0, 666, 460);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoGrandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoGrandeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoGrandeActionPerformed

    private void cmpNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmpNomeClienteActionPerformed

    private void botaoCalabresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCalabresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoCalabresaActionPerformed

    private void cmpIdVendaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmpIdVendaFocusGained

    }//GEN-LAST:event_cmpIdVendaFocusGained

    private void cmpIdVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpIdVendaActionPerformed

    }//GEN-LAST:event_cmpIdVendaActionPerformed

    private void botaoCadastraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastraActionPerformed
        if (validarCampos()) {
            insertPizza();
            limpar();
        }
    }//GEN-LAST:event_botaoCadastraActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente fechar a janela?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_botaoSairActionPerformed

    private void botaoEditaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditaActionPerformed
        if (validarCampos()) {
            editPizza();
        }
    }//GEN-LAST:event_botaoEditaActionPerformed

    private void botaoFrangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFrangoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoFrangoActionPerformed

    private void botaoPequenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPequenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoPequenaActionPerformed

    private void checkExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkExtraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkExtraActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        excluPizza();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void excluPizza() {

        pizza = new Pizza();
        pizza.getVenda().setIdVenda(Integer.parseInt(cmpIdVenda.getText()));

        pizza = BD.getBD().delPizza(pizza);

        if (pizza != null) {
            JOptionPane.showMessageDialog(
                    null,
                    "Nenhum ID encontrado para exclusão",
                    "Erro de exclusão",
                    0
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "ID da venda da pizza excluida com sucesso!",
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
        } else if (buttongroupRecheio.getSelection() == null) {
            JOptionPane.showMessageDialog(null, "Por favor selecione uma Recheio", "Erro nenhum recheio selecionado", 0);
            return (false);
        } else if (buttonGroupTamanho.getSelection() == null) {
            JOptionPane.showMessageDialog(null, "Por favor selecione uma das opções de Tamanho", "Erro nenhum tamanho de pizza selecionado", 0);
            return (false);
        }
        return (true);
    }

    private void insertPizza() {
        pizza = new Pizza();

        try {
            pizza.getVenda().setIdVenda(Integer.parseInt(cmpIdVenda.getText()));
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Por favor, campo de ID venda é permitido apenas números inteiros", "Erro de formato de ID", JOptionPane.ERROR_MESSAGE);
            return; // Retorna imediatamente em caso de erro
        }

        pizza.getVenda().setNomeCliente(cmpNomeCliente.getText());
        pizza.setQuantidade((int) spinnerQtdPizza.getValue());
        if (checkBorda.isSelected()) {
            pizza.setBordaRecheada(true);
        } else {
            pizza.setBordaRecheada(true);
        }
        if (checkExtra.isSelected()) {
            pizza.setExtra(true);
            pizza.setPrecoUn(10f);
        }

        if (botaoGrande.isSelected()) {
            pizza.setTamanho("Grande");
            pizza.setPrecoUn(pizza.getPrecoUn() + 40f);
        } else if (botaoMedia.isSelected()) {
            pizza.setTamanho("Média");
            pizza.setPrecoUn(pizza.getPrecoUn() + 30f);
        } else {
            pizza.setTamanho("Pequena");
            pizza.setPrecoUn(pizza.getPrecoUn() + 20f);
        }
        if (botaoCalabresa.isSelected()) {
            pizza.setRecheio("Calabresa");
            float valorUn = pizza.getPrecoUn() + 25f;
            float valorTotal = pizza.getQuantidade() * valorUn;
            pizza.setPrecoUn(valorUn);
            pizza.getVenda().setValorTotal(valorTotal);
        } else {
            pizza.setRecheio("Frango e catupiry");
            float valorUn = pizza.getPrecoUn() + 20f;
            float valorTotal = pizza.getQuantidade() * valorUn;
            pizza.setPrecoUn(valorUn);
            pizza.getVenda().setValorTotal(valorTotal);
        }

        pizza = BD.getBD().insPizza(pizza);
        if (pizza != null) {
            JOptionPane.showMessageDialog(null, "Venda de pizza cadastrado com sucesso!", "Cadastro de venda", JOptionPane.INFORMATION_MESSAGE);
            limpar();
        } else {
            JOptionPane.showMessageDialog(null, "Já existe uma venda de pizza cadastrada com este ID", "Erro cadastro de venda", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void editPizza() {
        pizza = new Pizza();
        try {
            pizza.getVenda().setIdVenda(Integer.parseInt(cmpIdVenda.getText()));
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Por favor, campo de ID venda é permitido apenas números inteiros", "Erro de formato de ID", JOptionPane.ERROR_MESSAGE);
            return;
        }
        pizza = BD.getBD().consultaIdPizza(pizza);

        if (pizza != null) {
            pizza.getVenda().setNomeCliente(cmpNomeCliente.getText());
            pizza.setQuantidade((int) spinnerQtdPizza.getValue());
            if (checkBorda.isSelected()) {
                pizza.setBordaRecheada(true);
            } else {
                pizza.setBordaRecheada(true);
            }

            if (botaoGrande.isSelected()) {
                pizza.setTamanho("Grande");
                pizza.setPrecoUn(40f);
            } else if (botaoMedia.isSelected()) {
                pizza.setTamanho("Média");
                pizza.setPrecoUn(30f);
            } else {
                pizza.setTamanho("Pequena");
                pizza.setPrecoUn(20f);
            }
            if (botaoCalabresa.isSelected()) {
                pizza.setRecheio("Calabresa");
                float valorUn = pizza.getPrecoUn() + 25f;
                float valorTotal = pizza.getQuantidade() * valorUn;
                pizza.setPrecoUn(valorUn);
                pizza.getVenda().setValorTotal(valorTotal);
            } else {
                pizza.setRecheio("Frango e catupiry");
                float valorUn = pizza.getPrecoUn() + 20f;
                float valorTotal = pizza.getQuantidade() * valorUn;
                pizza.setPrecoUn(valorUn);
                pizza.getVenda().setValorTotal(valorTotal);
            }
            JOptionPane.showMessageDialog(null, "Id encontrado e alterado !", "Alteração de pizza", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma venda de pizza cadastrada com este ID", "Erro edição de venda", JOptionPane.ERROR_MESSAGE);
        }
        limpar();
    }

    private void limpar() {
        cmpIdVenda.setText("");
        cmpNomeCliente.setText("");
        buttongroupRecheio.clearSelection();
        buttonGroupTamanho.clearSelection();
        checkBorda.setSelected(false);
        checkExtra.setSelected(false);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastra;
    private javax.swing.JRadioButton botaoCalabresa;
    private javax.swing.JButton botaoEdita;
    private javax.swing.JRadioButton botaoFrango;
    private javax.swing.JRadioButton botaoGrande;
    private javax.swing.JRadioButton botaoMedia;
    private javax.swing.JRadioButton botaoPequena;
    private javax.swing.JButton botaoSair;
    private javax.swing.ButtonGroup buttonGroupTamanho;
    private javax.swing.ButtonGroup buttongroupRecheio;
    private javax.swing.JCheckBox checkBorda;
    private javax.swing.JCheckBox checkExtra;
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
    private javax.swing.JSpinner spinnerQtdPizza;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
