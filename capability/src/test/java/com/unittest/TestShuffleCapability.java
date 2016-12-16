package com.unittest;

import com.capability.Create;
import com.capability.Fetch;
import com.capability.Shuffle;
import com.capability.SimpleShuffle;
import com.init.TestRunner;
import com.models.Deck;
import org.junit.Test;
import org.mockito.internal.matchers.InstanceOf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import sun.security.jca.GetInstance;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

/**
 * Created by Porali_S on 12/15/2016.
 */
@ActiveProfiles(profiles = "simple")
public class TestShuffleCapability extends TestRunner {

    @Autowired
    Create create;
    @Autowired
    Fetch fetch;
    @Autowired
    Shuffle shuffle;


    @Test
    public void test_dependency_injection() {
        assertNotNull(create);
        assertNotNull(fetch);
        assertNotNull(shuffle);
    }

    @Test
    public void simple_shuffle_algo_should_be_injected() {
        assertNotNull(shuffle instanceof SimpleShuffle);
    }

    @Test
    public void shuffle_the_card_and_verify() {
        try {
            List decks = new ArrayList();
            decks.add(create.createStandardDeckWithName("SimpleShuffleDeck"));
            System.out.println(decks);
            assertNotNull(fetch.fetchDeckWithName("SimpleShuffleDeck"));
            List shuffledDeck = this.shuffle.shuffle(decks);
            assertNotNull(shuffledDeck);
            System.out.println("*******************");
            System.out.println(shuffledDeck);
        }catch (Exception e){
            fail();
        }
    }

}
