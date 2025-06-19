package br.com.senaisp.bauru.aula06;

import java.util.Scanner;

public class Exemplo03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] cinema = new char[5][9];
		for(int i=0;i<cinema.length;i++) {
			for (int j=0;j<cinema[i].length;j++) {
				cinema[i][j]='_';
			}
		}
		String continua;
		do {
			mostrarTela(cinema);
			System.out.println("Digite a Fileira desejada:");
			int fil=sc.nextInt();
			System.out.println("Digite a poltrona desejada:");
			int pol=sc.nextInt();
			sc.nextLine();
			System.out.println("Deseja Continuar (S/N)?");
			continua = sc.nextLine();
			if (fil>=1 && fil<=5 && pol>=1 && pol<=9) {
				cinema[fil-1][pol-1]='X';
			}
			
		}while(continua.charAt(0)=='S');
		sc.close();
	}

	private static void mostrarTela(char[][] cinema) {
		System.out.println("Cinema do povo");
		System.out.println("  1 2 3 4 5 6 7 8 9");
		for(int i=0;i<cinema.length;i++) {
			System.out.println((i+1+" "));
			for (int j=0;j<cinema[i].length;j++) {
				System.out.println(" "+cinema[i][j]);
			}
			System.out.println();
		}
	}

}
