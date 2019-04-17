package GAME;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyListener extends KeyAdapter{

	@Override
	public void keyPressed(KeyEvent e) {
		if(Game.hit==null) {
			return;
		}
		if(e.getKeyCode()==KeyEvent.VK_S) {
			Game.hit.pressS();
		//	new Music("Pen.mp3",false).start();
		}
		else if(e.getKeyCode()==KeyEvent.VK_D) {
			Game.hit.pressD();
			//new Music("Pen.mp3",false).start();
		}
		else if(e.getKeyCode()==KeyEvent.VK_F) {
			Game.hit.pressF();
			//new Music("Pen.mp3",false).start();
		}	
		else if(e.getKeyCode()==KeyEvent.VK_SPACE) {
			Game.hit.pressSB();
		//	new Music("Pen.mp3",false).start();
		}
		else if(e.getKeyCode()==KeyEvent.VK_J) {
			Game.hit.pressJ();
		//	new Music("Pen.mp3",false).start();
		}
		else if(e.getKeyCode()==KeyEvent.VK_K) {
			Game.hit.pressK();
		//	new Music("Pen.mp3",false).start();
		}
		else if(e.getKeyCode()==KeyEvent.VK_L) {
			Game.hit.pressL();
		//	new Music("Pen.mp3",false).start();
		}
	}//
	
	
	@Override
	public void keyReleased(KeyEvent e) {
		if(Game.hit==null) {
			return;
		}
		if(e.getKeyCode()==KeyEvent.VK_S) {
			Game.hit.releaseS();
		}
		else if(e.getKeyCode()==KeyEvent.VK_D) {
			Game.hit.releaseD();
		}
		else if(e.getKeyCode()==KeyEvent.VK_F) {
			Game.hit.releaseF();
		}	
		else if(e.getKeyCode()==KeyEvent.VK_SPACE) {
			Game.hit.releaseSB();
		}
		else if(e.getKeyCode()==KeyEvent.VK_J) {
			Game.hit.releaseJ();
		}
		else if(e.getKeyCode()==KeyEvent.VK_K) {
			Game.hit.releaseK();
		}
		else if(e.getKeyCode()==KeyEvent.VK_L) {
			Game.hit.releaseL();
		}
		
	}
}
