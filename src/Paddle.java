import java.awt.*;

public class Paddle {

    public int x, y;
    public final int WIDTH = 150, HEIGHT = 20;

    public Paddle(Board board){

        x = (board.getWidth() - (WIDTH/2))/2;
        y = board.getHeight() + (HEIGHT - 50);
    }

    public void paint(Graphics g) {
        g.fillRect(x,y,WIDTH,HEIGHT);
    }
}
