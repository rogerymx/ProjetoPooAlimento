//VERSÃO UTILIZADA: NetBeans IDE 17
//Aluno: Roger Yoshiaki Motoyama / ra:2418355
package projetoze;
public class Pizza extends Alimento{
    private String tamanho;
    private boolean bordaRecheada;

    public Pizza() {
        this.bordaRecheada = false;
        this.tamanho = "";
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isBordaRecheada() {
        return bordaRecheada;
    }

    public void setBordaRecheada(boolean bordaRecheada) {
        this.bordaRecheada = bordaRecheada;
    }
    public void impDados(){
        System.out.println("-----------------------------------");
        System.out.println("Dados da venda da pizza de id "+this.getVenda().getIdVenda());
        System.out.println("Cliente: "+this.getVenda().getNomeCliente());
        System.out.println("Quantidade: "+this.getQuantidade());
        System.out.println("Recheio: "+this.getRecheio());
        System.out.println("Tamanho da pizza: "+this.getTamanho());
        if(this.isBordaRecheada()==true){
            System.out.println("Com borda recheada");
        }else{
            System.out.println("Sem borda recheada");
        }
        System.out.println("Preco unitario: " +this.getPrecoUn());
        if(this.isExtra()==true){
            System.out.println("Com recheio extra");
        }else{
            System.out.println("Sem recheio extra");
        }
        float fQuant = this.getQuantidade();
        this.getVenda().setValorTotal(((float)this.getPrecoUn()) * fQuant );
        System.out.println("Valor total: "+this.getVenda().getValorTotal()+" reais");
    }
}