package program;

import java.util.Scanner;

import conv.Conversor;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("BEM-VINDO AO CONVERSOR DE DÓLAR");
		System.out.print("Digite quantos dólares você deseja comprar $: ");
		double valor = scanner.nextDouble();
		
		System.out.println();
		Conversor.dolar(valor);
		
		
		System.out.println();
		System.out.println("Deseja comprar mais Dólares? Digite 1 para SIM e 0 para NÃO!");
		byte cond = scanner.nextByte();
		if(cond == 0) {
		 System.out.println("Muito obrigado por usar nossos serviços!");
		 
		 scanner.close();
		}
	}

}
