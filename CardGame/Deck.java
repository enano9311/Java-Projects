package CardGame;
import java.util.concurrent.ThreadLocalRandom;
import CardGame.Card;
import CardGame.Suit;
import CardGame.FaceValue;

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
        int randomNum = ThreadLocalRandom.current().nextInt(0, this.allCards.size());

        Card card;
        try
        {
            card = this.allCards.get(randomNum);
            this.allCards.remove(randomNum);
        }
        catch(Exception e)
        {
            System.out.println("");
            return null;
        }

        return card;
    }

    public void AddCard(Card newCard)
    {
        this.allCards.add(newCard);
    }

    public List<Card> Shuffle()
    {
        return null;
    }

    public Integer Size()
    {
        return this.allCards.size();
    }
}