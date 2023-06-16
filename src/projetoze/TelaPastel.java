//VERSÃO UTILIZADA: NetBeans IDE 17
//Aluno: Roger Yoshiaki Motoyama / ra:2418355
package projetoze;

import javax.swing.JOptionPane;

public class TelaPastel extends javax.swing.JFrame {

    private static TelaPastel telaPastel;
    private Pastel pastel = new Pastel();

    private TelaPastel() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public static TelaPastel getTelaPastel() {
        if (telaPastel == null) {
            telaPastel = new TelaPastel();
        }
        return telaPastel;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupTipoPastel = new javax.swing.ButtonGroup();
        buttonGroupRecheio = new javax.swing.ButtonGroup();
        buttonGroupSaborMassa = new javax.swing.ButtonGroup();
        txtTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmpIdVenda = new javax.swing.JTextField();
        cmpNomeCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        botaoFrito = new javax.swing.JRadioButton();
        botaoAssado = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        botaoFrango = new javax.swing.JRadioButton();
        botaoCarne = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        botaoSair = new javax.swing.JButton();
        botaoCadastra = new javax.swing.JButton();
        spinnerQtdPastel = new javax.swing.JSpinner();
        botaoEdita = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        botaoQueijo = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        checkExtra = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        botaoAlho = new javax.swing.JRadioButton();
        botaoPimenta = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(667, 410));

        txtTitulo.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        txtTitulo.setText("Pastel");

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
        jLabel3.setText("Tipo do pastel (Obrigatório)");

