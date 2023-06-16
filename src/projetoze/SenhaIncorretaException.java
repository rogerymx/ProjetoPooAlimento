//VERSÃO UTILIZADA: NetBeans IDE 17
//Aluno: Roger Yoshiaki Motoyama / ra:2418355
package projetoze;

import javax.swing.JOptionPane;

public class SenhaIncorretaException extends Exception {

    public void impSenhaIncorretaException() {
        JOptionPane.showMessageDialog(null, "Senha Incorreta!! EXCEPTION", "Exception user incorreto", 0);
    }
}
