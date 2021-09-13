package sct;

 interface interfaceexample {
	 void food();
	
}
interface dish {
	 void dishname();
}
class A implements dish,interfaceexample
{
	public void dishname() {System.out.println("daal chawal");}
	public void food() {System.out.println("rice");}

	public static void main (String args[])
	{
		A b=new A();
		b.dishname();
		b.food();
	}
}