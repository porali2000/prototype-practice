package com.models;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Porali_S on 12/15/2016.
 */
@Getter
@Setter
public class PIP {

    Suit suit;
    Rank rank;

    public PIP(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return rank.getRankName() + " - " + suit.name();
    }
}
