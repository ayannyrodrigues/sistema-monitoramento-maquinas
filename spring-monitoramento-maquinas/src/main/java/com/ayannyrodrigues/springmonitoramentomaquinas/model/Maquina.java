package com.ayannyrodrigues.springmonitoramentomaquinas.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table(name = "maquinas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Maquina {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NonNull
  private String nome;

  @NonNull
  private String descricao;

  @NonNull
  @Column(name = "data_hora_cadastro")
  private LocalDateTime dataCadastro = LocalDateTime.now();

  @OneToMany(mappedBy = "maquina")
  private List<Sensor> sensores;
}
