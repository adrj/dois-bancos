package com.adaltojr.doisbancos.business;

import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import com.adaltojr.doisbancos.model.AbstractEntity;
import com.adaltojr.doisbancos.repository.GenericRepository;

public abstract class GenericBusinessErp <T extends AbstractEntity> implements GenericRepository<T>{

	 	@PersistenceContext(unitName="erpdbpu")
	    protected final EntityManager manager;
	 	protected final Class<T> clazz;
	    
	 	
	 	protected GenericBusinessErp(EntityManager manager) {
			
	 		this.manager = EntityManagerErp.getEntityManager();
	 		
			@SuppressWarnings("unchecked")
			Class<T> clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];

			this.clazz = clazz;
		}
	 	
	 	public T save(T entity) {
			return manager.merge(entity);
		}
	 	
	   
		public Collection<T> loadAll() {
			Query query = manager.createQuery("from " + clazz.getName());

			@SuppressWarnings("unchecked")
			Collection<T> resultList = query.getResultList();

			return resultList;
		}

		public T loadById(Long id) {
			return manager.find(clazz, id);
		}

		public void remove(T entity) {
			manager.remove(manager.getReference(clazz, entity.getId()));
		}
	 	
}
