package curso_programacao_estrutura_repeticao;

import java.util.Scanner;

public class Exemplo_while {

	public static void main(String[] args) {
		// entrada de dados
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero para somatoria(digite 0 para sair)");
		int x = sc.nextInt();
		int soma = 0;

		// enquanto for difernete 0 recebe e soma o numero digitado
		while (x != 0) {
			// soma as variaveis
			soma = soma + x;
			// entrada de dados
			x = sc.nextInt();
		}
		// imprime a soma dos numeros digitados diferentes de 0
		System.out.println("A somatoria �: " + soma);
		sc.close();

	}

}
