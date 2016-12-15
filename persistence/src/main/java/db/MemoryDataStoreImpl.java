package db;

import dto.Dto;
import models.Deck;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Porali_S on 12/15/2016.
 */
@Component("memoryDataStore")
public class MemoryDataStoreImpl implements DataStore {

    static Map<String, Deck> STORED_DATAS = new HashMap();

    public synchronized boolean merge(Dto dto) {
        try {
            STORED_DATAS.put(dto.getDeckName(), dto.getDeck());
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public synchronized boolean delete(Dto dto) {
        try {
            STORED_DATAS.remove(dto.getDeckName());
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public synchronized Deck fetch(String deckName) {
        try {
            return STORED_DATAS.get(deckName);
        } catch (Exception e) {
            return null;
        }
    }
}
