package main.java.list.Pesquisa;

import main.java.list.OperacoesBasicas.Item;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Numeros> numerosList;

    public SomaNumeros() {
        this.numerosList = new ArrayList<>();
    }
    public void adicionarNumeros(int numero){
        numerosList.add(new Numeros(numero));
    }
    public void calcularSoma(){
        int total = 0;
        for (Numeros n : numerosList) {
            total = total + n.getNumero();
        }
        System.out.println("O da soma é: " + total);
    }

    public void encontrarMaiorNumero(){
        int maior = 0;
        for (Numeros m : numerosList) {
            if(maior <= m.getNumero()){
                maior = m.getNumero();
            }
        }
        System.out.println("O maior Número é: " + maior);
    }

    public void encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if (!numerosList.isEmpty()) {
            for (Numeros m : numerosList) {
                if(m.getNumero() <= menorNumero) {
                    menorNumero = m.getNumero();
                }
            }
        }
        System.out.println("O maior Número é: " + menorNumero);
    }

    public void exibirNumeros(){
        System.out.println(numerosList);
    }


    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumeros(10);
        somaNumeros.adicionarNumeros(39);
        somaNumeros.adicionarNumeros(23);
        somaNumeros.adicionarNumeros(4);
        somaNumeros.adicionarNumeros(64);
        somaNumeros.adicionarNumeros(4);
        somaNumeros.adicionarNumeros(6);
        somaNumeros.adicionarNumeros(9);
        somaNumeros.adicionarNumeros(80);
        somaNumeros.adicionarNumeros(2);


        somaNumeros.calcularSoma();
        somaNumeros.encontrarMaiorNumero();
        somaNumeros.encontrarMenorNumero();
        somaNumeros.exibirNumeros();
    }







}
