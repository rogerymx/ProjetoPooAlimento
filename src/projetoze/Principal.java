//VERSÃO UTILIZADA: NetBeans IDE 17
//Aluno: Roger Yoshiaki Motoyama / ra:2418355
package projetoze;

import javax.swing.JOptionPane;


/**
 *
 * @author Roger
 */
public class Principal extends javax.swing.JFrame {

    private static Principal telaPrincipal;

    private Principal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public static Principal getPrincipal() {
        if (telaPrincipal == null) {
            telaPrincipal = new Principal();
        }
        return telaPrincipal;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        btLista = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btPizza = new javax.swing.JButton();
        btPastel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JLabel();
        btHamb = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        bmPrinc = new javax.swing.JMenuBar();
        mnPrinc = new javax.swing.JMenu();
        opcHamb = new javax.swing.JMenuItem();
        opcPizza = new javax.swing.JMenuItem();
        opcPastel = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        jButton3.setText("jButton3");

        jButton4.setText("jButton4");

        jMenu2.setText("jMenu2");

        jMenuItem1.setText("jMenuItem1");
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(560, 764));
        setMinimumSize(new java.awt.Dimension(560, 764));
        setSize(new java.awt.Dimension(560, 764));

        btLista.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btLista.setText("Tabela");
        btLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListaActionPerformed(evt);
            }
        });

        btSair.setBackground(new java.awt.Color(255, 153, 153));
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btPizza.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btPizza.setText("Pizza");
        btPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPizzaActionPerformed(evt);
            }
        });

        btPastel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btPastel.setText("Pastel");
        btPastel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPastelActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Tipo de alimento");

        txtTitulo.setFont(new java.awt.Font("Unispace", 1, 48)); // NOI18N
        txtTitulo.setText("Sistema de vendas");

        btHamb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btHamb.setText("Hamburguer");
        btHamb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHambActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Tabela de vendas");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText(" (inserções, alterações e exclusões)");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Tela de busca de vendas");

        mnPrinc.setText("Alimentos");

        opcHamb.setText("Hamburguer");
        opcHamb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcHambActionPerformed(evt);
            }
        });
        mnPrinc.add(opcHamb);

        opcPizza.setText("Pizza");
        opcPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcPizzaActionPerformed(evt);
            }
        });
        mnPrinc.add(opcPizza);

        opcPastel.setText("Pastel");
        opcPastel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcPastelActionPerformed(evt);
            }
        });
        mnPrinc.add(opcPastel);

        bmPrinc.add(mnPrinc);

        jMenu1.setText("Sair");

        jMenuItem3.setText("Sair");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        bmPrinc.add(jMenu1);

        setJMenuBar(bmPrinc);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btHamb)
                        .addGap(39, 39, 39)
                        .addComponent(btPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(btPastel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(btLista, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btHamb, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPastel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btLista, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        setBounds(0, 0, 556, 645);
    }// </editor-fold>//GEN-END:initComponents

    private void btHambActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHambActionPerformed
        TelaHamburguer.getTelaHamburguer().setVisible(true);
    }//GEN-LAST:event_btHambActionPerformed

    private void btPastelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPastelActionPerformed
        TelaPastel.getTelaPastel().setVisible(true);
    }//GEN-LAST:event_btPastelActionPerformed

    private void btPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPizzaActionPerformed
        TelaPizza.getTelaPizza().setVisible(true);
    }//GEN-LAST:event_btPizzaActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente fechar a janela?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_btSairActionPerformed

    private void btListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListaActionPerformed
        Listas_Tabelas.getListas_Tabelas().setVisible(true);
    }//GEN-LAST:event_btListaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TelaBusca.getTelaBusca().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void opcHambActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcHambActionPerformed
        TelaHamburguer.getTelaHamburguer().setVisible(true);
    }//GEN-LAST:event_opcHambActionPerformed

    private void opcPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcPizzaActionPerformed
        TelaPizza.getTelaPizza().setVisible(true);
    }//GEN-LAST:event_opcPizzaActionPerformed

    private void opcPastelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcPastelActionPerformed
        TelaPastel.getTelaPastel().setVisible(true);
    }//GEN-LAST:event_opcPastelActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente fechar a janela?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar bmPrinc;
    private javax.swing.JButton btHamb;
    private javax.swing.JButton btLista;
    private javax.swing.JButton btPastel;
    private javax.swing.JButton btPizza;
    private javax.swing.JButton btSair;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenu mnPrinc;
    private javax.swing.JMenuItem opcHamb;
    private javax.swing.JMenuItem opcPastel;
    private javax.swing.JMenuItem opcPizza;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
