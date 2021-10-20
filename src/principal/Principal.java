package principal;


import java.util.Scanner;

import xadrez.Partida;
import xadrez.XadrezPeca;
import xadrez.XadrezPosicao;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Partida partida = new Partida();
		
		while(true) {
			Impressao.imprimaTabuleiro(partida.getPeca());
		  System.out.println();
		  System.out.print("Peca de Origem: ");
		  XadrezPosicao origem = Impressao.separaPosicao(sc);
		  
		  System.out.println();
		  System.out.print("Peca de Destino: ");
		  XadrezPosicao destino = Impressao.separaPosicao(sc);
		  
		  
		  XadrezPeca capturaPeca = partida.pecaPerformace(origem, destino);
		  
		}
	}

}
