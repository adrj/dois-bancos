package com.adaltojr.doisbancos.bd2.business;

import javax.persistence.EntityManager;
import com.adaltojr.doisbancos.business.GenericBusinessErp;
import com.adaltojr.doisbancos.bd2.model.UsuarioErp;
import com.adaltojr.doisbancos.bd2.repository.UsuarioErpRepository;
import br.com.caelum.vraptor.ioc.Component;

@Component
public class UsuarioErpBusiness extends GenericBusinessErp<UsuarioErp> implements UsuarioErpRepository {
	
	public UsuarioErpBusiness(EntityManager manager) {
		super(manager);
	}
	

}
