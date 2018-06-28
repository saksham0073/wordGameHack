import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class wordGameV6{
     public static void main(String []args){
		wordPermutation wp = new wordPermutation();
        wp.wordPermutation();
     }
}

class wordPermutation
{
	
    String[] dictionary = new String[980];
    public void wordPermutation()
	{
		//MODULE 1 : READ FILE 
		try
		{
			FileReader fr = new FileReader("wordDictionary.txt");
			BufferedReader br = new BufferedReader(fr);
			for(int i=0;i<980;i++)
			{
				if((dictionary[i] = br.readLine()) != null) {} 
			}
			br.close();
		}   
		catch(IOException e)
		{
			System.out.println("File not found");
		}

		//MODULE 2 : STORE INPUT LETTERS IN AN ARRAY CALLED WORD
		int i,n; char[] word = new char[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter letters:");              
		for(i=0;i<5;i++)
		{
			word[i] = sc.next().charAt(0);
		}

		//MODULE 3 : calculate 60 3-word permutations for the 5 input letters
		String[] wordPermutations = new String[60];
		i=0; int j=0; int k=0; int count=0;
		for(i=0;i<5;i++){
			for(j=0;j<5;j++){
			System.out.println(j);
				for(k=0;k<5;k++){
					if(k!=i && k!=j)
					{
						if(i==j)
						{
							j++;
						}
						if(k!=j)
						{
							try
							{	//obstacle: the  words in wordPermutation array are not getting displayed outside this loop
								for(;count<1;count++)
								{
									wordPermutations[count] = (word[i]+""+word[j]+""+word[k]);
								}
								count=0;
								System.out.println(wordPermutations[count]);
							}
							catch(ArrayIndexOutOfBoundsException e)
							{
								break;
							}
						}
					}
				}
			}
		}
	}
}