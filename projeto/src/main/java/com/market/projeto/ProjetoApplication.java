package com.market.projeto;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pessoa.Cliente;
import pessoa.Funcionario;
import site.Produto;

@SpringBootApplication
public class ProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoApplication.class, args);
		Scanner sc = new Scanner(System.in);
		String login, senha;
		boolean logou = false;
		Endereco endereco = new Endereco("Rua Uniao Industria","Itaipava", 420,"Petropolis","Brasil", "bl 2");
		Cartao cartao = new Cartao("a","s","12",455, "454");

		ArrayList <Cliente> lista_cliente = new ArrayList<>();
		Cliente pessoa = new Cliente("Lucas", "45454", "12/2/87", endereco, "Riba", "Batman", cartao);
		lista_cliente.add(pessoa);
		
		Produto bola = new Produto("Bola", "Bola redonda cheia", 120.00);
		Produto apito = new Produto("Apito", "Apito de índio ", 20.00);
		Produto ps5 = new Produto("Playstation 5", "Novo com controle", 3000.00);
		Produto xbox = new Produto("Xbox One", "Novo com controle", 2500.00);
		Produto pcGamer = new Produto("Pc Gamer", "Intel I9, 48gb de Ram, SSd 1Tb, Placa de Vídeo RTX 4080TI", 15000.00);
		Produto nSwitch = new Produto("Switch", "Usado", 50.00);
	
		ArrayList <Produto> lista_produto = new ArrayList<>();
		
		lista_produto.add(bola);
		lista_produto.add(apito);
		lista_produto.add(ps5);
		lista_produto.add(xbox);
		lista_produto.add(pcGamer);
		lista_produto.add(nSwitch);

		System.out.println("Bem vindo" + "\n" + "Login" );
		login = sc.nextLine();
		System.out.println("Senha: ");
		senha = sc.nextLine();
		
		while(!logar(lista_cliente)){
			logar(lista_cliente);
		}
		
		
		for (int i =0; i <lista_produto.size();i++){
			System.out.println(lista_produto.get(i).getNome() + ", descrição: " + lista_produto.get(i).getDescricao() + ", R$ " +
			lista_produto.get(i).getValor());
		}
			
		}
		public static boolean logar(ArrayList<Cliente> lista_cliente ){
			Scanner sc2 = new Scanner(System.in);
			String nome, senha;
			System.out.println("Bem vindo" + "\n" + "Login" );
			nome = sc2.nextLine();
			System.out.println("Senha: ");
			senha = sc2.nextLine();
			
			for (int i = 0; i < lista_cliente.size(); i++){
				if (nome.equals(lista_cliente.get(i).getLogin())){
				System.out.println("nome correto");
				sc2.close();
				return true;
			}
			}
			sc2.close();
			return false;
		}
	}
		

