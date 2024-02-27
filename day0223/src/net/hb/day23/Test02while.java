package net.hb.day23;

public class Test02while {

	public static void main(String[] args) {
		int n=0, sum=0;
		while(true) {
			n+=1;
			sum+=n;
			System.out.print(n+" ");
			if(n==50) {
				System.out.println();
				System.out.println("--------------");
				System.out.println("total : "+sum);
				break;
				}
		}
		
	}

}
