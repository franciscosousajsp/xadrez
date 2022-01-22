package xadrez;

import tabuleirodejogos.Peca;
import tabuleirodejogos.Posicao;
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
		XadrezPeca[][] matriz = new XadrezPeca[tabuleiro.getLinhas()][tabuleiro.getColunas()];

		for (int i = 0; i < tabuleiro.getLinhas(); i++) {
			for (int j = 0; j < tabuleiro.getColunas(); j++) {
				matriz[i][j] = (XadrezPeca) tabuleiro.peca(i, j);
			}
		}

		return matriz;
	}

	public XadrezPeca pecaPerformace(XadrezPosicao origemPosicao, XadrezPosicao destindoPosicao) {
		Posicao origem = origemPosicao.convertePosicao();
		Posicao destino = destindoPosicao.convertePosicao();

		validaPosicaoOrigem(origem);
		validaPosicaoDestino(origem, destino);

		Peca pecaCapturada = movePeca(origem, destino);

		return (XadrezPeca) pecaCapturada;
	}

	private Peca movePeca(Posicao origem, Posicao destino) {
		Peca p = tabuleiro.removePeca(origem);
		Peca pecaCapturada = tabuleiro.removePeca(destino);
		tabuleiro.colocaPeca(p, destino);

		return pecaCapturada;

	}

	private void validaPosicaoOrigem(Posicao posicao) {
		if (!tabuleiro.existePosicao(posicao)) {
			throw new XadrezException("Posicao ja existe na origem");
		}
	}

	private void validaPosicaoDestino(Posicao origem, Posicao destino) {
		if(!tabuleiro.peca(origem).possivelMovimento(destino)) {
			throw new XadrezException("Nao ha possibilidade de Movimento dessa peca pra este destino");
		}
	}


	private void colocaNovaPeca(char coluna, int linha, Peca peca) {
		tabuleiro.colocaPeca(peca, new XadrezPosicao(coluna, linha).convertePosicao());
	}

	private void iniciaJogo() {
		colocaNovaPeca('c', 7, new Rei(tabuleiro, Cor.BRANCA));
		colocaNovaPeca('c', 1, new Torre(tabuleiro, Cor.PRETA));
		colocaNovaPeca('a', 2, new Torre(tabuleiro, Cor.PRETA));
	}
}
