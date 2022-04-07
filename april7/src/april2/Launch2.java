package april2;
interface Mycal
{
	void add();
	void mul();
}
class Cal implements Mycal
{
	public void add()
	{
		int a=10;
		int b=10;
		int c=a+b;
		System.out.println(c);                          //20
	}
	public void mul()
	{
		int a=10;
		int b=10;
		int c=a*b;
		System.out.println(c);                          //100
	}
	void div()
	{
		int a=10;
		int b=10;
		int c=a/b;
		System.out.println(c);           // ERROR EXIST       
		
		
	}
}
public class Launch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cal c=new Cal();
Mycal ref;
ref=c;
ref.add();
ref.mul();                 
ref.div();              // //because div is of "Cal"(class) not of (interface)"Mycal"
((cal)(ref)).div();     // downcasting
	}

}
