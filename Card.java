package assignment8;
import java.util.*;
public class Card {

    //attributes
    private Suit suit;
    private  Rank rank;

//constructor
     Card(Suit  suit, Rank rank){
        this.suit =suit;
        this.rank=rank;

    }

    //getter methods
    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    // Return a string representation of the card.
    //reference [4]https://www.cs.utexas.edu/~chand/cs312/topic30_enums_cards_tostring.pdf
    public String toString()
    {
        return (rank + "-of-" + suit);
    }



    //main

}
