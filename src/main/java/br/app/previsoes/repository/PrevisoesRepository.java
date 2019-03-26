package br.app.previsoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.app.previsoes.model.Previsao;

public interface PrevisoesRepository extends JpaRepository<Previsao, Long>{

}
