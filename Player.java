package assignment8;
// Reference [2] http://www.mathcs.emory.edu/~cheung/Courses/170/Syllabus/10/pokerCheck.html
//reference [3]https://www.cs.utexas.edu/~chand/cs312/topic30_enums_cards_tostring.pdf
public class Player {



    private Card [] hand = new Card[52];


    public void setHand(int number_of_cards_to_deal) {

       this. hand = new Card[number_of_cards_to_deal];
    }
    public void resetHand() {

        this. hand = new Card[]{};
    }

    public Card [] getHand ()
    {


        return hand;
    }

    public void sortHand ()
    {

// Reference [2] http://www.mathcs.emory.edu/~cheung/Courses/170/Syllabus/10/pokerCheck.html



        int i, j, minimum;

     //sorting hand  based on rank first
        for ( i = 0 ; i < hand.length ; i ++ )
        {
            minimum = i;

            for ( j = i+1 ; j < hand.length ; j++ )
            {
                if (hand[j].getRank().ordinal() < hand[minimum].getRank().ordinal())// reference [3]https://www.cs.utexas.edu/~chand/cs312/topic30_enums_cards_tostring.pdf
                {
                    minimum = j;
                }
            }


            Card temp = hand[i];
            hand[i] = hand[minimum];
            hand[minimum] = temp;





        }




//sorting hand  based on suit second bubble https://www.geeksforgeeks.org/java-program-for-bubble-sort/[1]
        int n = hand.length;
        for (int k = 0; k < n-1; k++)
            for (int l = 0; l < n-k-1; l++)
                if (hand[l].getSuit().ordinal() > hand[l+1].getSuit().ordinal())
                {
                    // swap temp and arr[i]
                    Card temp = hand[l];
                    hand[l] = hand[l+1];
                    hand[l+1] = temp;
                }




    }


    void receiveCard(Card card, int position){
        hand[position] = card;
}
}