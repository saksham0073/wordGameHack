import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class wordGameV4{
     public static void main(String []args){
		wordPermutation wp = new wordPermutation();
        wp.wordPermutation();
     }
}

class wordPermutation{
		//MODULE #something : READ FILE 
        String[] dictionary = new String[1005];
        //displays possible word permutations for 1st letter
        public void wordPermutation(){
		try{
			FileReader fr = new FileReader("wordDictionary.txt");
			BufferedReader br = new BufferedReader(fr);
			for(int i=0;i<1005;i++){
				if((dictionary[i] = br.readLine()) != null) {} 
			}
			br.close();
		}   
			catch(IOException e){
			System.out.println("File not found");
			}

			//MODULE 1 : STORE INPUT LETTERS IN AN ARRAY
	
			//Declaring variables and input class Scanner
            int i,n; char[] word = new char[5];
            Scanner sc=new Scanner(System.in);
            System.out.println("enter letters:");              
			//stores the input in word array
            for(i=0;i<5;i++){
                word[i] = sc.next().charAt(0);
            }

			//MODULE #something : EXTRACT WORDS STARTING WITH INPUT LETTERS AND COMPARE WITH PERMUTATED WORDS
			String[] letter1matches = new String[1004];
			String[] letter1matched = new String[1004];
			for(i=0;i<1004;i++)
			{
				if(word[0]==dictionary[i].charAt(0))
				{
					letter1matches[i] = dictionary[i];
				}
			}
			for(i=0;i<1004;i++)
			{
				if(letter1matches[i]==null){}
				//extract only the words which start with the first letter of the input letters
				else{
					letter1matched[i] = letter1matches[i]; 
				}
			}
			
			String[] letter2matches = new String[1004];
			String[] letter2matched = new String[1004];
			for(i=0;i<1004;i++)
			{
				if(word[1]==dictionary[i].charAt(0))
				{
					letter2matches[i] = dictionary[i];
				}
			}
			for(i=0;i<1004;i++)
			{
				if(letter2matches[i]==null){}
				//extract only the words which start with the first letter of the input letters
				else{
					letter2matched[i] = letter2matches[i]; 
				}
			}

			String[] letter3matches = new String[1004];
			String[] letter3matched = new String[1004];
			for(i=0;i<1004;i++)
			{
				if(word[2]==dictionary[i].charAt(0))
				{
					letter3matches[i] = dictionary[i];
				}
			}
			for(i=0;i<1004;i++)
			{
				if(letter3matches[i]==null){}
				//extract only the words which start with the first letter of the input letters
				else{
					letter3matched[i] = letter3matches[i]; 
				}
			}

			String[] letter4matches = new String[1004];
			String[] letter4matched = new String[1004];
			for(i=0;i<1004;i++)
			{
				if(word[3]==dictionary[i].charAt(0))
				{
					letter4matches[i] = dictionary[i];
				}
			}
			for(i=0;i<1004;i++)
			{
				if(letter4matches[i]==null){}
				//extract only the words which start with the first letter of the input letters
				else{
					letter4matched[i] = letter4matches[i]; 
				}
			}

			String[] letter5matches = new String[1004];
			String[] letter5matched = new String[1004];
			for(i=0;i<1004;i++)
			{
				if(word[4]==dictionary[i].charAt(0))
				{
					letter5matches[i] = dictionary[i];
				}
			}
			for(i=0;i<1004;i++)
			{
				if(letter5matches[i]==null){}
				//extract only the words which start with the first letter of the input letters
				else{
					letter5matched[i] = letter5matches[i]; 
				}
			}
			
			// 60 word permutations of input letters
			int count=0;
            //letter 1
			for(i=0;i<1;i++)
            {
				String[] letter1Permutations= new String[15];
                System.out.println("--------------------------------------");
                char firstLetter = word[i];
				for(i=0;i<3;i++){
					letter1Permutations[count] = firstLetter+""+word[1]+""+word[i+2];
					count++;
                }
                for(i=0;i<4;i++){
                    if(word[i]!=word[1])
					{
					letter1Permutations[count] = firstLetter+""+word[2]+""+word[i+1];
					count++;
					}
                }
                for(i=0;i<4;i++){
                    if(word[i]!=word[2])
					{
					letter1Permutations[count] = firstLetter+""+word[3]+""+word[i+1];
					count++;
					}
                }
                for(i=0;i<3;i++){
					letter1Permutations[count] = firstLetter+""+word[4]+""+word[i+1];
					count++;
                }
				//compare each value from array letter1Permutations with letter1matches 
				try{
				System.out.println("Matches for letter "+word[0]+":");
				for(i=0;i<15;i++)
				{
					for(int j=0;j<1004;j++)
					if(letter1Permutations[i].equals(letter1matched[j]))
					{
						if(letter1Permutations[i] == null){}
						else
						System.out.println(letter1Permutations[i]+" ");
					}
				}
				}
				catch(NullPointerException e){
					break;
				}
            }
            //letter 2
			String[] letter2Permutations= new String[15];
			count=0;
            for(i=1;i<2;i++)
            {
                System.out.println("--------------------------------------");
                char secondLetter = word[i];
                for(i=1;i<4;i++){
                    letter2Permutations[count]=secondLetter+""+word[0]+""+word[i+1];
					count++;
                }
                for(i=0;i<5;i++){
                    if(word[i]!=word[1] && word[i]!=word[2]){
                    letter2Permutations[count] = secondLetter+""+word[2]+""+word[i];   
					count++;
					}
                }
                for(i=0;i<5;i++){
                    if(word[i]!=word[1] && word[i]!=word[3]){
                    letter2Permutations[count] = secondLetter+""+word[3]+""+word[i];  
					count++;
					}
                }
                for(i=0;i<4;i++){
                    if(word[i]!=word[1] && word[i]!=word[4]){
                    letter2Permutations[count] = secondLetter+""+word[4]+""+word[i];
					count++;
					}
                }
				try{
				System.out.println("Matches for letter "+word[1]+":");
				for(i=0;i<15;i++)
				{
					for(int j=0;j<1004;j++)
					if(letter2Permutations[i].equals(letter2matched[j]))
					{
						if(letter2Permutations[i] == null){}
						else
						System.out.println(letter2Permutations[i]);
					}
				}
				}
				catch(NullPointerException e){
					break;
				}
            }
            //letter 3
			String[] letter3Permutations = new String[15];
			count=0;
            for(i=2;i<3;i++)
            {
                System.out.println("--------------------------------------");
                char thirdLetter = word[i];
                for(i=0;i<4;i++){
                    if(word[i]!=word[1]){
                    letter3Permutations[count] = thirdLetter+""+word[0]+""+word[i+1];
					count++;
					}
                }
                for(i=0;i<5;i++){
                    if(word[i]!=word[1] && word[i]!=word[2]){
                    letter3Permutations[count] = thirdLetter+""+word[1]+""+word[i];  
					count++;
					}
                }
                for(i=0;i<5;i++){
                    if(word[i]!=word[2] && word[i]!=word[3]){
                    letter3Permutations[count] = thirdLetter+""+word[3]+""+word[i];   
					count++;
					}
                }
                for(i=0;i<4;i++){
                    if(word[i]!=word[2] && word[i]!=word[4]){
                    letter3Permutations[count] = thirdLetter+""+word[4]+""+word[i]; 
					count++;
					}
                }
				try{
				System.out.println("Matches for letter "+word[2]+":");
				for(i=0;i<15;i++)
				{
					for(int j=0;j<1004;j++)
					if(letter3Permutations[i].equals(letter3matched[j]))
					{
						if(letter3Permutations[i] == null){}
						else
						System.out.println(letter3Permutations[i]);
					}
				}
				}
				catch(NullPointerException e){
					break;
				}
            }
			//letter 4
			String[] letter4Permutations = new String[15];
			count=0;
			for(i=3;i<4;i++)
            {
                System.out.println("--------------------------------------"); 
                char fourthLetter = word[i];
                for(i=0;i<4;i++){
                    if(word[i]!=word[2]){
                    letter4Permutations[count] = fourthLetter+""+word[0]+""+word[i+1];
					count++;
					}
                }
                for(i=0;i<5;i++){
                    if(word[i]!=word[1] && word[i]!=word[3]){
                    letter4Permutations[count] = fourthLetter+""+word[1]+""+word[i];
					count++;}
                }
                for(i=0;i<5;i++){
                    if(word[i]!=word[2] && word[i]!=word[3]){
                     letter4Permutations[count] = fourthLetter+""+word[2]+""+word[i];   
					 count++;
					 }
                }
                for(i=0;i<3;i++){
                    if(word[i]!=word[3] && word[i]!=word[4]){
                     letter4Permutations[count] = fourthLetter+""+word[4]+""+word[i]; 
					count++;
					}
                }
				try{
				System.out.println("Matches for letter "+word[3]+":");
				for(i=0;i<15;i++)
				{
					for(int j=0;j<1004;j++)
					if(letter4Permutations[i].equals(letter4matched[j]))
					{
						if(letter4Permutations[i] == null){}
						else
						System.out.println(letter4Permutations[i]);
					}
				}
				}
				catch(NullPointerException e){
					break;
				}
            }
			//letter 5
			String[] letter5Permutations = new String[15];
			count=0;
            for(i=4;i<5;i++)
            {
                System.out.println("--------------------------------------");
                char fifthLetter = word[i];
                for(i=0;i<3;i++){
                    letter5Permutations[count] = fifthLetter+""+word[0]+""+word[i+1];
					count++;
                }
                for(i=0;i<4;i++){
                    if(word[i]!=word[1]){
                    letter5Permutations[count] = fifthLetter+""+word[1]+""+word[i];   
					count++;
					}
                }
                for(i=0;i<4;i++){
                    if(word[i]!=word[2]){
                    letter5Permutations[count] = fifthLetter+""+word[2]+""+word[i];  
					count++;
					}
                }
                for(i=0;i<3;i++){
                    letter5Permutations[count] = fifthLetter+""+word[3]+""+word[i]; 
					count++;
                }
				try{
				System.out.println("Matches for letter "+word[4]+":");
				for(i=0;i<15;i++)
				{
					for(int j=0;j<1004;j++)
					if(letter5Permutations[i].equals(letter5matched[j]))
					{
						if(letter5Permutations[i] == null){}
						else
						System.out.println(letter5Permutations[i]);
					}
				}
			}
				catch(NullPointerException e){
					break;
				}
            }
		}
}