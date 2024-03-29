package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
		BonusService service = new BonusService();
		
		//assertThrows(IllegalArgumentException.class, () ->  service.calcularBonus(new Funcionario("Matheus Falc�o", LocalDate.now() , new BigDecimal("25000"))));
		
		try {
			service.calcularBonus(new Funcionario("Matheus Falc�o", LocalDate.now() , new BigDecimal("25000")));
			fail("FALHOU!!");
		} catch (Exception e) {
			assertEquals("Funcion�rio com sal�rio maiordo que 10k n�o pode receber bonus", e.getMessage());
		}
	}
	
	@Test
	void bonusDeveriaSer10PorcentoDoSalario() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Matheus Falc�o", LocalDate.now() , new BigDecimal("2500")));
		
	assertEquals(new BigDecimal("250.00"), bonus);
	}
	
	@Test
	void bonusDeveriaSerDePorcentoParaSalarioDeExatamenteDezMil() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Matheus Falc�o", LocalDate.now() , new BigDecimal("10000")));
		
	assertEquals(new BigDecimal("1000.00"), bonus);
	}

}