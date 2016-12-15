package persist;

import db.DB;
import dto.DeckDto;
import models.Deck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Porali_S on 12/15/2016.
 */
@Component
public class GetImpl implements Get{
    @Autowired
    DB<DeckDto> database;


    public Deck fetch(String deckName){
        return database.fetch(deckName);
    }
}
