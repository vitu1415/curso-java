package entidade;

public class produtos {
    public String nome;
    public double valor;
    public int quantidade;

    public produtos (String nome, double valor, int quantidade){
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public double TotalEstoque() {
        return valor * quantidade;
    }
    public void adicionar(int quantidade){
        this.quantidade += quantidade;
    }
    public void remover(int quantidade){
        this.quantidade -= quantidade;
    }

    public String toString(){
        return nome 
            + ", $ "
            + String.format("%.2f", valor)
            + ", "
            + quantidade 
            + " quantidade, Total: $ "
            + String.format("%.2f", TotalEstoque());
    }
}
