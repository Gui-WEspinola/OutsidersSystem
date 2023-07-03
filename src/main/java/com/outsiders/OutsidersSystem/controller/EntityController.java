package com.outsiders.OutsidersSystem.controller;

import com.outsiders.OutsidersSystem.service.EntityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;
import java.util.List;

public abstract class EntityController<T, ID extends Serializable> {

    public abstract EntityService<T, ID> getService();

    @PostMapping
    public ResponseEntity<T> save(@RequestBody T entity) {
        return ResponseEntity.ok(getService().save(entity));
    }

    @GetMapping
    public List<T> findAll() {
        return getService().findAll();
    }
}
