package com.kh.day14.swing.component;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Exam_JComboBox extends JFrame {
	private String [] fruits = {"apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry"};
	private String [] names = {"일용자", "이용자", "삼용자", "사용자"};
	
	public Exam_JComboBox() {
		setTitle("JComboBox 이미지 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JComboBox<String> strCombo = new JComboBox<String>(fruits);
		c.add(strCombo);
		JComboBox<String> nameCombo = new JComboBox<String>();
		for(int i=0; i<names.length;i++) {
			if(i !=1) {
				nameCombo.addItem(names[i]);		
			}
		}
		c.add(nameCombo);
		
		setSize(300, 300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exam_JComboBox();
	}

}
