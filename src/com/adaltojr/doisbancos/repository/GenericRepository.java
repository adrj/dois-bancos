package com.adaltojr.doisbancos.repository;

import java.util.Collection;
import com.adaltojr.doisbancos.model.AbstractEntity;

public interface GenericRepository<T extends AbstractEntity> {

	Collection<T> loadAll();

	T loadById(Long id);

	void remove(T entity);

	T save(T entity);

}