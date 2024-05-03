package entities;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

import entities.enums.ordemStatus;

public class Orden {
    private Date moment;
    private ordemStatus status;

    private  Client client;
    private List<orderItem> itens = new ArrayList<>(); 

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public Orden(Date moment, ordemStatus status, Client client){
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment(){
        return moment;
    }
    public void setMoment(Date moment){
        this.moment = moment;
    }

    public ordemStatus getStatus(){
        return status;
    }
    public void setStatus(ordemStatus status){
        this.status = status;
    }

    public Client getClient(){
        return client;
    }
    public void setClient(Client client){
        this.client = client;
    }

    public List<orderItem> getItem(){
        return itens;
    }
    public void addItem(orderItem item){
        itens.add(item);
    }
    public void removeItem(orderItem item){
        itens.remove(item);
    }

    public double total(){
        double sum = 0.0;
        for(orderItem item : itens){
            sum += item.subTotal();
        }
        return sum;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Orden moment: "+ sdf.format(moment)+"\n");
        sb.append("Orden status: "+status +"\n");
        sb.append("Client: "+client+"\n");
        sb.append("Orden items:\n");
        for(orderItem item:itens){
            sb.append(item+"\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
    
        return sb.toString();
    }
}
