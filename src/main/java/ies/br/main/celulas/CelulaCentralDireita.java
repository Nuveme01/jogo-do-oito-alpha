package ies.br.main.celulas;

public class CelulaCentralDireita extends Celula {

	private Celula cima;
	private Celula baixo;
	private Celula esquerda;

	public CelulaCentralDireita(Integer numero) {
		super(numero);

	}

	public void fixarBaixo(Celula Baixo) {
		setBaixo(Baixo);
	}

	public void fixarCima(Celula cima) {
		setCima(cima);
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
		trocarNumero(this, getBaixo());
	}

	@Override
	public void moverParaEsquerda() {
		trocarNumero(this, esquerda);
	}

	@Override
	public void moverParaDireita() {
		System.out.println("Movimento não permitido");
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

	public Celula getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(Celula esquerda) {
		this.esquerda = esquerda;
	}

}
