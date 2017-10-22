
/*



 */
import java.lang.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Product {
	
	private int prodNumber;
	private String prodName;
	private int prodInventoryUnit;
	private char prodSaleCategory;
	private double prodUnitCost;
	private double prodUnitPrice;

	
	
	//Declaration of default constructor for Product
	public Product()
	{
		prodNumber = 0;
		prodName = "";
		prodInventoryUnit = 0;
		prodSaleCategory = ' ';
		prodUnitCost = 0.0;
		prodUnitPrice = 0.0;
	}
	
	//Declaration of constructor with parameters
	public Product(int number, String name, char category)
	{
		prodNumber = number;
		prodName = name;
		prodSaleCategory = category;
		prodInventoryUnit = 0;
		prodUnitCost = 0.0;
		prodUnitPrice = 0.0;
	}
	
	//Declaration of copy constructor for Product
	public Product(Product cloneProduct, int number)
	{
		cloneProduct.prodNumber = number;
		cloneProduct.prodName = prodName;
		cloneProduct.prodSaleCategory = prodSaleCategory;
		prodInventoryUnit = 0;
		prodUnitCost = 0;
		prodUnitPrice = 0;
		
	}
	
	//Declaration of accessors(gets) and mutators(sets) of each element
	
	
	public int getProdNumber()
	{
		return prodNumber;
	}
	//Check the value of number, it should be different from zero,better test it here.
	public void setProdNumber(int number) throws Exception{
		if(number == 0) 
		{
			throw new Exception("Invalid number! please enter a number different from 0");
		}
		if(prodInventoryUnit == 0)
		{
			prodNumber = number;
		}
		else
		{
			throw new Exception("You can not change the product number if product number is not zero");
		}
		
		
	}
	public String getProdName()
	{
		return prodName;
	}
	public void setProdName(String name){
		this.prodName = name;
	}
	
	public int getProdInventoryUnit()
	{
		return prodInventoryUnit;
	}
	
	public char getProdSaleCategory()
	{
		return prodSaleCategory;
	}
	//Check the value of number, it should be different from zero,better test it here.
	public void setprodSaleCategory(String saleCategory) throws Exception {
		char category = saleCategory.toUpperCase().charAt(0);
		
		if(category != 'A' && category != 'B' && category !='C')
		{
			throw new Exception("Invalid answer for the category! Please select A, B or C");
		}
		else
		{
			this.prodSaleCategory = category;	
		}
		
	}
	
	public double getProdUnitCost()
	{
		return prodUnitCost;
	}
	
	public double getProdUnitPrice()
	{
		return prodUnitPrice;
	}
	public void setProdUnitPrice(double unitPrice) throws Exception
	{
		if(prodUnitPrice > prodUnitCost)
		this.prodUnitPrice = unitPrice;
		else
		{
			throw new Exception("Invalid issue! The unit price should be great than the ptoduct's cost");
		}
	}

	
	//Declaration of different methods of the class Product
	public void receipt(int qteReceived, double unitCost)
	{
		
		double totalCurrentInventory = prodInventoryUnit * prodUnitCost;
		double totalReceivedInventory = qteReceived * unitCost;
		prodInventoryUnit += qteReceived;
		prodUnitCost = ((totalCurrentInventory + totalReceivedInventory) / (prodInventoryUnit));
	}
	
	//
	public void ship(int qteShipped) throws Exception 
	{
		if(qteShipped <= prodInventoryUnit)
		prodInventoryUnit -= qteShipped;
		else
		{
			throw new Exception("Sorry!You can ship more product than you have in your storage.");
		}
		
	}

	
	public String toString()
	{
		return String.format("%d %s %c %d %.2f %.2f", prodNumber, prodName, prodSaleCategory, 
				prodInventoryUnit, prodUnitCost,(prodInventoryUnit*prodUnitCost));
		
	}


}
