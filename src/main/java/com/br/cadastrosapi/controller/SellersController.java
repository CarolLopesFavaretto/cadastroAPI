package com.br.cadastrosapi.controller;

import com.br.cadastrosapi.service.SellersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sellers")
public class SellersController {

    @Autowired
    private SellersService service;


//    TODO crud completo
}
