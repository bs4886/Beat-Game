package GAME;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Note3 extends Thread{
	Game g3;
	private Image notebasic=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ��.png")).getImage();
	private Image notebasic2=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ��.png")).getImage();
	
	private Image ��ƮQ=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ��Q.png")).getImage();
	private Image ��ƮA=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ��A.png")).getImage();
	private Image ��ƮZ=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ��Z.png")).getImage();
	private Image ��ƮW=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ��W.png")).getImage();
	private Image ��ƮS=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ��S.png")).getImage();
	private Image ��ƮX=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ��X.png")).getImage();
	private Image ��ƮE=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ��E.png")).getImage();
	private Image ��ƮD=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ��D.png")).getImage();
	private Image ��ƮC=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ��C.png")).getImage();
	private Image ��ƮR=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ��R.png")).getImage();
	private Image ��ƮF=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ��F.png")).getImage();
	private Image ��ƮV=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ��V.png")).getImage();
	private Image ��ƮT=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ��T.png")).getImage();
	private Image ��ƮG=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ��G.png")).getImage();
	private Image ��ƮB=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ��B.png")).getImage();
	private Image ��ƮY=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ��Y.png")).getImage();
	private Image ��ƮH=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ��H.png")).getImage();
	private Image ��ƮN=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ��N.png")).getImage();
	private Image ��ƮU=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ��U.png")).getImage();
	private Image ��ƮJ=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ��J.png")).getImage();
	private Image ��ƮM=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ��M.png")).getImage();
	private Image ��ƮI=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ��I.png")).getImage();
	private Image ��ƮK=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ��K.png")).getImage();
	private Image ��Ʈ��=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ�տ�.png")).getImage();
	private Image ��ƮO=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ��O.png")).getImage();
	private Image ��ƮL=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ��L.png")).getImage();
	private Image ��Ʈ��=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ�տ�.png")).getImage();
	private Image ��ƮP=new ImageIcon(��Ŭ����.class.getResource("../images/��Ʈ��P.png")).getImage();
	
	
	
	private int x,y;
	private String noteType;

	
	public  Note3(int x, int y,String noteType) {
		this.x=x;
		this.y=y;
		this.noteType=noteType;
	}
	//�̺κ� �ҹ��� �빮�� �����ϰ� qasda �̷��̸����� �޴°ɷ� ������
	public void screenDraw(Graphics2D g) {
		if(noteType.equals("Q"))
		{
			g.drawImage(��ƮQ,x,y,null);
		}
		if (noteType.equals("A")) {
			g.drawImage(��ƮA,x,y,null);
			
		}
		if (noteType.equals("Z")) {
			g.drawImage(��ƮZ,x,y,null);
			
		}
		if (noteType.equals("W")) {
			g.drawImage(��ƮW,x,y,null);
			
		}
		if (noteType.equals("S")) {
			g.drawImage(��ƮS,x,y,null);
			
		}
		if (noteType.equals("X")) {
			g.drawImage(��ƮX,x,y,null);
			
		}
		if (noteType.equals("E")) {
			g.drawImage(��ƮE,x,y,null);
			
		}
		if (noteType.equals("D")) {
			g.drawImage(��ƮD,x,y,null);
			
		}
		if (noteType.equals("C")) {
			g.drawImage(��ƮC,x,y,null);
			
		}
		if (noteType.equals("R")) {
			g.drawImage(��ƮR,x,y,null);
			
		}
		if (noteType.equals("F")) {
			g.drawImage(��ƮF,x,y,null);
			
		}
		if (noteType.equals("V")) {
			g.drawImage(��ƮV,x,y,null);
			
		}
		if (noteType.equals("T")) {
			g.drawImage(��ƮT,x,y,null);
			
		}
		if (noteType.equals("G")) {
			g.drawImage(��ƮG,x,y,null);
			
		}
		if (noteType.equals("B")) {
			g.drawImage(��ƮB,x,y,null);
			
		}
		if (noteType.equals("Y")) {
			g.drawImage(��ƮY,x,y,null);
			
		}
		if (noteType.equals("H")) {
			g.drawImage(��ƮH,x,y,null);
			
		}
		if (noteType.equals("N")) {
			g.drawImage(��ƮN,x,y,null);
			
		}
		if (noteType.equals("U")) {
			g.drawImage(��ƮU,x,y,null);
			
		}
		if (noteType.equals("J")) {
			g.drawImage(��ƮJ,x,y,null);
			
		}
		if (noteType.equals("M")) {
			g.drawImage(��ƮM,x,y,null);
			
		}
		if (noteType.equals("I")) {
			g.drawImage(��ƮI,x,y,null);
			
		}
		if (noteType.equals("K")) {
			g.drawImage(��ƮK,x,y,null);
			
		}
		if (noteType.equals("��")) {
			g.drawImage(��Ʈ��,x,y,null);
			
		}
		if (noteType.equals("O")) {
			g.drawImage(��ƮO,x,y,null);
			
		}
		if (noteType.equals("L")) {
			g.drawImage(��ƮL,x,y,null);
			
		}
		if (noteType.equals("��")) {
			g.drawImage(��Ʈ��,x,y,null);
			
		}
		if (noteType.equals("P")) {
			g.drawImage(��ƮP,x,y,null);
			
		}
	}//
	
	public void drop() {
		y+=��Ŭ����.NOTE_SPEED;
	}
	@Override
	public void run() {
		
		
		
		try{
		while(true) {
		
			drop();
			Thread.sleep(��Ŭ����.SLEEP_TIME);
			System.out.println(y);
		if(y==1300) {
			break;
		}
	
		}
		}
		catch(Exception e){System.out.println(e.getMessage());}
	}
	
}
