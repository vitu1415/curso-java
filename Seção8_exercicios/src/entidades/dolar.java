package entidades;

public class dolar {
    public double p_dolar;
    public double valor;

    public double total(){
        return  p_dolar * valor + (p_dolar * valor * 6 / 100); 
    }
}
