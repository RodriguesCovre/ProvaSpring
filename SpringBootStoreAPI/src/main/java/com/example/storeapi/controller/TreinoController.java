
package com.example.storeapi.controller;

import com.example.storeapi.model.Treino;
import com.example.storeapi.repository.TreinoRepository;
import com.example.storeapi.service.TreinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api/treinos")
public class TreinoController {
  
  @Autowired
  private TreinoRepository treinoRepository;
  
  @Autowired
  private TreinoService treinoService;
  
  @PostMapping
  public ResponseEntity<Treino> criarTreino(@RequestBody Treino treino) {
    Treino treinoCriado = treinoService.criarTreino(treino);
    return ResponseEntity.ok(treinoCriado, httpStatus.CREATED);
  }
  
  @GetMapping
  public ResponseEntity<List<Treino>> listarTreinos() {
    List<Treino> treinos = treinoRepository.findAll();
    return ResponseEntity.ok(treinos, httpStatus.OK);
  }
  
  @GetMapping("/{codigo}")
  public ResponseEntity<Treino> buscarTreinoPorCodigo(@PathVariable Long codigo) {
    Treino treino = treinoRepository.findByCodigo(codigo);
    return ResponseEntity.ok(treino, httpStatus.OK);
  }
  
  @PutMapping("/{codigo}")
  public ResponseEntity<Treino> atualizarTreino(@PathVariable Long codigo, @RequestBody Treino treino) {
    Treino treinoAtualizado = treinoService.atualizarTreino(codigo, treino);
    return ResponseEntity.ok(treinoAtualizado, httpStatus.OK);
  }
  
  @DeleteMapping("/{codigo}")
  public ResponseEntity<Void> excluirTreino(@PathVariable Long codigo) {
    treinoService.excluirTreino(codigo);
    return ResponseEntity.noContent().build();
  }
}