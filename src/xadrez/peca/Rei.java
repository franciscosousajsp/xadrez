package xadrez.peca;

import tabuleirodejogos.Tabuleiro;
import xadrez.Cor;
import xadrez.XadrezPeca;

public class Rei extends XadrezPeca{

	public Rei(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
	}

	@Override
	public String toString() {
		return "R";
	}

	@Override
	public boolean[][] possivelMovimento() {
		boolean[][] matriz = new boolean[getTabuleiro().getLinhas()][getTabuleiro().getColunas()];
		return matriz;
	}

	
}
