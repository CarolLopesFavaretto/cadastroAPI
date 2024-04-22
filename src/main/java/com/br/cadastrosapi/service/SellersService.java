package com.br.cadastrosapi.service;

import com.br.cadastrosapi.entity.Sellers;
import com.br.cadastrosapi.repository.SellersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class SellersService {

    @Autowired
    private SellersRepository repository;

    public ResponseEntity<Sellers> save(Sellers sellers) {
        return ResponseEntity.ok().body(repository.save(sellers));
    }

    public ResponseEntity<Sellers> findById(Long registry) {
        return repository.findById(registry).map(sellers -> ResponseEntity.ok().body(sellers))
                .orElse(ResponseEntity.notFound().build());
    }

    public ResponseEntity<Sellers> update(Long registry, Sellers sellers) {
        return repository.findById(registry)
                .map(newSellers -> {
                    newSellers.setRegistry(registry);
                    newSellers.setName(sellers.getName());
                    newSellers.setCpf(sellers.getCpf());
                    newSellers.setEmail(sellers.getEmail());
                    newSellers.setContractType(sellers.getContractType());
                    return ResponseEntity.ok().body(repository.save(newSellers));
                }).orElse(ResponseEntity.notFound().build());
    }

    public void delete(Long registry) {
        repository.deleteById(registry);
    }
}
