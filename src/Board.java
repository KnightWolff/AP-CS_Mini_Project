import com.sun.jmx.snmp.agent.SnmpGenericMetaServer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Board extends JPanel implements ActionListener {

    Paddle player;
    Ball ball;
    Bricks[][] bricks = new Bricks[4][15];
    Timer timer;
    Game game;

    public Board(Game game){
        this.game = game;
        setPreferredSize(new Dimension(1000,900));
        setBackground(Color.BLACK);
        timer = new Timer(1000/60, this);
        timer.start();
    }

    public void setup(){

    }



    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public void paint(Graphics g){
        super.paintComponent(g);



    }

}
