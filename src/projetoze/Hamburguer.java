//VERSÃO UTILIZADA: NetBeans IDE 17
//Aluno: Roger Yoshiaki Motoyama / ra:2418355
package projetoze;
public class Hamburguer extends Alimento{
    private int qtdCarne;
    private String tipoPao;

    public Hamburguer() {
        this.qtdCarne = 1;
        this.tipoPao = "";
    }

    public int getQtdCarne() {
        return qtdCarne;
    }

    public void setQtdCarne(int qtdCarne) {
            this.qtdCarne = qtdCarne;
    }

    public String getTipoPao() {
        return tipoPao;
    }

    public void setTipoPao(String tipoPao) {
        this.tipoPao = tipoPao;
    }

    
    public void impDados() {
        System.out.println("-----------------------------------");
        System.out.println("Dados da venda do hamburguer de id "+this.getVenda().getIdVenda());
        System.out.println("Cliente: "+this.getVenda().getNomeCliente());
        System.out.println("Quantidade: "+this.getQuantidade());
        System.out.println("Tipo carne: "+this.getRecheio());
        System.out.println("Tipo pao: "+this.getTipoPao());
        System.out.println("Quantidade de carne:  "+this.getQtdCarne());
        System.out.println("Preco unitario: " +this.getPrecoUn());
        if(this.isExtra()==true){
            System.out.println("Com carne extra");
        }else{
            System.out.println("Sem carne extra");
        }
        float fQuant = this.getQuantidade();
        this.getVenda().setValorTotal(((float)this.getPrecoUn()) * fQuant );
        System.out.println("Valor total: "+this.getVenda().getValorTotal()+"reais");
    } 
}
