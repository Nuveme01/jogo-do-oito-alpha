package ies.br.main.celulas;

public class CelulaSuperiorEsquerda extends Celula {

	private Celula baixo;
	private Celula direita;

	public CelulaSuperiorEsquerda(Integer numero) {
		super(numero);
	}

	public void fixarBaixo(Celula baixo) {
		setBaixo(baixo);
	}

	public void fixarDireita(Celula direita) {
		setDireita(direita);
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
		System.out.println("Movimento não permitido");
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
