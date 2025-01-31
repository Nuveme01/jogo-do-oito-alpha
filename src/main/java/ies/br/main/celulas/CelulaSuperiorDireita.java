package ies.br.main.celulas;

public class CelulaSuperiorDireita extends Celula {

	public CelulaSuperiorDireita(Integer numero) {
		super(numero);
	}

	@Override
	public void moverParaCima() {
		System.out.println("Movimento n�o permitido");
	}

	@Override
	public void moverParaDireita() {
		System.out.println("Movimento n�o permitido");
	}

	@Override
	public Celula getCima() {
		return this;
	}

	@Override
	public Celula getDireita() {
		return this;
	}

}
