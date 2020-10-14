package ies.br.main.celulas;

public class CelulaInferiorEsquerda extends Celula {

	private Celula cima;
	private Celula direita;

	public CelulaInferiorEsquerda(Integer numero) {
		super(numero);
	}

	public void fixarCima(Celula cima) {
		setCima(cima);
	}

	public void fixarDireita(Celula direita) {
		setDireita(direita);
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
