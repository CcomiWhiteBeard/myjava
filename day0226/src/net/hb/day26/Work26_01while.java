package net.hb.day26;

public class Work26_01while {

	public static void main(String[] args) {
		int num=0;
		while(true) {
			num +=1;
			if (num == 31) 
				break;
			else if ((num%5)==0) 
				System.out.println(num);
			else
				System.out.printf(num+"\t");
		}

	}//end

}//class end
