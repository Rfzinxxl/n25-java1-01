package br.com.senaisp.bauru.aula07;

import java.util.Random;

public class Baralho {
	private Carta[] cartas;
	private boolean[] cartaRetirada;
	private Random rnd;
	public Baralho() {
		rnd = new Random();
		cartas = new Carta[Carta.NAIPES.length * Carta.NUMEROS.length];
		cartaRetirada = new boolean[cartas.length];
		for (int i=0;i<cartas.length;i++) { 
			cartas[i] = new Carta (i/Carta.NUMEROS.length,i%Carta.NUMEROS.length);
			cartaRetirada[i] = false;
		}
	}
	
	public Carta getCartaSorteada() {
		int ind;
		do {
			ind = rnd.nextInt(cartas.length);
			if (!cartaRetirada[ind]) {
				cartaRetirada[ind]=true;
				return cartas[ind];
			}
			
		}while(getNumCartasDisp()>0);
		return null;
	}
	public int getNumCartasDisp() {
		int ret =0;
		for(boolean it: cartaRetirada) {
			if(!it) {
				ret++;
			}
		}
		return ret;
	}
}



