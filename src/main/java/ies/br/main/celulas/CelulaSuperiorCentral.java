package ies.br.main.celulas;

public class CelulaSuperiorCentral extends Celula {

	public CelulaSuperiorCentral(Integer numero) {
		super(numero);
	}

	@Override
	public void moverParaCima() {
		System.out.println("Movimento n�o permitido");
	}

	@Override
	public Celula getCima() {
		return this;
	}

}
