package br.com.senaisp.bauru.aula04;

public class exemplo2 {

	public static void main(String[] args) {
		String str01 = "Roberto da Silva Sauro";
		System.out.println(str01.contains("sauro"));
		//Obter a posição no texto de um subtexto
		System.out.println(str01.indexOf("Silva"));
		System.out.println(str01.charAt(3));
		System.out.println(str01.substring(5));
		System.out.println(str01.substring(8,16));
		System.out.println(str01.compareTo("Roberta"));

	}

}
