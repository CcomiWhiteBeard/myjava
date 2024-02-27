package net.hb.day27;

public class Test02string {

	public static void main(String[] args) {
		
		String x = "lee";   //하나의 lee값을 x, y가 가리킴
		String y = "lee";
		
		String a = new String("kim");   //new키워드로 생성된 변수 내용같은지 비교는 대상변수.equals(비교변수)
		String b = new String("kim");   //== 는 주소값 비교
		
		if(x== y) {System.out.println("identical");}
		else {System.out.println("different");}

	}//END

}//class END
