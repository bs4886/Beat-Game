package GAME0227��Ʈ�����������;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Note extends Thread{
	Game g1;
	private Image notebasic=new ImageIcon(��Ŭ����.class.getResource("../images/notebasic.png")).getImage();
	private int x,y=580-1000/��Ŭ����.NOTE_SPEED*��Ŭ����.NOTE_SPEED;
	private String noteType;

	
	public  Note(int x, String noteType) {
		this.x=x;
		
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
		y+=��Ŭ����.NOTE_SPEED;
	}
	@Override
	public void run() {
		
		
		
		try{
		while(true) {
			drop();
			Thread.sleep(��Ŭ����.SLEEP_TIME);
			System.out.println(y);
		}
		}
		catch(Exception e){System.out.println(e.getMessage());}
	}
		
		
}
