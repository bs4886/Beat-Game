package GAME뒤로가기버튼하기전;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

import GAME.Music;
import GAME.주클래스;


public class Game extends JFrame{
	private Image img;
	private Graphics Graphic;
	//배경이미지
	private Image Background =new ImageIcon(주클래스.class.getResource("../images/audition.jpg")).getImage();
	private JLabel menuBar =new JLabel(new ImageIcon(주클래스.class.getResource("../images/menuBar.png")));
	//노래배경이미지
	private Image titleImage =new ImageIcon(주클래스.class.getResource("../images/wayback.png")).getImage();
	private Image selectedImage =new ImageIcon(주클래스.class.getResource("../images/waybackhomeST.jpg")).getImage();
	private Image titleImage2 =new ImageIcon(주클래스.class.getResource("../images/넘쳐흘러.png")).getImage();
	private Image selectedImage2 =new ImageIcon(주클래스.class.getResource("../images/넘쳐흘러.jpg")).getImage();
	private Image titleImage3 =new ImageIcon(주클래스.class.getResource("../images/YESORYES.png")).getImage();
	private Image selectedImage3 =new ImageIcon(주클래스.class.getResource("../images/YESORYES.jpg")).getImage();
	//게임배경이미지 
	private Image game1 =new ImageIcon(주클래스.class.getResource("../images/waybackhomeED.jpg")).getImage();
	private Image game2 =new ImageIcon(주클래스.class.getResource("../images/몽환적배경.jpg")).getImage();
	private Image game3 =new ImageIcon(주클래스.class.getResource("../images/yes이미지.jpg")).getImage();
	//첫시작 버튼이미지들
	private ImageIcon exitEnter=new ImageIcon(주클래스.class.getResource("../images/button11.png"));
	private ImageIcon exitBasic =(new ImageIcon(주클래스.class.getResource("../images/button00.png")));
	private ImageIcon enterbutton =new ImageIcon(주클래스.class.getResource("../images/게임시작.png"));
	private ImageIcon enteredbutton =new ImageIcon(주클래스.class.getResource("../images/게임시작누름.png"));
	private ImageIcon viewbutton =new ImageIcon(주클래스.class.getResource("../images/게임설명.png"));
	private ImageIcon view2button =new ImageIcon(주클래스.class.getResource("../images/게임설명누름.png"));
	private ImageIcon exitbutton =new ImageIcon(주클래스.class.getResource("../images/나가기버튼.png"));
	private ImageIcon exitedbutton =new ImageIcon(주클래스.class.getResource("../images/나가기누름.png"));
	//곡선택 버튼이미지
	private ImageIcon Easy =new ImageIcon(주클래스.class.getResource("../images/Easy.png"));
	private ImageIcon Normal =new ImageIcon(주클래스.class.getResource("../images/normal.png"));
	private ImageIcon Hard =new ImageIcon(주클래스.class.getResource("../images/Hard.png"));
	//게임시작창 버튼들
		private JButton exit =new JButton(exitBasic);
		private JButton start =new JButton(enterbutton);
		private JButton view =new JButton(viewbutton);
		private JButton exitBT =new JButton(exitbutton);
	//곡선택창 버튼들	
		private JButton EasyBT =new JButton(Easy);
		private JButton NormalBT=new JButton(Normal);
		private JButton HardBT =new JButton(Hard);

	//곡선택 버튼 이미지들
	private ImageIcon 좌0=new ImageIcon(주클래스.class.getResource("../images/좌0.png"));
	private ImageIcon 좌1 =(new ImageIcon(주클래스.class.getResource("../images/좌1.png")));
	private ImageIcon 우0 =new ImageIcon(주클래스.class.getResource("../images/우0.png"));
	private ImageIcon 우1 =new ImageIcon(주클래스.class.getResource("../images/우1.png"));
			
	//곡선택 버튼들
		private JButton 좌 =new JButton(좌0);
		private JButton 우 =new JButton(우0);
		
