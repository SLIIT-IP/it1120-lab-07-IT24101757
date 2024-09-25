import java.util.Scanner; // Import the java Scanner Library

public class IT24101757lab7Q1A{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		float TotMark=0;	
		float Avg;			
		int i=1;			
		int a=1;		
		String grade;		

		System.out.println("Enter marks for four subject:");
		
		System.out.print("Enter Subject Mark " + i +": ");
		TotMark += input.nextFloat();
		
		while (a<4)
		{
			System.out.print("Enter Subject Mark " + ++i +": ");
			TotMark += input.nextFloat();
			
			++a;	
		}
		
		Avg = TotMark/4;	//Find the average using total marks
		
		if (Avg >=75){					//find the grade
			grade = "Distinction";
		}else if (Avg >=50){
			grade = "Credit";
		}else{
			grade = "Fail";
		}
		
		System.out.println(" ");
		System.out.println("Average is : " + Avg);
		System.out.println("Overall Grade is : " + grade);
	}
}