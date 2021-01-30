package com.example.demo.service;

import com.example.demo.data.Data;
import com.example.demo.model.Card;
import com.example.demo.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class BlackJackService {
  
    @Autowired
    Data data;
    List<Card> deck;
    List<Card> delivery = new ArrayList<>();
    List<Card> forPC = new ArrayList<>();
    
    @PostConstruct
    void init() {
        deck = data.getDeck();
    }

    public List<Card> getShuffleDeck() {
        Collections.shuffle(deck);
        return deck;
    }
    
    public Card pick() {
        Card card = this.getShuffleDeck().get(0);
        deck.remove(card);
        return card;
    }
    
    public Player initPlayer(Player player) {
        player.getPrivateSet().clear();
        return player;
    }
    
    public int getPlayerSum(Player player) {
        List<Card> cards = player.getPrivateSet();
        return cards.stream().mapToInt(Card::getValue).sum();
    }
    
    public Card showSixPike() {
        Card sixPike = deck.get(4);
        // sixPike.setImg("/img/pike6.png");
        return sixPike;
    }
    
    public List<Card> getDeck() {
        return deck;
    }

    public Card pickFirstCard() {
        Card card = this.getShuffleDeck().get(0);
        deck.remove(card);
        return card;
    }
    
    public List<Card> getCardList() {
        Card card = this.pickFirstCard();
        delivery.add(card);
        return delivery;
    }

    public List<Card> getDelivery() {
        return delivery;
    }

    public List<Card> getDeliveryForPC() {
        Card card = this.pickFirstCard();
        forPC.add(card);
        card = this.pickFirstCard();
        forPC.add(card);
        card = this.pickFirstCard();
        forPC.add(card);
        return forPC;
    }
}