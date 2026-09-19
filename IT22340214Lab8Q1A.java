import java.util.Scanner;
public class IT22340214Lab8Q1A {
	public static void main(String[] args) {
	
	int[] myArray = new int[5];
	Scanner input = new Scanner(System.in);
	System.out.println("Enter 5 numbers");
	
	for(int  count =0; count < myArray.length ; count ++)
		{
		System.out.println("Enter Number " +(count+1) + ": ");
		myArray[count] = input.nextInt();
		}
		
		//printing in reverse order
		
		for(int c = myArray.length -1; c >=0 ; c--)
		{
			System.out.println(myArray[c] + " ");
		}
	}
}