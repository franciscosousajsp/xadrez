package xadrez;

import tabuleirodejogos.Peca;
import tabuleirodejogos.Tabuleiro;

public class XadrezPeca extends Peca{

	Cor cor;

	public XadrezPeca(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro);
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}
	
	

}
