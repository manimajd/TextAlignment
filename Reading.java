/*
									reading a file

Created by:		Mani Majd
Date:			August 8th 2017
Purpose:		Training

*/

import java.io.*; 
import java.util.Scanner;
public class Reading {
	
	public static int counter=0;

	public static void main(String[] args) throws FileNotFoundException {
		int justify = 14;
		File spaces = new File("space.txt");
		Scanner input = new Scanner(spaces);
		readAndallign(input, justify);		
	}//end of main

	
	
	public static void readAndallign(Scanner input, int justify){
		
		String line = "";
		while(input.hasNext()){
			line+=input.next();
			line+=" ";
		}

		int mod = line.length()%justify;
		for(int k=0;k<mod; k++){
			line+=" ";
		}
		
		for(int i=0;i<= line.length()/justify+1; i++){
			String word ="";
			for (int j= 0; j<=justify; j++){
				if(counter+j>line.length()){
					break;
				}else{
					word+=line.charAt(counter);
					counter++;
				}

			}//end of for loop
			System.out.println(word);
			
		}//end of wile
	}
}//end of class
