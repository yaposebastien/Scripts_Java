import java.util.Scanner;
import java.lang.NumberFormatException;
import java.lang.Exception;

public class Conversion {

	/**
	 * Program permits to convert a string 
	 * in number e.g "123" in int 123 
	 * with the usage of recursion
	 */
	public static void main(String[] args) throws Exception {
		
		int index = 0;
		int numberOfTimes = 1;
		double average = 0.0;
		Scanner scan = new Scanner(System.in);
		
		try
		{
		
			boolean isContinued = false;
			while(!isContinued)
			{
				System.out.println("Begin demo Conversion with recursion\n");
				System.out.println("Enter a string of number :");
				String toConvert = scan.next();
				System.out.println("Your string of numbers is : " +toConvert);
				if(toConvert.length() == 0)
					{throw new Exception("Sorry! We can convert an empty string");}
				if(toConvert.length() > 9)
					{throw new Exception("Sorry! Please enter a number less than 9 digits");}
			if(checkString(toConvert))
				{throw new Exception("Sorry! String can not contain alphabetic letters"); }
				else
				{
					int num=0, sum2=0;
					num = conversion(toConvert,index,sum2);
					average += num; 
					System.out.println("Number converted : "+ num);
					System.out.println("Average : "+ (average/numberOfTimes));
					System.out.println("Number of times : "+ numberOfTimes);
					numberOfTimes ++;
					System.out.println("Do you want to continue ? (Y/N) ");
					String answer = scan.next();
					if(answer.equalsIgnoreCase("N"))
						{isContinued = true;}
				} //End for Else Statement
			}
		}
		catch(NumberFormatException ex)
		{
			System.out.println("Sorry! the usage of letters is inacceptable" + ex.getMessage());
		}
		
	}

	 /**
	    * Computes the sum of each characters
	    * 
	    * @param values of index and converted Character
	    * @return the sum of the values in values
	    */
	   
	   public static int conversion(String s, int index2, int sum2)
	   {
		   int num = 0;
		   if(index2 == s.length())
		   	{ return sum2;}
		   sum2 *= 10;
		   num =  s.charAt(index2) - 48;
		   sum2 += num;
		   return conversion(s,(index2+1),sum2);
	   }
	   
	   public static boolean checkString(String chain)
	   {
		   boolean isString = false;
		   
		   for(int i= 0; i < chain.length(); i++) {
			   String singleChar = Character.toString(chain.charAt(i));
			   int convertNum = Integer.parseInt(singleChar);
			   if(convertNum >=0)
			   	{isString=false; }
			   else
			   	{isString=true; 
			   	break;}
		   }
		   
		   return isString;
	   }
}


