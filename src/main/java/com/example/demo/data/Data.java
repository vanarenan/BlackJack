package com.example.demo.data;

import com.example.demo.model.Card;
import com.example.demo.model.Nominal;
import com.example.demo.model.Suit;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class Data {
    private List<Card> deck = new ArrayList<>(
            Arrays.asList(
                    new Card(Suit.PIKE, Nominal.N6, 6, "/img/pike6.png"),
                    new Card(Suit.HEART, Nominal.N6, 6,"/img/heart6.png"),
                    new Card(Suit.TILE, Nominal.N6, 6,"/img/tile6.png"),
                    new Card(Suit.CLOVER, Nominal.N6, 6,"/img/clover6.png"),

                    new Card(Suit.PIKE, Nominal.N7, 7, "/img/pike7.png"),
                    new Card(Suit.HEART, Nominal.N7, 7, "/img/heart7.png"),
                    new Card(Suit.TILE, Nominal.N7, 7, "/img/tile7.png"),
                    new Card(Suit.CLOVER, Nominal.N7, 7, "/img/clover7.png"),

                    new Card(Suit.PIKE, Nominal.N8, 8, "/img/pike8.png"),
                    new Card(Suit.HEART, Nominal.N8, 8, "/img/heart8.png"),
                    new Card(Suit.TILE, Nominal.N8, 8, "/img/tile8.png"),
                    new Card(Suit.CLOVER, Nominal.N8, 8, "/img/clover8.png"),

                    new Card(Suit.PIKE, Nominal.N9, 9, "/img/pike9.png"),
                    new Card(Suit.HEART, Nominal.N9, 9, "/img/heart9.png"),
                    new Card(Suit.TILE, Nominal.N9, 9, "/img/tile9.png"),
                    new Card(Suit.CLOVER, Nominal.N9, 9, "/img/clover9.png"),

                    new Card(Suit.PIKE, Nominal.N10, 10, "/img/pike10.png"),
                    new Card(Suit.HEART, Nominal.N10, 10, "/img/heart10.png"),
                    new Card(Suit.TILE, Nominal.N10, 10, "/img/tile10.png"),
                    new Card(Suit.CLOVER, Nominal.N10, 10, "/img/clover10.png"),

                    new Card(Suit.PIKE, Nominal.JACK, 2, "/img/pike10.png"),
                    new Card(Suit.HEART, Nominal.JACK, 2, "/img/heart10.png"),
                    new Card(Suit.TILE, Nominal.JACK, 2, "/img/tile10.png"),
                    new Card(Suit.CLOVER, Nominal.JACK, 2, "/img/clover10.png"),

                    new Card(Suit.PIKE, Nominal.QUEEN, 3, "/img/pikeQueen.png"),
                    new Card(Suit.HEART, Nominal.QUEEN, 3, "/img/heartQueen.png"),
                    new Card(Suit.TILE, Nominal.QUEEN, 3, "/img/tileQueen.png"),
                    new Card(Suit.CLOVER, Nominal.QUEEN, 3, "/img/cloverQueen.png"),

                    new Card(Suit.PIKE, Nominal.KING, 4, "/img/pikeKing.png"),
                    new Card(Suit.HEART, Nominal.KING, 4, "/img/heartKing.png"),
                    new Card(Suit.TILE, Nominal.KING, 4, "/img/tileKing.png"),
                    new Card(Suit.CLOVER, Nominal.KING, 4, "/img/cloverKing.png"),

                    new Card(Suit.PIKE, Nominal.ACE, 11, "/img/pikeAce.png"),
                    new Card(Suit.HEART, Nominal.ACE, 11, "/img/heartAce.png"),
                    new Card(Suit.TILE, Nominal.ACE, 11, "/img/tileAce.png"),
                    new Card(Suit.CLOVER, Nominal.ACE, 11, "/img/cloverAce.png")
            )
    );

    public List<Card> getDeck() {
        return deck;
    }

    public void setDeck(List<Card> deck) {
        this.deck = deck;
    }
}