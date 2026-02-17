package Pedidos;

import java.util.List;

public class Pedido{
    private int numero;
    private List<Item> itens;
    private boolean fechado;

    //CONSTRUTORES
        public Pedido(int numero, List<Item> item, boolean fechado) {
        this.numero = numero;
        this.itens = item;
        this.fechado = fechado;
    }

    public Pedido() {
    }

    //GETTERS E SETTERS
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<Item> getItem() {
        return itens;
    }

    public void setItem(List<Item> item) {
        this.itens = item;
    }

    public boolean isFechado() {
        return fechado;
    }

    public void setFechado(boolean fechado) {
        this.fechado = fechado;
    }

    //METODOS

    public void adicionarItem(Item item){
        if(!fechado){
            itens.add(item);
        }
    }
    public void removerItem(Item item){
        if(!fechado){
            itens.remove(item);
        }
    }

    public double calcularItemTotal(){
        double total = 0;
        for(Item item : itens){
            total += item.getPreco();
        }

        return total;
    }
    public void fecharPedido(){
        this.fechado = true;
    }

}
