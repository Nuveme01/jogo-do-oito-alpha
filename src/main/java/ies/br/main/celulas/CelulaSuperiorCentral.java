package ies.br.main.celulas;

public class CelulaSuperiorCentral extends Celula {

	private Celula baixo;
	private Celula direita;
	private Celula esquerda;

	public CelulaSuperiorCentral(Integer numero) {
		super(numero);
	}

	public void fixarBaixo(Celula Baixo) {
		setBaixo(Baixo);
	}
	
	public void fixarDireita(Celula direita) {
		setDireita(direita);
	}
	
	public void fixarEsquerda(Celula esquerda) {
		setEsquerda(esquerda);
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
