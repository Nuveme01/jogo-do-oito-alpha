package ies.br.main.celulas;

public class CelulaSuperiorEsquerda extends Celula {

	public CelulaSuperiorEsquerda(Integer numero) {
		super(numero);
	}

	@Override
	public void moverParaCima() {
		System.out.println("Movimento não permitido");
	}

	@Override
	public void moverParaEsquerda() {
		System.out.println("Movimento não permitido");
	}

	@Override
	public Celula getCima() {
		return this;
	}

	@Override
	public Celula getEsquerda() {
		return this;
	}

}