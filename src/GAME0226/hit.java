package GAME0226;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;

import javax.swing.ImageIcon;

public class hit extends Thread{
	private Image gameinfo=new ImageIcon(��Ŭ����.class.getResource("../images/gameinfo.png")).getImage();
	private Image gameLine=new ImageIcon(��Ŭ����.class.getResource("../images/gameLine.png")).getImage();
	
	private Image routeLine=new ImageIcon(��Ŭ����.class.getResource("../images/routeLine.png")).getImage();
	private Image noteST=new ImageIcon(��Ŭ����.class.getResource("../images/notebasic.png")).getImage();
	private Image gameRoute=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ.png")).getImage();
	
	private Image gameRouteS=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ.png")).getImage();
	private Image gameRouteD=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ.png")).getImage();
	private Image gameRouteF=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ.png")).getImage();
	private Image gameRouteSB=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ.png")).getImage();
	private Image gameRouteSB2=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ.png")).getImage();
	
	private Image gameRouteJ=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ.png")).getImage();
	private Image gameRouteK=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ.png")).getImage();
	private Image gameRouteL=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ.png")).getImage();
	
	
	public void screenDraw(Graphics2D g) {
		g.drawImage(gameRouteS, 228,30,null);
		g.drawImage(gameRouteD, 332,30,null);
		g.drawImage(gameRouteF, 436,30,null);
		g.drawImage(gameRouteSB, 540,30,null);
		g.drawImage(gameRouteSB2, 640,30,null);
		g.drawImage(gameRouteJ, 744,30,null);
		g.drawImage(gameRouteK, 848,30,null);
		g.drawImage(gameRouteL, 952,30,null);
		g.drawImage(gameLine, 0,540,null);	
		g.drawImage(routeLine, 224,30,null);
		g.drawImage(routeLine, 328,30,null);
		
		g.drawImage(routeLine, 224,30,null);
		g.drawImage(routeLine, 328,30,null);
		g.drawImage(routeLine, 432,30,null);
		g.drawImage(routeLine, 536,30,null);
		g.drawImage(routeLine, 740,30,null);
		g.drawImage(routeLine, 844,30,null);
		g.drawImage(routeLine, 948,30,null);
		g.drawImage(routeLine, 1052,30,null);
		g.drawImage(gameinfo, 0,680,null);
		
		g.drawImage(noteST, 228,120,null);
		g.drawImage(noteST, 332,540,null);
		g.drawImage(noteST, 436,500,null);
		g.drawImage(noteST, 540,340,null);
		g.drawImage(noteST, 640,340,null);
		g.drawImage(noteST, 744,325,null);
		g.drawImage(noteST, 848,305,null);
		g.drawImage(noteST, 952,305,null);
		g.setColor(Color.WHITE);
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g.setFont(new Font("Arial",Font.BOLD,30));
		g.drawString("Way Back Home - SHAUN", 20, 710);
		g.drawString("Easy", 1190, 710);
		g.setColor(Color.DARK_GRAY);
		g.drawString("S", 270, 570);
		g.drawString("D", 374, 570);
		g.drawString("F", 478, 570);
		g.drawString("Space Bar", 569, 570);
		g.drawString("J", 784, 570);
		g.drawString("K", 889, 570);
		g.drawString("L", 993, 570);
		g.setColor(Color.LIGHT_GRAY);			
		g.setFont(new Font("Elephant",Font.BOLD,30));
		g.drawString("00000", 565, 710);
		
	}
	// S Ű
	public void pressS() {
		gameRouteS=new ImageIcon(��Ŭ����.class.getResource("../images/EFFT.png")).getImage();
	}
	public void releaseS() {
		gameRouteS=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ.png")).getImage();
	} //S Ű ��
	
	// D Ű
	public void pressD() {
			gameRouteD=new ImageIcon(��Ŭ����.class.getResource("../images/EFFT.png")).getImage();
		}
	public void releaseD() {
			gameRouteD=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ.png")).getImage();
		} //D Ű ��
		
	// F Ű
		public void pressF() {
			gameRouteF=new ImageIcon(��Ŭ����.class.getResource("../images/EFFT.png")).getImage();
		}
		public void releaseF() {
			gameRouteF=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ.png")).getImage();
		} //FŰ ��
		
		
		// SB Ű
		public void pressSB() {
			gameRouteSB=new ImageIcon(��Ŭ����.class.getResource("../images/EFFT.png")).getImage();
			gameRouteSB2=new ImageIcon(��Ŭ����.class.getResource("../images/EFFT.png")).getImage();
			
		}
		public void releaseSB() {
			gameRouteSB=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ.png")).getImage();
			gameRouteSB2=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ.png")).getImage();
			
		} //SB Ű ��
		
		// J Ű
		public void pressJ() {
			gameRouteJ=new ImageIcon(��Ŭ����.class.getResource("../images/EFFT.png")).getImage();
		}
		public void releaseJ() {
			gameRouteJ=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ.png")).getImage();
		} //J Ű ��
		
		// K Ű
		public void pressK() {
			gameRouteK=new ImageIcon(��Ŭ����.class.getResource("../images/EFFT.png")).getImage();
		}
		public void releaseK() {
			gameRouteK=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ.png")).getImage();
		} //K Ű ��
		
		// L Ű
		public void pressL() {
			gameRouteL=new ImageIcon(��Ŭ����.class.getResource("../images/EFFT.png")).getImage();
		}
		public void releaseL() {
			gameRouteL=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ.png")).getImage();
		} //L Ű ��
		
		

		
	@Override
	public void run() {
		
	}
}
