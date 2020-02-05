import java.awt.*;

public class Paddle {

    Game game;
    Board board;
    public int x, y;
    public final int WIDTH = 150, HEIGHT = 10;
    public int dx = 5;

    public Paddle(Board board, Game game){

        x = (board.getWidth() - (WIDTH/2))/2;
        y = (board.getHeight() + HEIGHT) - 45;
        this.board = board;
        this.game = game;
    }

    public Rectangle getBounds(){
        return new Rectangle(x,y,WIDTH,HEIGHT);
    }

    public void move(){
        if( game.isRightPressed()){
            if(x<board.getWidth() - WIDTH) {
                x += dx;
            }
        }
        if(game.isLeftPressed()){
            if(x>0){
                x-=dx;
            }
        }

    }

    public void paint(Graphics g) {
        g.fillRect(x,y,WIDTH,HEIGHT);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWIDTH() {
        return WIDTH;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }
}