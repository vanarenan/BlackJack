package com.example.demo.controller.web;

import com.example.demo.service.BlackJackService;
import com.example.demo.model.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/web/cards")
public class WebController {
    @Autowired
    BlackJackService service;

    @RequestMapping("/game")
    public String showTable(Model model) {
        return "game-table";
    }
    
    @RequestMapping("/deck")
    public String showDeck(Model model) {
        List<Card> deck = service.getDeck();
        model.addAttribute("deck", deck);
        return "deck";
    }
    
    @RequestMapping("/pick")
    public String pick(Model model) {
        List<Card> delivery = service.getCardList();
        int summ = delivery.stream().mapToInt(card -> card.getValue()).sum();
        String message = "";
        if (summ == 21) {
            message = "You win!";
        }
        if (summ > 21) {
            message = "You lose!";
        }
        model.addAttribute("summ", summ);
        model.addAttribute("delivery", delivery);
        model.addAttribute("message", message);
        return "game-table";
    }
    
    @RequestMapping("/stop")
    public String stop(Model model) {
        List<Card> delivery = service.getDelivery();
        int summ = delivery.stream().mapToInt(Card::getValue).sum();
        List<Card> forPC = service.getDeliveryForPC();
        return null;
    }

}