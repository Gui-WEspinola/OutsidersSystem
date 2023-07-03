package com.outsiders.OutsidersSystem.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class ProdutoEntity extends CrudEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected UUID id;
}
