package CardGame.Deck;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Deck {
    // A deck is a collection of 52 cards
    private List<Card> allCards;

    public Deck()
    {
        this.allCards = new ArrayList<>();
        for (Suit suit : Suit.values())
        {
            if(suit == Suit.NONE) {continue;}
            for (FaceValue fv : FaceValue.values())
            {
                if(fv == FaceValue.NONE){continue;}
                this.allCards.add(new Card(suit, fv));
            }
        }
    }

    public void EmptyDeck()
    {
        this.allCards = new ArrayList<>();
    }

    public Deck(List<Card> givenCards)
    {
        this.allCards = givenCards;
    }

    public List<Card> GetAllCards()
    {
        return this.allCards;
    }

    // give one random card
    public Card DrawCard()
    {
        return this.allCards.remove(0);
    }

    public void AddCard(Card newCard)
    {
        this.allCards.add(newCard);
    }

    public List<Card> Shuffle()
    {
        Collections.shuffle(this.allCards);
        return this.allCards;
    }

    public Integer Size()
    {
        return this.allCards.size();
    }
}