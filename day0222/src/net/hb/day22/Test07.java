package net.hb.day22;

public class Test07 {

	public static void main(String[] args) {
		int kor=50, eng=90, total=0;
		double avg=0;
		String  result="";
		
		total=kor+eng;
		avg=(double)total/2;
		
		if(kor<60 || eng<60) { result="RETEST -> score under 60 existed"; }
		else if(avg>=70 ) { result="PASS!";}
		else { result= "RETEST -> average under 70"; }
		
		System.out.println("total : "+total);
		System.out.println("average : "+avg);
		System.out.println("result : "+result);
	}

}
