package CardGame.Deck;

public class Card
{
    // suit, value, can be played?
    private Suit suit;
    private FaceValue faceValue;

    public Card(Suit suit, FaceValue fv) {
        this.suit = suit;
        this.faceValue = fv;
    }

    public Integer getNumericalScore()
    {
        switch(this.faceValue)
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

    public Card() {
        this.suit = Suit.NONE;
        this.faceValue = FaceValue.NONE;
    }

    public FaceValue getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(FaceValue faceValue) {
        this.faceValue = faceValue;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    // don't speak "11 of hearts" instead convert to Jack/Queen/King/Ace
    @Override
    public String toString()
    {
        return this.faceValue + " of " + this.suit;
    }
}