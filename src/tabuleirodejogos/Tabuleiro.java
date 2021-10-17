package tabuleirodejogos;

public class Tabuleiro {

	private Integer linha;
	private Integer coluna;
	private Peca[][] pecas;

	public Tabuleiro(Integer linha, Integer coluna) {

		if(linha < 1 || coluna < 1) {
			throw new ExceptionTabuleiro("N�o pode ser Criado o Tabuleiro");
		}
		
		this.linha = linha;
		this.coluna = coluna;
		pecas = new Peca[linha][coluna];

	}

	public Integer getLinha() {
		return linha;
	}

	public Integer getColuna() {
		return coluna;
	}

	public Peca peca(int linha, int coluna) {
		if(!existePosicao(linha, coluna)) {
			throw new ExceptionTabuleiro("posi��o n�o existe no tabuleiro");
		}
		return pecas[linha][coluna];
	}

	public Peca peca(Posicao posicao) {
		if(!existePosicao(posicao)) {
			throw new ExceptionTabuleiro("posic�o n�o existe no tabuleiro");
		}
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}

	public void colocaPeca(Peca peca, Posicao posicao) {
		if(temPeca(posicao)) {
			throw new ExceptionTabuleiro("pe�a j� existe no tabuleiro na posi��o " + posicao);
		}
      pecas[posicao.getLinha()][posicao.getColuna()] = peca;
      peca.posicao = posicao;
	}
	
	private boolean existePosicao(int linha, int coluna) {
		return linha >= 0 && linha < this.linha && coluna >= 0 && coluna < this.coluna;
	}
	
	public boolean existePosicao(Posicao posicao) {
		return existePosicao(posicao.getLinha(), posicao.getColuna());
	}
	
	public boolean temPeca(Posicao posicao) {
		if(!existePosicao(posicao)) {
			throw new ExceptionTabuleiro("posic�o n�o existe no tabuleiro");
		}
		return peca(posicao) != null; 
	}
}
