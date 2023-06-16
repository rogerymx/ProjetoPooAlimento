//VERSÃO UTILIZADA: NetBeans IDE 17
//Aluno: Roger Yoshiaki Motoyama / ra:2418355
package projetoze;

public class Pastel extends Alimento{

    private String massaSabor;
    private String tipoCozimento;

    public Pastel() {
        this.massaSabor = "";
        this.tipoCozimento = "";
    }

    public String getMassaSabor() {
        return massaSabor;
    }

    public void setMassaSabor(String massaSabor) {
        this.massaSabor = massaSabor;
    }

    public String getTipoCozimento() {
        return tipoCozimento;
    }

    public void setTipoCozimento(String tipoCozimento) {
        this.tipoCozimento = tipoCozimento;
    }

    public void switchPastel(int i) {
        switch (i) {
            case 1:
                setRecheio("Carne");
                setPrecoUn(10.00f);
                break;
            case 2:
                setRecheio("Frango");
                setPrecoUn(8.00f);
                break;
            case 3:
                setRecheio("Queijo");
                setPrecoUn(6.00f);
                break;
            default:
                System.out.println("Voce digitou um valor invalido");
                break;
        }
    }
    
    public void switchPastel(String s){
        if(s.equalsIgnoreCase("alho")){
            setMassaSabor("Alho");
        }else if(s.equalsIgnoreCase("pimenta")){
            setMassaSabor("Pimenta");
        }else{
            setMassaSabor("Tradicional");
        }
    }
    
    public void impDados(){
        System.out.println("-----------------------------------");
        System.out.println("Dados da venda do pastel de id "+this.getVenda().getIdVenda());
        System.out.println("Cliente: "+this.getVenda().getNomeCliente());
        System.out.println("Quantidade: "+this.getQuantidade());
        System.out.println("Recheio: "+this.getRecheio());
        System.out.println("Sabor da massa: "+this.getMassaSabor());
        System.out.println("Tipo de cozimento: "+this.getTipoCozimento());
        System.out.println("Preco unitario: " +this.getPrecoUn());
        if(this.isExtra()==true){
            System.out.println("Com recheio extra");
        }else{
            System.out.println("Sem recheio extra");
        }
        float fQuant = this.getQuantidade();
        this.getVenda().setValorTotal(((float)this.getPrecoUn()) * fQuant );
        System.out.println("Valor total: "+this.getVenda().getValorTotal()+"reais");
    }
}
