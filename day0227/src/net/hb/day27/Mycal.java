package net.hb.day27;

public class Mycal {

	public static void main(String[] args) {
		int a=7, b=4;
		int hap=0, nmg=0;
		double mok=0.0;
		
		try {
		hap=a+b;
		mok=a/b;
		nmg=a%b;
		}catch(Exception e) {System.out.println(e);}
		
		System.out.println(mok);
		System.out.println(nmg);
		System.out.println(hap);
		System.out.println("Tuesday");

	}//END

}//class END
