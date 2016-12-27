import java.io.*;

public class RNATranscription {

	public static void main(String[] args) throws IOException {
		//This allows the user to input data
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(reader);

		String dnaStrand = input.readLine();//This line asks for the dna sample data
		
		//This line replaces all T's with U's, then outputs the "transcribed" string in the sample output's format
		System.out.println(dnaStrand.replace('T','U'));
	}

}
