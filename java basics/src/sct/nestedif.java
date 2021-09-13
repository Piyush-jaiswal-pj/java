package sct;

public class nestedif {

	public static void main(String[] args) {
		int age=10;
		int weight=80;
		if(age>18) {
			if(weight>50) {
				System.out.println("You are eligible for Blood Donation");	
			}
			
		}
		else {
			System.out.println("You are Not eligible for Blood Donation");
		}

	}

}
