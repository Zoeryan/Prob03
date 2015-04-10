import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Prob03
	{
	public static void main(String[] args) throws FileNotFoundException
	{
	ArrayList newArray = new ArrayList();
	ArrayList myArray = new ArrayList();
	int length = 0;
	int location = 10;
	int countEven = 1;
	int countOdd = 1;
	Scanner input = new Scanner(new File("Prob03.txt"));
	while(input.hasNextLine())
		{
		while(input.hasNextInt())
			{
			myArray.add(input.nextInt());			
			Collections.sort(myArray);
			length = myArray.size();
			}
		System.out.println(myArray);
	
		while(location - countOdd > 1 && location + countEven < myArray.size())
			{
		for(int j = 0; j < length; j++)
			{
			int num = (int) myArray.get(j);
			if(num == 0)
				{
				location = length / 2;
				newArray.add(num , (location));
				System.out.println(newArray);
				}
		
			else if(num % 2 == 0)
				{
				newArray.add(num , (location + countEven));
				countEven++;
				}
			else
				{
				newArray.add(num , (location - countOdd));
				countOdd++;
				}
			}
		System.out.println(newArray);
		}
		}
	}
}
