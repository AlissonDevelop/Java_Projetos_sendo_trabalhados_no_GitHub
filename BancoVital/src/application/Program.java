package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBanco;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("");
		
		ContaBanco conta01 = new ContaBanco(); 
		ContaBanco conta02 = new ContaBanco(); 
		
		System.out.println("Informe o número da conta:");
        int numConta = sc.nextInt();
        sc.nextLine(); // Limpa o buffer

        System.out.println("Informe o nome do titular:");
        String titular = sc.nextLine();

        System.out.println("Informe o tipo de conta (CC ou CP):");
        String tipoConta = sc.nextLine();

        System.out.println("Informe o valor a ser depositado:");
        double valorDeposito = sc.nextDouble();

        System.out.println("Informe o valor a ser sacado:");
        double valorSaque = sc.nextDouble();
		
		conta01.setNumConta(numConta);
		conta01.setTitular(titular);
		conta01.abrirConta(tipoConta);		
		conta01.depositar(valorDeposito);
		conta01.sacar(valorSaque);

		
		
		System.out.println("");
		
		conta02.setNumConta(250602);
		conta02.setTitular("Marcia Rosa");
		conta02.abrirConta("CP");		
		conta02.depositar(2500);
		conta02.sacar(350);

				
		
		
		
		conta01.extrato();
		conta02.extrato();
		
		sc.close();
	}

}
