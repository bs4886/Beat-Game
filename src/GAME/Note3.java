package GAME;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Note3 extends Thread{
	Game g3;
	private Image notebasic=new ImageIcon(주클래스.class.getResource("../images/노트롱.png")).getImage();
	private Image notebasic2=new ImageIcon(주클래스.class.getResource("../images/노트숏.png")).getImage();
	
	private Image 노트Q=new ImageIcon(주클래스.class.getResource("../images/노트롱Q.png")).getImage();
	private Image 노트A=new ImageIcon(주클래스.class.getResource("../images/노트롱A.png")).getImage();
	private Image 노트Z=new ImageIcon(주클래스.class.getResource("../images/노트롱Z.png")).getImage();
	private Image 노트W=new ImageIcon(주클래스.class.getResource("../images/노트롱W.png")).getImage();
	private Image 노트S=new ImageIcon(주클래스.class.getResource("../images/노트롱S.png")).getImage();
	private Image 노트X=new ImageIcon(주클래스.class.getResource("../images/노트롱X.png")).getImage();
	private Image 노트E=new ImageIcon(주클래스.class.getResource("../images/노트롱E.png")).getImage();
	private Image 노트D=new ImageIcon(주클래스.class.getResource("../images/노트롱D.png")).getImage();
	private Image 노트C=new ImageIcon(주클래스.class.getResource("../images/노트롱C.png")).getImage();
	private Image 노트R=new ImageIcon(주클래스.class.getResource("../images/노트롱R.png")).getImage();
	private Image 노트F=new ImageIcon(주클래스.class.getResource("../images/노트롱F.png")).getImage();
	private Image 노트V=new ImageIcon(주클래스.class.getResource("../images/노트롱V.png")).getImage();
	private Image 노트T=new ImageIcon(주클래스.class.getResource("../images/노트롱T.png")).getImage();
	private Image 노트G=new ImageIcon(주클래스.class.getResource("../images/노트롱G.png")).getImage();
	private Image 노트B=new ImageIcon(주클래스.class.getResource("../images/노트롱B.png")).getImage();
	private Image 노트Y=new ImageIcon(주클래스.class.getResource("../images/노트롱Y.png")).getImage();
	private Image 노트H=new ImageIcon(주클래스.class.getResource("../images/노트롱H.png")).getImage();
	private Image 노트N=new ImageIcon(주클래스.class.getResource("../images/노트롱N.png")).getImage();
	private Image 노트U=new ImageIcon(주클래스.class.getResource("../images/노트롱U.png")).getImage();
	private Image 노트J=new ImageIcon(주클래스.class.getResource("../images/노트롱J.png")).getImage();
	private Image 노트M=new ImageIcon(주클래스.class.getResource("../images/노트롱M.png")).getImage();
	private Image 노트I=new ImageIcon(주클래스.class.getResource("../images/노트롱I.png")).getImage();
	private Image 노트K=new ImageIcon(주클래스.class.getResource("../images/노트롱K.png")).getImage();
	private Image 노트왼=new ImageIcon(주클래스.class.getResource("../images/노트롱왼.png")).getImage();
	private Image 노트O=new ImageIcon(주클래스.class.getResource("../images/노트롱O.png")).getImage();
	private Image 노트L=new ImageIcon(주클래스.class.getResource("../images/노트롱L.png")).getImage();
	private Image 노트오=new ImageIcon(주클래스.class.getResource("../images/노트롱오.png")).getImage();
	private Image 노트P=new ImageIcon(주클래스.class.getResource("../images/노트롱P.png")).getImage();
	
	
	
	private int x,y;
	private String noteType;

	
	public  Note3(int x, int y,String noteType) {
		this.x=x;
		this.y=y;
		this.noteType=noteType;
	}
	//이부분 소문자 대문자 구분하고 qasda 이런이름으로 받는걸로 만들자
	public void screenDraw(Graphics2D g) {
		if(noteType.equals("Q"))
		{
			g.drawImage(노트Q,x,y,null);
		}
		if (noteType.equals("A")) {
			g.drawImage(노트A,x,y,null);
			
		}
		if (noteType.equals("Z")) {
			g.drawImage(노트Z,x,y,null);
			
		}
		if (noteType.equals("W")) {
			g.drawImage(노트W,x,y,null);
			
		}
		if (noteType.equals("S")) {
			g.drawImage(노트S,x,y,null);
			
		}
		if (noteType.equals("X")) {
			g.drawImage(노트X,x,y,null);
			
		}
		if (noteType.equals("E")) {
			g.drawImage(노트E,x,y,null);
			
		}
		if (noteType.equals("D")) {
			g.drawImage(노트D,x,y,null);
			
		}
		if (noteType.equals("C")) {
			g.drawImage(노트C,x,y,null);
			
		}
		if (noteType.equals("R")) {
			g.drawImage(노트R,x,y,null);
			
		}
		if (noteType.equals("F")) {
			g.drawImage(노트F,x,y,null);
			
		}
		if (noteType.equals("V")) {
			g.drawImage(노트V,x,y,null);
			
		}
		if (noteType.equals("T")) {
			g.drawImage(노트T,x,y,null);
			
		}
		if (noteType.equals("G")) {
			g.drawImage(노트G,x,y,null);
			
		}
		if (noteType.equals("B")) {
			g.drawImage(노트B,x,y,null);
			
		}
		if (noteType.equals("Y")) {
			g.drawImage(노트Y,x,y,null);
			
		}
		if (noteType.equals("H")) {
			g.drawImage(노트H,x,y,null);
			
		}
		if (noteType.equals("N")) {
			g.drawImage(노트N,x,y,null);
			
		}
		if (noteType.equals("U")) {
			g.drawImage(노트U,x,y,null);
			
		}
		if (noteType.equals("J")) {
			g.drawImage(노트J,x,y,null);
			
		}
		if (noteType.equals("M")) {
			g.drawImage(노트M,x,y,null);
			
		}
		if (noteType.equals("I")) {
			g.drawImage(노트I,x,y,null);
			
		}
		if (noteType.equals("K")) {
			g.drawImage(노트K,x,y,null);
			
		}
		if (noteType.equals("왼")) {
			g.drawImage(노트왼,x,y,null);
			
		}
		if (noteType.equals("O")) {
			g.drawImage(노트O,x,y,null);
			
		}
		if (noteType.equals("L")) {
			g.drawImage(노트L,x,y,null);
			
		}
		if (noteType.equals("오")) {
			g.drawImage(노트오,x,y,null);
			
		}
		if (noteType.equals("P")) {
			g.drawImage(노트P,x,y,null);
			
		}
	}//
	
	public void drop() {
		y+=주클래스.NOTE_SPEED;
	}
	@Override
	public void run() {
		
		
		
		try{
		while(true) {
		
			drop();
			Thread.sleep(주클래스.SLEEP_TIME);
			System.out.println(y);
		if(y==1300) {
			break;
		}
	
		}
		}
		catch(Exception e){System.out.println(e.getMessage());}
	}
	
}
