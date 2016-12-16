package com.capability;

import com.models.Deck;
import com.models.PIP;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.smartcardio.Card;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Created by Porali_S on 12/15/2016.
 */
@Component
@Profile("simple")
public class SimpleShuffle implements Shuffle  {

    Random random = new Random();

    @Override
    public List<Deck> shuffle(List<Deck> decks) {

        decks.parallelStream()
                .map(deck -> deck.getCards())
                .collect(Collectors.toList()).forEach(deck -> {
                swap(deck);
        });
        return collect;
    }

    private void swap(List<PIP> deck) {

    }
}
