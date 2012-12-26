package com.adaltojr.doisbancos.repository;

import java.util.Collection;
import com.adaltojr.doisbancos.model.ERPAbstractEntity;

public interface ERPGenericRepository<T extends ERPAbstractEntity> {

	Collection<T> loadAll();

	T loadById(Long id);

	void remove(T entity);

	T save(T entity);

}