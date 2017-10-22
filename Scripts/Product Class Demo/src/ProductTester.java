import java.lang.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ProductTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		
			
		//Declaration of the first product
		System.out.println("Construct the first object of product");
		Product productOne = new Product(1245,"Cocoa",'A');
		System.out.println("Setting reception of 100 units of Product one and cost of $10 per unit");
		productOne.receipt(100,10.00);
		System.out.println("Adding another reception of 100 units and cost of $11 per unit");
		productOne.receipt(100, 11);
		System.out.println("Setting the shipping of 50 units of Product one");
		productOne.ship(50);
		System.out.println(productOne.toString());
		System.out.println("\n");
		
		
		//Declaration of the second  product
		System.out.println("Construct the second  object of product");
		Product productTwo = new Product(1246, "Coffee", 'B');
		System.out.println("Setting reception of 200 units of Product Two and cost of $11.50 per unit");
		productTwo.receipt(200,11.50);
		System.out.println("Adding another reception of 100 units and cost of $13 per unit");
		productTwo.receipt(100,13.00);
		System.out.println("Setting the shipping of 25 units of Product Two");
		productTwo.ship(25);
		System.out.println(productTwo.toString());
		
		System.out.println("\n Testing all exceptions of Class Product");
		int loopCount = 0;
		boolean done = false;
		do
		{
			try
			{
			
				switch(loopCount)
				{
				case 0: loopCount++;
					productOne.ship(500);
				
				case 1: loopCount++;
					Product productThree = new Product();
					productThree.setProdNumber(0);
					
				case 2: loopCount++;
					Product productFourth = new Product();
					productFourth.setprodSaleCategory("Y");
					productFourth.receipt(100, 12.5);
					productFourth.setProdUnitPrice(9.50);
				
					
				default : done = true;	
				}
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			
		} while(!done);

		System.out.println("\nEnd of Product Class Implementation");
		return;
	}

}
