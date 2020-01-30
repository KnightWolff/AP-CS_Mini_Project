import java.awt.*;

public class Paddle {

        private int x, y;
        private final int WIDTH = 150, HEIGHT = 20;

        Board board;
        Game game;
        private int dy = 5;

        public Paddle(Board board, Game game){
            x = 0;
            y= 0;
            this.board = board;
            this.game = game;
        }

        public void setPosition(int x, int y){
            this.x = x - WIDTH/2;
            this.y = y - HEIGHT/2;
        }

        public Rectangle getBounds(){
            return new Rectangle(x,y,WIDTH,HEIGHT);

        }

        public void paint(Graphics g){
            g.fillRect(x,y,WIDTH,HEIGHT);
        }


}
