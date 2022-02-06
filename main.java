package assignment8;

import java.util.Arrays;

public class main {


    public static void main(String[] args) {
        // write your code here


        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 =new Player();
        Player player4 =new Player();
        Player[] arr = {player1, player2};


        Game gameOfBridge = new Game(arr);
        gameOfBridge.deal();
        System.out.println("--------------------Deal-----");
        Card[] h1 = player1.getHand();
        Card[] h2 = player2.getHand();
       // Card[] h3 = player3.getHand();
        System.out.println("--------------------Player1 Hand-----");
        System.out.println(h1.length);
        for (int i = 0; i < h1.length;i++)
        {
            System.out.println(h1[i]);

            // gameOfBridge .displayDeck();


        }

       System.out.println("--------------------Player2 Hand-----");
        System.out.println(h2.length);
        for (int i = 0; i < h2.length;i++)
        {
            System.out.println(h2[i]);




        }

        player2.sortHand();
        h2=player2.getHand();
        System.out.println("--------------------SORT-----");
        System.out.println("--------------------Player2 Hand-----");
        System.out.println(h2.length);
        for (int i = 0; i < h2.length;i++)
        {
            System.out.println(h2[i]);




        }


        gameOfBridge.reset();
        System.out.println("--------------------Reset-----");
        System.out.println("--------------------Player1 Hand-----");
        Card[] h = player1.getHand();
        //System.out.println(h.length);
        System.out.println(h.length);
        for (int i = 0; i < h.length;i++) {
            System.out.println(h[i]);

            // gameOfBridge .displayDeck();

        }
        System.out.println("--------------------Player2Hand-----");
        Card[] hk = player1.getHand();
        //System.out.println(h.length);
        System.out.println(hk.length);
        for (int i = 0; i < hk.length;i++) {
            System.out.println(hk[i]);

            // gameOfBridge .displayDeck();

        }
        System.out.println("--------------------displaydeck-----");
        gameOfBridge .displayDeck();
    }
}
