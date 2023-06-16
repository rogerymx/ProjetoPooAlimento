//VERSÃO UTILIZADA: NetBeans IDE 17
//Aluno: Roger Yoshiaki Motoyama / ra:2418355
package projetoze;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Roger
 */
public class BD {

    static Hamburguer hamb = new Hamburguer();
    static Pizza pizza = new Pizza();
    static Pastel pastel = new Pastel();
    static List<Hamburguer> bdHamb;
    static List<Pizza> bdPizza;
    static List<Pastel> bdPastel;
    private static BD bancoH;

    private BD() {
        bdHamb = new ArrayList<Hamburguer>();
        bdPizza = new ArrayList<Pizza>();
        bdPastel = new ArrayList<Pastel>();
    }

    public static BD getBD() {
        if (bancoH == null) {
            bancoH = new BD();
        }
        return bancoH;
    }

    /*------------------------------Métodos Hamburguer ------------------------------*/
    public List<Hamburguer> getBdHamb() {
        return bdHamb;
    }

    public Hamburguer consultaIdHamb(Hamburguer h) {
        for (int i = 0; i < bdHamb.size(); i++) {
            if (h.getVenda().getIdVenda() == (bdHamb.get(i).getVenda().getIdVenda())) {
                return bdHamb.get(i);
            }
        }
        return null;
    }

    public Hamburguer insHamb(Hamburguer h) {
        if (consultaIdHamb(h) == null) {
            bdHamb.add(h);
            return h;
        }
        return null;
    }

    public static Hamburguer delHamb(Hamburguer h) {
        for (int i = 0; i < bdHamb.size(); i++) {
            if (h.getVenda().getIdVenda() == bdHamb.get(i).getVenda().getIdVenda()) {
                bdHamb.remove(bdHamb.get(i));
                return null;
            }
        }
        return hamb;
    }

    /*------------------------------Métodos Pizza------------------------------*/
    public List<Pizza> getBdPizza() {
        return bdPizza;
    }

    public Pizza consultaIdPizza(Pizza pizza) {
        for (int i = 0; i < bdPizza.size(); i++) {
            if (pizza.getVenda().getIdVenda() == (bdPizza.get(i).getVenda().getIdVenda())) {
                return bdPizza.get(i);
            }
        }
        return null;
    }

    public Pizza insPizza(Pizza pizza) {
        if (consultaIdPizza(pizza) == null) {
            bdPizza.add(pizza);
            return pizza;
        }
        return null;
    }
    
    public static Pizza delPizza(Pizza pizza) {
        for (int i = 0; i < bdPizza.size(); i++) {
            if (pizza.getVenda().getIdVenda() == bdPizza.get(i).getVenda().getIdVenda()) {
                bdPizza.remove(bdPizza.get(i));
                return null;
            }
        }
        return pizza;
    }

    /*------------------------------Métodos Pastel------------------------------*/
    public List<Pastel> getBdPastel() {
        return bdPastel;
    }

    public Pastel consultaIdPastel(Pastel pastel) {
        for (int i = 0; i < bdPastel.size(); i++) {
            if (pastel.getVenda().getIdVenda() == (bdPastel.get(i).getVenda().getIdVenda())) {
                return bdPastel.get(i);
            }
        }
        return null;
    }

    public Pastel insPastel(Pastel pastel) {
        if (consultaIdPastel(pastel) == null) {
            bdPastel.add(pastel);
            return pastel;
        }
        return null;
    }
    
    public static Pastel delPastel(Pastel pastel) {
        for (int i = 0; i < bdPastel.size(); i++) {
            if (pastel.getVenda().getIdVenda() == bdPastel.get(i).getVenda().getIdVenda()) {
                bdPastel.remove(bdPastel.get(i));
                return null;
            }
        }
        return pastel;
    }

    /*public static Pessoa altPesCpf(Pessoa p){
		for(int i = 0; i < bdPes.size(); i++){
			if(p.getCpf() == bdPes.get(i).getCpf()){
                            String nNome = JOptionPane.showInputDialog(
                            null,
                            "NOVO NOME",
                            "ATUALIZAR NOME",
                            1 //ICONE
                        );
				p.setNome(nNome);
				bdPes.set(i, p);
				return bdPes.get(i);
			}
		}
		return null;
	}
    }*/
}
