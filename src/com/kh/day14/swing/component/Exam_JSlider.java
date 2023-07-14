package com.kh.day14.swing.component;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class Exam_JSlider extends JFrame {
	
	public Exam_JSlider() {
		setTitle("JSlider 이미지 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		
		JSlider slider =new JSlider(JSlider.HORIZONTAL, 0, 200, 100); //100은 시작값
		slider.setPaintLabels(true); //숫자
		slider.setPaintTicks(true);  //눈금
		slider.setMajorTickSpacing(50); //눈금 중간값
		slider.setMinorTickSpacing(10); //눈금 최소값
		slider.setPaintTrack(true);
//		slider.setPaintTrack(false); //track
		c.add(slider);
		
		setSize(300, 100);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exam_JSlider();
	}

}
