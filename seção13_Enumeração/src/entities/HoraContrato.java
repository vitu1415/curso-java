package entities;

import java.util.Date;

public class HoraContrato {
    private Date data;
    private double valor;
    private int horas;

    public HoraContrato(){

    }

    public HoraContrato (Date data, double valor, int horas){
        this.data = data;
        this.valor = valor;
        this.horas = horas;
    }
    
    public Date getData(){
        return data;
    }

    public void setData(Date data){
        this.data = data;
    }

    public double getValor(){
        return valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public int getHoras(){
        return horas;
    }

    public void setHoras(int horas){
        this.horas = horas;
    }

    public double totalHoras(){
        return valor * horas;
    }
}