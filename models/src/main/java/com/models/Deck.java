package com.models;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Porali_S on 12/15/2016.
 */

@Getter
@Setter
public class Deck {

    static Deck sortedDeck;
    public List<PIP> cards;

    private Deck(){
    }

    public Deck(List<PIP> cards){
        this.cards = cards;
    }

    public static Deck getNewDeck() {
        if (null != sortedDeck) {
            return sortedDeck;
        }

        List<PIP> pips = new ArrayList<>();

        Arrays.stream(Suit.values()).forEach(suit -> {
            Arrays.stream(Rank.values()).forEach(rank -> {
                pips.add(new PIP(suit, rank));
            });
        });
        sortedDeck = new Deck(pips);
        return sortedDeck;
    }
}
