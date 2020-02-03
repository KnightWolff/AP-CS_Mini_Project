import java.awt.*;

public class Bricks {

    public int x,y;
    public int WIDTH;
    public final int HEIGHT = 35;

    public Bricks(Board board, int row, int col){
        WIDTH = board.getWidth()/22;
        x = WIDTH*row;
        y = (board.getHeight()/4) + (HEIGHT* col);

    }


    public void paint(Graphics g){
        g.fillRoundRect(x,y,WIDTH, HEIGHT, 10, 10);
    }


}
