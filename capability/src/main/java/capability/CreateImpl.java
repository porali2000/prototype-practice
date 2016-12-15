package capability;

import dto.DeckDto;
import models.Deck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import persist.Put;

/**
 * Created by Porali_S on 12/15/2016.
 */
@Service
public class CreateImpl implements Create{

    @Autowired
    Put<DeckDto> put;


    @Override
    public Deck createStandardDeckWithName(String deckName) {
        if(StringUtils.isEmpty(deckName))
            return null;

        Deck deck = new Deck();
        put.save(new DeckDto(deckName, deck));
        return deck;
    }
}
