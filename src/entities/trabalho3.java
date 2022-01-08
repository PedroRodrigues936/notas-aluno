package entities;

import java.util.Locale;
import java.util.Scanner;

public class trabalho3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		String nomeA;
		double nota1;
		double nota2;
		double nota3;
		double soma;
		
		String nomeB;
		double notab1;
		double notab2;
		double notab3;
		double somaB;

		System.out.println("nome do aluno: ");
		nomeA = sc.nextLine();
		System.out.println("Digite as três nota do aluno: ");
		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		nota3 = sc.nextDouble();
		System.out.println(soma = nota1 + nota2 + nota3);
		System.out.println();

		if (soma < 60) {
			System.out.println(nomeA + " Recuperação");
			System.out.println("Faltam " + (60 - soma));
		} else {
			System.out.println(nomeA + " Parabéns, Passou!");
		}
        
		System.out.println();
		
		System.out.println("nome do aluno: ");
        nomeB = sc.next();
        System.out.println("Digite as três nota do aluno: ");
		notab1 = sc.nextDouble();
		notab2 = sc.nextDouble();
		notab3 = sc.nextDouble();
		System.out.println(somaB = notab1 + notab2 + notab3);
		System.out.println();

		if (soma < 60) {
			System.out.println(nomeB + " Recuperação");
			System.out.println(" Faltam" + (60 - somaB));
		} else {
			System.out.println(nomeB + " Parabéns, Passou!");
		}

		sc.close();
	}

}
