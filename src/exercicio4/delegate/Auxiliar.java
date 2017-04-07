package exercicio4.delegate;

import br.ufsc.ine.leb.sistemaBancario.Agencia;
import br.ufsc.ine.leb.sistemaBancario.Banco;
import br.ufsc.ine.leb.sistemaBancario.Conta;
import br.ufsc.ine.leb.sistemaBancario.Moeda;
import br.ufsc.ine.leb.sistemaBancario.SistemaBancario;

public class Auxiliar {

	public static Banco criarCaixaEconomica() {
		return new SistemaBancario().criarBanco("Caixa Econômica", Moeda.BRL);
		
	}

	public static Agencia criarCaixaEconomicaTrindade() {
		Banco caixaEconomica = new SistemaBancario().criarBanco("Caixa Econômica", Moeda.BRL);
		Agencia caixaEconomicaTrindade = caixaEconomica.criarAgencia("Trindade");
		
		return caixaEconomicaTrindade;
	}

	public static Conta criarConta() {
		Banco caixaEconomica = new SistemaBancario().criarBanco("Caixa Econômica", Moeda.BRL);
		Agencia caixaEconomicaTrindade = caixaEconomica.criarAgencia("Trindade");
		Conta joaoCaixaEconomicaTrindade = caixaEconomicaTrindade.criarConta("João");

		return joaoCaixaEconomicaTrindade;
	}

}
