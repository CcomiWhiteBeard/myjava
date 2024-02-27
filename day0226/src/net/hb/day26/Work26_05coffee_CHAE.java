package net.hb.day26;

import java.util.Scanner;

public class Work26_05coffee_CHAE {

	public static void main(String[] args) {
		int sel = 0, money = 0;
		int n=0, m=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("how much do u have?  >>>");
		String data = scan.nextLine();
		money = Integer.parseInt(data);
		
		while(true) {
			System.out.println();
			System.out.println("\t*---  coffee machine  ---*");
			System.out.println("1.coffee(300)  2.hot choco(250)  3.return  9.exit");
			System.out.print("select the menu  >>>");
			sel = Integer.parseInt(scan.nextLine());
			
			if(sel==9) {
				System.out.println("-------- exit --------");
				break;
			}   //sel==9
			else if(sel==1) {
				if(money<300) {
					System.out.println("-------- not enough money. please select another option --------");
					System.out.println("-------- remain : "+money+" --------");	
				}
				else {
					money -= 300;
					n +=1 ;
				}
			}  //sel==1
			else if(sel==2) {
				if(money<250) {
					System.out.println("-------- not enough money. please select another option --------");
					System.out.println("-------- remain : "+money+" --------");	
				}
				else {
					money -= 250;
					m +=1 ;
				}
			}  //sel==2
			else {
				System.out.println("-------- you ordered "+n+" coffee & "+m+" hot choco --------");
				System.out.println("-------- return : "+money+" --------");
			}  //sel==3
			
		}//while end
		
		scan.close();

	}//end

}//class end
