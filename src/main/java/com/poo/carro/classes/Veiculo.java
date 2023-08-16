package com.poo.carro.classes;

public class Veiculo {
    //Atributos

    public String proprietario;
    public String renavam;
    public String marca;
    public String modelo;
    public int ano;
    public String cor; 
    public double quilometragem;
    
    //Comportamentos
    public void imprimeDocumento(){
        System.out.println(this.proprietario + "\n" +
		this.renavam + "\n" +
		this.marca + "\n" +
		this.modelo + "\n" +
		this.ano + "\n" +
		this.cor + "\n" +
		this.quilometragem );
    }

    public void acelerar () {
        //um veiculo acelera

    }
    

}
