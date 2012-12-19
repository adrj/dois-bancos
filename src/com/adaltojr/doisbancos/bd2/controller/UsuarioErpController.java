package com.adaltojr.doisbancos.bd2.controller;

import java.util.Collection;
import com.adaltojr.doisbancos.bd2.model.UsuarioErp;
import com.adaltojr.doisbancos.bd2.repository.UsuarioErpRepository;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;

@Resource
public class UsuarioErpController {
	
	private UsuarioErpRepository usuarioErpBusiness;
	private Result result;
	
	public UsuarioErpController(UsuarioErpRepository usuarioErpBusiness, Result result){
		this.usuarioErpBusiness = usuarioErpBusiness;
		this.result = result;
	}
	
	@Get
	@Path("/bd2/usuario/lista")
	public void listauser(){
		
		Collection<UsuarioErp> usersList = usuarioErpBusiness.loadAll();
		result.include("usersList", usersList);
	}
	
}
