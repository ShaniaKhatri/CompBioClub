import java.io.*;//used to get input
import java.math.*;//used to store large numbers in BigInteger objects

public class RealisticRabbitPopulation {
	
	public static void main(String[] args) throws IOException {
		
		//This allows the user to input data
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(reader);
		BufferedReader input2 = new BufferedReader(reader);

		int months = Integer.parseInt(input.readLine());//This line asks for the amount of total months
		int age = Integer.parseInt(input2.readLine());//this line asks for the lifespan of each rabbit
		
		//BigInteger allows java to handle the really big numbers that the problem asks for, without rounding error
		BigInteger[] rabbits = new BigInteger[age+1];//position 0 is newborns, 1 is 1 month old babies, 2 is 2 month old adults, etc.
		
		BigInteger total = BigInteger.ZERO;//sets total to zero
		
		//unlike primitives, BigIntegers need to be initialized beforehand. This loop sets all the rabbits array numbers to zero
		for(int counter1=0;counter1<=age;counter1++) {
			rabbits[counter1] = BigInteger.ZERO;//BigInteger isn't a primitive, so rabbits[counter1] = 0; doesn't work. The assignment needs to also be a BigInteger
		}
		
		rabbits[1] = BigInteger.ONE;//simulates the first month, where 1 rabbit is born
		
		//loops through each month, starting with the second month
		for(int date=2;date<=months;date++) {
			
			rabbits[0] = BigInteger.valueOf(0);//sets the 0 month old amount to zero
			
			//loops through the existing adult rabbits
			for(int counter2=2;counter2<=age;counter2++) {
				rabbits[0]=rabbits[0].add(rabbits[counter2]);//finds the total number of new baby rabbits. '.add()' is required to add BigIntegers
			}
			
			//loops through the existing adult rabbits in reverse order
			for(int growth=age;growth>=1;growth--) {
				rabbits[growth] = rabbits[growth-1];//kills off the oldest rabbit generation, then ages all rabbits by 1 month
			}
			/*//This loop is for debugging
			for(int counter3=0;counter3<=age;counter3++) {
				System.out.print(rabbits[counter3] + " ");
			}
			System.out.println();*/
		}
		
		//loops through existing alive rabbits
		for(int counter=1;counter<=age;counter++) {
			total=total.add(rabbits[counter]);//finds total number of living rabbits
		}
		
		//outputs result
		System.out.println(total);
	}

}
