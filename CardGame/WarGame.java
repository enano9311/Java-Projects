package CardGame;

public class WarGame {

    private Deck Player1Deck;
    private Deck Player2Deck;
    public Integer Player1Score;
    public Integer Player2Score;

    // give 26 randomly drawn cards to player 1, remaining to player 2 WLOG
    public WarGame()
    {
        this.Player1Score = 0;
        this.Player2Score = 0;
        this.Player1Deck = new Deck();
        this.Player1Deck.EmptyDeck();
        this.Player2Deck = new Deck();
        this.Player2Deck.EmptyDeck();

        Deck startingDeck = new Deck();
        Integer startingDeckSize = startingDeck.Size();
        for(int i = 0; i < startingDeckSize/2; i++)
        {
            this.Player1Deck.AddCard(startingDeck.DrawCard());
        }
        this.Player2Deck = startingDeck;
    }

    public void DoTurn() throws Exception
    {
        Card card1 = this.Player1Deck.DrawCard();
        Card card2 = this.Player2Deck.DrawCard();

        System.out.println("Player 1 plays: " + card1 + "\nPlayer 2 plays: " + card2);
        if(card1.getNumericalScore() > card2.getNumericalScore() || card2.getNumericalScore() == null)
        {
            System.out.println("Player 1 wins this hand!");
            this.Player1Score ++;
        }
        else if (card2.getNumericalScore() > card1.getNumericalScore() || card1.getNumericalScore() == null)
        {
            System.out.println("Player 2 wins this hand!");
            this.Player2Score++;
        }
        else if (card2.getNumericalScore() == card1.getNumericalScore())
        {
            System.out.println("a goddamn tie!");
            //handleTieTurn();
        }
        else
        {
            throw new Exception("CardArithmeticFailure");
        }
    }

    public String GetCurrentScore()
    {
        return "Player 1 score: " + this.Player1Score + "\nPlayer 2 score: " + this.Player2Score;
    }

    public Boolean GameFinished()
    {
        return Player1Deck.Size() > 0 || Player2Deck.Size() > 0;
    }

    private void handleTieTurn () {}

}
