package com.adaltojr.doisbancos.bd2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.adaltojr.doisbancos.model.ERPAbstractEntity;

@Entity
@Table(name="usuarios_erp")
public class UsuarioErp extends ERPAbstractEntity  {

	private static final long serialVersionUID = 1L;

	@Column(name="nomeUser", unique=true, nullable=false )
    private String nomeUser;
    
	@Id
    @Column(name="senha")
    private String senha;

	public String getNomeUser() {
		return nomeUser;
	}

	public void setNomeUser(String nomeUser) {
		this.nomeUser = nomeUser;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
    
}
