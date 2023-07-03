package com.outsiders.OutsidersSystem.service;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;

public abstract class EntityService<T, ID extends Serializable> {

    public abstract JpaRepository<T, ID> getRepository();

    public T save(T entity) {
        return getRepository().save(entity);
    }

    public List<T> findAll() {
        return getRepository().findAll();
    }
}
