package CardGame;
import CardGame.Deck.Card;
import CardGame.Games.WarGame;

import java.util.ArrayList;

public class Game {

    public static void main(String[] args) {

        WarGame wGame = new WarGame("Marc","Chad");
        Boolean cardsLeft = true;
        ArrayList<Card> startingPot = new ArrayList<Card>();
        while(cardsLeft)
        {
            try
            {
                Thread.sleep(1000);
                wGame.DoTurn(startingPot);
            }
            catch(Exception e) {}

            cardsLeft = wGame.GameFinished();
            System.out.println(wGame.GetCurrentScore());
        }
        System.out.println("GAME COMPLETED!");
        System.out.println(wGame.GetCurrentScore());

    }
}