package CardGame.Player;
import CardGame.Deck.Card;
import CardGame.Deck.FaceValue;
import CardGame.Deck.Deck;

public class Player {

    private String name;
    public Deck deck;

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

    public Integer cardScore(Card card)
    {
        switch(card.getFaceValue())
        {
            case Two:
                return 2;
            case Three:
                return 3;
            case Four:
                return 4;
            case Five:
                return 5;
            case Six:
                return 6;
            case Seven:
                return 7;
            case Eight:
                return 8;
            case Nine:
                return 9;
            case Ten:
                return 10;
            case Jack:
                return 11;
            case Queen:
                return 12;
            case King:
                return 13;
            case Ace:
                return 14;
            default:
                return null;
        }

    }

    public Card playCard()
    {
        return this.deck.DrawCard();
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
