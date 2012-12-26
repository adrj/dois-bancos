package com.adaltojr.doisbancos.business;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import br.com.caelum.vraptor.ioc.ApplicationScoped;
import br.com.caelum.vraptor.ioc.Component;

@ApplicationScoped
@Component
public class DefaultEntityManagerFactory {
	
	private EntityManagerFactory factory;
	
	public DefaultEntityManagerFactory(){
		
		factory = Persistence.createEntityManagerFactory("default");
		
	}
	
	public EntityManagerFactory get() {
		
	    return this.factory;
	    
	}

}
