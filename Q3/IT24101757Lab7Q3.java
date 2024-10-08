import java.util.Scanner;

public class IT24101757Lab7Q3
{
         public static void main(String[] args)
         {

          Scanner input = new Scanner(System.in);
          int numbers[] = new int[5];

          int i, j = 0;
          char modeOfPayment;
          double discount, totalBill, totalAmount;

           for (i=0; i < 5; i++)
           {
            System.out.println("Customer " + ++j);
             
            System.out.print("Enter total bill amount :");
            totalBill = input.nextDouble();

            System.out.print("Enter mode of payment (C for cash, O for other) :");
            modeOfPayment = input.next().charAt(0);

                if(modeOfPayment == 'C' || modeOfPayment == 'c')
                  {
                   discount = totalBill * 0.05;
                   totalAmount = totalBill - discount;

                  System.out.println("Discount is: " + discount);
                  System.out.println("Amount to be paid: " + totalAmount);
                   
                   }

               else if (modeOfPayment == 'O' || modeOfPayment == 'o')
                  {
                   System.out.println("No discount applicable");
                   System.out.println("Amount to be paid: " + totalBill);
                  }
               else
                  {
                   System.out.println("Payment Mode is Not Valid");
                  }

          System.out.println(); 
          }
         }
}



