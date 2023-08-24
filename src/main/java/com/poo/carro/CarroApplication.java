package com.poo.carro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import com.poo.carro.classes.Conta;
//import com.poo.carro.classes.Veiculo;
import com.poo.carro.classes.Aluno;


@SpringBootApplication
public class CarroApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarroApplication.class, args);

		//Veiculo carroDoLucas = new Veiculo();
		
		//carroDoLucas.proprietario = "Lucas";
		//carroDoLucas.renavam = "546545";
		//carroDoLucas.marca = "Fiat";
		//carroDoLucas.modelo = "Cayanne";
		//carroDoLucas.ano = 2023;
		//carroDoLucas.cor = "Preto";
		//carroDoLucas.quilometragem = 5000.0;

		//carroDoLucas.imprimeDocumento();

		//Conta conta1 = new Conta ();

		//System.out.println(conta1.getTitular());
		//System.out.println(conta1.getSenha());
		//System.out.println(conta1.getNumeroDaConta());

		//Conta conta2 = new Conta ();
		
		//System.out.println(conta2.getTitular());
		//System.out.println(conta2.getSenha());
		//System.out.println(conta2.getNumeroDaConta());

		Aluno inscricao	= new Aluno();
		System.out.println("\nInscrição efetuada com sucesso!" +"\n" + "Nome: " + inscricao.getNome() + 
		"\n" +"Data de nascimento: " + inscricao.getDataNasc() + "\nSua matrícula é: " + inscricao.getMatricula() + "\n");

		Aluno inscricao2 = new Aluno();
		System.out.println("\nInscrição efetuada com sucesso!" +"\n" + "Nome: " + inscricao2.getNome() + 
		"\n" +"Data de nascimento: " + inscricao2.getDataNasc() + "\nSua matrícula é: " + inscricao2.getMatricula());

	}

}
