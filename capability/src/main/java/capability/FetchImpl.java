package capability;

import models.Deck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import persist.Get;

/**
 * Created by Porali_S on 12/15/2016.
 */

@Component
public class FetchImpl implements Fetch {

    @Autowired
    Get get;

    public Deck fetchDeckWithName(String deckName){
        return get.fetch(deckName);
    }
}
