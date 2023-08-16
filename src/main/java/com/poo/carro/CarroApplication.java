package com.poo.carro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.poo.carro.classes.Conta;
import com.poo.carro.classes.Veiculo;

@SpringBootApplication
public class CarroApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarroApplication.class, args);

		Veiculo carroDoLucas = new Veiculo();
		
		carroDoLucas.proprietario = "Lucas";
		carroDoLucas.renavam = "546545";
		carroDoLucas.marca = "Fiat";
		carroDoLucas.modelo = "Cayanne";
		carroDoLucas.ano = 2023;
		carroDoLucas.cor = "Preto";
		carroDoLucas.quilometragem = 5000.0;

		//carroDoLucas.imprimeDocumento();

		Conta conta1 = new Conta ();
		conta1.setSenha("1234Abc");

		System.out.println(conta1.getSenha());




	}

}
