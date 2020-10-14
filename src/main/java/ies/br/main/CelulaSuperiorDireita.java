package ies.br.main;

public class CelulaSuperiorDireita extends Celula {

	private Celula baixo;
	private Celula esquerda;

	public CelulaSuperiorDireita(Integer numero, Celula baixo, Celula esquerda) {
		super(numero);
		this.setBaixo(baixo);
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
		System.out.println("Movimento não permitido");
	}

	public Celula getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(Celula esquerda) {
		this.esquerda = esquerda;
	}

	public Celula getBaixo() {
		return baixo;
	}

	public void setBaixo(Celula baixo) {
		this.baixo = baixo;
	}

}
