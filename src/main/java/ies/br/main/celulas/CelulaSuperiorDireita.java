package ies.br.main.celulas;

public class CelulaSuperiorDireita extends Celula {

	private Celula baixo;
	private Celula esquerda;

	public CelulaSuperiorDireita(Integer numero) {
		super(numero);
	}
	
	public void fixarBaixo(Celula baixo) {
		setBaixo(baixo);
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
