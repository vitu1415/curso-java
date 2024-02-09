package entidades;

public class trabalhador {
    public String nome;
    public double salario;
    public double taxa;

    public double salario_real(){
        return salario - taxa;
    }
    public void aumento_de_salario(double percentual){
        salario += salario * percentual / 100;
    }
    public String frase(){
        return nome + ", $" + String.format("%.2f", salario_real());
    }
}
