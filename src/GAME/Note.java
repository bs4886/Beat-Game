package GAME;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Note extends Thread{
	Game g1;
	private Image notebasic=new ImageIcon(주클래스.class.getResource("../images/notebasic.png")).getImage();
	private int x,y;
	private String noteType;

	
	public  Note(int x, int y,String noteType) {
		this.x=x;
		this.y=y;
		this.noteType=noteType;
	}
	public void screenDraw(Graphics2D g) {
		if(noteType.equals("short"))
		{
			g.drawImage(notebasic,x,y,null);
		}
		else if (noteType.equals("Long")) {
			g.drawImage(notebasic,x,y,null);
			g.drawImage(notebasic,x+100,y,null);
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
		}
		}
		catch(Exception e){System.out.println(e.getMessage());}
	}
		
		
}
