package com.kh.day17.network.socket.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class BaseballClient {

	public static void main(String[] args) {
		String address = "127.0.0.1";
		int port = 7777;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			Socket socket = new Socket(address, port);
			System.out.println("클라이언트 소켓을 생성하였습니다.");
			System.out.println("/" + address);
			System.out.println("게임 준비 완료");
			//입출력준비
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			
			for(;;) {
				System.out.print("--> ");
				String sendMsg = sc.nextLine();
				
				//입력한거 보내기
				dos.writeUTF(sendMsg);
				dos.flush();
				
				
				//보낸거 받기
				String recvMsg = dis.readUTF();
				System.out.println(recvMsg);
				
				if(recvMsg.equals("오류!")) {
					System.out.println("잘못 입력하셨습니다. 형식에 맞게 입력해 주세요.");
					continue;
					//if(recvMsg.equals("3스트라이크 0볼")) {
				} else if(recvMsg.startsWith("3")) {
					System.out.println("축하합니다 아웃입니다.");
					break;
				}
		
				
				
				
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
