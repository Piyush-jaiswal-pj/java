package sct;

public class leapyear {

	public static void main(String[] args) {
		int year = 2020;
		if(year%4==0 && year % 400==0|| year % 100 != 0) {
			System.out.println(year+" is leap Year");
			
		}
		else {
			System.out.println(year+"is Not leap Year");
			}
	}

}
