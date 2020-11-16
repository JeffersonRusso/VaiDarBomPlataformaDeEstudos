package com.vaiDarBom.vaiDarBomPlataformaDeEstudos.model;

import javax.annotation.processing.SupportedAnnotationTypes;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min=1, max=100)
	private String usuario;

	@NotNull
	@Size(min=1, max=100)
	private String nome;

	@NotNull
	@Size(min=8)
	private String senha;
	
	/*  ########### INFO USUARIO ########### */
	
	@NotNull
	private String cidade;
	
	@NotNull
	@Size(max=300)
	private String sobreUsuario;
	
	@NotNull
	private String ano;
	

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getSobreUsuario() {
		return sobreUsuario;
	}

	public void setSobreUsuario(String sobreUsuario) {
		this.sobreUsuario = sobreUsuario;
	}
	
	/*  ########### INFO USUARIO ########### */

	public long getId() {
		return id;
	}
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}