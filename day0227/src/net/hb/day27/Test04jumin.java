package net.hb.day27;

public class Test04jumin {

	public static void main(String[] args) {
		
		//String jumin = new String("940810-2012345");
		String jumin = "940810-2012345";
		char data = jumin.charAt(7);
		if(data=='1' || data=='3') {System.out.println("male");}
		else if(data=='2'||data=='4') {System.out.println("female");}
		else {System.out.println("wrong input");}

	}//END

}//class END
