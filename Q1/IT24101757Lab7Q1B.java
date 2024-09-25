import java.util.Scanner;

public class IT24101757Lab7Q1B{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); 
		
		float TotMark=0;	//Total Marks
		float Avg;			//Average Mark
		int i=0;			//Student counter(Input)
		int a=0;			//Counter for loop
		String grade;		//Average Grade
		
		while (a<3){
			System.out.println("Student " + ++i);
			
			System.out.print("Enter Marks : "); //input marks single line using spacing
			TotMark += input.nextFloat();
			TotMark += input.nextFloat();
			TotMark += input.nextFloat();
			TotMark += input.nextFloat();
			
			Avg = TotMark/4;
			
			if (Avg >=75)
			{					
				grade = "Distinction";
			}
			else if (Avg >=50)
			{
				grade = "Credit";
			}
			else
			{
				grade = "Fail";
			}
			
			System.out.println("Average is : " + Avg);
			System.out.println("Overall Grade is : " + grade);
			System.out.println(" ");
			
			a = ++a;
			TotMark=0; 
		}
		
	}
}