package Funcionarios;

public class OutsourcedEmployee extends Employee {
    //atributos
    private double additionalCharge;
    //construtores
    public OutsourcedEmployee() { super();}
    public OutsourcedEmployee(Integer hour, String name, double valuePerHour, double additionalCharge) {
        super(hour, name, valuePerHour);
        this.additionalCharge = additionalCharge;
    }
    //getter and setters
    public double getAdditionalCharge() {
        return additionalCharge;
    }
    public void setAdditionalCharge(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
    @Override
    public double paymant(){
        return super.paymant() + additionalCharge * 1.1;
    }
}
