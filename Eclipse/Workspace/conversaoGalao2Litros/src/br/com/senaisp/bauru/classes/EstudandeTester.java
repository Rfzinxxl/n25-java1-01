package br.com.senaisp.bauru.classes;

public class EstudandeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudande est = new Estudante();
		est.setNome("Aluno 01");
		est.setra(1234);
		System.out.printl(est.getnome());
		System.out.println(est);
		Estudante est2 = new Estudante(4567, "Aluno 02");
		System.out.println(est2);

	}

}
