
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Board extends JPanel implements ActionListener {

    Paddle player;
    Ball ball;
    Bricks[][] bricks;
    Timer timer;

    public Board() {
        player = new Paddle();
        ball = new Ball();

        this.setSize(new Dimension(1000,900));
        this.setBackground(Color.black);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }


    public void paintComponents(Graphics g){
        super.paint(g);

        g.setColor(Color.red);

    }
}
