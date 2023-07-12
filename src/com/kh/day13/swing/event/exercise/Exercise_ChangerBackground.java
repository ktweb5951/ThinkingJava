package com.kh.day13.swing.event.exercise;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exercise_ChangerBackground extends JFrame {
	//<F1>키를 입력받으면 컨텐트팬의 배경을 초록색으로,
	// % 키를 입력받으면 노란색으로 변경
	
	public Exercise_ChangerBackground() {
		
		
		//title : Key Code 예제, F키 : 초록색, %키 : 노란색 
		//size : 300,150
		
		setTitle("Key Code 예제, F1키 : 초록색, %키 : 노란색");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		JLabel la = new JLabel();
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 50));
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char keyChar = e.getKeyChar(); //유니코드 키값
				int keyCode = e.getKeyCode(); // 가상키 값
				la.setText(e.getKeyText(keyCode) + "키가 입력되었음");
				
				if(keyChar == '%') {
					c.setBackground(Color.yellow);
				} else if(keyCode == KeyEvent.VK_F1) {
					c.setBackground(Color.green);
				} else {
					c.setBackground(Color.LIGHT_GRAY);
				}
					
			}
		});
		la.setSize(100, 20);
		la.setLocation(0, 50);
		c.add(la);
	
		
		setSize(300, 150);
		setVisible(true);
		
		
		// 키 입력받기 위해 포커스줌
		c.setFocusable(true);
		c.requestFocus();

	}
	public static void main(String[] args) {
		new Exercise_ChangerBackground();
	}
}
