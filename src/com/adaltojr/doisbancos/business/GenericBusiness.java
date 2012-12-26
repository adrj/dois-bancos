package com.adaltojr.doisbancos.business;

import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import com.adaltojr.doisbancos.model.AbstractEntity;
import com.adaltojr.doisbancos.repository.GenericRepository;

public abstract class GenericBusiness<T extends AbstractEntity> implements GenericRepository<T>{

	protected final EntityManager entityManager;
	protected final Class<T> clazz;

	protected GenericBusiness(DefaultEntityManager entityManager) {

		this.entityManager = entityManager.get();

		@SuppressWarnings("unchecked")
		Class<T> clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];

		this.clazz = clazz;
	}
	
	public T save(T entity) {
		return entityManager.merge(entity);
	}
 	
   
	public Collection<T> loadAll() {
		Query query = entityManager.createQuery("from " + clazz.getName());

		@SuppressWarnings("unchecked")
		Collection<T> resultList = query.getResultList();

		return resultList;
	}

	public T loadById(Long id) {
		return entityManager.find(clazz, id);
	}

	public void remove(T entity) {
		entityManager.remove(entityManager.getReference(clazz, entity.getId()));
	}

}