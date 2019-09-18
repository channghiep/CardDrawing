package com.example.lab2;

public class Deck {
    String[] suit= {"Heart", "Diamond", "Club", "Spade"};
    String[] rank= {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    int n = suit.length* rank.length;
    String[] cardDeck = new String[n];

    public String[] createdeck(){


        for(int i=0; i<rank.length; i++){
            for(int j=0; j<suit.length;j++){
                    cardDeck[suit.length * i + j] =
                    rank[i] + " of " + suit[j];
            }
        }

        return cardDeck;
    }


}
