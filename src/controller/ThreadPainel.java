package controller;

import java.util.Random;

import javax.swing.JTextField;

public class ThreadPainel extends Thread{
	private JTextField textField;
	
	public ThreadPainel(JTextField textField) {
		this.textField = textField;
	}
	
	@Override
	public void run() {
		randomization();
	}
	
	private void randomization() {
		Random random = new Random();
		for(int i = 0; i < random.nextInt(100); i++) {
			this.textField.setText("" + (random.nextInt(6) + 1));
			try {
				sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
