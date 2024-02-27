package net.hb.day27;

public class Test03string {

	public static void main(String[] args) {
		
		 char data[] = {'k', 'i', 'm'};    //배열로 한글자씩 지정 후 String에 넘김
		 String str = new String(data);
		 
		 String a = new String("kim");
		 
		 String b = "kim";
		
		 System.out.println(str);
		 System.out.println(a);
		 System.out.println(b);

	}//END

}//class END
