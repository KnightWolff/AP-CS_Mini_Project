import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Board extends JPanel implements ActionListener {

    Paddle paddle;
    Ball ball;
    Bricks[][] brick;
    Game game;
    Timer timer;
    Color pick;
    int num = 0;


    public Board(Game game){
        this.setBackground(Color.black);
        this.setPreferredSize(new Dimension(1500,600));

        this.game = game;
        brick = new Bricks[22][6];
        timer = new Timer(1000/60, this);
        timer.start();
    }

    public void setup(){
        paddle = new Paddle(this, game);
        ball =new Ball(this, paddle);

        for(int col = 0; col < 6; col++) {
            for(int row = 0; row < 22; row++){
                brick[row][col] = new Bricks(this, row, col);
            }
        }

    }

    public void checkCollisions(){
        for(int col = 0; col < brick.length; col++) {
            for(int row = 0; row < brick[0].length; row++){
                if(brick[col][row] != null){
                    if(ball.getBounds().intersects(brick[col][row].getBounds())){
                        ball.setDY();
                        brick[col][row] = null;
                        break;
                    }
                }

            }
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        ball.move();
        paddle.move();
        ball.checkCollisions(paddle);

        this.checkCollisions();


        repaint();
    }

    public void paint(Graphics g){
        super.paintComponent(g);

        g.setColor(Color.white);
        paddle.paint(g);
        ball.paint(g);

        for(int col = 0; col < 6; col++) {
            g.setColor(colorMaker());
            for(int row = 0; row < 22; row++){
                g.setColor(colorMaker());
                if(brick[row][col] != null) {
                    (brick[row][col]).paint(g);
                }
            }
        }

    }

    public Color colorMaker(){

        switch(num){
            case 0: pick = Color.getColor("yellow", Color.yellow);
                num++;
                break;
            case 1: pick = Color.getColor("red", Color.red);
                num++;
                break;
            case 2: pick = Color.getColor("blue", Color.blue);
                num = 0;
                break;
        }
        return pick;
    }

}