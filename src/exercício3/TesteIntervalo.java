package exercício3;

import static org.junit.Assert.*;
import org.joda.time.LocalTime;
import org.joda.time.DateTime;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.junit.Test;

public class TesteIntervalo {
	
	@Test
	public void testeIntervaloDias() throws Exception {
		
		DateTime dataInicio = new DateTime(2017,3,31, 18, 30);
		DateTime dataFim = new DateTime(2017,5,6, 18, 30);
		DateTime hoje = new DateTime(2017, 4, 1, 18, 30);
		
		Interval intervalo = new Interval(dataInicio, dataFim);
		assertTrue(intervalo.contains(hoje));
	
		long periodo = intervalo.toDurationMillis();		
		long dias = periodo / 86400000;
		assertEquals(36, dias);
	}

}
