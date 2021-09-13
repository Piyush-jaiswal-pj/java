package sct;

public class singleinheritnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
add A=new add();
A.number(5,7);//it sends 5,7 to method number arg()
A.addition();
	}

}
  class Value{
	int x,y;
	void number(int a,int b)//here first entered 5,7
	{
		x=a; //gets its value
		y=b;
		  
	}
}
  class add extends Value{ //inherite the class
	  void addition() {
		  int c;
		  c=x+y;// calls the number method
		  System.out.println("the addition of given integer is"+c);
		
		  
	  }
  }
