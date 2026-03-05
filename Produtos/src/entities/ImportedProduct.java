package entities;

public class ImportedProduct extends Product{
    //atributos
    private Double customFee;

    //construtores
    public ImportedProduct() {
     super();
    }
    public ImportedProduct(double price, String name, Double customFee) {
        super(price, name);
        this.customFee = customFee;
    }

    //getter e setters
    public Double getCustomFee() {
        return customFee;
    }
    public void setCustomFee(Double customFee) {
        this.customFee = customFee;
    }

    //métodos
    public Double totalPrice(){
        return getPrice() + customFee;
    }

    @Override
    public String priceTag(){
        return getName() + " - Price more tax R$ " + getPrice() + " Custom fee: " + customFee;
    }
}
