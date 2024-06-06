package com.br.cadastrosapi.controller;

import com.br.cadastrosapi.entity.Sellers;
import com.br.cadastrosapi.service.SellersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sellers")
public class SellersController {

    @Autowired
    private SellersService service;

    @PostMapping("/sellers")
    public ResponseEntity<Sellers> save(@RequestBody Sellers sellers) {
        return service.save(sellers);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Sellers> findById(@PathVariable("id") String registry) {
        return service.findById(registry);
    }

    @PutMapping("update/{id}")
    public ResponseEntity<Sellers> update(@PathVariable("id") String registry, @RequestBody Sellers sellers) {
        return service.update(registry, sellers);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable("id") String registry) {
        service.delete(registry);
    }
}
