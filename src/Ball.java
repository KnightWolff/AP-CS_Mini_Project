import java.awt.*;

public class Ball {

    public int x, y;
    public final int DIAM = 20;

    public Ball(Board board){
        x = 100;
        y = 100;
    }



    public void paint(Graphics g){
        g.fillOval(x,y,DIAM,DIAM);
    }
}
