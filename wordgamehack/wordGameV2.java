import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class wordGameV2{

     public static void main(String []args){
        //readingFile rf = new readingFile();
		//rf.read();
		wordPermutation wp = new wordPermutation();
        wp.wordPermutation();
     }
}
/* class readingFile{
public void read()
{
try{
		FileReader fr = new FileReader("wordDictionary.txt");
		BufferedReader br = new BufferedReader(fr);
		String[] str = new String[170];
		for(int i=0;i<170;i++){
			if((str[i] = br.readLine()) != null)
			{
			}
		}
		//add a way to compare computed words with dictionary words
		for(int i=0;i<170;i++){
		System.out.println(str[i] + "\n");
		}
		br.close();
	}   catch(IOException e){
		System.out.println("File not found");
		}
}
}*/

class wordPermutation{
{
        String[] dictionary = new String[170];
        //displays possible word permutations for 1st letter
        public void wordPermutation(){
		try{
			FileReader fr = new FileReader("wordDictionary.txt");
			BufferedReader br = new BufferedReader(fr);
			for(int i=0;i<170;i++){
				if((dictionary[i] = br.readLine()) != null) {} 
			}
			//add a way to compare computed words with dictionary words
			//for(int i=0;i<170;i++){
			//System.out.println(dictionary[i] + "\n");
			//}
			br.close();
		}   
			catch(IOException e){
			System.out.println("File not found");
			}
}
			//MODULE 1 : STORE INPUT LETTERS IN AN ARRAY
{			
			//Declaring variables and input class Scanner
            int i,n; char[] word = new char[5];
            Scanner sc=new Scanner(System.in);
            System.out.println("enter letters:");              
			//stores the input in word array
            for(i=0;i<5;i++){
                word[i] = sc.next().charAt(0);
            }
}
			String[] letter1matches = new String[170];
			
			for(i=0;i<170;i++)
			{
				if(word[0]==dictionary[i].charAt(0))
				{
					letter1matches[i] = dictionary[i];
				}
			}
			for(i=0;i<170;i++)
			{
				if(letter1matches[i]==null){}
				//extract only the words which start with the first letter of the input letters
				else{
					System.out.println(letter1matches[i]);
				}
			}
			// 60 word permutations of input letters
{
            //letter 1
			for(i=0;i<1;i++)
            {
                System.out.println("--------------------------------------");
                char firstLetter = word[i];
				for(i=0;i<3;i++){
					 System.out.println(firstLetter+""+word[1]+""+word[i+2]);
                }
                for(i=0;i<4;i++){
                    if(word[i]!=word[1])
                    System.out.println(firstLetter+""+word[2]+""+word[i+1]);   
                }
                for(i=0;i<4;i++){
                    if(word[i]!=word[2])
                    System.out.println(firstLetter+""+word[3]+""+word[i+1]);   
                }
                for(i=0;i<3;i++){
                    System.out.println(firstLetter+""+word[4]+""+word[i+1]);   
                }
            }
            //letter 2
            for(i=1;i<2;i++)
            {
                System.out.println("--------------------------------------");
                char secondLetter = word[i];
                for(i=1;i<4;i++){
                    System.out.println(secondLetter+""+word[0]+""+word[i+1]);
                }
                for(i=0;i<5;i++){
                    if(word[i]!=word[1] && word[i]!=word[2])
                    System.out.println(secondLetter+""+word[2]+""+word[i]);   
                }
                for(i=0;i<5;i++){
                    if(word[i]!=word[1] && word[i]!=word[3])
                    System.out.println(secondLetter+""+word[3]+""+word[i]);   
                }
                for(i=0;i<4;i++){
                    if(word[i]!=word[1] && word[i]!=word[4])
                    System.out.println(secondLetter+""+word[4]+""+word[i]);   
                }
            }
            //letter 3
            for(i=2;i<3;i++)
            {
                System.out.println("--------------------------------------");
                char thirdLetter = word[i];
                for(i=0;i<4;i++){
                    if(word[i]!=word[1])
                    System.out.println(thirdLetter+""+word[0]+""+word[i+1]);
                }
                for(i=0;i<5;i++){
                    if(word[i]!=word[1] && word[i]!=word[2])
                    System.out.println(thirdLetter+""+word[1]+""+word[i]);   
                }
                for(i=0;i<5;i++){
                    if(word[i]!=word[2] && word[i]!=word[3])
                    System.out.println(thirdLetter+""+word[3]+""+word[i]);   
                }
                for(i=0;i<4;i++){
                    if(word[i]!=word[2] && word[i]!=word[4])
                    System.out.println(thirdLetter+""+word[4]+""+word[i]); 
                }
            }
            for(i=3;i<4;i++)
            {
                System.out.println("--------------------------------------"); 
                char fourthLetter = word[i];
                for(i=0;i<4;i++){
                    if(word[i]!=word[2])
                    System.out.println(fourthLetter+""+word[0]+""+word[i+1]);
                }
                for(i=0;i<5;i++){
                    if(word[i]!=word[1] && word[i]!=word[3])
                    System.out.println(fourthLetter+""+word[1]+""+word[i]);   
                }
                for(i=0;i<5;i++){
                    if(word[i]!=word[2] && word[i]!=word[3])
                    System.out.println(fourthLetter+""+word[2]+""+word[i]);   
                }
                for(i=0;i<3;i++){
                    if(word[i]!=word[3] && word[i]!=word[4])
                    System.out.println(fourthLetter+""+word[4]+""+word[i]); 
                }
            }
            for(i=4;i<5;i++)
            {
                System.out.println("--------------------------------------");
                char fifthLetter = word[i];
                for(i=0;i<3;i++){
                    System.out.println(fifthLetter+""+word[0]+""+word[i+1]);
                }
                for(i=0;i<4;i++){
                    if(word[i]!=word[1])
                    System.out.println(fifthLetter+""+word[1]+""+word[i]);   
                }
                for(i=0;i<4;i++){
                    if(word[i]!=word[2])
                    System.out.println(fifthLetter+""+word[2]+""+word[i]);   
                }
                for(i=0;i<3;i++){
                    
                    System.out.println(fifthLetter+""+word[3]+""+word[i]); 
                }
				break;
            }
}
		}
}
/*
class calcPermutation{
        public void outputPermutation()
        {
            int n,r;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter number of letters:");
            n = sc.nextInt();
            System.out.println("enter word length:");
            r = sc.nextInt();
            int nLetters = calcFact(n);
            int wordLength = calcFact(n-r);
            System.out.println("Possible Permutations:" + nLetters/wordLength);
     
        int calcFact(int n)
        {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
            return result;
        }
        }
}*/