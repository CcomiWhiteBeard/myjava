package net.hb.day22;

public class Work01 {

	public static void main(String[] args) {
		int a=8, b=9, c=4;
		
		if(a<b) {
			if(b<c) {System.out.print(a+"\t"+b+"\t"+c);}
			else if(c<a) {System.out.print(c+"\t"+a+"\t"+b);}
			else {System.out.print(a+"\t"+c+"\t"+b);}
		}
		else {
			if(a<c) {System.out.print(b+"\t"+a+"\t"+c); }
			else if(c<b) {System.out.print(c+"\t"+b+"\t"+a);}
			else {System.out.print(b+"\t"+c+"\t"+a); }
		}

	}

}
