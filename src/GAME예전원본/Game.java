package GAME��������;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

import GAME.Music;
import GAME.��Ŭ����;


public class Game extends JFrame{
	private Image img;
	private Graphics Graphic;
	//����̹���
	private Image Background =new ImageIcon(��Ŭ����.class.getResource("../images/audition.jpg")).getImage();
	private JLabel menuBar =new JLabel(new ImageIcon(��Ŭ����.class.getResource("../images/menuBar.png")));
	//�뷡����̹���
	private Image titleImage =new ImageIcon(��Ŭ����.class.getResource("../images/wayback.png")).getImage();
	private Image selectedImage =new ImageIcon(��Ŭ����.class.getResource("../images/waybackhomeST.jpg")).getImage();
	private Image titleImage2 =new ImageIcon(��Ŭ����.class.getResource("../images/wayback.png")).getImage();
	private Image selectedImage2 =new ImageIcon(��Ŭ����.class.getResource("../images/waybackhomeST.jpg")).getImage();
	private Image titleImage3 =new ImageIcon(��Ŭ����.class.getResource("../images/wayback.png")).getImage();
	private Image selectedImage3 =new ImageIcon(��Ŭ����.class.getResource("../images/waybackhomeST.jpg")).getImage();
	//ù���� ��ư�̹�����
	private ImageIcon exitEnter=new ImageIcon(��Ŭ����.class.getResource("../images/button11.png"));
	private ImageIcon exitBasic =(new ImageIcon(��Ŭ����.class.getResource("../images/button00.png")));
	private ImageIcon enterbutton =new ImageIcon(��Ŭ����.class.getResource("../images/���ӽ���.png"));
	private ImageIcon enteredbutton =new ImageIcon(��Ŭ����.class.getResource("../images/���ӽ��۴���.png"));
	private ImageIcon viewbutton =new ImageIcon(��Ŭ����.class.getResource("../images/���Ӽ���.png"));
	private ImageIcon view2button =new ImageIcon(��Ŭ����.class.getResource("../images/���Ӽ�����.png"));
	private ImageIcon exitbutton =new ImageIcon(��Ŭ����.class.getResource("../images/�������ư.png"));
	private ImageIcon exitedbutton =new ImageIcon(��Ŭ����.class.getResource("../images/�����⴩��.png"));
	
	//���ӽ���â ��ư��
		private JButton exit =new JButton(exitBasic);
		private JButton start =new JButton(enterbutton);
		private JButton view =new JButton(viewbutton);
		private JButton exitBT =new JButton(exitbutton);
		
	

	//��� ��ư �̹�����
	private ImageIcon ��0=new ImageIcon(��Ŭ����.class.getResource("../images/��0.png"));
	private ImageIcon ��1 =(new ImageIcon(��Ŭ����.class.getResource("../images/��1.png")));
	private ImageIcon ��0 =new ImageIcon(��Ŭ����.class.getResource("../images/��0.png"));
	private ImageIcon ��1 =new ImageIcon(��Ŭ����.class.getResource("../images/��1.png"));
			
	//��� ��ư��
		private JButton �� =new JButton(��0);
		private JButton �� =new JButton(��0);
		
		private int mouseX,mouseY;
		
