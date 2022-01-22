package tabuleirodejogos;



public class Tabuleiro {

	private Integer linhas;
	private Integer colunas;
	private Peca[][] pecas;

	public Tabuleiro(Integer linhas, Integer colunas) {
		if(linhas < 1 && colunas < 1) {
			throw new ExceptionTabuleiro("Nao pode ser Criado o Tabuleiro");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		
		pecas = new Peca[linhas][colunas];
	}
	
	public Integer getLinhas() {
		return linhas;
	}

	public Integer getColunas() {
		return colunas;
	}

	public Peca peca(int linha, int coluna) {
		if (!existePosicao(linha, coluna)) {
			throw new ExceptionTabuleiro("posicao nao existe no tabuleiro");
		}
		return pecas[linha][coluna];
	}

	public Peca peca(Posicao posicao) {
		if (!existePosicao(posicao)) {
			throw new ExceptionTabuleiro("posicao nao existe no tabuleiro");
		}
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}

	public void colocaPeca(Peca peca, Posicao posicao) {
		if (temPeca(posicao)) {
			throw new ExceptionTabuleiro("peca ja existe no tabuleiro na posiçao " + posicao);
		}
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
	}

	public Peca removePeca(Posicao posicao) {

		if (!existePosicao(posicao)) {
			throw new ExceptionTabuleiro("posicao nao existe no tabuleiro");
		}

		if (peca(posicao) == null) {
			return null;
		}

		Peca aux = peca(posicao);
		aux.posicao = null;
		pecas[posicao.getLinha()][posicao.getColuna()] = null;

		return aux;

	}

	private boolean existePosicao(int linha, int coluna) {
		return linha >= 0 && linha < this.linhas && coluna >= 0 && coluna < this.colunas;
	}

	public boolean existePosicao(Posicao posicao) {
		return existePosicao(posicao.getLinha(), posicao.getColuna());
	}

	public boolean temPeca(Posicao posicao) {
		if (!existePosicao(posicao)) {
			throw new ExceptionTabuleiro("posicao nao existe no tabuleiro");
		}
		return peca(posicao) != null;
	}
}
