package db;

import dto.Dto;
import models.Deck;

/**
 * Created by Porali_S on 12/15/2016.
 */
public interface DB<T extends Dto> {
    boolean write(T dto);
    Deck fetch(String deckName);
}
