package CardGame;
import CardGame.Card;
import CardGame.Suit;
import CardGame.FaceValue;

public class Game {

    public static void main(String[] args) {
        System.out.println("test");
        Card card = new Card();
        System.out.println(card.toString());

        Card secondCard = new Card(Suit.Hearts,FaceValue.Ace);
        System.out.println(secondCard.toString());
    }
}