package br.com.dev2web.repository;

import br.com.dev2web.model.Excercicio;
import br.com.dev2web.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TreinoRepository extends JpaRepository<Excercicio, Long> {

List<Excercicio> findByStatus(Status status);
}
