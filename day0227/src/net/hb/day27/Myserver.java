package net.hb.day27;

import java.io.IOException;
import java.net.ServerSocket;

//public class Myserver {
//	public static void main(String[] args) {
//		ServerSocket ss = new ServerSocket();
//	}
	
public class Myserver {
public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	

}
