package com.example.demo.controller;

import com.example.demo.service.BlackJackService;
import com.example.demo.model.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class WebController {
  
    @Autowired
    BlackJackService service;

    @RequestMapping("newgame")
    public String refresh(Model model) {
        service.init();
        return "redirect:/pick";
    }
    
    @RequestMapping("pick")
    public String pick(Model model) {
      
        service.pickCard();
        
        List<Card> delivery = service.getDelivery();
        int sum = delivery.stream().mapToInt(Card::getValue).sum();
        List<Card> forPC = service.getDeliveryForPC();
        int sum2 = forPC.stream().mapToInt(Card::getValue).sum();
        String message = "zalupa"; //service.getWinner(sum, sum2);

//        if (sum > 21) return "redirect:stop";
        
        int counterPlayer = service.counterPlayer;
        int counterPC = service.counterPC;
        
        model.addAttribute("score", counterPlayer + ":" + counterPC);
        model.addAttribute("sum", sum);
        model.addAttribute("sum2", sum2);
        model.addAttribute("delivery", delivery);
        model.addAttribute("pcdelivery", forPC);
        model.addAttribute("message", message);
        
        return "deck";
    }
    
    @RequestMapping("stop")
    public String stop(Model model) {
      
//        List<Card> delivery = service.getDelivery();
//        int sum = delivery.stream().mapToInt(Card::getValue).sum();
//        List<Card> forPC = service.getDeliveryForPC();
//        int sum2 = forPC.stream().mapToInt(Card::getValue).sum();
//        String message = service.getWinner(sum, sum2);
//        int getDeckSize = service.getDeckSize();
//        int counterPlayer = service.counterPlayer;
//        int counterPC = service.counterPC;
//        String score = "" + counterPlayer + ":" + counterPC;
//        int round = service.round;
//
//        model.addAttribute("round", round);
//        model.addAttribute("score", score);
//        model.addAttribute("sizeDeck", getDeckSize);
//        model.addAttribute("sum", sum);
//        model.addAttribute("sum2", sum2);
//        model.addAttribute("delivery", delivery);
//        model.addAttribute("pcdelivery", forPC);
//        model.addAttribute("message", message);
        return "deck";
    }

}