package exercício3;

import static org.junit.Assert.*;
import org.joda.time.LocalTime;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.LocalDate;
import org.junit.Test;

public class TesteJodaTime {
	
	@Test
	public void verificarQueDoisEhDiferenteDeTres() throws Exception {
		assertNotEquals(2, 3);
	}
	
	@Test
	public void verificarAlgumaCoisa() throws Exception {
		LocalDate hoje = new LocalDate(2017, 4, 1);
		assertEquals(1, hoje.getDayOfMonth());
		assertEquals(4, hoje.getMonthOfYear());
		assertEquals(2017, hoje.getYear());
	}
	
//	@Test
	public void verificaDatadeNascimento() throws Exception {
		LocalDate nascimento = new LocalDate(1993, 3, 8);
		assertEquals(8, nascimento.getDayOfMonth());
		assertEquals(3, nascimento.getMonthOfYear());
		assertEquals(1993, nascimento.getYear());
		
	}
	
	@Test
	public void testaLocalTime() throws Exception {
		LocalTime horarioAcordar = new LocalTime(8, 20);
		assertEquals(8, horarioAcordar.getHourOfDay());
		assertEquals(20, horarioAcordar.getMinuteOfHour());	
	}
	
	@Test(expected = IllegalFieldValueException.class)
	public void verificaHorarioNegativo() throws Exception {
		LocalTime horarioNegativo = new LocalTime(-10, 0);	
	}

	@Test(expected = IllegalFieldValueException.class)
	public void verificaAnoNegativo() throws Exception {
		LocalDate anoNegativo = new LocalDate(1,4,-2017 );	
	}

	@Test
	public void somaData() throws Exception {
		LocalDate dataSomada = new LocalDate(2017, 2,28).plusDays(1);
		assertEquals(1, dataSomada.getDayOfMonth());
		assertEquals(3, dataSomada.getMonthOfYear());
		assertEquals(2017, dataSomada.getYear());
	}
	
	@Test
	public void subtraiHora() throws Exception {
		LocalTime horaSubtraida = new LocalTime(12, 00, 00, 00).minusMillis(1);
		assertEquals(11, horaSubtraida.getHourOfDay());
		assertEquals(59, horaSubtraida.getMinuteOfHour());
		assertEquals(59, horaSubtraida.getSecondOfMinute());
		assertEquals(999, horaSubtraida.getMillisOfSecond());
	}

	
	
	
}