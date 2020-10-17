package ies.br.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import ies.br.main.celulas.Celula;

public class TesteDeTrocaDeNumeroDaCelula {

	private Celula celula1;
	private Celula celula2;

	@Test
	public void trocandoValoresDaPrimeiraCelulaComASegunda() {
		celula1 = new Celula(Integer.valueOf(5));
		celula2 = new Celula(Integer.valueOf(9));
		celula1.trocarNumero(celula1, celula2);

		assertEquals(Integer.valueOf(9), celula1.getNumero());
	}

	@Test
	public void trocandoValoresDaSegundaCelulaComAPrimeira() {
		celula1 = new Celula(Integer.valueOf(5));
		celula2 = new Celula(Integer.valueOf(9));
		celula2.trocarNumero(celula1, celula2);

		assertEquals(Integer.valueOf(5), celula2.getNumero());
	}
}
