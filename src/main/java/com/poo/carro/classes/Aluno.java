package com.poo.carro.classes;
import java.util.Scanner;

public class Aluno {

    Scanner leia = new Scanner(System.in);

    public String nome;
    private String dataNasc;
    private int matricula;
    static int contador = 1;

    public Aluno () {
        System.out.println("Digite seu nome: ");
        this.setNome(leia.nextLine());

        System.out.println("Digite sua data de nascimento: ");
        this.setDataNasc(leia.nextLine());

        this.setMatricula(contador);
        contador++;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }



    
}
