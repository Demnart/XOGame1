/**
 * Created by Алина on 03.10.2016.
 */
public class Main {
    static Board board = new Board();
    static Point point = new Point();
    static Player player = new Player();
    static Ai ai = new Ai();
    public static void main(String[] args) {
        board.initCells();
        board.show();
        do {
            board.doShoot(ai.getShoot(), Type.X);
            board.show();
            board.checkWinner(Type.X);
            board.doShoot(player.getShoot(), Type.O);
            board.show();
            board.checkWinner(Type.O);
        } while (!board.isGameNotEnd());
    }
}
