package TDD;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class CalculadoraTest {

	@Test
	public void deveriaSomarDoisNumerosPositivos() {
		Caluladora calc = new Caluladora();
		int soma = calc.somar(3, 7);
		
		Assert.assertEquals(10, soma);
	}

}