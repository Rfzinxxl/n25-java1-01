package br.com.senaisp.bauru.aula04;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome completo:");
		String nome = sc.nextLine();
		String priNome = nome.substring(0,nome.indexOf(' '));
		String ultNome = nome.substring(nome.lastIndexOf(" ")+1);
		System.out.println(priNome);
		System.out.println(ultNome);
		sc.close();

	}

}
