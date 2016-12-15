package capability;

import models.Deck;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Porali_S on 12/15/2016.
 */
@Component
@Profile("simple")
public class SimpleShuffle implements Shuffle  {
    @Override
    public List<Deck> shuffle(List<Deck> decks) {
        return null;
    }
}
