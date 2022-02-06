package assignment8;
import java.util.*;
// Reference [1] https://codereview.stackexchange.com/questions/208644/cards-shuffling-and-dealing-program
//reference[2] https://www.javaprogrammingforums.com/whats-wrong-my-code/34594-dealing-13-cards-4-players.html
public class Game {

    //attributes
    private Card[] deck ;
    public static final int totalcards = 52;

    private  Player[] players ;
    Card[] resetDeck ;
    Game( Player [] players)
    {
        // Reference [1] https://codereview.stackexchange.com/questions/208644/cards-shuffling-and-dealing-program
        this.players=players;
        deck = new Card[ totalcards ]; //size

          int i =0;

        for (Suit suit : Suit.values()) {

   // suit will take on values of SPADE, HEARTS, CLUBS, DIAMONDS
            for (Rank  rank : Rank.values()) {
                deck[i]= new Card(suit,rank);
                i++;
            }
        }

    }


    //getter method


    public Card[] getDeck() {
        return deck;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void deal() {

        //shuffling the  card first
        // Reference [1] https://codereview.stackexchange.com/questions/208644/cards-shuffling-and-dealing-program

        Random rand = new Random();
        int j;
        for (int i = 0; i < totalcards; i++) {
            j = rand.nextInt(52);
            Card temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }

        // add card in hand at each position per player

        int numOfPlayers = getPlayers().length;
        int number_of_cards_to_deal = deck.length / numOfPlayers;



        for  (int i = 0; i < numOfPlayers; i++) {

            players[i].setHand(number_of_cards_to_deal);

            int flag =0;

            for (int k = 0; k< number_of_cards_to_deal; k++) {

//reference[2]


                players[i].receiveCard(deck[k + (i * number_of_cards_to_deal)],k);//passing respective card and position in hand



            }
        }

        resetDeck = getDeck();
        deck = null;
    }



    public void reset() {


        deck = resetDeck;
        int numOfPlayers = getPlayers().length;
        for (int i = 0; i < numOfPlayers; i++) {

            players[i].resetHand();

        }

    }



    public void displayDeck()
    {
// reference [1]
        System.out.println("------------------------Deck of cards---------------------");
        int count =0;
        if(deck!=null){
        for (Card card : deck) {
            System.out.println(card.getRank() + " of " + card.getSuit() + "     ");
            count++;
        }
        }
        else{
            System.out.println("Deck is empty");
        }
        System.out.println("---------------------------------------------");


    }





    }


















