package game;


 
import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {


    JMenuBar menuBar = new JMenuBar();
    private PuzzlePanel puzzlePanel;
    private JPanel imagePanel;
    ControlGamePanel controlPanel;
    JPanel messagePanel;
    JMenu menu1 = new JMenu("鏂囦欢");
    JMenu menu2 = new JMenu("缂栬緫");
    JMenu menu3 = new JMenu("璧勬簮");
    public GameWindow() throws HeadlessException {
        this.setSize(400,300);
        menuBar.add(menu1);
        menuBar.add(menu2);
        menuBar.add(menu3);

        puzzlePanel = new PuzzlePanel();
        imagePanel = new JPanel();
        controlPanel = new ControlGamePanel();
        messagePanel = new JPanel();

        add(controlPanel,BorderLayout.SOUTH);
        add(messagePanel,BorderLayout.NORTH);
        add(puzzlePanel,BorderLayout.CENTER);
        add(imagePanel,BorderLayout.EAST);

        messagePanel.setBackground(Color.CYAN);
        imagePanel.setBackground(Color.magenta);
        //璁剧疆鑿滃崟鏍�
        this.setJMenuBar(menuBar);
        setVisible(true);
    }
}
