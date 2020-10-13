package ies.br.main;

public class CelulaCentral extends Celula implements Movimentos {

	private Celula cima;
	private Celula baixo;
	private Celula esquerda;
	private Celula direita;

	public CelulaCentral(Integer numero, Celula cima, Celula baixo, Celula esquerda, Celula direita) {
		super(numero);
		this.setCima(cima);
		this.setBaixo(baixo);
		this.setEsquerda(esquerda);
		this.setDireita(direita);
	}

	@Override
	public void moverParaCima() {
		trocarNumero(this, getCima());
	}

	@Override
	public void moverParaBaixo() {
		trocarNumero(this, getBaixo());
	}

	@Override
	public void moverParaEsquerda() {
		trocarNumero(this, getEsquerda());
	}

	@Override
	public void moverParaDireita() {
		trocarNumero(this, getDireita());
	}

	public Celula getCima() {
		return cima;
	}

	public void setCima(Celula deCima) {
		this.cima = deCima;
	}

	public Celula getBaixo() {
		return baixo;
	}

	public void setBaixo(Celula deBaixo) {
		this.baixo = deBaixo;
	}

	public Celula getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(Celula esquerda) {
		this.esquerda = esquerda;
	}

	public Celula getDireita() {
		return direita;
	}

	public void setDireita(Celula direita) {
		this.direita = direita;
	}

}
