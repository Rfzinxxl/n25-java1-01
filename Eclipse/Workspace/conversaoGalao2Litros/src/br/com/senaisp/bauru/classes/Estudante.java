package br.com.senaisp.bauru.classes;

public class Estudante {
	//Fields ou campos ou variáveis de instância
	private String nome;
	private int ra;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getRa() {
		return ra;
	}
	public void setRa(int ra) {
		this.ra = ra;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public boolean isEhFumante() {
		return ehFumante;
	}
	public void setEhFumante(boolean ehFumante) {
		this.ehFumante = ehFumante;
	}
	private double nota;
	private boolean ehFumante;
	//Constructor
	public Estundante() {
		nome = "Sem nome";
		ra=0;
		nota=0.0.;
		ehFumante=false;
	}
	

}
