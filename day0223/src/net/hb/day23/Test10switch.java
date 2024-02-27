package net.hb.day23;

public class Test10switch {

	public static void main(String[] args) {
		int kor = 90;
		char grade;
		
		switch(kor) {
		case 90 :
			grade='A';
			break;
		case 80 :
			grade='B';
			break;
		default :
			grade='F';
			break;
		}//switch end
		
		System.out.println(grade);

	}

}
