package CardGame;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import CardGame.Card;
import CardGame.Suit;
import CardGame.FaceValue;
import CardGame.Deck;
import CardGame.WarGame;

public class Game {

    public static void main(String[] args) {

        WarGame wGame = new WarGame();
        Boolean cardsLeft = true;
        while(cardsLeft)
        {
            try
            {
                Thread.sleep(1000);
                wGame.DoTurn();
            }
            catch(Exception e) {}

            cardsLeft = wGame.GameFinished();
            System.out.println(wGame.GetCurrentScore());
        }
        System.out.println("GAME COMPLETED!");
        System.out.println(wGame.GetCurrentScore());
        
    }
}