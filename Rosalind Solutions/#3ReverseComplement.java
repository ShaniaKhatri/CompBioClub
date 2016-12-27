import java.io.*;

public class ReverseComplement {

	public static void main(String[] args) throws IOException {
		
		//This allows the user to input data
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(reader);

		String dnaStrand = input.readLine();//This line asks for the dna sample data
		
		//Creates an empty string to add letters to
		String complement = "";
		
		//Loops backwards through the input string
		for(int x=dnaStrand.length()-1;x>=0;x--) {
			
			//Adds letters to complement in the reverse order of how they appear in dnaStrand
			complement = complement + dnaStrand.substring(x,x+1);
		}
		
		//Changes all the letters in complement to the complementary base pair
		String transcription = complement.replace('A','t').replace('T','a').replace('C','g').replace('G','c');
		transcription = transcription.replace('a','A').replace('t','T').replace('c','C').replace('g','G');
		//used lower and upper case to avoid .replace() functions interacting with each other
		
		//Outputs result
		System.out.println(transcription);
	}
	
}

