package main.java.list.OperacoesBassicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
            itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for(Item i : itemList){
            if(i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }
        itemList.removeAll(itensParaRemover);
    }

    public void calcularValorTotal() {
        double total = 0;
        for (Item i : itemList) {
            total = total + i.getPreco();
        }
        System.out.println("O valor total é: " + total);
    }

    public void exibirItens(){
        System.out.println(itemList);
    }


    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("TV", 2000.00, 2);
        carrinhoDeCompras.adicionarItem("Celular", 1500.00, 3);
        carrinhoDeCompras.adicionarItem("Notebook", 2500.00, 1);

        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.calcularValorTotal();

        carrinhoDeCompras.removerItem("Celular");
        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.calcularValorTotal();
    }

}
