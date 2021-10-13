package xadrez;

import tabuleirodejogos.Tabuleiro;

public class Partida {

	Tabuleiro tabuleiro;

	public Partida() {

		tabuleiro = new Tabuleiro(8, 8);

	}

	public XadrezPeca[][] getPeca() {
		XadrezPeca[][] matriz = new XadrezPeca[tabuleiro.getLinha()][tabuleiro.getColuna()];

		for (int i = 0; i < tabuleiro.getLinha(); i++) {
			for (int j = 0; j < tabuleiro.getColuna(); j++) {
				matriz[i][j] = (XadrezPeca) tabuleiro.peca(i, j);
			}
		}

		return matriz;
	}
}
