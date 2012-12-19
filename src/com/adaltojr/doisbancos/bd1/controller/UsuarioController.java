package com.adaltojr.doisbancos.bd1.controller;

import java.util.Collection;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import com.adaltojr.doisbancos.bd1.model.Usuario;
import com.adaltojr.doisbancos.bd1.repository.UsuarioRepository;


@Resource
public class UsuarioController {
	
	private UsuarioRepository usuarioBusiness;
	private Result result;
	
	public UsuarioController(UsuarioRepository usuarioBusiness, Result result){
		this.usuarioBusiness = usuarioBusiness;
		this.result = result;
	}
		
	@Get
	@Path("/bd1/usuario/lista")
	public void listauser(){
		
		Collection<Usuario> usersList = usuarioBusiness.loadAll();
		result.include("usersList", usersList);
	}	

	
}
