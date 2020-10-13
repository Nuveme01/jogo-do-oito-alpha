package ies.br.main;

public class CelulaCentral extends Celula implements Movimentos {

	private Celula deCima;
	private Celula deBaixo;
	private Celula esquerda;
	private Celula direita;

	public CelulaCentral(Integer numero, Celula deCima, Celula deBaixo, Celula esquerda, Celula direita) {
		super(numero);
		this.setDeCima(deCima);
		this.setDeBaixo(deBaixo);
		this.setEsquerda(esquerda);
		this.setDireita(direita);
	}

	@Override
	public void moverParaCima() {
		trocarNumero(this, deCima);
	}

	@Override
	public void moverParaBaixo() {
		trocarNumero(this, deBaixo);

	}

	@Override
	public void moverParaEsquerda() {
		trocarNumero(this, esquerda);

	}

	@Override
	public void moverParaDireita() {
		trocarNumero(this, direita);

	}

	public Celula getDeCima() {
		return deCima;
	}

	public void setDeCima(Celula deCima) {
		this.deCima = deCima;
	}

	public Celula getDeBaixo() {
		return deBaixo;
	}

	public void setDeBaixo(Celula deBaixo) {
		this.deBaixo = deBaixo;
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
