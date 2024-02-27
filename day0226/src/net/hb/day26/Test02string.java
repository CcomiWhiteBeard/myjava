package net.hb.day26;

public class Test02string {

	public static void main(String[] args) {
		
		String data="1234";
		//int b = (int)data;     (int)로 String int형 변환불가
		int b = Integer.parseInt(data); //Integer이용
		System.out.println(data+31);
		System.out.println(b+31);
	}//end

}//class end
