package com.adaltojr.doisbancos.business;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.persistence.EntityManager;
import br.com.caelum.vraptor.ioc.Component;

@Component
public class DefaultEntityManager {
	
	private EntityManager entityManager;
	private DefaultEntityManagerFactory factory;

	public DefaultEntityManager(DefaultEntityManagerFactory factory){
		this.factory = factory;
	} 	
	
	public EntityManager get() {
		   return this.entityManager;
	}
			
	@PostConstruct
	public void abre() {
	   this.entityManager = factory.get().createEntityManager();
	}
		
	@PreDestroy
	public void fecha() {
	   this.entityManager.close();
	}

}