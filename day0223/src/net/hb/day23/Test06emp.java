package net.hb.day23;
import java.util.Scanner;

public class Test06emp {
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		String name="", dept="";
		
		System.out.print("input name >>> ");
		name = scan.nextLine();
		System.out.print("inpu depart >>> ");
		dept = scan.nextLine();
		
		System.out.println("********************");
		System.out.println(name+", "+dept);
		scan.close();
	}//main END
} //class END
