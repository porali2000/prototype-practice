package db;

import dto.Dto;
import models.Deck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;

/**
 * Created by Porali_S on 12/15/2016.
 */

@Component
 public class DBImpl<T extends Dto> implements DB<T>{

    @Autowired
    @Qualifier("memoryDataStore")
    DataStore dataStore;

    public boolean write(T dto){
       return dataStore.merge(dto);
    }

    public Deck fetch(String deckName){
        return dataStore.fetch(deckName);
    }
}
