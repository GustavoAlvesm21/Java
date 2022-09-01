package banco;

import java.util.Scanner;

public class CriarCliente {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int qtd_contas = sc.nextInt(); 
		
		for(int i=0;i<qtd_contas;i++) {
			
			Cliente cliente = new Cliente(); 
			
			Scanner sc1 = new Scanner(System.in);
			Scanner sc2 = new Scanner(System.in); 
			Scanner sc3 = new Scanner(System.in); 
			Scanner sc4= new Scanner(System.in); 
			
			String nome = sc1.nextLine(); 
			String cpf = sc2.nextLine(); 
			int agencia = sc3.nextInt(); 
			int idade = sc4.nextInt(); 
			
			cliente.setNome(nome);  
			cliente.setCpf(cpf);
			cliente.setAgencia(agencia);
			cliente.setIdade(idade); 
			
			System.out.println("Nome: "+cliente.nome+ " CPF: "+cliente.cpf+ " Agencia: "+cliente.agencia + " Idade: "+cliente.idade); 
		}
	}
}