package br.com.alura.spring.data;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.alura.spring.data.service.CrudCargoService;
import br.com.alura.spring.data.service.CrudFunconarioService;
import br.com.alura.spring.data.service.CrudUnidadeTrabalhoService;
import br.com.alura.spring.data.service.RelatorioFuncionarioDinamico;
import br.com.alura.spring.data.service.RelatoriosService;

@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner{

	private Boolean system = true;
	private final CrudCargoService cargoService;
	private final RelatoriosService relatoriosService;
	private final CrudFunconarioService funconarioService;
	private final CrudUnidadeTrabalhoService unidadeTrabalhoService;
	private final RelatorioFuncionarioDinamico relatorioFuncionarioDinamico;
	
	public SpringDataApplication(CrudCargoService cargoService, CrudFunconarioService funconarioService,
			CrudUnidadeTrabalhoService unidadeTrabalhoService, RelatoriosService relatoriosService, RelatorioFuncionarioDinamico relatorioFuncionarioDinamico) {
		this.cargoService = cargoService;
		this.funconarioService = funconarioService;
		this.unidadeTrabalhoService = unidadeTrabalhoService;
		this.relatoriosService = relatoriosService;
		this.relatorioFuncionarioDinamico = relatorioFuncionarioDinamico;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDataApplication.class, args);
	}
	
	@Override
	public void run(String...  args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		
		while(system) {
			System.out.println("Qual ação você quer executar?");
			System.out.println("0 - Sair");
			System.out.println("1 - Cargo");
			System.out.println("2 - Funcionario");
			System.out.println("3 - Unidade Trabalho");
			System.out.println("4 - Relatorios");
			System.out.println("5 - Relatorio Dinâmico");
			
			int action = scanner.nextInt();
			
			switch (action) {
			case 1:
				cargoService.inicial(scanner);
				break;
			case 2:
				funconarioService.inicial(scanner);
				break;
			case 3:
				unidadeTrabalhoService.inicial(scanner);
				break;
			case 4:
				relatoriosService.inicial(scanner);
				break;
			case 5:
				relatorioFuncionarioDinamico.inicial(scanner);
				break;
			default:
				system = false;
				break;
			}
		}
	}
}