        buttonGroupTipoPastel.add(botaoFrito);
        botaoFrito.setText("Frito");
        botaoFrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFritoActionPerformed(evt);
            }
        });

        buttonGroupTipoPastel.add(botaoAssado);
        botaoAssado.setText("Assado");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Recheio (Obrigatório)");

        buttonGroupRecheio.add(botaoFrango);
        botaoFrango.setText("Frango");
        botaoFrango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFrangoActionPerformed(evt);
            }
        });

        buttonGroupRecheio.add(botaoCarne);
        botaoCarne.setText("Carne");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Quantidade de pastéis (1 a 10)");

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

        spinnerQtdPastel.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

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

        buttonGroupRecheio.add(botaoQueijo);
        botaoQueijo.setText("Queijo");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Opcionais:");

        checkExtra.setText("Recheio extra");
        checkExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkExtraActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Sabor da massa (Obrigatório)");

        buttonGroupSaborMassa.add(botaoAlho);
        botaoAlho.setText("Alho");
        botaoAlho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlhoActionPerformed(evt);
            }
        });

        buttonGroupSaborMassa.add(botaoPimenta);
        botaoPimenta.setText("Pimenta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169)
                .addComponent(jLabel2))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(cmpIdVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(260, 260, 260)
                .addComponent(cmpNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel5)
                .addGap(60, 60, 60)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoFrango)
                    .addComponent(botaoCarne)
                    .addComponent(botaoQueijo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerQtdPastel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoAlho)
                    .addComponent(botaoPimenta))
                .addGap(133, 133, 133)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoFrito, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoAssado, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jLabel9)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoFrango)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(botaoCarne))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(botaoQueijo)))
                        .addGap(9, 9, 9)
                        .addComponent(jLabel6)
                        .addGap(4, 4, 4)
                        .addComponent(spinnerQtdPastel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botaoAlho)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(botaoPimenta))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoFrito, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(botaoAssado)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel8)
                        .addGap(4, 4, 4)
                        .addComponent(checkExtra)))
                .addGap(28, 28, 28)
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

    private void botaoFritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFritoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoFritoActionPerformed

    private void cmpNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmpNomeClienteActionPerformed

    private void botaoFrangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFrangoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoFrangoActionPerformed

    private void cmpIdVendaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmpIdVendaFocusGained

    }//GEN-LAST:event_cmpIdVendaFocusGained

    private void cmpIdVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpIdVendaActionPerformed

    }//GEN-LAST:event_cmpIdVendaActionPerformed

    private void botaoCadastraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastraActionPerformed
        if (validarCampos()) {
            insertPastel();
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
            editPastel();
        }
    }//GEN-LAST:event_botaoEditaActionPerformed

    private void checkExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkExtraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkExtraActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        excluPastel();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botaoAlhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoAlhoActionPerformed

    private void excluPastel() {

        pastel = new Pastel();
        pastel.getVenda().setIdVenda(Integer.parseInt(cmpIdVenda.getText()));

        pastel = BD.getBD().delPastel(pastel);

        if (pastel != null) {
            JOptionPane.showMessageDialog(
                    null,
                    "Nenhum ID encontrado para exclusão",
                    "Erro de exclusão",
                    0
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "ID da venda do pastel excluida com sucesso!",
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
        } else if (buttonGroupRecheio.getSelection() == null) {
            JOptionPane.showMessageDialog(null, "Por favor selecione uma das opções de recheio", "Erro nenhum recheio selecionado", 0);
            return (false);
        } else if (buttonGroupTipoPastel.getSelection() == null) {
            JOptionPane.showMessageDialog(null, "Por favor selecione uma das opções de tipo de pastel", "Erro nenhum tipo de pastel selecionado", 0);
            return (false);
        } else if (buttonGroupSaborMassa.getSelection() == null) {
            JOptionPane.showMessageDialog(null, "Por favor selecione uma das opções de sabor de massa", "Erro nenhum tipo de sabor de massa selecionado", 0);
            return (false);
        }
        return (true);
    }

    private void insertPastel() {
        pastel = new Pastel();

        try {
            pastel.getVenda().setIdVenda(Integer.parseInt(cmpIdVenda.getText()));
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Por favor, campo de ID venda é permitido apenas números inteiros", "Erro de formato de ID", JOptionPane.ERROR_MESSAGE);
            return; // Retorna imediatamente em caso de erro
        }
        if (botaoAlho.isSelected()) {
            pastel.setMassaSabor("Alho");
        } else {
            pastel.setMassaSabor("Pimenta");
        }
        pastel.getVenda().setNomeCliente(cmpNomeCliente.getText());
        pastel.setQuantidade((int) spinnerQtdPastel.getValue());

        if (botaoFrango.isSelected()) {
            pastel.setRecheio("Frango");
            float precoBase = 10.00f;
            pastel.setPrecoUn(precoBase);
        } else if (botaoCarne.isSelected()) {
            pastel.setRecheio("Carne");
            float precoBase = 12.00f;
            pastel.setPrecoUn(precoBase);
        } else {
            pastel.setRecheio("Queijo");
            float precoBase = 8.00f;
            pastel.setPrecoUn(precoBase);
        }

        if (botaoFrito.isSelected()) {
            pastel.setTipoCozimento("Frito");
        } else {
            pastel.setTipoCozimento("Assado");
        }

        if (checkExtra.isSelected()) {
            pastel.setExtra(true);
            pastel.setPrecoUn(pastel.getPrecoUn() + 2.00f);
        } else {
            pastel.setExtra(false);
        }

        pastel.getVenda().setValorTotal(pastel.getQuantidade() * pastel.getPrecoUn());
        pastel = BD.getBD().insPastel(pastel);
        if (pastel != null) {
            JOptionPane.showMessageDialog(null, "Venda de pastel cadastrado com sucesso!", "Cadastro de venda", JOptionPane.INFORMATION_MESSAGE);
            limpar();
        } else {
            JOptionPane.showMessageDialog(null, "Já existe uma venda de pastel cadastrada com este ID", "Erro cadastro de venda", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void editPastel() {
        pastel = new Pastel();
        try {
            pastel.getVenda().setIdVenda(Integer.parseInt(cmpIdVenda.getText()));
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Por favor, campo de ID venda é permitido apenas números inteiros", "Erro de formato de ID", JOptionPane.ERROR_MESSAGE);
            return;
        }
        pastel = BD.getBD().consultaIdPastel(pastel);

        if (pastel != null) {
            pastel.getVenda().setNomeCliente(cmpNomeCliente.getText());
            pastel.setQuantidade((int) spinnerQtdPastel.getValue());
            if (botaoAlho.isSelected()) {
                pastel.setMassaSabor("Alho");
            } else {
                pastel.setMassaSabor("Pimenta");
            }
            if (botaoFrango.isSelected()) {
                pastel.setRecheio("Frango");
                float precoBase = 10.00f;
                pastel.setPrecoUn(precoBase);
            } else if (botaoCarne.isSelected()) {
                pastel.setRecheio("Carne");
                float precoBase = 12.00f;
                pastel.setPrecoUn(precoBase);
            } else {
                pastel.setRecheio("Queijo");
                float precoBase = 8.00f;
                pastel.setPrecoUn(precoBase);
            }

            if (botaoFrito.isSelected()) {
                pastel.setTipoCozimento("Frito");
            } else {
                pastel.setTipoCozimento("Assado");
            }

            if (checkExtra.isSelected()) {
                pastel.setExtra(true);
                pastel.setPrecoUn(pastel.getPrecoUn() + 2.00f);
            } else {
                pastel.setExtra(false);
            }

            pastel.getVenda().setValorTotal(pastel.getQuantidade() * pastel.getPrecoUn());
            JOptionPane.showMessageDialog(null, "Id encontrado e alterado!", "Alteração de Pastel", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma venda de Pastel cadastrada com este ID", "Erro edição de venda", JOptionPane.ERROR_MESSAGE);
        }
        limpar();
    }

    private void limpar() {
        cmpIdVenda.setText("");
        cmpNomeCliente.setText("");
        buttonGroupRecheio.clearSelection();
        buttonGroupTipoPastel.clearSelection();
        checkExtra.setSelected(false);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton botaoAlho;
    private javax.swing.JRadioButton botaoAssado;
    private javax.swing.JButton botaoCadastra;
    private javax.swing.JRadioButton botaoCarne;
    private javax.swing.JButton botaoEdita;
    private javax.swing.JRadioButton botaoFrango;
    private javax.swing.JRadioButton botaoFrito;
    private javax.swing.JRadioButton botaoPimenta;
    private javax.swing.JRadioButton botaoQueijo;
    private javax.swing.JButton botaoSair;
    private javax.swing.ButtonGroup buttonGroupRecheio;
    private javax.swing.ButtonGroup buttonGroupSaborMassa;
    private javax.swing.ButtonGroup buttonGroupTipoPastel;
    private javax.swing.JCheckBox checkExtra;
    private javax.swing.JTextField cmpIdVenda;
    private javax.swing.JTextField cmpNomeCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner spinnerQtdPastel;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
