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
        System.out.println(this.proprietario + 
		this.renavam +
		this.marca +
		this.modelo +
		this.ano +
		this.cor +
		this.quilometragem );
    }

    public void acelerar () {
        //um veiculo acelera

    }
    

}
