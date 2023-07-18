package com.kh.day17.network.socket.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class BaseballServer {

	public static void main(String[] args) {
		ServerSocket serversocket = null;
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date now = new Date();
		Random rand = new Random();
		int randNum =0;
		int port = 7777;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		int [] numbers = new int[3];
		String formatNow = "";
		try {
			serversocket = new ServerSocket(port);
			System.out.println("서버소켓을 생성하였습니다.");
			formatNow =  formatter.format(now);
			System.out.println(formatNow);
			System.out.println("클라이언트의 접속을 기다립니다.");
			Socket socket = serversocket.accept();
			System.out.println("클라이언트가 접속했습니다.");
			//(int)Math.random() * (최댓값 - 최소값 + 1) + 최소값
			System.out.print("서버 숫자 -> ");
			for(int i=0; i<3; i++) {
				//중복 없이 추출
				numbers[i] = (int)(Math.random()*9+1);
				for(int j=0; j<i ; j++) {
					if(numbers[j] == numbers[i]) {
						 i--;
						 break;
					}
				}
			}
			for(int i=0; i<numbers.length;i++) {
				System.out.print(numbers[i] + " ");
			}
			System.out.println("\n서버 준비 완료");
			//입출력 준비
			is= socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);

			
			while(true) {
				int strike = 0;
				int ball = 0;
				//보낸거 받기
				String recvMsg = dis.readUTF();
				System.out.printf("받기 : %s\n", recvMsg);
				String [] inputNums = recvMsg.split(" ");
	
				if(inputNums.length != 3) {
					String errMsg = "오류!";
					dos.writeUTF(errMsg);
					continue;
				}
		
				for(int i=0; i<numbers.length;i++) {
					for(int j=0; j<numbers.length;j++) {
						if(numbers[i]==Integer.parseInt(inputNums[j])) {
							if(i ==j) {
								strike++;
							} else {
								ball++;
							}
						}
					}
				}
				
				//결과 알려주기 (보내기)
				// 정답과 비교해서 스트라이크, 볼 알려주기
				String result = "";
				result = strike + "스트라이크 " + ball + "볼";
				
				if(strike==3) {
					String endMsg = "3스트라이크 0볼";
					dos.writeUTF(endMsg);
					System.out.println("아웃! 게임 종료");
					break;
				}
	
				dos.writeUTF(result);
				dos.flush();
				
				
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
