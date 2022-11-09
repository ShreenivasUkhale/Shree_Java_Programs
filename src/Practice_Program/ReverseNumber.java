package Practice_Program;

public class ReverseNumber {

	public static void main(String[] args) {
		ReverseNumber obj = new ReverseNumber();
		obj.UsingWhileLoop(args);
		obj.UsingFor();
	}
	
	public void UsingWhileLoop(String[] args) {
		
		int number = 100456, reverse=0 ; 
		while(number!=0)
		{
			int remainder = number%10;
			reverse = reverse *10+ remainder;
			number = number/10;
		}
		System.out.println("The reverse of given number is: "+ reverse);
	}
	
	public void UsingFor() {
		int number = 100456, reverse=0 ;
		for (;number!=0;number=number/10)
		{
			int remainder = number%10;
			reverse= reverse*10+remainder;
		}
		System.out.println("The reverse of given number is: "+ reverse);
	}

}
