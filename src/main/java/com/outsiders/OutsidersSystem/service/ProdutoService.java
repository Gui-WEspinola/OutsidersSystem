package com.outsiders.OutsidersSystem.service;

import com.outsiders.OutsidersSystem.entity.ProdutoEntity;
import com.outsiders.OutsidersSystem.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
@RequiredArgsConstructor
public class ProdutoService extends EntityService<ProdutoEntity, UUID>{

    private final ProdutoRepository produtoRepository;
    @Override
    public JpaRepository<ProdutoEntity, UUID> getRepository() {
        return produtoRepository;
    }
}
