package CardGame;
import java.util.HashMap;
import CardGame.FaceValue;
import CardGame.Suit;

public class Card
{
    // suit, value, can be played?
    private Suit suit;
    private FaceValue faceValue;

    public Card(Suit suit, FaceValue fv) {
        this.suit = suit;
        this.faceValue = fv;
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