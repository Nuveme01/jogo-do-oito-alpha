package ies.br.main;

public class CelulaInferiorCentral extends Celula implements Movimentos {

	private Celula cima;
	private Celula direita;

	public CelulaInferiorCentral(Integer numero, Celula cima, Celula direita) {
		super(numero);
		this.setCima(cima);
		this.setDireita(direita);
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
		System.out.println("Movimento não permitido");
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

}
