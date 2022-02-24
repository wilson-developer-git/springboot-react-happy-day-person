package br.com.wilsonprogram.gestaoproduto.repository;

import br.com.wilsonprogram.gestaoproduto.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
