package tabuleirodejogos;

public abstract class Peca {

	protected Posicao posicao;
	private Tabuleiro tabuleiro;

	public Peca(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}

	public abstract boolean[][] possivelMovimento();

	public boolean possivelMovimento(Posicao posicao) {
		return possivelMovimento()[posicao.getLinha()][posicao.getColuna()];
	}

	public boolean existePosivelMovimento() {
		
		boolean[][] matriz = possivelMovimento();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j]) {
					return true;
				}
			}
		}

		return false;

	}
}
