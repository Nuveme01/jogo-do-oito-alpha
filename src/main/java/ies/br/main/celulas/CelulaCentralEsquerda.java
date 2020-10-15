package ies.br.main.celulas;

public class CelulaCentralEsquerda extends Celula {

	public CelulaCentralEsquerda(Integer numero) {
		super(numero);
	}

	public void fixarBaixo(Celula Baixo) {
		setBaixo(Baixo);
	}

	public void fixarCima(Celula cima) {
		setCima(cima);
	}

	public void fixarDireita(Celula direita) {
		setDireita(direita);
	}

	@Override
	public void moverParaEsquerda() {
		
	}

	@Override
	public Celula getEsquerda() {
		return this;
	}

}
