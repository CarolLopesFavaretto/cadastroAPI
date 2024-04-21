package com.br.cadastrosapi.service;

import com.br.cadastrosapi.repository.SellersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellersService {

    @Autowired
    private SellersRepository repository;
}
