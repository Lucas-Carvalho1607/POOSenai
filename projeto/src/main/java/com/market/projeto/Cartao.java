package com.market.projeto;



public class Cartao {
    protected String numero;
    protected String nome;
    protected String dataValidade;
    protected int cvv;
    protected String cpf;
    
    public Cartao(String numero, String nome, String dataValidade, int cvv, String cpf){
        this.numero= numero;
        this.nome = nome;
        this.dataValidade = dataValidade;
        this.cvv = cvv;
        this.cpf = cpf;
    }
}
