package ies.br.main.celulas;

public class CelulaInferiorCentral extends Celula {

	public CelulaInferiorCentral(Integer numero) {
		super(numero);
	}

	@Override
	public void moverParaBaixo() {
		System.out.println("Movimento n�o permitido");
	}

	@Override
	public Celula getBaixo() {
		return this;
	}

}
