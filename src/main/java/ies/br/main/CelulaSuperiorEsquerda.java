package ies.br.main;

public class CelulaSuperiorEsquerda extends Celula {

	private Celula baixo;
	private Celula direita;

	public CelulaSuperiorEsquerda(Integer numero, Celula baixo, Celula direita) {
		super(numero);
		this.setBaixo(baixo);
		this.setDireita(direita);
	}

	@Override
	public void moverParaCima() {
		System.out.println("Movimento n�o permitido");
	}

	@Override
	public void moverParaBaixo() {
		trocarNumero(this, getBaixo());

	}

	@Override
	public void moverParaEsquerda() {
		System.out.println("Movimento n�o permitido");
	}

	@Override
	public void moverParaDireita() {
		trocarNumero(this, getDireita());
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
