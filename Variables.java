public class Variables {
	
	//instance variables---inside class outside method/block
	int a=10;
	String s="java";
	
	//static variable
	static int b=20;

	public static void main(String[] args) {
 //System.out.println(a); can not access the non static variable by static block --create object of class
		
		Variables v=new Variables();
		System.out.println(v.a);
		System.out.println(v.s);
		 
		//access static variables
		System.out.println(b);
		System.out.println(Variables.b);  
	}
		
	//access with non static block also
		public void m1()
		{
			System.out.println(b);
		}
		

	}
