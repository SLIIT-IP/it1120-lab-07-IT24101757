import java.util.Scanner;

public class IT24101757Lab7Q3
{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		float TotBill;
		char PayMode;
		float Disc;
		float DBill;
		int c=0;		//Customer counter
		int intpaymode;
		
		
		while (c<5)
		{
			
			System.out.println("Customer "+ ++c);
			
			System.out.print("Enter Total bill amount: ");
			TotBill = input.nextFloat();
			
			System.out.print("Enter mode of payment (C for cash, o for other): ");
			PayMode = input.next().charAt(0);
			
			intpaymode = PayMode;		//Get the ASCII Value
			
			if (intpaymode == 67 || intpaymode == 99){	// C = 67 / c = 99 (ASCII)
				
				Disc = (TotBill*5/100);
				DBill = TotBill - Disc;
				
				System.out.println("Discount is : " + Disc);
				System.out.println("Amount to be apid : " + DBill);
				
				
			} 
			else if (intpaymode == 79 || intpaymode == 111)
			{		// O = 99 / o = 111 (ASCII)
				
				System.out.println("No Discount applicable");
				System.out.println("Amount to be apid : " + TotBill);
				
			}
			else
			{
				
				System.out.println("Payment Mode is not valid");
				
			}
			
			System.out.println(" ");
		}
		
	}
}