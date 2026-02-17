package Pedidos;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private String nome;
    private double preco;

    //CONSTRUTOR


    public Item(double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    //GETTERS SOMENTE

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }
}
