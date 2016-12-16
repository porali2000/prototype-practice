package com.capability;

import com.models.Card;
import com.models.Deck;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Porali_S on 12/15/2016.
 */
@Component
@Profile("complex")
public class ComplexShuffle implements Shuffle  {
    @Override
    public List<Deck> shuffle(List<Deck> decks) {

        decks.forEach(deck ->{
            List<Card> cards = deck.getCards();
            Random random = new Random();
            int randomSplitPoint = random.nextInt(52); //selecting a random number tosplit the deck of cards
            List<Card> secondHalf = cards.subList(randomSplitPoint, cards.size());
            List<Card> firstHalf = cards.subList(0, randomSplitPoint);
            secondHalf = recursiveSplit(secondHalf);
            List<Card> tempCards = new ArrayList<>();
            tempCards.addAll(secondHalf);
            tempCards.addAll(firstHalf);
            deck.setCards(tempCards);
        });
        return decks;
    }

    private List<Card> recursiveSplit(List<Card> secondHalf) {
        Random random = new Random();
        int leastCapacity = random.nextInt(3);

        //If the hand capacity is least return whatever we got
        if(secondHalf.size() < leastCapacity ){
            return secondHalf;
        }else {
            int splitPoint = random.nextInt(secondHalf.size());
            List<Card>  seconds_firstHalf = secondHalf.subList(0 ,splitPoint);
            List<Card> seconds_secondHalf = secondHalf.subList( splitPoint, secondHalf.size());
            seconds_secondHalf = recursiveSplit(seconds_secondHalf);

            List<Card> tempCards = new ArrayList<>();
            tempCards.addAll(seconds_secondHalf);
            tempCards.addAll(seconds_firstHalf);
            return tempCards;
        }
    }
}
