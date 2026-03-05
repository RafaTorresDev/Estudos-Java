package entities;

import java.time.LocalDate;

public class UsedProduct extends  Product{
    //atributos
    private LocalDate manufactureDate;

    //construtores hahahaha to mlk
    public UsedProduct() {
       super();
    }
    public UsedProduct(double price, String name, LocalDate manufactureDate) {
        super(price, name);
        this.manufactureDate = manufactureDate;
    }

    //get e set
    public LocalDate getManufactureDate() {
        return manufactureDate;
    }
    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    //metodos
    @Override
    public String priceTag(){
        return getName()
                + " (used) - R$ " + getPrice()
                + " (Date of fabric: " + manufactureDate + ")";
    }
}
