package net.hb.day22;

public class Test03if {

	public static void main(String[] args) {
		String  result="";
		int kor=40, eng=88, total=0;
		double avg=0;
		//char grade = 'F';
		
		total=kor+eng;
		avg=(double)total/2;
		
		if(avg==100 ) { result="coungrats and bonus";}
		else if(avg>=70) {result="congrats";}
		else {result="retest";}
		
		System.out.println("total : "+total);
		System.out.println("average : "+avg);
		System.out.println("result : "+result);

	}

}
