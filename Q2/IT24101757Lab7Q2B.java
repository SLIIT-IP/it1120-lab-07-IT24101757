public class IT24101757Lab7Q2B{
	public static void main(String[] args){
		int i;
		int a;
		
		for (i=1; i<=5; i++)
		{
			System.out.print(i + " "+"-"+" ");
			for(a=0; a<i; a++)
			{
				System.out.print("&" + " ");
			}
			System.out.println();
		}

	}
}