package net.hb.day22;

public class Test04escape {

	public static void main(String[] args) {
		int kor=40, eng=88, total=0;
		double avg=0;
		
		total=kor+eng;
		avg=(double)total/2;
		
		System.out.println("total : "+total);
		System.out.println("average : "+avg);
		System.out.println(kor+"\t"+eng+"\t"+total);
		System.out.println("-------------------------");
		System.out.println("abcdef\nghij\nlmnop\tqrstuv");
	}

}
