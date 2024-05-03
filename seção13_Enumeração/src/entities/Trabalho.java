package entities;

import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;

import entities.enums.levelTrabalho;

public class Trabalho {
    private String nome;
    private levelTrabalho level;
    private double baseSalario;

    private Departamento departamento;
    private List<HoraContrato> contratos = new ArrayList<>();

    public Trabalho(){

    }

    public Trabalho (String nome, levelTrabalho level, double baseSalario, Departamento departamento){
        this.nome = nome;
        this.level = level;
        this.baseSalario = baseSalario;
        this.departamento = departamento;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public levelTrabalho getLevel(){
        return level;
    }

    public void setLevel(levelTrabalho level){
        this.level = level;
    }

    public Double getBasSalario(){
        return baseSalario;
    }

    public void setBaseSalario(Double baseSalario){
        this.baseSalario = baseSalario;
    }

    public Departamento getDepartamento(){
        return departamento;
    }

    public void setDepartamento(Departamento departamento){

        this.departamento = departamento;
    }

    public List<HoraContrato> getContratos(){
        return contratos;
    }

    public void addContratos(HoraContrato contrato){
        contratos.add(contrato);
    }

    public void removeContratos(HoraContrato contrato){
        contratos.remove(contrato);
    }
    
    public double income(int year, int month) {
		double sum = baseSalario;
		Calendar cal = Calendar.getInstance();
		for (HoraContrato c : contratos) {
			cal.setTime(c.getData());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			if (year == c_year && month == c_month) {
				sum += c.totalHoras();
			}
		}
		return sum;
    }

}