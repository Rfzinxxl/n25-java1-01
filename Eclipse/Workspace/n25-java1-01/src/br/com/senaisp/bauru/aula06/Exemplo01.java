package br.com.senaisp.bauru.aula06;

public class Exemplo01 {

	public static void main(String[] args) {
		//Definindo um vetor de flores
		String[] flores = new String[4];
		flores[0]= "Rosa";
		flores[1]= "Cravo";
		flores[2]= "Lírio";
		flores[3]= "Margarida";
		for(int i=0;i<flores.length;i++) {
			System.out.println(flores[i]);
		}
		for(String it: flores) {
			System.out.println(it);
		}

	}

}
