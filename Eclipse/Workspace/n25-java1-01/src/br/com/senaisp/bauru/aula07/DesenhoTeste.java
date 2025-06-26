package br.com.senaisp.bauru.aula07;

import java.awt.Color;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class DesenhoTeste {

	public static void main(String[] args) {
		JOptionPane pnl = new JOptionPane();
		JDialog dlg = pnl.createDialog("Desenhos em Java");
		dlg.setSize(800,600);
		System.out.println(Desenho.getQtdeInstancias());
		Retangulo ret	 = new Retangulo(50, 50, 300, 200, Color.MAGENTA);
		Triangulo tri = new Triangulo(50, 50, 300, 200, Color.GREEN);
		System.out.println(Desenho.getQtdeInstancias());
		dlg.setContentPane(tri);
		dlg.setVisible(true);
		
	}

}
