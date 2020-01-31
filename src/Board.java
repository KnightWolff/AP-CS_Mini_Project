import javax.swing.*;
import java.awt.*;
public class Board extends JPanel {

    Paddle paddle;
    Ball ball;
    Bricks[][] brick;
    Color pick;
    int num = 0;


    public Board(){
        this.setBackground(Color.black);
        this.setPreferredSize(new Dimension(1500,600));

        brick = new Bricks[22][6];
    }

    public void setup(){
        ball =new Ball(this);
        paddle = new Paddle(this);

        for(int row = 0; row < 22; row++) {
            for(int col = 0; col < 6; col++){
                brick[row][col] = new Bricks(this, row, col);
            }
        }

    }


    public void paint(Graphics g){
        super.paintComponent(g);

        g.setColor(Color.white);
        paddle.paint(g);
        ball.paint(g);

        for(int row = 0; row < 22; row++) {
            g.setColor(colorMaker());
            for(int col = 0; col < 6; col++){
                g.setColor(colorMaker());
                (brick[row][col]).paint(g);
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
            default: num = 0;
        }
        return pick;
    }

}
