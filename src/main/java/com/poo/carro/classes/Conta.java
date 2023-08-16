package com.poo.carro.classes;

public class Conta {
    private String titular;
    private String numeroDaConta;
    private String senha;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getSenha() {
        return this.senha;
    }
    
    public void setSenha(String novaSenha){
        this.senha = novaSenha;
    }
    
}
