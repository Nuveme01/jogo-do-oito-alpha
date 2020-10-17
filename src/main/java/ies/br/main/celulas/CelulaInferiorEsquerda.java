package ies.br.main.celulas;

public class CelulaInferiorEsquerda extends Celula {

	public CelulaInferiorEsquerda(Integer numero) {
		super(numero);
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
	public Celula getEsquerda() {
		return this;
	}

	@Override
	public Celula getBaixo() {
		return this;
	}

}
