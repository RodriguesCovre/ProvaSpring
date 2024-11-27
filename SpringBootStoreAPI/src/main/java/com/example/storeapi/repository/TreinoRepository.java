package com.example.storeapi.repository;

import com.example.storeapi.model.Treino;
import com.example.storeapi.model.StatusTreino;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TreinoRepository extends JpaRepository<Treino, Long> {
  
  List<Treino> findByStatus(StatusTreino status);
  
  Treino findByCodigo(Long codigo);
}