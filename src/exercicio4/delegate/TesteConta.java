package exercicio4.delegate;

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
	public void joaoCaixaEconomicaTrindade() throws Exception {

		Banco caixaEconomica = new SistemaBancario().criarBanco("Caixa Econ�mica", Moeda.BRL);
		Agencia caixaEconomicaTrindade = caixaEconomica.criarAgencia("Trindade");
		Conta joaoCaixaEconomicaTrindade = Auxiliar.criarConta();

		
		assertEquals("0001-4", joaoCaixaEconomicaTrindade.obterIdentificador());
		assertEquals("João", joaoCaixaEconomicaTrindade.obterTitular());
		assertTrue(joaoCaixaEconomicaTrindade.calcularSaldo().zero());
		assertEquals(caixaEconomicaTrindade, joaoCaixaEconomicaTrindade.obterAgencia());
	}

}
