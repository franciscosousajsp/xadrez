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
		return new Posicao(linha - 8, coluna - 'a');
	}
	
	protected static XadrezPosicao trocaPosicao(Posicao posicao) {
		return new XadrezPosicao((char)('a'- posicao.getColuna()), posicao.getLinha() - 8);
	}

	@Override
	public String toString() {
		return " "+coluna+linha;
	}
	
	

}
