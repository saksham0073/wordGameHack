import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class wordGameV8{
     public static void main(String []args){
		wordPermutation wp = new wordPermutation();
        wp.wordPermutation();
     }
}

class wordPermutation
{
	
    ArrayList<String> dictionary = new ArrayList<String>();
    public void wordPermutation()
	{
		//MODULE 1 : READ FILE 
		try
		{
			FileReader fr = new FileReader("wordDictionary.txt");
			BufferedReader br = new BufferedReader(fr);
			for(int i=0;i<980;i++)
			{
				if(br.readLine()!=null) 
				{
					dictionary.add(br.readLine());
				}
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
		ArrayList<String> wordPermutations = new ArrayList<String>();
		i=0; int j=0; int k=0; int count=0;
		for(i=0;i<5;i++){
			for(j=0;j<5;j++){
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
							{	
								String permutatedWord1 = word[i]+""+word[j]+""+word[k];
								wordPermutations.add(permutatedWord1);
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
		Iterator itr = dictionary.iterator();
		for(i=0;i<60;i++)
		{
			try
			{
				for(j=0;j<dictionary.size();j++)
				{
					
					while(itr.hasNext())
					{
						System.out.println(wordPermutations.get(i)+"=="+itr.next());
						if(wordPermutations.get(i)==itr.next())
						{
						System.out.println("here");
						System.out.println(wordPermutations.get(i));
						}
					}
				}
			}
			catch(NoSuchElementException e)
			{}
		}
	}
}