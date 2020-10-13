package ies.br.main;

public class CelulaSuperiorCentral extends Celula implements Movimentos {

	private Celula baixo;
	private Celula direita;
	private Celula esquerda;

	public CelulaSuperiorCentral(Integer numero, Celula baixo, Celula direita, Celula esquerda) {
		super(numero);
		this.setBaixo(baixo);
		this.setDireita(direita);
		this.setEsquerda(esquerda);
	}

	@Override
	public void moverParaCima() {
		System.out.println("Movimento não permitido");
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

	public Celula getBaixo() {
		return baixo;
	}

	public void setBaixo(Celula baixo) {
		this.baixo = baixo;
	}

}
