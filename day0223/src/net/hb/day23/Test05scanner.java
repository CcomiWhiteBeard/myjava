package net.hb.day23;

import java.lang.System;
import java.lang.String;
import java.util.Scanner;

public class Test05scanner {

	public static void main(String[] args) {
		int dan=0;
		Scanner scan =  new Scanner(System.in);
		System.out.print("input >>> ");
		dan = scan.nextInt();
		for(int i=1; i<10; i+=1) {
			System.out.println(dan+" x "+i+" = "+(dan*i));
		}
		scan.close();
		
	}

}
