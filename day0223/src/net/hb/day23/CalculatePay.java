package net.hb.day23;
import java.util.Scanner;
public class CalculatePay {

	public static void main(String[] args) {
		final int RATE = 10000;
		int pay=0;
		int hours=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("input time : ");
		hours = scan.nextInt();
		
		if(hours>8) {
			pay = RATE*8 + (int)(1.5*RATE*(hours-8));
		}
		else {
			pay = RATE*hours;
		}
		System.out.printf("pay is %d.\n", pay);
		scan.close();
	}
}
