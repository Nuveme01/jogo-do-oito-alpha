package ies.br.main;

public class CelulaCentralDireita extends Celula {

	private Celula cima;
	private Celula baixo;

	public CelulaCentralDireita(Integer numero, Celula cima, Celula baixo) {
		super(numero);
		this.setCima(cima);
		this.setBaixo(baixo);
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

}
