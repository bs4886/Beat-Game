package GAME;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class hit3 extends Thread {

	private Image gameinfo=new ImageIcon(��Ŭ����.class.getResource("../images/gameinfo.png")).getImage();
	private Image gameLine=new ImageIcon(��Ŭ����.class.getResource("../images/gameLine.png")).getImage();
	
	private Image routeLine=new ImageIcon(��Ŭ����.class.getResource("../images/Line.png")).getImage();
	private Image ��Ʈ����=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ����.png")).getImage();
	private Image ��Ʈ����2=new ImageIcon(��Ŭ����.class.getResource("../images/����2.png")).getImage();
	private Image ��Ʈ����ed=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	private Image ��Ʈ����2ed=new ImageIcon(��Ŭ����.class.getResource("../images/����2ed.png")).getImage();

	
	
	private Image ��Ʈ����Q=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	private Image ��Ʈ����A=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	private Image ��Ʈ����Z=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	private Image ��Ʈ����W=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	private Image ��Ʈ����S=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	private Image ��Ʈ����X=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	private Image ��Ʈ����E=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	private Image ��Ʈ����D=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	private Image ��Ʈ����C=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	private Image ��Ʈ����R=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	private Image ��Ʈ����F=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	private Image ��Ʈ����V=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	private Image ��Ʈ����T=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	private Image ��Ʈ����G=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	private Image ��Ʈ����B=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	private Image ��Ʈ����Y=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	private Image ��Ʈ����H=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	private Image ��Ʈ����N=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	private Image ��Ʈ����U=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	private Image ��Ʈ����J=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	private Image ��Ʈ����M=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	private Image ��Ʈ����I=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	private Image ��Ʈ����K=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	private Image ��Ʈ���ο�=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	private Image ��Ʈ����O=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	private Image ��Ʈ����L=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	private Image ��Ʈ���ο�=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	private Image ��Ʈ����P=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	
	
	
	
	//
	
	
	
	private Image ���1=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();//��1
	private Image ���2=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();//��1
	private Image ���3=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();//��1
	private Image ���4=new ImageIcon(��Ŭ����.class.getResource("../images/���ù.png")).getImage();//��1
	private Image ���5=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();//��1
	private Image ���6=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();//��1
	private Image ���7=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();//��1
	private Image ���8=new ImageIcon(��Ŭ����.class.getResource("../images/���ù.png")).getImage();//��2��
	private Image ���9=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();//��2
	private Image ���10=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();//��2
	private Image ���11=new ImageIcon(��Ŭ����.class.getResource("../images/���ù.png")).getImage();//��2
	private Image ���12=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();//��2
	private Image ���13=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();//��2
	private Image ���14=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();//��2
	private Image ���15=new ImageIcon(��Ŭ����.class.getResource("../images/���ù.png")).getImage();//��3
	private Image ���16=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();//��3
	private Image ���17=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();//��3
	private Image ���18=new ImageIcon(��Ŭ����.class.getResource("../images/���ù.png")).getImage();//��3
	private Image ���19=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();//��3
	private Image ���20=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();//��3
	private Image ���21=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();//��3
	private Image ���22=new ImageIcon(��Ŭ����.class.getResource("../images/���ù.png")).getImage();//��4
	private Image ���23=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();//��4
	private Image ���24=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();//��4
	private Image ���25=new ImageIcon(��Ŭ����.class.getResource("../images/���ù.png")).getImage();//��4
	private Image ���26=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();//��4
	private Image ���27=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();//��4
	private Image ���28=new ImageIcon(��Ŭ����.class.getResource("../images/�ǹݳ�.png")).getImage();//��4
	private Image ���29=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();//��4
	
	
	private Image ���1=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();//����1
	private Image ���2=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();//����1
	private Image ���3=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();//�Ę�1
	private Image ���4=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();//�֘�1
	private Image ���5=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();//���1
	private Image ���6=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();//����2
	private Image ���7=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();//����2
	private Image ���8=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();//�Ę�2
	private Image ���9=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();//�֘�2
	private Image ���10=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();//���2
	private Image ���11=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();//����3
	private Image ���12=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();//����3
	private Image ���13=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();//�Ę�3
	private Image ���14=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();//�֘�3
	private Image ���15=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();//���3
	private Image ���16=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();//����4
	private Image ���17=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();//����4
	private Image ���18=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();//�Ę�4
	private Image ���19=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();//�֘�
	

	ArrayList<Note3> noteList3=new ArrayList<Note3>();
	
	public hit3() {
	
	}
	public void screenDraw3(Graphics2D g) {
		g.drawImage(gameLine, 0,540,null);	
		
		g.drawImage(��Ʈ����Q, 107,30,null);	//
		g.drawImage(��Ʈ����2ed, 133,30,null);
		g.drawImage(��Ʈ����A, 156,30,null);	//
		g.drawImage(��Ʈ����2ed, 177,30,null);
		g.drawImage(��Ʈ����Z, 203,30,null);    //
		
		g.drawImage(��Ʈ����W, 231,30,null);	
		g.drawImage(��Ʈ����2ed, 257,30,null);	//
		g.drawImage(��Ʈ����S, 282,30,null);	
		g.drawImage(��Ʈ����2ed, 304,30,null);	//
		g.drawImage(��Ʈ����X, 329,30,null);
		g.drawImage(��Ʈ����2ed, 352,30,null);	//
		g.drawImage(��Ʈ����E, 380,30,null);
		
		g.drawImage(��Ʈ����D, 404,30,null);	
		g.drawImage(��Ʈ����2ed, 429,30,null);	//
		g.drawImage(��Ʈ����C, 453,30,null);	
		g.drawImage(��Ʈ����2ed, 478,30,null);  //
		g.drawImage(��Ʈ����R, 504,30,null);   
		
		g.drawImage(��Ʈ����F, 529,30,null);	
		g.drawImage(��Ʈ����2ed, 554,30,null);   //
		g.drawImage(��Ʈ����V, 577,30,null);	
		g.drawImage(��Ʈ����2ed, 600,30,null);   //
		g.drawImage(��Ʈ����T, 624,30,null);
		g.drawImage(��Ʈ����2ed, 647,30,null);	//
		g.drawImage(��Ʈ����G, 675,30,null);
		
		g.drawImage(��Ʈ����B, 700,30,null);	//
		g.drawImage(��Ʈ����2ed, 724,30,null);
		g.drawImage(��Ʈ����Y, 748,30,null);	//
		g.drawImage(��Ʈ����2ed, 772,30,null);
		g.drawImage(��Ʈ����H, 799,30,null);  
		
		g.drawImage(��Ʈ����N, 824,30,null);	//
		g.drawImage(��Ʈ����2ed, 848,30,null);
		g.drawImage(��Ʈ����U, 872,30,null);	//
		g.drawImage(��Ʈ����2ed, 896,30,null);
		g.drawImage(��Ʈ����J, 919,30,null);
		g.drawImage(��Ʈ����2ed, 942,30,null);	//
		g.drawImage(��Ʈ����M, 970,30,null);
		
		g.drawImage(��Ʈ����I, 994,30,null);	//
		g.drawImage(��Ʈ����2ed, 1018,30,null);
		g.drawImage(��Ʈ����K, 1042,30,null);	//
		g.drawImage(��Ʈ����2ed, 1068,30,null);
		g.drawImage(��Ʈ���ο�, 1096,30,null);  
		
		g.drawImage(��Ʈ����O, 1119,30,null);	//
		g.drawImage(��Ʈ����2ed, 1144,30,null);
		g.drawImage(��Ʈ����L, 1168,30,null);	//
		g.drawImage(��Ʈ����2ed, 1189,30,null);
		g.drawImage(��Ʈ���ο�, 1214,30,null);  
		g.drawImage(��Ʈ����2ed, 1236,30,null);
		g.drawImage(��Ʈ����P, 1260,30,null);  
		
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
		
		
		
		g.drawImage(���1, 110,580,null);	
		g.drawImage(���2, 135,580,null);	//25
		g.drawImage(���3, 180,580,null);	//45
		g.drawImage(���4, 225,580,null);	//45
		g.drawImage(���5, 270,580,null);	//45
		g.drawImage(���6, 315,580,null);	//45
		g.drawImage(���7, 360,580,null);	//45
		g.drawImage(���8, 405,580,null);	//45
		g.drawImage(���9	, 450,580,null);//45
		g.drawImage(���10, 495,580,null);//45	
		g.drawImage(���11, 530,580,null);//45
		g.drawImage(���12, 575,580,null);//45
		g.drawImage(���13, 620,580,null);//45
		g.drawImage(���14, 665,580,null);	//45
		g.drawImage(���15, 700,580,null);	//35
		g.drawImage(���16, 745,580,null);	//45
		g.drawImage(���17, 790,580,null);	//45
		g.drawImage(���18, 825,580,null);	//35
		g.drawImage(���19, 870,580,null);	//45
		g.drawImage(���20, 915,580,null);	//45
		g.drawImage(���21, 960,580,null);	//45
		g.drawImage(���22, 995,580,null);	//35
		g.drawImage(���23, 1040,580,null);	//45
		g.drawImage(���24, 1075,580,null);//35
		g.drawImage(���25, 1120,580,null);	//45
		g.drawImage(���26, 1165,580,null);	//45
		g.drawImage(���27, 1210,580,null);	//45
		g.drawImage(���28, 1255,580,null);	//45
	
		
		g.drawImage(���1, 135,580,null);	
		g.drawImage(���2, 175,580,null); //40	
		g.drawImage(���3, 260,580,null);	//80
		g.drawImage(���4, 305,580,null);	//45
		g.drawImage(���5, 350,580,null);//45
		g.drawImage(���6, 430,580,null);	//80
		g.drawImage(���6, 475,580,null);	//45
		g.drawImage(���7, 555,580,null);	//80
		g.drawImage(���8, 600,580,null);	//45
		g.drawImage(���9, 645,580,null);	//45
		g.drawImage(���10, 725,580,null);//80
		g.drawImage(���11, 770,580,null);//45
		g.drawImage(���12, 850,580,null);//80
		g.drawImage(���13, 895,580,null);//45/
		g.drawImage(���14, 940,580,null);//45
		g.drawImage(���15, 1020,580,null);//80
		g.drawImage(���16, 1065,580,null);//45
		g.drawImage(���17, 1145,580,null);//80
		g.drawImage(���18, 1190,580,null);//45
		g.drawImage(���19, 1235,580,null);//45
		
		
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
		���1=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����Q=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ����.png")).getImage();
	}
	public void releaseQ() {
		//���1=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����Q=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
		
	} //Q Ű ��
	public void pressA() {
		//���2=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����A=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ����.png")).getImage();
	}
	public void releaseA() {
		//���2=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����A=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	} //Q Ű ��
	public void pressZ() {
		//���3=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����Z=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ����.png")).getImage();
	}
	public void releaseZ() {
		//���3=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����Z=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	} //Q Ű ��
	public void pressW() {
		//���4=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����W=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ����.png")).getImage();
	}
	public void releaseW() {
		//���4=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����W=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	} //Q Ű ��
	public void pressS() {
		//���5=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����S=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ����.png")).getImage();
	}
	public void releaseS() {
		//���5=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����S=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	} //Q Ű ��
	public void pressX() {
		//���6=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����X=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ����.png")).getImage();
	}
	public void releaseX() {
		//���6=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����X=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	}///Ű���� ����Ȯ���Ұ�!
	public void pressE() {
		//���7=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����E=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ����.png")).getImage();
	}
	public void releaseE() {
		//���7=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����E=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	} //Q Ű ��
	public void pressD() {
		//���8=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����D=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ����.png")).getImage();
	}
	public void releaseD() {
		//���8=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����D=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	}///Ű���� ����Ȯ���Ұ�	
	public void pressC() {
		//���9=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����C=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ����.png")).getImage();
	}
	public void releaseC() {
		//���9=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����C=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	} //Q Ű ��
	public void pressR() {
		//���10=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����R=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ����.png")).getImage();
	}
	public void releaseR() {
		//���10=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����R=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	} //Q Ű ��
	public void pressF() {
		//���11=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����F=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ����.png")).getImage();
	}
	public void releaseF() {
		//���11=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����F=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	} //Q Ű ��
	public void pressV() {
		//���12=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����V=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ����.png")).getImage();
	}
	public void releaseV() {
		//���12=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����V=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	} //Q Ű ��
	public void pressT() {
		//���13=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����T=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ����.png")).getImage();
	}
	public void releaseT() {
		//���13=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����T=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	} //Q Ű ��
	public void pressG() {
		//���14=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����G=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ����.png")).getImage();
	}
	public void releaseG() {
		//���14=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����G=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	} //Q Ű ��
	public void pressB() {
		//���15=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����B=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ����.png")).getImage();
	}
	public void releaseB() {
		//���15=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����B=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	} //Q Ű ��
	public void pressY() {
		//���16=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����Y=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ����.png")).getImage();
	}
	public void releaseY() {
		//���16=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����Y=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	} //Q Ű ��
	public void pressH() {
		//���17=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����H=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ����.png")).getImage();
	}
	public void releaseH() {
		//���17=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����H=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	} //Q Ű ��
	public void pressN() {
		//���18=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����N=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ����.png")).getImage();
	}
	public void releaseN() {
		//���18=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����N=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	} //Q Ű ��
	public void pressU() {
		//���19=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����U=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ����.png")).getImage();
	}
	public void releaseU() {
		//���19=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����U=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	} //Q Ű ��
	public void pressJ() {
		//���20=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����J=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ����.png")).getImage();
	}
	public void releaseJ() {
		//���20=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����J=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	} //Q Ű ��
	public void pressM() {
		//���21=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����M=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ����.png")).getImage();
	}
	public void releaseM() {
		//���21=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����M=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	} //Q Ű ��
	public void pressI() {
		//���22=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����I=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ����.png")).getImage();
	}
	public void releaseI() {
		//���22=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����I=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	} //Q Ű ��
	public void pressK() {
		//���23=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����K=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ����.png")).getImage();
	}
	public void releaseK() {
		//���24=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����K=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	} //Q Ű ��
	public void press����() {
		//���25=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ���ο�=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ����.png")).getImage();
	}
	public void release����() {
		//���25=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ���ο�=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	} //Q Ű ��
	public void pressO() {
		//���26=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����O=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ����.png")).getImage();
	}
	public void releaseO() {
		//���26=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����O=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	} //Q Ű ��
	public void pressL() {
		//���27=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����L=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ����.png")).getImage();
	}
	public void releaseL() {
		//���27=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����L=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	} //Q Ű ��
	public void press����() {
		//���28=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ���ο�=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ����.png")).getImage();
	}
	public void release����() {
		//���28=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ���ο�=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	} //Q Ű ��
	public void pressP() {
		//���29=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����P=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ����.png")).getImage();
	}
	public void releaseP() {
		//���29=new ImageIcon(��Ŭ����.class.getResource("../images/���.png")).getImage();
		��Ʈ����P=new ImageIcon(��Ŭ����.class.getResource("../images/����ed.png")).getImage();
	} //Q Ű ��
	
	@Override
	public void run() {
		
	}
	public void dropNotes() {
	
		Note3 note100 =new Note3(799,-600,"H");//��
		Note3 note101 =new Note3(700,-600,"B");//��
		//Note3 note102 =new Note3(107,-600,"Long");//��
		//Note3 note103 =new Note3(404,-600,"Long");//��
		
		Note3 note104 =new Note3(970,-1050,"M");//��
		Note3 note105 =new Note3(872,-1050,"U");//��
		//Note3 note106 =new Note3(156,-1050,"Long");//��
		//Note3 note107 =new Note3(282,-1050,"Long");//��
		
		Note3 note108 =new Note3(700,-1500,"B");//��
		Note3 note109 =new Note3(919,-1500,"J");//��
		//Note3 note110 =new Note3(203,-1500,"Long");//��
		//Note3 note111 =new Note3(329,-1500,"Long");//��
		
		Note3 note112 =new Note3(675,-1950,"G");//��
		Note3 note113 =new Note3(872,-1950,"U");//��
		//Note3 note114 =new Note3(504,-1950,"Long");//��
		//Note3 note115 =new Note3(203,-1950,"Long");//��
		
		Note3 note116 =new Note3(919,-2400,"J");//��
		Note3 note117 =new Note3(824,-2400,"N");//��
	
		Note3 note118 =new Note3(994,-2850,"I");//��
		Note3 note119 =new Note3(875,-2850,"U");//��
		
		Note3 note120 =new Note3(919,-3300,"J");//��
		Note3 note121 =new Note3(824,-3300,"N");//��
		
		Note3 note122 =new Note3(970,-3750,"M");//��
		Note3 note123 =new Note3(872,-3750,"U");//��
		
		
		Note3 note124 =new Note3(1096,-4200,"��");//��
		Note3 note125 =new Note3(994,-4200,"I");//��
		Note3 note126 =new Note3(872,-4200,"U");//��
		
		
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
