import java.util.Random;

/**
 * Created by Алина on 24.10.2016.
 */
public class Player implements Shootable {
    @Override
    public Point getShoot() {
        return new Point(new Random().nextInt(3),new Random().nextInt(3));
    }
}
