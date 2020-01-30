import java.awt.*;

public class Ball {
    private int x,y;
    private final int DIAMETER = 30;
    private final int SPEED = 8;

    double dx = SPEED, dy = SPEED;

    Board board;

    public Ball(Board board) {
        x = 100;
        y = 100;


        this.board = board;
    }

    public void paint(Graphics g){
        g.fillOval(x,y,DIAMETER,DIAMETER);
    }

}
