package com;

public class VowelsEx {

	public static void main(String[] args) {
		
		char word[] = {'w','i','p','r','o'};
		int count=0;
		
		for(int i=0;i<word.length;i++) {
			
			if(word[i] == 'a' || word[i] == 'e' || word[i] == 'i' || word[i] == 'o' || word[i] == 'u') {
				
				System.out.println(word[i]+" is a Vowels");
				count++;
				
			}else {
				System.out.println(word[i]+" is Not a Vowels");
			}
			
			
		}
		System.out.println("Total no of Vowels in an array is : "+count);
	}

}
