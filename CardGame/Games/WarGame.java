package CardGame.Games;
import CardGame.Player.WarPlayer;
import CardGame.Deck.Card;
import CardGame.Deck.Deck;

import java.util.ArrayList;

public class WarGame {


    private WarPlayer player1;
    private WarPlayer player2;

    // give 26 randomly drawn cards to player 1, remaining to player 2 WLOG
    public WarGame(String player1Name, String player2Name)
    {
        Deck Player1Deck = new Deck();
        Player1Deck.EmptyDeck();
        Deck Player2Deck = new Deck();
        Player2Deck.EmptyDeck();

        Deck startingDeck = new Deck();
        startingDeck.Shuffle();
        Integer startingDeckSize = startingDeck.Size();
        for(int i = 0; i < startingDeckSize/2; i++)
        {
            Player1Deck.AddCard(startingDeck.DrawCard());
        }
        Player2Deck = startingDeck;

        this.player1 = new WarPlayer(Player1Deck, player1Name, 0);
        this.player2 = new WarPlayer(Player2Deck, player2Name, 0);
    }

    public void DoTurn(ArrayList<Card> pot) throws Exception
    {
        Card card1 = this.player1.playCard();
        Card card2 = this.player2.playCard();
        WarPlayer winningPlayer;

        System.out.println(player1.getName() + " plays: " + card1);
        System.out.println(player2.getName() + " plays: " + card2);
        if(player1.cardScore(card1) > player2.cardScore(card2) || player2.cardScore(card2) == null)
        {
            this.player1.incrementScore();
            winningPlayer = player1;
        }
        else if (player2.cardScore(card2) > player1.cardScore(card1) || player1.cardScore(card1) == null)
        {
            this.player2.incrementScore();
            winningPlayer = player2;
        }
        else if (player2.cardScore(card2) == player1.cardScore(card1))
        {
            System.out.println("A tie. Each player puts two cards in the pot!!");
            pot.add(card1);
            pot.add(card2);
            pot.add(this.player1.playCard());
            pot.add(this.player1.playCard());
            pot.add(this.player2.playCard());
            pot.add(this.player2.playCard());
            System.out.println("POT SIZE " + pot.size());
            winningPlayer = null;
            DoTurn(pot);
        }
        else
        {
            winningPlayer = null;
            throw new Exception("CardArithmeticFailure");
        }

        System.out.println(winningPlayer.getName() + " won that hand!");
        winningPlayer.addCard(card1);
        winningPlayer.addCard(card2);
        for(Card card : pot)
        {
            System.out.println(winningPlayer.getName() + " gets: " + card.toString());
            winningPlayer.addCard(card);
        }
        pot.clear();
    }

    public String GetCurrentScore()
    {
        String player1Information = this.player1.getName() + " cards remaining: " + this.player1.getDeck().Size();
        String player2Information = this.player2.getName() + " cards remaining: " + this.player2.getDeck().Size();
        return player1Information + "\n" + player2Information;
    }

    public Boolean GameFinished()
    {
        return this.player1.getDeck().Size() > 0 && this.player2.getDeck().Size() > 0;
    }

    private void handleTieTurn () {}

}
