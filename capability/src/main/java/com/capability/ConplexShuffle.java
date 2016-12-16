package com.capability;

import com.models.Deck;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Porali_S on 12/15/2016.
 */
@Component
@Profile("complex")
public class ConplexShuffle extends SimpleShuffle  {
    @Override
    public List<Deck> shuffle(List<Deck> decks) {
        return null;
    }
}