package CardGame.Player;

import CardGame.Deck.Deck;

public class Player {

    private String name;
    private Deck deck;

    public Player()
    {
        this.deck = new Deck();
        this.name = "Player";
    }

    public Player(Deck dealtDeck, String givenName)
    {
        this.deck = dealtDeck;
        this.name = givenName;
    }


    public String getName() {
        return name;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

}
