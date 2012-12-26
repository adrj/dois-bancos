package com.adaltojr.doisbancos.bd1.business;

import br.com.caelum.vraptor.ioc.Component;
import com.adaltojr.doisbancos.bd1.model.Usuario;
import com.adaltojr.doisbancos.bd1.repository.UsuarioRepository;
import com.adaltojr.doisbancos.business.DefaultEntityManager;
import com.adaltojr.doisbancos.business.GenericBusiness;

@Component
public class UsuarioBusiness extends GenericBusiness<Usuario> implements UsuarioRepository{
	
	public UsuarioBusiness(DefaultEntityManager entityManager) {
		super(entityManager);
	}
	
}
