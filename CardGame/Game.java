package CardGame;
import CardGame.Games.WarGame;

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