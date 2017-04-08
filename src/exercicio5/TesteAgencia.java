package exercicio5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.ufsc.ine.leb.sistemaBancario.Agencia;
import br.ufsc.ine.leb.sistemaBancario.Banco;
import br.ufsc.ine.leb.sistemaBancario.Conta;
import br.ufsc.ine.leb.sistemaBancario.Moeda;
import br.ufsc.ine.leb.sistemaBancario.SistemaBancario;

public class TesteAgencia {

	@Test
	public void bancoDoBrasilCentro() throws Exception {
		Banco bancoDoBrasil = new SistemaBancario().criarBanco("Banco do Brasil", Moeda.BRL);
		Agencia bancoDoBrasilCentro = bancoDoBrasil.criarAgencia("Centro");

		assertEquals("002", bancoDoBrasilCentro.obterIdentificador());
		assertEquals("Centro", bancoDoBrasilCentro.obterNome());
		assertEquals(bancoDoBrasil, bancoDoBrasilCentro.obterBanco());
	}

}
