package com.collabera.exercises;

import com.collabera.exercises.Card.Rank;
import com.collabera.exercises.Card.Suit;

public class Deck {

    private static final Card[] cards = new Card[52];
    private static final int suitSize = Suit.values().length; // 4

    public static Card getCard(Rank rank, Suit suit) {
        int index = rank.ordinal() * suitSize + suit.ordinal();
        Card card = cards[index];
        if (card == null) {                 // generate once
            card = new Card(rank, suit);
            cards[index] = card;
        }                                   // else reuse
        return card;
    }
}
