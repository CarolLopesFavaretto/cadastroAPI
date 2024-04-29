package com.br.cadastrosapi.service;

import com.br.cadastrosapi.entity.ContractType;
import com.br.cadastrosapi.entity.Sellers;
import com.br.cadastrosapi.repository.SellersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class SellersService {

    @Autowired
    private SellersRepository repository;

    public ResponseEntity<Sellers> save(Sellers sellers) {

        ContractType contractType = sellers.getContractType();

        switch (contractType) {
            case CLT:
            case PJ:
            case OUT:
                sellers.setRegistry(getRegistry(contractType));
                return ResponseEntity.ok(repository.save(sellers));
            default:
                return ResponseEntity.notFound().build();
        }
    }

    private String getRegistry(ContractType contractType) {
        String registry = UUID.randomUUID().toString();
        return registry + "-" + contractType;
    }


    public ResponseEntity<Sellers> findById(String registry) {
        return repository.findById(registry).map(sellers -> ResponseEntity.ok().body(sellers))
                .orElse(ResponseEntity.notFound().build());
    }

    public ResponseEntity<Sellers> update(String registry, Sellers sellers) {
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

    public void delete(String registry) {
        repository.deleteById((registry));
    }
}