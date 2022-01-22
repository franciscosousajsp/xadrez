package xadrez.peca;

import tabuleirodejogos.Posicao;
import tabuleirodejogos.Tabuleiro;
import xadrez.Cor;
import xadrez.XadrezPeca;

public class Torre extends XadrezPeca {

	public Torre(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
	}

	@Override
	public String toString() {
		return "T";
	}

	@Override
	public boolean[][] possivelMovimento() {
		boolean[][] matriz = new boolean[getTabuleiro().getLinhas()][getTabuleiro().getColunas()];

		Posicao p = new Posicao(0, 0);

		// posicao acima
		p.setValor(posicao.getLinha() - 1, posicao.getColuna());
		while (getTabuleiro().existePosicao(p) && !getTabuleiro().temPeca(p)) {
			matriz[p.getLinha()][p.getColuna()] = true;
			p.setLinha(p.getLinha() - 1);
		}

		if (getTabuleiro().existePosicao(p) && getTabuleiro().temPeca(p)) {
			matriz[p.getLinha()][p.getColuna()] = true;
		}

		// posicao esquerda
		p.setValor(posicao.getLinha(), posicao.getColuna() - 1);
		while (getTabuleiro().existePosicao(p) && !getTabuleiro().temPeca(p)) {
			matriz[p.getLinha()][p.getColuna()] = true;
			p.setColuna(p.getColuna() - 1);
		}

		if (getTabuleiro().existePosicao(p) && getTabuleiro().temPeca(p)) {
			matriz[p.getLinha()][p.getColuna()] = true;
		}

		// posicao direita
		p.setValor(posicao.getLinha(), posicao.getColuna() + 1);
		while (getTabuleiro().existePosicao(p) && !getTabuleiro().temPeca(p)) {
			matriz[p.getLinha()][p.getColuna()] = true;
			p.setColuna(p.getColuna() + 1);
		}

		if (getTabuleiro().existePosicao(p) && getTabuleiro().temPeca(p)) {
			matriz[p.getLinha()][p.getColuna()] = true;
		}
		
		// posicao acima
		p.setValor(posicao.getLinha() + 1, posicao.getColuna());
		while (getTabuleiro().existePosicao(p) && !getTabuleiro().temPeca(p)) {
			matriz[p.getLinha()][p.getColuna()] = true;
			p.setLinha(p.getLinha() + 1);
		}

		if (getTabuleiro().existePosicao(p) && getTabuleiro().temPeca(p)) {
			matriz[p.getLinha()][p.getColuna()] = true;
		}

		return matriz;
	}

}
