package CardGame.Player;

import CardGame.Deck.Card;
import CardGame.Deck.Deck;

public class WarPlayer extends Player {

    public Integer score;
    public Deck deck;

    public WarPlayer()
    {
        super();
        this.score = 0;
    }

    public WarPlayer(Deck dealtDeck, String givenName, Integer score)
    {
        super(dealtDeck, givenName);
        this.score = score;
    }


    public Integer incrementScore()
    {
        this.score ++;
        return this.score;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public void addCard(Card card)
    {
        super.deck.AddCard(card);
    }
}
