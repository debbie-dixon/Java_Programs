public class StackExample{
	public static void main(String[] args){
		methodA(); // calling methods	
	}
	
	public satic void methodA() {
		int x = 10; // local variable i methodA
		methodA(); // calling methodB
	}
	
	public static void methodB() {
		int y = 20; // local variable in methodB
		//do something with y...
		
	}
}