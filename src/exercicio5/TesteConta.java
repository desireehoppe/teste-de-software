package exercicio5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.ufsc.ine.leb.sistemaBancario.Agencia;
import br.ufsc.ine.leb.sistemaBancario.Banco;
import br.ufsc.ine.leb.sistemaBancario.Conta;
import br.ufsc.ine.leb.sistemaBancario.Moeda;
import br.ufsc.ine.leb.sistemaBancario.SistemaBancario;

public class TesteConta {

	@Test
	public void mariaBancoDoBrasilCentro() throws Exception {
		Banco bancoDoBrasil = new SistemaBancario().criarBanco("Banco do Brasil", Moeda.BRL);
		Agencia bancoDoBrasilCentro = bancoDoBrasil.criarAgencia("Centro");
		Conta mariaBancoDoBrasilCentro = bancoDoBrasilCentro.criarConta("Maria");
		
		assertEquals("0001-5", mariaBancoDoBrasilCentro.obterIdentificador());
		assertEquals("Maria", mariaBancoDoBrasilCentro.obterTitular());
		assertTrue(mariaBancoDoBrasilCentro.calcularSaldo().zero());
		assertEquals(bancoDoBrasilCentro, mariaBancoDoBrasilCentro.obterAgencia());
	}
}
