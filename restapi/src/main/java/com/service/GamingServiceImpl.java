package com.service;

import com.capability.Create;
import com.capability.Fetch;
import com.capability.Purge;
import com.capability.Shuffle;
import com.models.Deck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Porali_S on 12/15/2016.
 */
@Service
public class GamingServiceImpl implements GamingService{

    Create create;
    Fetch fetch;
    Purge purge;
    Shuffle shuffle;

    @Autowired
    public GamingServiceImpl(Create create, Fetch fetch, Purge purge, Shuffle shuffle) {
        this.create = create;
        this.fetch = fetch;
        this.purge = purge;
        this.shuffle = shuffle;
    }



    @Override
    public boolean putNewNamedDeck(String deckName) {
        if(StringUtils.isEmpty(deckName))
        return false;
        create.createStandardDeckWithName(deckName);
        return true;
    }

    @Override
    public boolean purgeNamedDeck(String deckName) {
        if(StringUtils.isEmpty(deckName))
            return false;
        return purge.purgeNamedDeck(deckName);
    }

    @Override
    public Deck getNamedDeck(String deckName) {
        if(StringUtils.isEmpty(deckName))
            return null;

        return fetch.fetchDeckWithName(deckName);
    }

    @Override
    public  List<Deck> shuffleExistingNamedDeck(String deckName) {
        if(StringUtils.isEmpty(deckName))
            return null;
        List<Deck> decks = new ArrayList<>();
        decks.add(fetch.fetchDeckWithName(deckName));
        return shuffle.shuffle(decks);
    }

    @Override
    public List<Deck> getPersistedDecks() {
        return null;
    }
}
