package ies.br.main.celulas;

public class CelulaInferiorDireita extends Celula {

	public CelulaInferiorDireita(Integer numero) {
		super(numero);
	}

	@Override
	public void moverParaBaixo() {
		System.out.println("Movimento não permitido");
	}

	@Override
	public void moverParaDireita() {
		System.out.println("Movimento não permitido");
	}

	@Override
	public Celula getDireita() {
		return this;
	}

	@Override
	public Celula getBaixo() {
		return this;
	}

}
