//Shania Khatri

import java.io.*;
import java.util.*;

public class CountingDNA { //class header
	
	//private data - variables that can be used through out the program, in all methods and main.
	private int countA = 0; //declares and initializes in one step
	private int countT = 0;
	private int countG = 0;
	private int countC = 0;
	
	public void method() throws IOException{
		Scanner sc = new Scanner(new File("rosalind_dna_data4.txt")); //your data file here
		
		while(sc.hasNext()){ //only makes a new string with next token if there is another token
			
			String sequence = sc.next(); //makes new token
			
			for(int x=0;x<sequence.length();x++){ //for loop, only allows program to loop through length of the sequence
				if (sequence.charAt(x)== 'A'){ //ups count of A if char is A
					countA ++;
				}
				else if (sequence.charAt(x)=='T'){ //ups count of T if char is T
					countT ++;
				}
				else if (sequence.charAt(x)== 'G'){ //ups count of G if char is G
					countG ++;
				}
				else{ //sequence.charAt(x)== 'C' - no need to check, this is a default if all other ifs are false				
					countC ++;                       // ups count of C if char is C
				}
			}
		}
		
		sc.close();
	}
	
	public String toString(){ //toString
		return countA + " " + countC + " "+ countG + " "+ countT;
	}

	//main
	public static void main(String[] args) throws IOException{

		CountingDNA object = new CountingDNA(); //makes a countingDNA object with which to call methods. uses default constructor
		
		object.method();   //calls method()
		object.toString(); //calls toString()
	}

}//class body
