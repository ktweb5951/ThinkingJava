package com.kh.day13.swing.event;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exam_KeyListener extends JFrame {
	public Exam_KeyListener() {
		setTitle("KeyListener 에제"); //제목설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //완전히 다히게
		JLabel [] laArrs = new JLabel[3];
		
		laArrs[0] = new JLabel("getKeyCode()");
		laArrs[1] = new JLabel("getKeyChar()");
		laArrs[2] = new JLabel("getKeyText()"); // 컴포넌트 Label 초기값 설정
//		JLabel la1 = new JLabel("getKeyCode()");
//		JLabel la2 = new JLabel("getKeyChar()");
//		JLabel la3 = new JLabel("getKeyText()");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.addKeyListener(new KeyAdapter() { //Adapter 클래스 사용
			@Override
			public void keyPressed(KeyEvent e) {
				char keyChar = e.getKeyChar(); //유니코드 키값
				int keyCode = e.getKeyCode(); // 가상키 값
				laArrs[0].setText(Integer.toString(keyCode));
				laArrs[1].setText(Character.toString(keyChar)); //F5, F10 등 매핑 안되어있는건 안나옴
				laArrs[2].setText(e.getKeyText(keyCode));
			}
		});
		for(JLabel la : laArrs) {
			la.setOpaque(true);  //바탕색 보이게 하기 위해서 컴포넌트를 불투명하게 함
			la.setBackground(Color.yellow); // 바탕색 노랑색으로 설정
			c.add(la); // 컴포넌트 콘테이너에추가
		}
//		la1.setOpaque(true); /
//		la2.setOpaque(true); //바탕색 보이게 하기 위해서 컴포넌트를 불투명하게 함
//		la3.setOpaque(true); //바탕색 보이게 하기 위해서 컴포넌트를 불투명하게 함
//		la1.setBackground(Color.yellow);
//		la2.setBackground(Color.yellow);
//		la3.setBackground(Color.yellow);
//		la1.setSize(50, 20);
//		c.add(la1);
//		la1.setSize(50, 20);
//		c.add(la2);
//		la1.setSize(50, 20);
//		c.add(la3);
		
				
		setSize(300, 150); //Frame 크기설정
		setVisible(true); // Frame visible 설정
		// 스윙 프레임이 만들어질 포커스를 주고자 하는 경우 setVisible 이후에
		// 포커스를 주어야한다.
		//키입력을 받을 수 있도록 포커스를 주는 것임
		c.setFocusable(true); //component가 포커스를 받을 수 있도록 설정
		c.requestFocus(); // component에 포커스 강제 지정 
		
	}
	public static void main(String[] args) {
		new Exam_KeyListener();
	}

}
