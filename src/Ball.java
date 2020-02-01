import java.awt.*;

public class Ball {

    public int x, y;
    public final int DIAM = 15;
    public int dx = 3, dy =3;
    Board board;

    public Ball(Board board, Paddle paddle){
        x = (paddle.getX() + paddle.getWIDTH()/2) - DIAM/2;
        y = paddle.getY() - paddle.getHEIGHT() - DIAM/2;
        this.board = board;
    }

    public void move(){
        if(this.x <= 0){
            dx*=-1;
        }
        if(x+DIAM >= board.getWidth()){
            dx*=-1;
        }
        if(y<=0 || y+DIAM >= board.getHeight()){
            dy*=-1;
        }
        x+=dx;
        y+=dy;

    }

    public void paint(Graphics g){
        g.fillOval(x,y,DIAM,DIAM);
    }
}
