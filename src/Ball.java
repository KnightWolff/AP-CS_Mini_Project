import java.awt.*;

public class Ball {

    public int x, y;
    public final int DIAM = 15;
    public int dx = 3, dy =3;
    double MAXANGLE = 5*Math.PI/12;
    double SPEED = 6;
    Board board;

    public Ball(Board board, Paddle paddle){
        x = (paddle.getX() + paddle.getWIDTH()/2) - DIAM/2;
        y = paddle.getY() - paddle.getHEIGHT() - DIAM/2;
        this.board = board;
    }

    public Rectangle getBounds(){
        return new Rectangle(x,y,DIAM,DIAM);
    }


    public void checkCollisions(Paddle player){
        if(getBounds().intersects(player.getBounds())){

            dy *= -1;

          /*  if(x + DIAM<player.getX()+player.getWIDTH()/2){
                dy *= -1;
            }
            if(x>player.getX()+player.getWIDTH()/2){
                dy *= -1;
            }*/
            //dy=(int)(SPEED * -Math.cos(MAXANGLE));
        }

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
    public int setDY(){
        dy*=-1;
        return dy;
    }

    public void paint(Graphics g){
        g.fillOval(x,y,DIAM,DIAM);
    }
}

