import java.awt.*;

public class Paddle {

    public int x,y;
    public final int WIDTH = 150, HEIGHT = 20;
    public int dx;

    public Paddle(){
        x = 100;
        y = 100;
    }



    public void paint(Graphics g){
        g.fillRect(x,y,WIDTH, HEIGHT);
    }

}
