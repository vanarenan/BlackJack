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
    List<Card> deck = new ArrayList<>();
    boolean isStop = false;
    List<Card> delivery = new ArrayList<>();
    List<Card> forPC = new ArrayList<>();
    public int counterPlayer = 0;
    public int counterPC = 0;

    @PostConstruct
    public void init() {
        delivery = new ArrayList<>();
        forPC = new ArrayList<>();
        deck = data.getDeck();
    }

    public void pickCard() {
        Card card = this.getShuffleDeck().get(0);
        deck.remove(card);
        delivery.add(card);
    }
    
    public void pickCardPC() {
        Card card = this.getShuffleDeck().get(0);
        deck.remove(card);
        forPC.add(card);
    }

    public List<Card> getShuffleDeck() {
        Collections.shuffle(deck);
        return deck;
    }

    public Player InitPlayer(Player player) {
        player.getPrivateSet().clear();
        return player;
    }
    
    public int getPlayerSum(Player player) {
        List<Card> cards = player.getPrivateSet();
        return cards.stream().mapToInt(Card::getValue).sum();
    }

    public List<Card> getDeck() {
        return deck;
    }

    public List<Card> getDelivery() {
        return delivery;
    }

    public List<Card> getDeliveryForPC() {
        return forPC;
    }

    public String getWinner(int sum, int sum2) {
        String youWin = "You are WinNer";
        String loser = "You are LosSer";
        String draw = "Draw";
        String message = "";
        isStop = true;

        if (sum == sum2) {
            message = draw;
        } else {
            if (sum == 21 && sum2 != 21) {
                message = youWin;
            } else {
                if (sum < 21 && sum2 > 21) {
                    message = youWin;
                } else {
                    if (sum < 21 && sum2 < 21 && sum > sum2) {
                        message = youWin;
                    } else {
                        if (sum < 21 && sum2 < 21 && sum < sum2) {
                            message = loser;
                        } else {
                            if (sum > 21 && sum2 > 21 && sum < sum2) {
                                message = youWin;
                            } else {
                                if (sum > 21 && sum2 > 21 && sum > sum2) {
                                    message = loser;
                                } else {
                                    if (sum > 21 && sum2 < 21) {
                                        message = loser;
                                    }
                                }
                            }
                        }
                    }

                }
            }
        }
//        if (message.equals(youWin)) {
//            this.setScore(true);
//        } else {
//            this.setScore(false);
//        } if (message.equals(draw)){
//            this.setScore(false);
//        }
        return message;
    }

}