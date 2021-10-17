package xadrez;

import tabuleirodejogos.Peca;
import tabuleirodejogos.Tabuleiro;
import xadrez.peca.Rei;
import xadrez.peca.Torre;


public class Partida {

	Tabuleiro tabuleiro;

	public Partida() {

		tabuleiro = new Tabuleiro(8, 8);
		iniciaJogo();

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
	
	private void colocaNovaPeca(char coluna, int linha, Peca peca) {
		tabuleiro.colocaPeca(peca, new XadrezPosicao(coluna, linha).convertePosicao());
	}
	
	
	private void iniciaJogo() {
		colocaNovaPeca('c', 7, new Rei(tabuleiro, Cor.BRANCA));
		colocaNovaPeca('c',1, new Torre(tabuleiro, Cor.PRETA));
		colocaNovaPeca('a', 2, new Torre(tabuleiro, Cor.PRETA));
	}
}
