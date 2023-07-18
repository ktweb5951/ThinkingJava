package com.kh.day17.network.socket.calculator;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CalculatorServer {

	public static void main(String[] args) {
		//서버와 연결 되었습니다.
		//계산식(빈칸으로 띄어 입력, 예 24 + 42) >> 23
		//잘못 입력하셨습니다. 형식에 맞게 입력해 주세요.
		//계산식(빈칸으로 띄어 입력, 예 24 + 42) >> 24 + 42
		//계산 결과 66
		// 계산식(빈칸으로 띄어 입력, 예 24 + 42) >> 
		ServerSocket serversocket = null;
		int port = 8888;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		
		try {
//			System.out.println(".");
//			Thread.sleep(1000);
//			System.out.println(".");
//			Thread.sleep(1000);
//			System.out.println(".");
//			Thread.sleep(1000);
			System.out.println("서버 구동중입니다.");
			for(int i=1; i<=50; i++) {
				System.out.print("=");
				Thread.sleep(10);
			}
			System.out.println("100%");
			System.out.println();
			
			serversocket = new ServerSocket(port);
			System.out.println("클라이언트의 연결을 기다리고 있습니다..");
			Socket socket = serversocket.accept();
			System.out.println("클라이언트와 연결 되었습니다.");
			// 받을 준비
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			while(true) {
				// 데이터 받기
				String recvMsg = dis.readUTF();
				if(recvMsg.equalsIgnoreCase("exit")) {
					System.out.println("클라이언트가 종료하였습니다.");
					break;
				}
				System.out.printf("받은 메시지 : %s\n", recvMsg);
				// 24 + 42 -> 띄어쓰기 기준으로 문자열 배열을 만듬
				// 24 / + / 42
				String [] msgArrs = recvMsg.split(" ");

				if(msgArrs.length != 3) {
					String errMsg = "end";
					dos.writeUTF(errMsg);
					continue;
				}
				int num1 =  Integer.parseInt(msgArrs[0]);
				int num2 =  Integer.parseInt(msgArrs[2]); //String -> int
				String operator = msgArrs[1];
				String result = "";
				switch (operator) {
					case "+":
						result = String.valueOf(num1 + num2); // 스트링으로 변환
						break;
					case "-":
						result = String.valueOf(num1 - num2); 
						break;
					case "*":
						result = num1 * num2 + ""; // 문자열을 추가해도 된다.
						break;
					case "/":
						result = num1 / num2 + "";
						break;
					case "%":
						result = num1 % num2 + "";
						break;
				}
				//결과 보내고 끝
				dos.writeUTF(result);
				dos.flush();
			
				
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
