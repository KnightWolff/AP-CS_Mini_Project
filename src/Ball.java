import java.awt.*;

public class Ball {

    public int x, y;
    public final int DIAM = 20;

    public Ball(){
        x = 40;
        y = 40;
    }

    public void paint(Graphics g){
        g.fillOval(x,y, DIAM, DIAM);
    }

}
