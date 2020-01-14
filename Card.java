package com.collabera.exercises;

import java.util.Comparator;

public class Card {

    private Rank rank; // enum
    private Suit suit; // enum
    
    public static enum Rank {
        ONE, TWO, THREE, FOUR // assume complete implementation
    }

    public static enum Suit {
        SPADES, HEARTS, CLUBS, DIAMONDS
    }

    public static Comparator<Card> sortByRank() {
        return Comparator.comparing(card -> card.rank);
    }

    public static Comparator<Card> sortBySuit() {
        return Comparator.comparing(card -> card.suit);
    }

    @Override
    public int hashCode() {
        return rank.ordinal() * 10 + suit.ordinal();
    }

    @Override
    public boolean equals(Object obj) {
        // optimize by checking for same reference
        if (this == obj) return true;
        // check correct type and for nonnull obj
        if (!(obj instanceof Card)) return false;
        Card other = (Card) obj;
        // actual comparison
        return rank == other.rank && suit == other.suit;
    }
    
    public Card(Rank rank, Suit suit) {
       
    }
}