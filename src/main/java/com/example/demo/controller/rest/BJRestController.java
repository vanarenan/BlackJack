package com.example.demo.controller.rest;

import com.example.demo.service.BlackJackService;
import com.example.demo.model.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cards")
public class BJRestController {
    @Autowired
    BlackJackService service;

    @RequestMapping("/pick")
    public Card pickCard() {
        return service.pick();
    }
}