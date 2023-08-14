package com.poo.carro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.poo.carro.classes.Veiculo;

@SpringBootApplication
public class CarroApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarroApplication.class, args);

		Veiculo carroDoLucas = new Veiculo();
		
		carroDoLucas.proprietario = "Lucas\n";
		carroDoLucas.renavam = "546545\n";
		carroDoLucas.marca = "Fiat\n";
		carroDoLucas.modelo = "Cayanne\n";
		carroDoLucas.ano = 2023+'\n';
		carroDoLucas.cor = "Preto\n";
		carroDoLucas.quilometragem = 5000.0;

		carroDoLucas.imprimeDocumento();


	}

}
