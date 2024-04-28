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
        String registry = UUID.randomUUID().toString();

        if (sellers.getContractType() == ContractType.CLT) {
            registry = registry + "-" + ContractType.CLT;
            sellers.setRegistry(registry);
            return ResponseEntity.ok(repository.save(sellers));
        }
        else if (sellers.getContractType() == ContractType.PJ) {
            registry = registry + "-" + ContractType.PJ;
            sellers.setRegistry(registry);
            return ResponseEntity.ok(repository.save(sellers));
        }
        else if (sellers.getContractType() == ContractType.OUT) {
            registry = registry + "-" + ContractType.OUT;
            sellers.setRegistry(registry);
            return ResponseEntity.ok(repository.save(sellers));
        }
        return ResponseEntity.notFound().build();

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