package net.hb.day26;

public class Work26_04reverse_CHAE {

	public static void main(String[] args) {
		int num = 5942;
		int n=0;
		
		System.out.println("original : " + num);
		
		System.out.print("reverse : ");
		while(true) {
			n = num%10;
			num /= 10;
			System.out.print(n);
			if(num<10) {
				System.out.print(num);
				break;
			}
		}//while end
		
	}//end

}//class end
