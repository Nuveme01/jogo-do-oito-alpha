package ies.br.main;

public class CelulaCentral extends Celula {

	private Celula cima;
	private Celula baixo;
	private Celula esquerda;
	private Celula direita;

	public CelulaCentral(Integer numero) {
		super(numero);
	}

	public void fixarDireita(Celula direita) {
		this.setDireita(direita);
	}

	public void fixarEsquerda(Celula esquerda) {
		this.setEsquerda(esquerda);
	}

	public void fixarBaixo(Celula baixo) {
		this.setBaixo(baixo);
	}

	public void fixarCima(Celula cima) {
		this.setCima(cima);
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
