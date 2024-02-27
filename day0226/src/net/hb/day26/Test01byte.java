package net.hb.day26;

public class Test01byte {

	public static void main(String[] args) {
		
		//byte = 8bit   -128 ~ 127 사이 정수 기억
		//int = 4byte = 32bit
		//double = 8byte = 64bit
		//boolean = 1byte = 8bit
		//char = 2byte = 16bit
		
		byte bvalue1 = 7;
		byte bvalue2 = 65;
		//byte bvalue3 = bvalue1 + bvalue2;  error 인텔cpu는 연산값 int형으로 인식
		byte bvalue3 = (byte)(bvalue1 + bvalue2);
		System.out.println(bvalue3);
		
	}//end

}//class end
