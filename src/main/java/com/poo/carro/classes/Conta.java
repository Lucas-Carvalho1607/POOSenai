package com.poo.carro.classes;

import java.util.Scanner;

public class Conta {
    private String titular;
    private int numeroDaConta;
    private String senha;
    static int contador = 1000;
    

    public Conta () {
        System.out.println("Escreva o nome do titular: ");
        Scanner leia = new Scanner(System.in);

        this.setTitular(leia.nextLine());

        this.setNumeroDaConta(contador);;
        contador++;
        leia.close();
        this.senha = "1111";

    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public int getNumeroDaConta() {
        return numeroDaConta;
    }
    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
            
    }
    
    

