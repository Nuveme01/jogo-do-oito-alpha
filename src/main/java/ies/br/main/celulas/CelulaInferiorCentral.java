package ies.br.main.celulas;

public class CelulaInferiorCentral extends Celula {

	private Celula cima;
	private Celula esquerda;
	private Celula direita;

	public CelulaInferiorCentral(Integer numero) {
		super(numero);
	}

	public void fixarCima(Celula cima) {
		setCima(cima);
	}

	public void fixarDireita(Celula direita) {
		setDireita(direita);
	}

	public void fixarEsquerda(Celula esquerda) {
		setEsquerda(esquerda);
	}

	@Override
	public void moverParaCima() {
		trocarNumero(this, getCima());
	}

	@Override
	public void moverParaBaixo() {
		System.out.println("Movimento não permitido");
	}

	@Override
	public void moverParaEsquerda() {
		trocarNumero(this, esquerda);
	}

	@Override
	public void moverParaDireita() {
		trocarNumero(this, getDireita());
	}

	public Celula getCima() {
		return cima;
	}

	public void setCima(Celula cima) {
		this.cima = cima;
	}

	public Celula getDireita() {
		return direita;
	}

	public void setDireita(Celula direita) {
		this.direita = direita;
	}

	public Celula getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(Celula esquerda) {
		this.esquerda = esquerda;
	}

}
