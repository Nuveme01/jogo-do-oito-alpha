package ies.br.main.celulas;

public class CelulaCentralDireita extends Celula {

	public CelulaCentralDireita(Integer numero) {
		super(numero);
	}

	public void fixarBaixo(Celula Baixo) {
		setBaixo(Baixo);
	}

	public void fixarCima(Celula cima) {
		setCima(cima);
	}

	public void fixarEsquerda(Celula esquerda) {
		setEsquerda(esquerda);
	}

	@Override
	public void moverParaDireita() {
		
	}

	@Override
	public Celula getDireita() {
		return this;
	}

}
