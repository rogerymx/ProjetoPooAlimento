//VERSÃO UTILIZADA: NetBeans IDE 17
//Aluno: Roger Yoshiaki Motoyama / ra:2418355
package projetoze;

abstract class Alimento {
    private String recheio;
    private float precoUn;
    private int quantidade;
    private boolean extra;
    private Venda venda;
    
    public Alimento(){
        this.precoUn = 0;
        this.quantidade = 0;
        this.extra = false;
        venda = new Venda();
    }
    
    public String getRecheio() {
        return recheio;
    }
    
    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }
    
    public float getPrecoUn() {
        return precoUn;
    }
    
    public void setPrecoUn(float precoUn) {
        this.precoUn = precoUn;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public boolean isExtra() {
        return extra;
    }
    
    public void setExtra(boolean extra) {
        this.extra = extra;
    }
    
    public Venda getVenda(){
        return venda;
    }
    
    public void setVenda(Venda venda){
        this.venda = venda;
    }
    
    public void verExtra(String i){
        if(i.equalsIgnoreCase("s")){
           this.setExtra(true);
        }else{
            this.setExtra(false);
        }
    }
  
}
