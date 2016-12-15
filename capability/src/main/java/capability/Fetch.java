package capability;

import models.Deck;

/**
 * Created by Porali_S on 12/15/2016.
 */
interface Fetch {
    Deck fetchDeckWithName(String deckName);
}
