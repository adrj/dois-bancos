package com.adaltojr.doisbancos.business;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import br.com.caelum.vraptor.ioc.ApplicationScoped;
import br.com.caelum.vraptor.ioc.Component;

@ApplicationScoped
@Component
public class ERPEntityManagerFactory {
	
	private EntityManagerFactory factory;
    
	public ERPEntityManagerFactory(){
   
		factory = Persistence.createEntityManagerFactory("erpdbpu");
      
    }
	
	public EntityManagerFactory get() {
	    return this.factory;
	}
	
}
