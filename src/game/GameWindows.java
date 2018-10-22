package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class GameWindows extends JFrame{
	private JPanel imagePanel;
	private PuzzlePanel puzzlePanel;
	private JMenu menuGame,menuHelp, menuImage,menuResult;
	private JMenuBar bar;
	private JMenuItem musicItem,exitItem,oneGradeResult,twoGradeResult;
	private JRadioButtonMenuItem oneGradeItem,twoGradeItem,qqImage,flowerImage;
	private JMenuItem gameDescription;
	ControlGamePanel controlPanel;
	JPanel messagePanel;
	
	public static void main(String[] agrs) {
		new GameWindows();
	}
	public GameWindows() throws HeadlessException {
		super();
		bar = new JMenuBar();
		setJMenuBar(bar);
		menuGame = new JMenu("��Ϸ");
		menuHelp = new JMenu("����");
		bar.add(menuGame);
		bar.add(menuHelp);
		
		menuImage = new JMenu("ѡ��ͼ��");
		this.qqImage = new JRadioButtonMenuItem("QQͼƬ",true);
		//this.qqImage.addActionListener(this);
		this.flowerImage = new JRadioButtonMenuItem("��ͼƬ",true);
		//this.flowerImage.addActionListener(this);
		ButtonGroup group1 = new ButtonGroup();
		group1.add(qqImage);
		group1.add(flowerImage);
		menuImage.add(qqImage);
		menuImage.add(flowerImage);
		menuImage.addSeparator();
		
		oneGradeItem = new JRadioButtonMenuItem("��ͨ����3*3",true);
		//this.oneGradeItem.addActionListener(this);
		twoGradeItem = new JRadioButtonMenuItem("�߼�����4*4",true);
		//this.twoGradeItem.addActionListener(this);
		ButtonGroup group2 = new ButtonGroup();
		group1.add(oneGradeItem);
		group1.add(twoGradeItem);
		musicItem = new JMenuItem("�������ֲ��ſ���");
		menuResult = new JMenu("�鿴���а�");
		this.oneGradeResult = new JMenuItem("��ͨ���а�");
		//this.oneGradeResult.addActionListener(this);
		this.twoGradeResult = new JMenuItem("�߼����а�");
		this.menuResult.add(this.oneGradeResult);
		this.menuResult.add(this.twoGradeResult);
		//this.twoGradeResult.addActionListener(this);
		exitItem = new JMenuItem("�˳�");
		
		menuGame.add(this.menuImage);
		menuGame.addSeparator();
		menuGame.add(this.oneGradeItem);
		menuGame.add(this.twoGradeItem);
		menuGame.addSeparator();
		menuGame.add(this.musicItem);
		menuGame.addSeparator();
		menuGame.add(this.menuResult);
		menuGame.addSeparator();
		menuGame.add(this.exitItem);
		this.gameDescription = new JMenuItem("��Ϸ˵��");
		//this.gameDescription.addActionListener(this);
		this.menuHelp.add(this.gameDescription);
		
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
		
		this.setBounds(800, 300, 400, 300);
		this.setVisible(true);
		
	}
}
