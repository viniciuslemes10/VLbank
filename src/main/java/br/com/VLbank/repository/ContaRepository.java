package br.com.VLbank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.VLbank.conta.Conta;

public interface ContaRepository extends JpaRepository<Conta, Long>{

	boolean existsByNumeroConta(String numeroConta);
	
	@Query("SELECT c.numeroConta FROM Conta c")
	List<String> obterNumerosConta();

}
