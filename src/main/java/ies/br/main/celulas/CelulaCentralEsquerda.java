package ies.br.main.celulas;

public class CelulaCentralEsquerda extends Celula {

	private Celula cima;
	private Celula baixo;
	private Celula direita;

	public CelulaCentralEsquerda(Integer numero) {
		super(numero);
	}

	public void fixarBaixo(Celula Baixo) {
		setBaixo(Baixo);
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

	public Celula getBaixo() {
		return baixo;
	}

	public void setBaixo(Celula baixo) {
		this.baixo = baixo;
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
