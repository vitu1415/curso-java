package entidade;

public class Banco {
    private int num;
    private String nome;
    private double dinheiro_total;

    public Banco (int num, String nome, double dinheiro_inicial){
        this.num = num;
        this.nome = nome;
        deposito(dinheiro_inicial);
    }
    public Banco (int num, String nome){
        this.num = num;
        this.nome = nome;
    }

    public String texto(){
        return "Conta " + num + ", nome: " + nome
        + ", balaciamento "
        + String.format("%.2f", dinheiro_total);
    }

    public int getNumber() {
		return num;
	}

	public String getHolder() {
		return nome;
	}

	public void setHolder(String nome) {
		this.nome = nome;
	}

	public double getBalance() {
		return dinheiro_total;
	}

	public void deposito(double dinheiro) {
		dinheiro_total += dinheiro;
	}
	
	public void retirar(double dinheiro) {
		dinheiro_total -= dinheiro + 5.0;
	}
}