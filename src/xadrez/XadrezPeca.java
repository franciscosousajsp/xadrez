package xadrez;

import tabuleirodejogos.Peca;
import tabuleirodejogos.Posicao;
import tabuleirodejogos.Tabuleiro;

public abstract class XadrezPeca extends Peca{

	Cor cor;

	public XadrezPeca(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro);
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}
	
	protected boolean existePecaAdversario(Posicao posicao) {
		
		XadrezPeca peca = (XadrezPeca)getTabuleiro().peca(posicao);
		
		return peca != null && peca.getCor() != cor; 
	}

}
