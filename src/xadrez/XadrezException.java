package xadrez;

import tabuleirodejogos.ExceptionTabuleiro;

public class XadrezException  extends ExceptionTabuleiro {

	private static final long serialVersionUID = 1L;

	public XadrezException(String msg) {
		super(msg);
	}
}
