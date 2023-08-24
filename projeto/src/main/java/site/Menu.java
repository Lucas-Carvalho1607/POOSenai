package site;

import java.util.ArrayList;
import java.util.Scanner;

import pessoa.Cliente;

public class Menu {
    
    String  frases[] = {"Ver lista de produtos", "Ver cartoes", "Adicionar novo cliente",
        "Adicionar novo produto",};

    public int opcoes (){
        int escolha;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < frases.length; i++){
            System.out.println((i + 1) + ". " + frases[i]);
        }
        // poderia colocar essa frase e da linha 31 na array mas ia mexer no loop de cima 
        System.out.println("Escolha o numero do seu produto\n0 para voltar");
        escolha = sc.nextInt();
        return escolha;
    }
    // coloquei a lista de produtos em um metodo, passando a lista de produtos como parametro, criada na linha 35
	public int verLista(ArrayList <Produto> lista_produto){
        int escolha;
		for (int i =0; i < lista_produto.size();i++){
			System.out.println((i + 1) + " " + lista_produto.get(i).getNome() + 
			", descrição: " + lista_produto.get(i).getDescricao() + ", R$ " +
			lista_produto.get(i).getValor());
		}
        System.out.println("Escolha o numero do seu produto\n0 para voltar");
        Scanner sc3 = new Scanner(System.in);
        escolha = sc3.nextInt();
        return escolha;
    }
    public void verCartoes(ArrayList<Cliente> lista_cliente, String cpf){
        for(int i = 0; i < lista_cliente.size(); i++){
            if (lista_cliente.get(i).getCpf().equals(cpf)){
                System.out.println("Nome " + lista_cliente.get(i).getCartao().getNome());
                System.out.println("Num: " + lista_cliente.get(i).getCartao().getNumero()); 
                System.out.println("Val: " + lista_cliente.get(i).getCartao().getDataValidade()); 
                System.out.println("CVV : " + lista_cliente.get(i).getCartao().getCvv()); 
            }
        }
    }
        // recebe a lista de cliente e devolve ela atualizada
    public ArrayList<Cliente> add_cliente (ArrayList<Cliente> lista_cliente){
        String nome, cpf, dataNasc, login, senha;
        String cartao_nome, cartao_numero, cartao_dataValidade, cartao_cpf; // coloquei em outra linha pra facilitar
        int cartao_cvv;
        String end_rua, end_bairro, end_cidade, end_pais, end_complemento;
        int end_num;
        Scanner sc4 = new Scanner(System.in);
        Scanner sc5 = new Scanner(System.in);
        String frases2 [] = {"Nome: ", "CPF: ", "Data Nasc:", "Login: ", "Senha: ", "Numero: ", "Data Validade:",
    "CVV: ", "Rua: ", "Bairro: ", "Cidade: ", "País: ", "Complemento: ", "Cadastro iniciado", "Cadastro realizado",
    "Precisamos de um cartão", "Precisamos de um endereço"};

        System.out.println(frases2[13] + "\n" + frases2[0]);
        nome = sc4.nextLine();
        cartao_nome = nome;
        System.out.println(frases2[1]);
        cpf = sc4.nextLine();
        cartao_cpf = cpf;
        System.out.println(frases2[2]);
        dataNasc = sc4.nextLine();
        System.out.println(frases2[3]);
        login = sc4.nextLine();
        System.out.println(frases2[4]);
        senha = sc4.nextLine();
        System.out.println(frases2[15] + "\n" + frases2[5]);
        cartao_numero = sc4.nextLine();
        System.out.println(frases2[6]);
        cartao_dataValidade = sc4.nextLine();
        // falta terminar o endereço e instanciar em um novo cliente 

        return lista_cliente;
        }
    }
  