		private int mouseX,mouseY;
		//곡선택 >>> 게임화면 변경을위한 변수
		private int isMainScreen=0;
		private int gameint=0;
		private int count=0;
		//선택창노래
		Music selectedMusic =new Music("WayBack Home.mp3",true);
		//게임창노래 (원곡)
		Music GMusic;
		public Game() {
		setUndecorated(true); //메뉴바제거
		setTitle("Beat Game");
		setSize(주클래스.스크린길이, 주클래스.스크린높이);
		setResizable(false); //창크기 설정불가
		setLocationRelativeTo(null); //창이 화면 정중앙에뜨게한다.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBackground(new Color(0,0,0,0));
		setLayout(null);
		
		
		Music mainMusic=new Music("MUSIC1.MP3",true);
		mainMusic.start(); //메인노래 틀기
		
	
	
		
	
///////////////나가기 버튼 시작
	exit.setBounds(1240, 0, 35, 35);
	exit.setBorderPainted(false);
	exit.setContentAreaFilled(false);
	exit.setFocusPainted(false);
	exit.addMouseListener(new MouseAdapter() { //나가기 버튼의 액션리스너 시작
		@Override
		public void mouseEntered(MouseEvent e) {
			exit.setIcon(exitEnter);
			exit.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
			//버튼 가져다대면 손가락모양으로 바뀌게
			Music buttonEnteredMusic=new Music("Pen.mp3",false);
			buttonEnteredMusic.start();
		}
		@Override
		public void mouseExited(MouseEvent e) {
			exit.setIcon(exitBasic);
			exit.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			//다시 커서 디폴트로 변경
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
	}); //나가기 버튼의 마우스 액션리스너 end
	add(exit);
	/////////////////나가기 버튼끝 
		
		menuBar.setBounds(0, 0, 1280, 30);
		menuBar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
			mouseX=e.getX();
			mouseY=e.getY();
			}
		}); //마우스 리스너
		menuBar.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				setLocation(x-mouseX, y-mouseY);
			}
		});; //마우스 모션
		add(menuBar);
	/////////메뉴바 끝
		
		
		
		
		
		///////////////게임시작 버튼 시작
		start.setBounds(510, 323, 250, 100);
		start.setBorderPainted(false);
		start.setContentAreaFilled(false);
		start.setFocusPainted(false);
		start.addMouseListener(new MouseAdapter() { //나가기 버튼의 액션리스너 시작
			@Override
			public void mouseEntered(MouseEvent e) {
				start.setIcon(enteredbutton);
				start.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
				//버튼 가져다대면 손가락모양으로 바뀌게
				Music buttonEnteredMusic=new Music("Pen.mp3",false);
				buttonEnteredMusic.start();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				start.setIcon(enterbutton);
				start.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				//다시 커서 디폴트로 변경
			}
			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonEnteredMusic=new Music("Wood.mp3",false);
				buttonEnteredMusic.start();
				start.setVisible(false);
				view.setVisible(false);
				exitBT.setVisible(false);
				좌.setVisible(true);
				우.setVisible(true);
				EasyBT.setVisible(true);
				NormalBT.setVisible(true);
				HardBT.setVisible(true);
				
				mainMusic.close();
				selectedMusic.start();
 				 Background=new ImageIcon(주클래스.class.getResource("../images/곡선택.png")).getImage();
			isMainScreen=1;
			}
		}); //게임시작 버튼의 마우스 액션리스너 end
		add(start);
		////////////////게임시작 버튼끝 
		
		view.setBounds(510, 400, 250, 100);
		view.setBorderPainted(false);
		view.setContentAreaFilled(false);
		view.setFocusPainted(false);
		view.addMouseListener(new MouseAdapter() { //나가기 버튼의 액션리스너 시작
			@Override
			public void mouseEntered(MouseEvent e) {
				view.setIcon(view2button);
				view.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
				//버튼 가져다대면 손가락모양으로 바뀌게
				Music buttonEnteredMusic=new Music("Pen.mp3",false);
				buttonEnteredMusic.start();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				view.setIcon(viewbutton);
				view.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				//다시 커서 디폴트로 변경
			}
			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonEnteredMusic=new Music("Wood.mp3",false);
				buttonEnteredMusic.start();
				start.setVisible(false);
				view.setVisible(false);
				exitBT.setVisible(false);
				 Background=new ImageIcon(주클래스.class.getResource("../images/곡선택.png")).getImage();
		
			}
		}); //나가기 버튼의 마으스 액션리스너 end
		
		add(view);
		//게임설명 버튼 끝 
		
		/*
		 * 나가기 버튼 시작 !!!!!!!! 
		 */
		
	///////나가기버튼
			exitBT.setBounds(510, 480, 250, 100);
			exitBT.setBorderPainted(false);
			exitBT.setContentAreaFilled(false);
			exitBT.setFocusPainted(false);
			exitBT.addMouseListener(new MouseAdapter() { //나가기 버튼의 액션리스너 시작
				@Override
				public void mouseEntered(MouseEvent e) {
					exitBT.setIcon(exitedbutton);
					exitBT.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
					//버튼 가져다대면 손가락모양으로 바뀌게
					Music buttonEnteredMusic=new Music("Pen.mp3",false);
					buttonEnteredMusic.start();
				}
				@Override
				public void mouseExited(MouseEvent e) {
					exitBT.setIcon(exitbutton);
					exitBT.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
					//다시 커서 디폴트로 변경
				}
				@Override
				public void mousePressed(MouseEvent e) {
					Music buttonEnteredMusic=new Music("Wood.mp3",false);
					buttonEnteredMusic.start();
					System.exit(0);
			
				}
			}); //나가기 버튼의 마우스 액션리스너 end
			
			add(exitBT);
		
		
		//나가기버튼 끝
		
		///////좌버튼
					좌.setBounds(240, 310, 60, 60);
					좌.setBorderPainted(false);
					좌.setContentAreaFilled(false);
					좌.setFocusPainted(false);
					좌.setVisible(false);
					좌.addMouseListener(new MouseAdapter() { //나가기 버튼의 액션리스너 시작
						@Override
						public void mouseEntered(MouseEvent e) {
							좌.setIcon(좌1);
							좌.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
							//버튼 가져다대면 손가락모양으로 바뀌게
							Music buttonEnteredMusic=new Music("Pen.mp3",false);
							buttonEnteredMusic.start();
						}
						@Override
						public void mouseExited(MouseEvent e) {
							좌.setIcon(좌0);
							좌.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
							//다시 커서 디폴트로 변경
						}
						@Override
						public void mousePressed(MouseEvent e) {
							Music buttonEnteredMusic=new Music("Wood.mp3",false);
							buttonEnteredMusic.start();
						//왼쪽버튼이벤트
							
						isMainScreen--;
						PlayMusic(isMainScreen);
					
						}
					}); //좌버튼의 마우스 액션리스너 end
					
					add(좌);
				
				
				//좌버튼 끝
				
				///////우버튼
									우.setBounds(980, 310, 60, 60);
									우.setBorderPainted(false);
									우.setContentAreaFilled(false);
									우.setFocusPainted(false);
									우.setVisible(false);
									우.addMouseListener(new MouseAdapter() { //나가기 버튼의 액션리스너 시작
										@Override
										public void mouseEntered(MouseEvent e) {
											우.setIcon(우1);
											우.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
											//버튼 가져다대면 손가락모양으로 바뀌게
											Music buttonEnteredMusic=new Music("Pen.mp3",false);
											buttonEnteredMusic.start();
										}
										@Override
										public void mouseExited(MouseEvent e) {
											우.setIcon(우0);
											우.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
											//다시 커서 디폴트로 변경
										}
										@Override
										public void mousePressed(MouseEvent e) {
											Music buttonEnteredMusic=new Music("Wood.mp3",false);
											buttonEnteredMusic.start();
										//우버튼이벤트
											isMainScreen++;
										PlayMusic(isMainScreen);
										}
									}); //우버튼의 마우스 액션리스너 end
									
									add(우);
								
								
								
			
			///////이지버튼
					EasyBT.setBounds(375, 580, 135, 125);
					EasyBT.setBorderPainted(false);
					EasyBT.setContentAreaFilled(false);
					EasyBT.setFocusPainted(false);
					EasyBT.setVisible(false);
					EasyBT.addMouseListener(new MouseAdapter() { //이지 버튼의 액션리스너 시작
		@Override
		public void mouseEntered(MouseEvent e) {
			
			EasyBT.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
		//버튼 가져다대면 손가락모양으로 바뀌게
		Music buttonEnteredMusic=new Music("Pen.mp3",false);
		buttonEnteredMusic.start();
	    }
			@Override
		public void mouseExited(MouseEvent e) {
	
			EasyBT.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		//다시 커서 디폴트로 변경
		}
		@Override
		public void mousePressed(MouseEvent e) {
		Music buttonEnteredMusic=new Music("Wood.mp3",false);
		buttonEnteredMusic.start();
		gameint=1;
		count=isMainScreen;
		isMainScreen=0;
		gameStrat(1);
		
		}
		}); //이지버튼의 마우스 액션리스너 end
									
		add(EasyBT);
								
								
		//이지버튼 끝
					
		///////노말버튼
		NormalBT.setBounds(560, 580, 135, 125);
		NormalBT.setBorderPainted(false);
		NormalBT.setContentAreaFilled(false);
		NormalBT.setFocusPainted(false);
		NormalBT.setVisible(false);
		NormalBT.addMouseListener(new MouseAdapter() { //이지 버튼의 액션리스너 시작
			@Override
			public void mouseEntered(MouseEvent e) {

				NormalBT.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
				//버튼 가져다대면 손가락모양으로 바뀌게
				Music buttonEnteredMusic=new Music("Pen.mp3",false);
				buttonEnteredMusic.start();
			}
			@Override
			public void mouseExited(MouseEvent e) {

				NormalBT.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				//다시 커서 디폴트로 변경
			}
			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonEnteredMusic=new Music("Wood.mp3",false);
				buttonEnteredMusic.start();
				//노말버튼이벤트
				gameint=2;
				count=isMainScreen;
				isMainScreen=0;
				gameStrat(2);
			}
		}); //노말버튼의 마우스 액션리스너 end
						
		add(NormalBT);
					
					
