package com.codesquad.blackjack.dto;

import com.codesquad.blackjack.domain.Chip;

public class UserDto {
    private String type;
    private String name;
    private CardsDto cards;
    private Chip chip;

    public UserDto(String name, CardsDto cards) {
        this.name = name;
        this.cards = cards;
    }

    public UserDto(String type, String name, CardsDto cards, Chip chip) {
        this.type = type;
        this.name = name;
        this.cards = cards;
        this.chip = chip;
    }

    public UserDto(String name, CardsDto cards, Chip chip) {
        this.name = name;
        this.cards = cards;
        this.chip = chip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CardsDto getCards() {
        return cards;
    }

    public void setCards(CardsDto cards) {
        this.cards = cards;
    }

    public Chip getChip() {
        return chip;
    }

    public void setChip(Chip chip) {
        this.chip = chip;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "name='" + name + '\'' +
                ", cards=" + cards +
                ", chip=" + chip +
                '}';
    }
}
