package com.example.storeapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Table(name = "treinos")
public class Treino {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  private String nome;
  private String descricao;
  private List<Exercicio> exercicios;
  private Integer series;
  private Integer repeticoes;
  private Integer descansoEntreSeries;
  private StatusTreino status;
  

  public Long getId() {
      return id;
  }

  public void setId(Long id) {
      this.id = id;
  }

  public String getNome() {
      return nome;
  }

  public void setNome(String nome) {
      this.nome = nome;
  }

  public String getDescricao() {
      return descricao;
  }

  public void setDescricao(String descricao) {
      this.descricao = descricao;
  }

  public List<Exercicio> getExercicios() {
      return exercicios;
  }

  public void setExercicios(List<Exercicio> exercicios) {
      this.exercicios = exercicios;
  }

  public Integer getSeries() {
      return series;
  }

  public void setSeries(Integer series) {
      this.series = series;
  }

  public Integer getRepeticoes() {
    return repeticoes;
  }

  public void setRepeticoes(Integer repeticoes) {
    this.repeticoes = repeticoes
  }
}