//노말버튼 끝
		
		///////하드버튼
		HardBT.setBounds(760, 580, 135, 125);
		HardBT.setBorderPainted(false);
		HardBT.setContentAreaFilled(false);
		HardBT.setFocusPainted(false);
		HardBT.setVisible(false);
		HardBT.addMouseListener(new MouseAdapter() { //이지 버튼의 액션리스너 시작
			@Override
			public void mouseEntered(MouseEvent e) {

				HardBT.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
				//버튼 가져다대면 손가락모양으로 바뀌게
				Music buttonEnteredMusic=new Music("Pen.mp3",false);
				buttonEnteredMusic.start();
			}
			@Override
			public void mouseExited(MouseEvent e) {

				HardBT.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				//다시 커서 디폴트로 변경
			}
			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonEnteredMusic=new Music("Wood.mp3",false);
				buttonEnteredMusic.start();
				//하드버튼이벤트
				gameint=3;
				count=isMainScreen;
				isMainScreen=0;
				gameStrat(3);
			}
		}); //하드버튼의 마우스 액션리스너 end
						
		add(HardBT);
					
					
//하드버튼 끝
		
			
	
	}
	public void paint(Graphics g) {
		img =createImage(주클래스.스크린길이,주클래스.스크린높이);
		Graphic =img.getGraphics();
		imgDraw(Graphic);
		g.drawImage(img, 0, 0, null);
	} //페인트
	public void imgDraw(Graphics g) {
		g.drawImage(Background, 0, 0, null);
		paintComponents(g);
		
		if(isMainScreen==1) {
			g.drawImage(selectedImage, 340,170,null);
			g.drawImage(titleImage, 340, 520,null);
			}
		if(isMainScreen==2) {
			g.drawImage(selectedImage2, 340,170,null);
			g.drawImage(titleImage2, 330, 180,null);
		}
		if(isMainScreen==3) {
			g.drawImage(selectedImage3, 340,170,null);
			g.drawImage(titleImage3, 340, 510,null);
		}
		this.repaint();
		if(count==1&&gameint==1) {
			Background=new ImageIcon(주클래스.class.getResource("../images/waybackhomeED.jpg")).getImage();
		}
		if(count==1&&gameint==2) {
			Background=new ImageIcon(주클래스.class.getResource("../images/waybackhomeED.jpg")).getImage();
		}
		if(count==1&&gameint==3) {
			Background=new ImageIcon(주클래스.class.getResource("../images/waybackhomeED.jpg")).getImage();
		}
		if(count==2&&gameint==1) {
			Background=new ImageIcon(주클래스.class.getResource("../images/몽환적배경.jpg")).getImage();
		}
		if(count==2&&gameint==2) {
			Background=new ImageIcon(주클래스.class.getResource("../images/몽환적배경.jpg")).getImage();
		}
		if(count==2&&gameint==3) {
			Background=new ImageIcon(주클래스.class.getResource("../images/몽환적배경.jpg")).getImage();
		}
		if(count==3&&gameint==1) {
			Background=new ImageIcon(주클래스.class.getResource("../images/yes이미지.jpg")).getImage();
		}
		if(count==3&&gameint==2) {
			Background=new ImageIcon(주클래스.class.getResource("../images/yes이미지.jpg")).getImage();
		}
		if(count==3&&gameint==3) {
			Background=new ImageIcon(주클래스.class.getResource("../images/yes이미지.jpg")).getImage();
		}
	
	}
	public void PlayMusic(int isMainScreen) {
		
		
		if(isMainScreen==1) {
			if(selectedMusic!=null) {
			selectedMusic.close();
			}
			selectedMusic =new Music("WayBack Home.mp3",true);
			selectedMusic.start();
			
			
		}
		if(isMainScreen==2) {
			if(selectedMusic!=null) {
				selectedMusic.close();
				}
			selectedMusic =new Music("넘쳐흘러선택.mp3",true);
			selectedMusic.start();
			
			
		}
		if(isMainScreen==3) {
			if(selectedMusic!=null) {
				selectedMusic.close();
				}	
			selectedMusic =new Music("YESorYES선택.mp3",true);
			selectedMusic.start();
			}
	}//playmusic
	public void gameStrat(int gameint) {
		if(selectedMusic!=null) {
			selectedMusic.close();
		좌.setVisible(false);
		우.setVisible(false);
		EasyBT.setVisible(false);
		NormalBT.setVisible(false);
		HardBT.setVisible(false);	
		}	
		if(count==1&&gameint==1) {
			if(GMusic!=null) {GMusic.close();}
			if(selectedMusic!=null) {selectedMusic.close();}
			GMusic =new Music("WayBack Home.mp3",true);
			GMusic.start();
			}
		if(count==1&&gameint==2) {
			if(GMusic!=null) {GMusic.close();}
			if(selectedMusic!=null) {selectedMusic.close();}
			GMusic =new Music("WayBack Home.mp3",true);
			GMusic.start();
			}
		if(count==1&&gameint==3) {
			if(GMusic!=null) {GMusic.close();}
			if(selectedMusic!=null) {selectedMusic.close();}
			GMusic =new Music("WayBack Home.mp3",true);
			GMusic.start();
			}
		//2번째곡
		if(count==2&&gameint==1) {
			if(GMusic!=null) {GMusic.close();}
			if(selectedMusic!=null) {selectedMusic.close();}
			GMusic =new Music("넘쳐흘러.mp3",true);
			GMusic.start();
			}
		if(count==2&&gameint==2) {
			if(GMusic!=null) {GMusic.close();}
			if(selectedMusic!=null) {selectedMusic.close();}
			GMusic =new Music("넘쳐흘러.mp3",true);
			GMusic.start();
			}
		if(count==2&&gameint==3) {
			if(GMusic!=null) {GMusic.close();}
			if(selectedMusic!=null) {selectedMusic.close();}
			GMusic =new Music("넘쳐흘러.mp3",true);
			GMusic.start();
			}
		//3번째곡
		if(count==3&&gameint==1) {
			if(GMusic!=null) {GMusic.close();}	
			if(selectedMusic!=null) {selectedMusic.close();}
			GMusic =new Music("YESorYES.mp3",true);
			GMusic.start();
			}
		if(count==3&&gameint==2) {
			if(GMusic!=null) {GMusic.close();}	
			if(selectedMusic!=null) {selectedMusic.close();}
			GMusic =new Music("YESorYES.mp3",true);
			GMusic.start();
			}
		if(count==3&&gameint==3) {
			if(GMusic!=null) {GMusic.close();}	
			if(selectedMusic!=null) {selectedMusic.close();}
			GMusic =new Music("YESorYES.mp3",true);
			GMusic.start();
			}
	
	}
}//end
