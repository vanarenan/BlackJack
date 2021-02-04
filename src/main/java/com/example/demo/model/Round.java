package com.example.demo.model;

import java.time.LocalDateTime;
import java.util.List;

public class Round {
    private String userName;
    private List<Card> delivery;
    private List<Card> deliveryPC;
    private Boolean isWinner;
    private String score;
    private LocalDateTime start;
    private LocalDateTime finish;
}
