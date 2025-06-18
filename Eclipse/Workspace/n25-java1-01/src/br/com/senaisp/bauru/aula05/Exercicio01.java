package br.com.senaisp.bauru.aula05;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(Exercicio01.class.getResourceAsStream("arquivo.txt"));
		String linha= sc.nextLine(); // Pegando a linha do Cabeçalho
		Scanner sca= new Scanner(linha);
		sca.useDelimiter(";");
		while(sca.hasNext()) {
			System.out.print(sca.next()+"\t\t");
		}
		System.out.println();
		sca.close();
		while(sc.hasNextLine()) {
			linha= sc.nextLine();
			sca = new Scanner(linha);
			sca.useDelimiter(";");
			
		}

	}

}
