package com.adaltojr.doisbancos.business;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerErp {
	
	private static EntityManagerFactory emf;
    
	public static EntityManager getEntityManager(){
        if(emf == null){
            emf = Persistence.createEntityManagerFactory("erpdbpu");
        }
        return emf.createEntityManager();
    }

}
