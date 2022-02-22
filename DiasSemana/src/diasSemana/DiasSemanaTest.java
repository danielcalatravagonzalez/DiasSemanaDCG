/**
 * 
 */
package diasSemana;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author Daniel
 *
 */
class DiasSemanaTest {

	@Test
	void decisionDiaTest() {
		assertEquals("El día seleccionado es LUNES", DiasSemana.decisionDia(1));
		assertEquals("El día seleccionado es Domingo", DiasSemana.decisionDia(7));
		assertEquals("ERROR: número incorrecto.", DiasSemana.decisionDia(0));
		assertEquals("ERROR: número incorrecto.", DiasSemana.decisionDia(8));
	}

}
