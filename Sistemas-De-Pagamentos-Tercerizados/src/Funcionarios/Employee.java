package Funcionarios;

public class Employee {
    //atributos
    private String name;
    private Integer hour;
    private double valuePerHour;
    //construtores
    public Employee(Integer hour, String name, double valuePerHour) {
        this.hour = hour;
        this.name = name;
        this.valuePerHour = valuePerHour;
    }
    public Employee(){}
    //getters and setters
    public Integer getHour() {
        return hour;
    }
    public void setHour(Integer hour) {
        this.hour = hour;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getValuePerHour() {
        return valuePerHour;
    }
    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }
    //métodos

    public double paymant(){
        return hour + valuePerHour;
    }
}
