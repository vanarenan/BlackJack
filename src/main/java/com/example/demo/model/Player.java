package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;

    @Override
    public String toString() {
        return "Player{name='" + name + '\'' +", privateSet=" + privateSet + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player() {}

    public Player(String name) {
        this.name = name;
        this.privateSet = new ArrayList<>();
    }

    public List<Card> getPrivateSet() {
        return privateSet;
    }

    public void setPrivateSet(List<Card> privateSet) {
        this.privateSet = privateSet;
    }

    private List<Card> privateSet;
}