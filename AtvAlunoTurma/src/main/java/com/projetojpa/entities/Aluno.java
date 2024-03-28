package com.projetojpa.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "aluno")
public class Aluno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id", nullable = false)
	private Long Id;
	
	@NotNull
	@NotBlank
	@Column (name = "cidade", nullable = false, length = 255)
	private String cidade;
	
	@NotNull
	@NotBlank 
	@Email
	@Column (name = "email", nullable = false, length = 255)
	private String email;
	
	@NotNull
	@NotBlank 
	@Column (name = "nome", nullable = false, length = 255)
	private String nome;
	
	@NotNull
	@NotBlank 
	@Column (name = "ra", nullable = false, length = 255)
	private String ra;
	
	@NotNull
	@NotBlank 
	@Column (name = "telefone", nullable = false, length = 255)
	private String telefone;
	
	@NotNull
	@NotBlank 
	@Column (name = "renda", nullable = false)
	private double renda;
	
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn(name = "id_turma", nullable = false)
	private Turma turma;

}