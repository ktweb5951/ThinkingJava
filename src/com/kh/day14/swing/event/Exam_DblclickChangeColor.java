package com.kh.day14.swing.event;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exam_DblclickChangeColor extends JFrame{

	public Exam_DblclickChangeColor() {
		setTitle("Click and Dbl Click Change BackgroundColor 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel la = new JLabel();
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());
//		c.addMouseListener(new  MouseAdapter() {
//
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				c.setBackground(Color.BLACK);	
//			}
//		});
		setSize(300,200);
		setVisible(true);
	}
	
	private class MyMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			//더블클릭 구현, 클릭 카운트가 2면 더블클릭
			if(e.getClickCount() == 2) {	
				// (int)Math.random() * (최댓값 - 최솟값 + 1) + 최소값
				// 0 ~ 255
				int red = (int)(Math.random()*256); 
				int green = (int)(Math.random()*256);
				int blue = (int)(Math.random()*256);
				Component c = (Component)e.getSource();
				c.setBackground(new Color(red,green,blue));
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exam_DblclickChangeColor();
	}

}
