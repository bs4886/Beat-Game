package GAME;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class hit3 extends Thread {

	private Image gameinfo=new ImageIcon(주클래스.class.getResource("../images/gameinfo.png")).getImage();
	private Image gameLine=new ImageIcon(주클래스.class.getResource("../images/gameLine.png")).getImage();
	
	private Image routeLine=new ImageIcon(주클래스.class.getResource("../images/Line.png")).getImage();
	private Image 루트라인=new ImageIcon(주클래스.class.getResource("../images/루트라인.png")).getImage();
	private Image 루트라인2=new ImageIcon(주클래스.class.getResource("../images/라인2.png")).getImage();
	private Image 루트라인ed=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	private Image 루트라인2ed=new ImageIcon(주클래스.class.getResource("../images/라인2ed.png")).getImage();

	
	
	private Image 루트라인Q=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	private Image 루트라인A=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	private Image 루트라인Z=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	private Image 루트라인W=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	private Image 루트라인S=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	private Image 루트라인X=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	private Image 루트라인E=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	private Image 루트라인D=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	private Image 루트라인C=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	private Image 루트라인R=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	private Image 루트라인F=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	private Image 루트라인V=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	private Image 루트라인T=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	private Image 루트라인G=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	private Image 루트라인B=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	private Image 루트라인Y=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	private Image 루트라인H=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	private Image 루트라인N=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	private Image 루트라인U=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	private Image 루트라인J=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	private Image 루트라인M=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	private Image 루트라인I=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	private Image 루트라인K=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	private Image 루트라인왼=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	private Image 루트라인O=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	private Image 루트라인L=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	private Image 루트라인오=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	private Image 루트라인P=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	
	
	
	
	//
	
	
	
	private Image 백건1=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();//도1
	private Image 백건2=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();//레1
	private Image 백건3=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();//미1
	private Image 백건4=new ImageIcon(주클래스.class.getResource("../images/백건첫.png")).getImage();//파1
	private Image 백건5=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();//솔1
	private Image 백건6=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();//라1
	private Image 백건7=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();//시1
	private Image 백건8=new ImageIcon(주클래스.class.getResource("../images/백건첫.png")).getImage();//도2ㅗ
	private Image 백건9=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();//레2
	private Image 백건10=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();//미2
	private Image 백건11=new ImageIcon(주클래스.class.getResource("../images/백건첫.png")).getImage();//파2
	private Image 백건12=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();//솔2
	private Image 백건13=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();//라2
	private Image 백건14=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();//시2
	private Image 백건15=new ImageIcon(주클래스.class.getResource("../images/백건첫.png")).getImage();//도3
	private Image 백건16=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();//레3
	private Image 백건17=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();//미3
	private Image 백건18=new ImageIcon(주클래스.class.getResource("../images/백건첫.png")).getImage();//파3
	private Image 백건19=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();//솔3
	private Image 백건20=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();//라3
	private Image 백건21=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();//시3
	private Image 백건22=new ImageIcon(주클래스.class.getResource("../images/백건첫.png")).getImage();//도4
	private Image 백건23=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();//레4
	private Image 백건24=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();//미4
	private Image 백건25=new ImageIcon(주클래스.class.getResource("../images/백건첫.png")).getImage();//파4
	private Image 백건26=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();//솔4
	private Image 백건27=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();//라4
	private Image 백건28=new ImageIcon(주클래스.class.getResource("../images/건반끝.png")).getImage();//시4
	private Image 백건29=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();//시4
	
	
	private Image 흑건1=new ImageIcon(주클래스.class.getResource("../images/흑건.png")).getImage();//도샾1
	private Image 흑건2=new ImageIcon(주클래스.class.getResource("../images/흑건.png")).getImage();//레샾1
	private Image 흑건3=new ImageIcon(주클래스.class.getResource("../images/흑건.png")).getImage();//파샾1
	private Image 흑건4=new ImageIcon(주클래스.class.getResource("../images/흑건.png")).getImage();//솔샾1
	private Image 흑건5=new ImageIcon(주클래스.class.getResource("../images/흑건.png")).getImage();//라샾1
	private Image 흑건6=new ImageIcon(주클래스.class.getResource("../images/흑건.png")).getImage();//도샾2
	private Image 흑건7=new ImageIcon(주클래스.class.getResource("../images/흑건.png")).getImage();//레샾2
	private Image 흑건8=new ImageIcon(주클래스.class.getResource("../images/흑건.png")).getImage();//파샾2
	private Image 흑건9=new ImageIcon(주클래스.class.getResource("../images/흑건.png")).getImage();//솔샾2
	private Image 흑건10=new ImageIcon(주클래스.class.getResource("../images/흑건.png")).getImage();//라샾2
	private Image 흑건11=new ImageIcon(주클래스.class.getResource("../images/흑건.png")).getImage();//도샾3
	private Image 흑건12=new ImageIcon(주클래스.class.getResource("../images/흑건.png")).getImage();//레샾3
	private Image 흑건13=new ImageIcon(주클래스.class.getResource("../images/흑건.png")).getImage();//파샾3
	private Image 흑건14=new ImageIcon(주클래스.class.getResource("../images/흑건.png")).getImage();//솔샾3
	private Image 흑건15=new ImageIcon(주클래스.class.getResource("../images/흑건.png")).getImage();//라샾3
	private Image 흑건16=new ImageIcon(주클래스.class.getResource("../images/흑건.png")).getImage();//도샾4
	private Image 흑건17=new ImageIcon(주클래스.class.getResource("../images/흑건.png")).getImage();//레샾4
	private Image 흑건18=new ImageIcon(주클래스.class.getResource("../images/흑건.png")).getImage();//파샾4
	private Image 흑건19=new ImageIcon(주클래스.class.getResource("../images/흑건.png")).getImage();//솔샾
	

	ArrayList<Note3> noteList3=new ArrayList<Note3>();
	
	public hit3() {
	
	}
	public void screenDraw3(Graphics2D g) {
		g.drawImage(gameLine, 0,540,null);	
		
		g.drawImage(루트라인Q, 107,30,null);	//
		g.drawImage(루트라인2ed, 133,30,null);
		g.drawImage(루트라인A, 156,30,null);	//
		g.drawImage(루트라인2ed, 177,30,null);
		g.drawImage(루트라인Z, 203,30,null);    //
		
		g.drawImage(루트라인W, 231,30,null);	
		g.drawImage(루트라인2ed, 257,30,null);	//
		g.drawImage(루트라인S, 282,30,null);	
		g.drawImage(루트라인2ed, 304,30,null);	//
		g.drawImage(루트라인X, 329,30,null);
		g.drawImage(루트라인2ed, 352,30,null);	//
		g.drawImage(루트라인E, 380,30,null);
		
		g.drawImage(루트라인D, 404,30,null);	
		g.drawImage(루트라인2ed, 429,30,null);	//
		g.drawImage(루트라인C, 453,30,null);	
		g.drawImage(루트라인2ed, 478,30,null);  //
		g.drawImage(루트라인R, 504,30,null);   
		
		g.drawImage(루트라인F, 529,30,null);	
		g.drawImage(루트라인2ed, 554,30,null);   //
		g.drawImage(루트라인V, 577,30,null);	
		g.drawImage(루트라인2ed, 600,30,null);   //
		g.drawImage(루트라인T, 624,30,null);
		g.drawImage(루트라인2ed, 647,30,null);	//
		g.drawImage(루트라인G, 675,30,null);
		
		g.drawImage(루트라인B, 700,30,null);	//
		g.drawImage(루트라인2ed, 724,30,null);
		g.drawImage(루트라인Y, 748,30,null);	//
		g.drawImage(루트라인2ed, 772,30,null);
		g.drawImage(루트라인H, 799,30,null);  
		
		g.drawImage(루트라인N, 824,30,null);	//
		g.drawImage(루트라인2ed, 848,30,null);
		g.drawImage(루트라인U, 872,30,null);	//
		g.drawImage(루트라인2ed, 896,30,null);
		g.drawImage(루트라인J, 919,30,null);
		g.drawImage(루트라인2ed, 942,30,null);	//
		g.drawImage(루트라인M, 970,30,null);
		
		g.drawImage(루트라인I, 994,30,null);	//
		g.drawImage(루트라인2ed, 1018,30,null);
		g.drawImage(루트라인K, 1042,30,null);	//
		g.drawImage(루트라인2ed, 1068,30,null);
		g.drawImage(루트라인왼, 1096,30,null);  
		
		g.drawImage(루트라인O, 1119,30,null);	//
		g.drawImage(루트라인2ed, 1144,30,null);
		g.drawImage(루트라인L, 1168,30,null);	//
		g.drawImage(루트라인2ed, 1189,30,null);
		g.drawImage(루트라인오, 1214,30,null);  
		g.drawImage(루트라인2ed, 1236,30,null);
		g.drawImage(루트라인P, 1260,30,null);  
		
		g.drawImage(routeLine, 106,30,null);	
		g.drawImage(routeLine, 132,30,null);	
		g.drawImage(routeLine, 155,30,null);	
		g.drawImage(routeLine, 177,30,null);	
		g.drawImage(routeLine, 202,30,null);	
		g.drawImage(routeLine, 227,30,null);	
		
		g.drawImage(routeLine, 256,30,null);	
		g.drawImage(routeLine, 282,30,null);	
		g.drawImage(routeLine, 304,30,null);	
		g.drawImage(routeLine, 328,30,null);	
		g.drawImage(routeLine, 350,30,null);	
		g.drawImage(routeLine, 377,30,null);	
		g.drawImage(routeLine, 404,30,null);
		
		g.drawImage(routeLine, 429,30,null);	
		g.drawImage(routeLine, 453,30,null);	
		g.drawImage(routeLine, 476,30,null);	
		g.drawImage(routeLine, 500,30,null);	
		g.drawImage(routeLine, 529,30,null);
		
		g.drawImage(routeLine, 554,30,null);	
		g.drawImage(routeLine, 577,30,null);	
		g.drawImage(routeLine, 600,30,null);	
		g.drawImage(routeLine, 624,30,null);	
		g.drawImage(routeLine, 646,30,null);	
		g.drawImage(routeLine, 672,30,null);	
		g.drawImage(routeLine, 700,30,null);	
		
		g.drawImage(routeLine, 724,30,null);	
		g.drawImage(routeLine, 748,30,null);	
		g.drawImage(routeLine, 770,30,null);	
		g.drawImage(routeLine, 796,30,null);	
		g.drawImage(routeLine, 824,30,null);	
		
		g.drawImage(routeLine, 848,30,null);	
		g.drawImage(routeLine, 872,30,null);	
		g.drawImage(routeLine, 894,30,null);	
		g.drawImage(routeLine, 918,30,null);	
		g.drawImage(routeLine, 940,30,null);	
		g.drawImage(routeLine, 966,30,null);	
		g.drawImage(routeLine, 994,30,null);//
		
		g.drawImage(routeLine, 1018,30,null);	
		g.drawImage(routeLine, 1042,30,null);	
		g.drawImage(routeLine, 1066,30,null);	
		g.drawImage(routeLine, 1092,30,null);	
		g.drawImage(routeLine, 1119,30,null);
		
		g.drawImage(routeLine, 1144,30,null);	
		g.drawImage(routeLine, 1168,30,null);	
		g.drawImage(routeLine, 1189,30,null);	
		g.drawImage(routeLine, 1214,30,null);	
		g.drawImage(routeLine, 1236,30,null);	
		g.drawImage(routeLine, 1258,30,null);	
		
		
		
		g.drawImage(백건1, 110,580,null);	
		g.drawImage(백건2, 135,580,null);	//25
		g.drawImage(백건3, 180,580,null);	//45
		g.drawImage(백건4, 225,580,null);	//45
		g.drawImage(백건5, 270,580,null);	//45
		g.drawImage(백건6, 315,580,null);	//45
		g.drawImage(백건7, 360,580,null);	//45
		g.drawImage(백건8, 405,580,null);	//45
		g.drawImage(백건9	, 450,580,null);//45
		g.drawImage(백건10, 495,580,null);//45	
		g.drawImage(백건11, 530,580,null);//45
		g.drawImage(백건12, 575,580,null);//45
		g.drawImage(백건13, 620,580,null);//45
		g.drawImage(백건14, 665,580,null);	//45
		g.drawImage(백건15, 700,580,null);	//35
		g.drawImage(백건16, 745,580,null);	//45
		g.drawImage(백건17, 790,580,null);	//45
		g.drawImage(백건18, 825,580,null);	//35
		g.drawImage(백건19, 870,580,null);	//45
		g.drawImage(백건20, 915,580,null);	//45
		g.drawImage(백건21, 960,580,null);	//45
		g.drawImage(백건22, 995,580,null);	//35
		g.drawImage(백건23, 1040,580,null);	//45
		g.drawImage(백건24, 1075,580,null);//35
		g.drawImage(백건25, 1120,580,null);	//45
		g.drawImage(백건26, 1165,580,null);	//45
		g.drawImage(백건27, 1210,580,null);	//45
		g.drawImage(백건28, 1255,580,null);	//45
	
		
		g.drawImage(흑건1, 135,580,null);	
		g.drawImage(흑건2, 175,580,null); //40	
		g.drawImage(흑건3, 260,580,null);	//80
		g.drawImage(흑건4, 305,580,null);	//45
		g.drawImage(흑건5, 350,580,null);//45
		g.drawImage(흑건6, 430,580,null);	//80
		g.drawImage(흑건6, 475,580,null);	//45
		g.drawImage(흑건7, 555,580,null);	//80
		g.drawImage(흑건8, 600,580,null);	//45
		g.drawImage(흑건9, 645,580,null);	//45
		g.drawImage(흑건10, 725,580,null);//80
		g.drawImage(흑건11, 770,580,null);//45
		g.drawImage(흑건12, 850,580,null);//80
		g.drawImage(흑건13, 895,580,null);//45/
		g.drawImage(흑건14, 940,580,null);//45
		g.drawImage(흑건15, 1020,580,null);//80
		g.drawImage(흑건16, 1065,580,null);//45
		g.drawImage(흑건17, 1145,580,null);//80
		g.drawImage(흑건18, 1190,580,null);//45
		g.drawImage(흑건19, 1235,580,null);//45
		
		
		for(int i=0; i<noteList3.size();i++) {
			Note3 note3=noteList3.get(i);
			note3.screenDraw(g);
		}
		
		g.drawImage(gameinfo, 0,680,null);
		g.setColor(Color.WHITE);
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g.setFont(new Font("Arial",Font.BOLD,20));
		g.drawString("Way Back Home - SHAUN", 20, 710);
		g.drawString("Easy", 1190, 710);
		g.setColor(Color.DARK_GRAY);
		g.drawString("Q", 113, 570);
		g.drawString("A", 163, 570);		
		g.drawString("Z", 213, 570);	
		g.drawString("W", 235, 570);	
		g.drawString("S", 288, 570);		
		g.drawString("X", 336, 570);		
		g.drawString("E", 388, 570);		
		g.drawString("D", 413, 570);		
		g.drawString("C", 459, 570);		
		g.drawString("R", 510, 570);	
		g.drawString("F", 538, 570);		
		g.drawString("V", 584, 570);		
		g.drawString("T", 632, 570);		
		g.drawString("G", 679, 570);		
		g.drawString("B", 707, 570);
		g.drawString("Y", 757, 570);
		g.drawString("H", 805, 570);
		g.drawString("N", 832, 570);
		g.drawString("U", 877, 570);
		g.drawString("J", 925, 570);
		g.drawString("M", 972, 570);
		g.drawString("I", 1007, 570);
		g.drawString("K", 1052, 570);
		g.drawString("<", 1102, 570);
		g.drawString("O", 1127, 570);
		g.drawString("L", 1177, 570);
		g.drawString(">", 1222, 570);
		g.drawString("P", 1266, 570);

		
		
		g.setColor(Color.LIGHT_GRAY);			
		g.setFont(new Font("Elephant",Font.BOLD,30));
		g.drawString("00000", 565, 710);
	}
	public void pressQ() {
		백건1=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인Q=new ImageIcon(주클래스.class.getResource("../images/루트라인.png")).getImage();
	}
	public void releaseQ() {
		//백건1=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인Q=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
		
	} //Q 키 끝
	public void pressA() {
		//백건2=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인A=new ImageIcon(주클래스.class.getResource("../images/루트라인.png")).getImage();
	}
	public void releaseA() {
		//백건2=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인A=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	} //Q 키 끝
	public void pressZ() {
		//백건3=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인Z=new ImageIcon(주클래스.class.getResource("../images/루트라인.png")).getImage();
	}
	public void releaseZ() {
		//백건3=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인Z=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	} //Q 키 끝
	public void pressW() {
		//백건4=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인W=new ImageIcon(주클래스.class.getResource("../images/루트라인.png")).getImage();
	}
	public void releaseW() {
		//백건4=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인W=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	} //Q 키 끝
	public void pressS() {
		//백건5=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인S=new ImageIcon(주클래스.class.getResource("../images/루트라인.png")).getImage();
	}
	public void releaseS() {
		//백건5=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인S=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	} //Q 키 끝
	public void pressX() {
		//백건6=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인X=new ImageIcon(주클래스.class.getResource("../images/루트라인.png")).getImage();
	}
	public void releaseX() {
		//백건6=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인X=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	}///키보드 순서확인할것!
	public void pressE() {
		//백건7=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인E=new ImageIcon(주클래스.class.getResource("../images/루트라인.png")).getImage();
	}
	public void releaseE() {
		//백건7=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인E=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	} //Q 키 끝
	public void pressD() {
		//백건8=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인D=new ImageIcon(주클래스.class.getResource("../images/루트라인.png")).getImage();
	}
	public void releaseD() {
		//백건8=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인D=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	}///키보드 순서확인할것	
	public void pressC() {
		//백건9=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인C=new ImageIcon(주클래스.class.getResource("../images/루트라인.png")).getImage();
	}
	public void releaseC() {
		//백건9=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인C=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	} //Q 키 끝
	public void pressR() {
		//백건10=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인R=new ImageIcon(주클래스.class.getResource("../images/루트라인.png")).getImage();
	}
	public void releaseR() {
		//백건10=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인R=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	} //Q 키 끝
	public void pressF() {
		//백건11=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인F=new ImageIcon(주클래스.class.getResource("../images/루트라인.png")).getImage();
	}
	public void releaseF() {
		//백건11=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인F=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	} //Q 키 끝
	public void pressV() {
		//백건12=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인V=new ImageIcon(주클래스.class.getResource("../images/루트라인.png")).getImage();
	}
	public void releaseV() {
		//백건12=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인V=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	} //Q 키 끝
	public void pressT() {
		//백건13=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인T=new ImageIcon(주클래스.class.getResource("../images/루트라인.png")).getImage();
	}
	public void releaseT() {
		//백건13=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인T=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	} //Q 키 끝
	public void pressG() {
		//백건14=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인G=new ImageIcon(주클래스.class.getResource("../images/루트라인.png")).getImage();
	}
	public void releaseG() {
		//백건14=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인G=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	} //Q 키 끝
	public void pressB() {
		//백건15=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인B=new ImageIcon(주클래스.class.getResource("../images/루트라인.png")).getImage();
	}
	public void releaseB() {
		//백건15=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인B=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	} //Q 키 끝
	public void pressY() {
		//백건16=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인Y=new ImageIcon(주클래스.class.getResource("../images/루트라인.png")).getImage();
	}
	public void releaseY() {
		//백건16=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인Y=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	} //Q 키 끝
	public void pressH() {
		//백건17=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인H=new ImageIcon(주클래스.class.getResource("../images/루트라인.png")).getImage();
	}
	public void releaseH() {
		//백건17=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인H=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	} //Q 키 끝
	public void pressN() {
		//백건18=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인N=new ImageIcon(주클래스.class.getResource("../images/루트라인.png")).getImage();
	}
	public void releaseN() {
		//백건18=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인N=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	} //Q 키 끝
	public void pressU() {
		//백건19=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인U=new ImageIcon(주클래스.class.getResource("../images/루트라인.png")).getImage();
	}
	public void releaseU() {
		//백건19=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인U=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	} //Q 키 끝
	public void pressJ() {
		//백건20=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인J=new ImageIcon(주클래스.class.getResource("../images/루트라인.png")).getImage();
	}
	public void releaseJ() {
		//백건20=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인J=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	} //Q 키 끝
	public void pressM() {
		//백건21=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인M=new ImageIcon(주클래스.class.getResource("../images/루트라인.png")).getImage();
	}
	public void releaseM() {
		//백건21=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인M=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	} //Q 키 끝
	public void pressI() {
		//백건22=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인I=new ImageIcon(주클래스.class.getResource("../images/루트라인.png")).getImage();
	}
	public void releaseI() {
		//백건22=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인I=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	} //Q 키 끝
	public void pressK() {
		//백건23=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인K=new ImageIcon(주클래스.class.getResource("../images/루트라인.png")).getImage();
	}
	public void releaseK() {
		//백건24=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인K=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	} //Q 키 끝
	public void press왼쪽() {
		//백건25=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인왼=new ImageIcon(주클래스.class.getResource("../images/루트라인.png")).getImage();
	}
	public void release왼쪽() {
		//백건25=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인왼=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	} //Q 키 끝
	public void pressO() {
		//백건26=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인O=new ImageIcon(주클래스.class.getResource("../images/루트라인.png")).getImage();
	}
	public void releaseO() {
		//백건26=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인O=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	} //Q 키 끝
	public void pressL() {
		//백건27=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인L=new ImageIcon(주클래스.class.getResource("../images/루트라인.png")).getImage();
	}
	public void releaseL() {
		//백건27=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인L=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	} //Q 키 끝
	public void press오른() {
		//백건28=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인오=new ImageIcon(주클래스.class.getResource("../images/루트라인.png")).getImage();
	}
	public void release오른() {
		//백건28=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인오=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	} //Q 키 끝
	public void pressP() {
		//백건29=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인P=new ImageIcon(주클래스.class.getResource("../images/루트라인.png")).getImage();
	}
	public void releaseP() {
		//백건29=new ImageIcon(주클래스.class.getResource("../images/백건.png")).getImage();
		루트라인P=new ImageIcon(주클래스.class.getResource("../images/라인ed.png")).getImage();
	} //Q 키 끝
	
	@Override
	public void run() {
		
	}
	public void dropNotes() {
	
		Note3 note100 =new Note3(799,-600,"H");//미
		Note3 note101 =new Note3(700,-600,"B");//도
		//Note3 note102 =new Note3(107,-600,"Long");//도
		//Note3 note103 =new Note3(404,-600,"Long");//도
		
		Note3 note104 =new Note3(970,-1050,"M");//시
		Note3 note105 =new Note3(872,-1050,"U");//솔
		//Note3 note106 =new Note3(156,-1050,"Long");//레
		//Note3 note107 =new Note3(282,-1050,"Long");//솔
		
		Note3 note108 =new Note3(700,-1500,"B");//도
		Note3 note109 =new Note3(919,-1500,"J");//라
		//Note3 note110 =new Note3(203,-1500,"Long");//미
		//Note3 note111 =new Note3(329,-1500,"Long");//라
		
		Note3 note112 =new Note3(675,-1950,"G");//시
		Note3 note113 =new Note3(872,-1950,"U");//솔
		//Note3 note114 =new Note3(504,-1950,"Long");//미
		//Note3 note115 =new Note3(203,-1950,"Long");//미
		
		Note3 note116 =new Note3(919,-2400,"J");//시
		Note3 note117 =new Note3(824,-2400,"N");//솔
	
		Note3 note118 =new Note3(994,-2850,"I");//시
		Note3 note119 =new Note3(875,-2850,"U");//솔
		
		Note3 note120 =new Note3(919,-3300,"J");//시
		Note3 note121 =new Note3(824,-3300,"N");//솔
		
		Note3 note122 =new Note3(970,-3750,"M");//시
		Note3 note123 =new Note3(872,-3750,"U");//솔
		
		
		Note3 note124 =new Note3(1096,-4200,"왼");//시
		Note3 note125 =new Note3(994,-4200,"I");//시
		Note3 note126 =new Note3(872,-4200,"U");//솔
		
		
		noteList3.add(note100);
		noteList3.add(note101);
		//noteList3.add(note102);
		//noteList3.add(note103);
		noteList3.add(note104);
		noteList3.add(note105);
		//noteList3.add(note106);
		//noteList3.add(note107);
		noteList3.add(note108);
		noteList3.add(note109);
		//noteList3.add(note110);
		//noteList3.add(note111);
		noteList3.add(note112);
		noteList3.add(note113);
		
		//noteList3.add(note114);
		//noteList3.add(note115);
		noteList3.add(note116);
		noteList3.add(note117);
		noteList3.add(note118);
		noteList3.add(note119);
		noteList3.add(note120);
		noteList3.add(note121);
		noteList3.add(note122);
		noteList3.add(note123);
		noteList3.add(note124);
		noteList3.add(note125);
		noteList3.add(note126);
		
		
			
			note100.start();
			note101.start();
			//note102.start();
			//note103.start();
			note104.start();
			note105.start();
			//note106.start();
			//note107.start();
			note108.start();
			note109.start();
			//note110.start();
			//note111.start();
			note112.start();
			note113.start();
			//note114.start();
		
			
			
			note116.start();
			note117.start();
			note118.start();
			note119.start();
			note120.start();
			note121.start();
			note122.start();
			note123.start();
			note124.start();
			note125.start();
			note126.start();
	
			
		
			
			
		
	}
}
