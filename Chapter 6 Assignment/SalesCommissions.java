import java.util.Scanner;
public class SalesCommissions{
		public static void main (String args[]) {
			Scanner scan = new Scanner(System.in);
			
			 int weeklySalary = 200;
			double rate = 0.09;
			 double commission;
			 int totalSalary;
			 
			 System.out.printf("Enter number of  Sales People: ");
			 int salesPeople = scan.nextInt();
			 
			 int [] salesPerson = new int[salesPeople];
			  
			 for (int i = 1; i <=salesPeople; i++) {
				 System.out.printf("Enter sales for SalesPerson %d: ", i);
				 int sales = scan.nextInt();
				 
				  commission = (double)rate * sales;
				 totalSalary = (int)commission + weeklySalary;
				 
				 System.out.println(totalSalary);
			 
			 
			 }
			 
			 switch(totalSalary) {
				 case 1000:
				 
			
		}
		
		
}