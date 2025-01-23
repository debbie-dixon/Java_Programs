
public class VarargsArgument{
	public static void main (String args[]){
		System.out.println(add(6,20,3,5,7));
		listOfNames("Martins","Kate","Benjamin","Louis","Ray");
		
	}
	
	public static int add(int...numbers) {
		int sum = 0;
		for (int element:numbers) {
			sum += element;
		}
		return sum;
	}
	
	public static void listOfNames(String...names){
		for (String name : names){
			System.out.println(name);
		}
	}
}

// 