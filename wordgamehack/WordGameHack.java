/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordgamehack;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class WordGameHack {
     public static void main(String []args){
         
                wordPermutation wp = new wordPermutation();
                wp.wordPermutation();
     }
}

class wordPermutation
{
    
    char[] word = new char[5];
    Scanner sc=new Scanner(System.in);
    ArrayList<String> dictionary = new ArrayList<String>(980);
    public void wordPermutation()
	{
            int i=0;
            
		//MODULE 1 : READ FILE 
		try
		{
			FileReader fr = new FileReader("C:\\Users\\Shacks\\Documents\\NetBeansProjects\\wordGameHack\\src\\wordgamehack\\wordDictionary.txt");
			BufferedReader br = new BufferedReader(fr);
			for(i=0;i<980;i++)
			{
					dictionary.add(br.readLine());
			}
			br.close();
		}   
		catch(IOException e)
		{
			System.out.println("File not found");
		}
               
                //MODULE 2 : STORE INPUT LETTERS IN AN ARRAY CALLED WORD
                System.out.println("enter letters:");              
		for(i=0;i<5;i++)
		{
                    word[i] = sc.next().charAt(0);
		}
		
                //MODULE 3 : calculate 60 3-word permutations for the 5 input letters
		ArrayList<String> wordPermutations = new ArrayList(60);
		 int j, k;
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
                for(i=0;i<60;i++)
		{
			try
			{
				for(j=0;j<dictionary.size();j++)
				{
                                    if(wordPermutations.get(i).equals(dictionary.get(j)))
                                    {
                                        System.out.println(wordPermutations.get(i));
                                    }
				}
			}
			catch(NoSuchElementException e)
			{}
		}
            fourLetterwordPermutation flwp = new fourLetterwordPermutation();
            flwp.fourLetterwordPermutation();
	}
}

class fourLetterwordPermutation extends wordPermutation
{
    void fourLetterwordPermutation()
    {
        //MODULE 1 : READ FILE 
        ArrayList<String> fourLetterDictionary = new ArrayList<String>(3919);
        try
        {
                FileReader fr = new FileReader("C:\\Users\\Shacks\\Documents\\NetBeansProjects\\wordGameHack\\src\\wordgamehack\\fourLetterDictionary.txt");
                BufferedReader br = new BufferedReader(fr);
                for(int i=0;i<3919;i++)
                {
                    fourLetterDictionary.add(br.readLine());
                }
                br.close();
        }   
        catch(IOException e)
        {
                System.out.println("File not found");
        }
        
        //MODULE 2 : TAKE INPUT LETTERS
        int i,n; char[] word = new char[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter letters:");              
		for(i=0;i<5;i++)
		{
			word[i] = sc.next().charAt(0);
		}
        //MODULE 3 : calculate 60 3-word permutations for the 5 input letters
		ArrayList<String> fourLetterPermutations = new ArrayList();
		int   j, k, l;
		for(i=0;i<5;i++){
			for(j=0;j<5;j++){
				for(k=0;k<5;k++){
                                    for(l=0;l<5;l++){
					if(l!=i && l!=j && l!=k)
					{                                                               
                                            if(i==j)
					    {
					        j++;
					    }
                                            if(i==k)
                                            {
                                                k++;
                                            }
					    if(j==k)
                                            {
                                                k++;
                                            }
                                            if(j==l)
                                            {
                                                l++;
                                            }
                                           if(k==l)
                                            {
                                                l++;
                                            }
                                            try
                                           {	
                                                String wordsOfFour = word[i]+""+word[j]+""+word[k]+""+word[l];
                                                fourLetterPermutations.add(wordsOfFour);
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
              
                for(i=0;i<120;i++)
		{
                    try
                    {
                            for(j=0;j<fourLetterDictionary.size();j++)
                            {
                                //System.out.println(fourLetterPermutations.get(i));
                                if(fourLetterPermutations.get(i).equals(fourLetterDictionary.get(j)))
                                {
                                    System.out.println(fourLetterPermutations.get(i));
                                }
                            }
                    }
                    catch(NoSuchElementException e)
                    {}
		}
           }
}