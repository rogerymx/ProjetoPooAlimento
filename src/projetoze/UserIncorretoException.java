//VERSÃO UTILIZADA: NetBeans IDE 17
//Aluno: Roger Yoshiaki Motoyama / ra:2418355
package projetoze;

import javax.swing.JOptionPane;

public class UserIncorretoException extends Exception {

    public void impNumUserIncorretoException() {
        JOptionPane.showMessageDialog(null, "User Incorreto!! EXCEPTION", "Exception user incorreto", 0);
    }
}
