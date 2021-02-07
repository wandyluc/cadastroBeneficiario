package br.com.wandy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wandy.model.Beneficiario;

public interface CadastroRepository extends JpaRepository<Beneficiario, Long> {

}
