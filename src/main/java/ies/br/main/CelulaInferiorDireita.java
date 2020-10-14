package ies.br.main;

public class CelulaInferiorDireita extends Celula {

	private Celula cima;
	private Celula esquerda;

	public CelulaInferiorDireita(Integer numero, Celula cima, Celula esquerda) {
		super(numero);
		this.setCima(cima);
		this.setEsquerda(esquerda);
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
		trocarNumero(this, getEsquerda());
	}

	@Override
	public void moverParaDireita() {
		System.out.println("Movimento não permitido");
	}

	public Celula getCima() {
		return cima;
	}

	public void setCima(Celula cima) {
		this.cima = cima;
	}

	public Celula getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(Celula esquerda) {
		this.esquerda = esquerda;
	}

}