		private boolean isMainScreen=false;
	public Game() {
		setUndecorated(true); //�޴�������
		setTitle("Beat Game");
		setSize(��Ŭ����.��ũ������, ��Ŭ����.��ũ������);
		setResizable(false); //âũ�� �����Ұ�
		setLocationRelativeTo(null); //â�� ȭ�� ���߾ӿ��߰��Ѵ�.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBackground(new Color(0,0,0,0));
		setLayout(null);
		
		
		Music mainMusic=new Music("MUSIC1.MP3",true);
		mainMusic.start(); //���γ뷡 Ʋ��
	
		
///////////////������ ��ư ����
	exit.setBounds(1240, 0, 35, 35);
	exit.setBorderPainted(false);
	exit.setContentAreaFilled(false);
	exit.setFocusPainted(false);
	exit.addMouseListener(new MouseAdapter() { //������ ��ư�� �׼Ǹ����� ����
		@Override
		public void mouseEntered(MouseEvent e) {
			exit.setIcon(exitEnter);
			exit.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
			//��ư �����ٴ�� �հ���������� �ٲ��
			Music buttonEnteredMusic=new Music("Pen.mp3",false);
			buttonEnteredMusic.start();
		}
		@Override
		public void mouseExited(MouseEvent e) {
			exit.setIcon(exitBasic);
			exit.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			//�ٽ� Ŀ�� ����Ʈ�� ����
		}
		@Override
		public void mousePressed(MouseEvent e) {
			Music buttonEnteredMusic=new Music("Wood.mp3",false);
			buttonEnteredMusic.start();
			try {
				Thread.sleep(1000);
			}catch(InterruptedException ex) {ex.printStackTrace();}
			System.exit(0);
			
		}
	}); //������ ��ư�� ���콺 �׼Ǹ����� end
	add(exit);
	/////////////////������ ��ư�� 
		
		menuBar.setBounds(0, 0, 1280, 30);
		menuBar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
			mouseX=e.getX();
			mouseY=e.getY();
			}
		}); //���콺 ������
		menuBar.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				setLocation(x-mouseX, y-mouseY);
			}
		});; //���콺 ���
		add(menuBar);
	/////////�޴��� ��
		
		
		
		
		
		///////////////���ӽ��� ��ư ����
		start.setBounds(510, 323, 250, 100);
		start.setBorderPainted(false);
		start.setContentAreaFilled(false);
		start.setFocusPainted(false);
		start.addMouseListener(new MouseAdapter() { //������ ��ư�� �׼Ǹ����� ����
			@Override
			public void mouseEntered(MouseEvent e) {
				start.setIcon(enteredbutton);
				start.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
				//��ư �����ٴ�� �հ���������� �ٲ��
				Music buttonEnteredMusic=new Music("Pen.mp3",false);
				buttonEnteredMusic.start();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				start.setIcon(enterbutton);
				start.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				//�ٽ� Ŀ�� ����Ʈ�� ����
			}
			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonEnteredMusic=new Music("Wood.mp3",false);
				buttonEnteredMusic.start();
				start.setVisible(false);
				view.setVisible(false);
				exitBT.setVisible(false);
				��.setVisible(true);
				��.setVisible(true);
				mainMusic.close();
				Music selectedMusic =new Music("WayBack Home.mp3",true);
				selectedMusic.start();
 				 Background=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
			isMainScreen=true;
			}
		}); //���ӽ��� ��ư�� ���콺 �׼Ǹ����� end
		add(start);
		////////////////���ӽ��� ��ư�� 
		
		view.setBounds(510, 400, 250, 100);
		view.setBorderPainted(false);
		view.setContentAreaFilled(false);
		view.setFocusPainted(false);
		view.addMouseListener(new MouseAdapter() { //������ ��ư�� �׼Ǹ����� ����
			@Override
			public void mouseEntered(MouseEvent e) {
				view.setIcon(view2button);
				view.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
				//��ư �����ٴ�� �հ���������� �ٲ��
				Music buttonEnteredMusic=new Music("Pen.mp3",false);
				buttonEnteredMusic.start();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				view.setIcon(viewbutton);
				view.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				//�ٽ� Ŀ�� ����Ʈ�� ����
			}
			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonEnteredMusic=new Music("Wood.mp3",false);
				buttonEnteredMusic.start();
				start.setVisible(false);
				view.setVisible(false);
				exitBT.setVisible(false);
				 Background=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		
			}
		}); //������ ��ư�� ������ �׼Ǹ����� end
		
		add(view);
		//���Ӽ��� ��ư �� 
		
		/*
		 * ������ ��ư ���� !!!!!!!! 
		 */
		
	///////�������ư
			exitBT.setBounds(510, 480, 250, 100);
			exitBT.setBorderPainted(false);
			exitBT.setContentAreaFilled(false);
			exitBT.setFocusPainted(false);
			exitBT.addMouseListener(new MouseAdapter() { //������ ��ư�� �׼Ǹ����� ����
				@Override
				public void mouseEntered(MouseEvent e) {
					exitBT.setIcon(exitedbutton);
					exitBT.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
					//��ư �����ٴ�� �հ���������� �ٲ��
					Music buttonEnteredMusic=new Music("Pen.mp3",false);
					buttonEnteredMusic.start();
				}
				@Override
				public void mouseExited(MouseEvent e) {
					exitBT.setIcon(exitbutton);
					exitBT.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
					//�ٽ� Ŀ�� ����Ʈ�� ����
				}
				@Override
				public void mousePressed(MouseEvent e) {
					Music buttonEnteredMusic=new Music("Wood.mp3",false);
					buttonEnteredMusic.start();
					System.exit(0);
			
				}
			}); //������ ��ư�� ���콺 �׼Ǹ����� end
			
			add(exitBT);
		
		
		//�������ư ��
		
		///////�¹�ư
					��.setBounds(240, 310, 60, 60);
					��.setBorderPainted(false);
					��.setContentAreaFilled(false);
					��.setFocusPainted(false);
					��.setVisible(false);
					��.addMouseListener(new MouseAdapter() { //������ ��ư�� �׼Ǹ����� ����
						@Override
						public void mouseEntered(MouseEvent e) {
							��.setIcon(��1);
							��.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
							//��ư �����ٴ�� �հ���������� �ٲ��
							Music buttonEnteredMusic=new Music("Pen.mp3",false);
							buttonEnteredMusic.start();
						}
						@Override
						public void mouseExited(MouseEvent e) {
							��.setIcon(��0);
							��.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
							//�ٽ� Ŀ�� ����Ʈ�� ����
						}
						@Override
						public void mousePressed(MouseEvent e) {
							Music buttonEnteredMusic=new Music("Wood.mp3",false);
							buttonEnteredMusic.start();
						//���ʹ�ư�̺�Ʈ
					
						}
					}); //�¹�ư�� ���콺 �׼Ǹ����� end
					
					add(��);
				
				
				//�¹�ư ��
				
				///////���ư
									��.setBounds(980, 310, 60, 60);
									��.setBorderPainted(false);
									��.setContentAreaFilled(false);
									��.setFocusPainted(false);
									��.setVisible(false);
									��.addMouseListener(new MouseAdapter() { //������ ��ư�� �׼Ǹ����� ����
										@Override
										public void mouseEntered(MouseEvent e) {
											��.setIcon(��1);
											��.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
											//��ư �����ٴ�� �հ���������� �ٲ��
											Music buttonEnteredMusic=new Music("Pen.mp3",false);
											buttonEnteredMusic.start();
										}
										@Override
										public void mouseExited(MouseEvent e) {
											��.setIcon(��0);
											��.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
											//�ٽ� Ŀ�� ����Ʈ�� ����
										}
										@Override
										public void mousePressed(MouseEvent e) {
											Music buttonEnteredMusic=new Music("Wood.mp3",false);
											buttonEnteredMusic.start();
										//���ư�̺�Ʈ
									
										}
									}); //���ư�� ���콺 �׼Ǹ����� end
									
									add(��);
								
								
								//���ư ��
								
			
	
	}
	public void paint(Graphics g) {
		img =createImage(��Ŭ����.��ũ������,��Ŭ����.��ũ������);
		Graphic =img.getGraphics();
		imgDraw(Graphic);
		g.drawImage(img, 0, 0, null);
	} //����Ʈ
	public void imgDraw(Graphics g) {
		g.drawImage(Background, 0, 0, null);
		paintComponents(g);
		if(isMainScreen) {
			g.drawImage(selectedImage, 340,170,null);
			g.drawImage(titleImage, 340, 520,null);
		}
		this.repaint();
	}
}//end
