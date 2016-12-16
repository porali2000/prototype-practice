package com.capability;

import com.models.Deck;
import com.models.Card;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Created by Porali_S on 12/15/2016.
 */
@Component
@Profile("simple")
public class SimpleShuffle implements Shuffle  {



    @Override
    public List<Deck> shuffle(List<Deck> decks) {

        decks.parallelStream()
                .map(deck -> deck.getCards())
                .collect(Collectors.toList()).forEach(cards -> {
                swap(cards);
        });
        return decks;
    }

    private void swap(List<Card> cards) {
        for(Card card:cards){
            int randomIndex = new Random().nextInt(52);
            Card randomCard = cards.get(randomIndex);
            Card tempCard = randomCard;
            randomCard.setRank(card.getRank());
            randomCard.setSuit(card.getSuit());
            card.setRank(tempCard.getRank());
            card.setSuit(tempCard.getSuit());
        }
    }
}
