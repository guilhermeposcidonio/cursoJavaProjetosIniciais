package curso_programacao_estrutura_repeticao;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Entradad de dados
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tipo de combustivel abastecido:");
		System.out.println("1 - Alcool");
		System.out.println("2 - Gasolina");
		System.out.println("3 - Diesel");
		System.out.println("4 - FIM");
		//Declarando as variaveis
		int opcao = sc.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		//Enquanto opcao for diferente de 4 faca
		while(opcao != 4) {
			//Estrutura condicional e somatoria dos tipos de combustiveis 
			if(opcao == 1) {
				alcool = alcool +1;
				
				}else if(opcao == 2) {
					gasolina = gasolina +1;
				
					}else if(opcao == 3) {
						diesel = diesel +1;
						
						}else if(opcao > 4 || opcao <= 0) {
							System.out.println("OPCAO INVALIDA!!");
							}
			//Entrada de dados estrutura repetitiva enquanto opcao for diferente de 4
			System.out.println("Digite o tipo de combustivel abastecido:");
			System.out.println("1 - Alcool");
			System.out.println("2 - Gasolina");
			System.out.println("3 - Diesel");
			System.out.println("4 - FIM");
			opcao = sc.nextInt();
		
		}
		//Imprime a somatoria dos tipos de combustiveis
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		sc.close();
	}

}
