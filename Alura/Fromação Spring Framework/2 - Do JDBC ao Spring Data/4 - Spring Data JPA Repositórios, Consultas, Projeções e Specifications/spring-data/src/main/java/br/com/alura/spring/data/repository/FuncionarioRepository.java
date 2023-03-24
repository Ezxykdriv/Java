package br.com.alura.spring.data.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.spring.data.orm.Funcionario;

@Repository
public interface FuncionarioRepository extends PagingAndSortingRepository<Funcionario, Integer> {
	// EQUALS
	List<Funcionario> findByNome(String nome);
	
	//novo método com paginação
    List<Funcionario> findByNome(String nome, Pageable pageable);

	// LIKE
	// O valor do parâmetro nome deve usar o pattern, por exemplo: String nome = "%maria%";
	List<Funcionario> findByNomeLike(String nome);

	// STARTING
	List<Funcionario> findByNomeStartingWith(String nome);

	// ENDING
	List<Funcionario> findByNomeEndingWith(String nome);

	// NULL
	List<Funcionario> findByNomeIsNull();

	// NOT NULL
	List<Funcionario> findByNomeIsNotNull();

	// ORDENAÇÃO
	List<Funcionario> findByNomeOrderByNomeAsc(String nome);

	// List<Funcionario> findNyNomeAndSalarioGreaterThanAndDataContratacao(String
	// nome, Double salario, LocalDate data);

	@Query("SELECT f FROM Funcionario f WHERE f.nome =:nome AND f.salario >= :salario AND f.dataContratacao =:data")
	List<Funcionario> findNomeSalarioMaiorDataCOntratacao(String nome, Double salario, LocalDate data);
	
	@Query(value = "SELECT * FROM funcionarios f WHERE f.data_contratacao >= :data", nativeQuery = true)
	List<Funcionario> findDataContratacaoMaior(LocalDate data);
}