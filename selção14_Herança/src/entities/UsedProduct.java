package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{
    private LocalDate manufactureDate;

    public UsedProduct(){
        super();
    }
    public UsedProduct(String name, double price, LocalDate manufactureDate){
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate(){
        return manufactureDate;
    }
    public void setManufactureDate(LocalDate manudactureDate){
        this.manufactureDate = manudactureDate;
    }

    public String priceTag(){
        return super.getName() 
        + "(used) $ "+super.getPrice()+ 
        " (Manufacture date: " 
        + manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ")";
    }
}
