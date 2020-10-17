package ies.br.main.celulas;

public class CelulaInferiorCentral extends Celula {

	public CelulaInferiorCentral(Integer numero) {
		super(numero);
	}

	@Override
	public void moverParaBaixo() {
		System.out.println("Movimento não permitido");
	}

	@Override
	public Celula getBaixo() {
		return this;
	}

}
