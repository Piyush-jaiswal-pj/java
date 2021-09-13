package sct;
import java.util.Scanner;//scanner package (cin)

public class Nested_switch {//nested switch case

	public static void main(String[] args) {
		//aim = find stream of person using info years and branch
		Scanner i=new Scanner(System.in);
		System.out.println("Enter the college year");
		int year=i.nextInt();
		System.out.println("Enter the branch (use only give below words)");
		System.out.println("C for CSE");
		System.out.println("I for IT");
		System.out.println("Efor CE");
		char branch=i.next().charAt(0);//for taking char value valid for only one digit
		switch(year)
		{
		case 1: System.out.println("physics,chemistry,bce,c,c++");
		break;
		case 2:
			switch(branch)
		 {
		 	case 'C':
		 				System.out.println("java,python,ada,ds,dc,soft skils");
		 				break;
		 	case 'I': 																//nested switch
		 				System.out.println("ds,c++,coa,maths,eee,pom");
						break;
		 	case 'E': 
						System.out.println("basic of ce,maths, measurement,physics");
						break;
		}
		break;
		
		case 3:
			switch(branch)
			{
			case 'C': 
						System.out.println("ai,ml,dbs,intern,project");
						break;
				
			case 'I': 
						System.out.println(",ai,ml,python,intern,project");
						break;
			case 'E': 
						System.out.println("building blocks , truss,construction ,major,quality checking of raw material");
						break;
			}
			break;	
		case 4:
			switch(branch)
			{
			case 'C': 
						System.out.println("placement,cloud networking,dbms-1,project-2,tranning,major project");
						break;
				
			case 'I': 
						System.out.println("palcement, project, dbms ,ai ,ml,tranning");
						break;
			case 'E': 
						System.out.println("final blocks,placement,construction on raw material,intern,project,major,minnor");
						break;
			}
			break;	
		}
		
	 }
 }
