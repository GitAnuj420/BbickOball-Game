package ballobrick;

import javax.swing.JFrame;


public class BallObrick{
    public static void main(String[] args) {
        JFrame obj = new JFrame();
        game_play gplay = new game_play();
        obj.setBounds(10,10,700,600);
        obj.setTitle("Break The Balls");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gplay);
    }
    
}
