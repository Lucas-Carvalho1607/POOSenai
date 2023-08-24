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
}
