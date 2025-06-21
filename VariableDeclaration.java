public class VariableDeclaration {
	int number1;
	static int staticVar;

	public static void main(String[] args) {
		int localVar;
		//System.out.println(number); //not valid local variable must be initialized
		localVar=10;
		System.out.println(localVar);
			
		//instance variable no need to initialize it will give default value
		Identifiers i=new Identifiers();
		System.out.println(i.number1);
		
		//static variable no need to initialize it will give default value
		System.out.println(staticVar);
		
		//static int a; can not declare inside block

	}


}
