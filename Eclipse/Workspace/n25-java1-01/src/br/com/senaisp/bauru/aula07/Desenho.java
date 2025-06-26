package br.com.senaisp.bauru.aula07;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public abstract class Desenho extends JPanel {
	/**
	 * 
	 */
	private static int qtdeInstancias=0;
	private static final long serialVersionUID = 1L;
	private int posX;
	private int posY;
	private Color cor;
	//constructor
	public Desenho(int posX,int posY, Color cor) {
		qtdeInstancias++;
		this.posX = posX;
		this.posY = posY;
		this.cor = cor;
	}
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public Color getCor() {
		return cor;
	}
	public void setCor(Color cor) {
		this.cor = cor;
	}
	protected abstract void desenharForma(Graphics g);
	@Override
	public void paint(Graphics g) {
		desenharForma(g);
	
	}
	public static int getQtdeInstancias() {
		return qtdeInstancias;
	}
}
