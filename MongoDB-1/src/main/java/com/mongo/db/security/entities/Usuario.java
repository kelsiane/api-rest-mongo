package com.mongo.db.security.entities;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

import com.mongo.db.security.enums.PerfilEnum;

@Document(collection = "usuario")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 306411570471828345L;

	private String id;
	private String email;
	private String senha;
	private PerfilEnum perfil;

	public Usuario() {
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public PerfilEnum getPerfil() {
		return perfil;
	}

	public void setPerfil(PerfilEnum perfil) {
		this.perfil = perfil;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
