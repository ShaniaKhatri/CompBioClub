import java.io.*;

public class RabbitPopulation {
	public static void main(String[] args) throws IOException {
		//This allows the user to input data
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(reader);
		BufferedReader input2 = new BufferedReader(reader);

		int months = Integer.parseInt(input.readLine());//This line asks for the amount of total months
		int fertility = Integer.parseInt(input2.readLine());//this line asks for the amount of children each rabbit pair has
		
		long newGen = 1;//amount of baby rabbits
		long oldGen = 0;//amount of reproducing rabbits
		long newBirths = 0;
		
		//loops through each month
		for(int date=2;date<=months;date++) {
			newBirths = oldGen*fertility;//new rabbits are born
			oldGen=oldGen + newGen;//1 month old rabbits become adults
			newGen = newBirths;//the new rabbits become 1 month old rabbits
		}
		//Outputs the result
		System.out.println(oldGen);
		System.out.println(newGen);
		System.out.println(oldGen + newGen);
	}

}
