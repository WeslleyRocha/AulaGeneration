package Outros;

import java.util.Scanner;

public class ex4 {
	public static void main (String args[])
	{
		int nota1, nota2, nota3, media1, media2, media3, media, aluno;
		
		Scanner ler = new Scanner (System.in);
		System.out.println(" Bem Vindo ao Calculo de media de alunos(as) !");
		
		System.out.println(" Favor, Digite o nome do aluno: ");
		aluno = ler.nextInt();
				
		System.out.println("OK, Agora digite a primeira nota: ");
		nota1 = ler.nextInt();
		
		System.out.println("Perfeito, agora digite a segunda nota do aluno:");
		nota2 = ler.nextInt();
		
		System.out.println("Por fim, Digite a terceira e ultima nota do aluno:");
		nota3 = ler.nextInt();
		
		// Calculo de media
		
		media1 = nota1/2;
		media2 = nota2/3;
		media3 = nota2/5;
		media = media1 + media2 + media3/3;
		
		System.out.println("O Aluno: " + aluno + ", Ficou com media de: " + media);
		
	}

}