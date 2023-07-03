package com.outsiders.OutsidersSystem.controller;


import com.outsiders.OutsidersSystem.entity.ProdutoEntity;
import com.outsiders.OutsidersSystem.service.EntityService;
import com.outsiders.OutsidersSystem.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("produtos")
@RequiredArgsConstructor
public class ProdutoController extends EntityController<ProdutoEntity, UUID>{

    private final ProdutoService produtoService;

    @Override
    public EntityService<ProdutoEntity, UUID> getService() {
        return produtoService;
    }
}
