package br.com.opportune.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.opportune.model.Empresa;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long>{

	Optional<Empresa> findByEmail(String email);
}
