package db;

import dto.Dto;
import models.Deck;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Porali_S on 12/15/2016.
 */

interface DataStore {

    Map<String, Deck> STORED_DATAS = new HashMap();

    boolean merge(Dto dto);

    boolean delete(Dto dto);

     Deck fetch(String deckName);
}
