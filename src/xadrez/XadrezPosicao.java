package xadrez;

import tabuleirodejogos.Posicao;

public class XadrezPosicao {

	private char coluna;
	private Integer linha;

	public XadrezPosicao(char coluna, Integer linha) {
		if (coluna < 'a' || coluna > 'h' || linha < 1 || linha > 8) {
			throw new ExceptionXadrez("Erro a instanciar a linha e coluna ");
		}

		this.coluna = coluna;
		this.linha = linha;
	}

	public char getColuna() {
		return coluna;
	}

	public Integer getLinha() {
		return linha;
	}

	protected Posicao convertePosicao() {
		return new Posicao(8 - linha, coluna - 'a');
	}
	
	protected static XadrezPosicao trocaPosicao(Posicao posicao) {
		return new XadrezPosicao((char)('a'- posicao.getColuna()), 8 - posicao.getLinha());
	}

	@Override
	public String toString() {
		return " "+coluna+linha;
	}
	
	

}
