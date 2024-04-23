package com.stringdemo;

public class SstringInBuiltFunctions {

	public static void main(String[] args) {
	
		String sampleString = "Hello, World!";
		
		String str = "Hello, World!";
		
		//1. length()
		
		int length = str.length();
		System.out.println("Length of the string : " +length); // 13
		
		// 2. charAt()
		
		char charAtIndex5 = str.charAt(5);
		System.out.println("Character at index 5: " + charAtIndex5); // ,
		
		// 3. substring()
		
		String subStringFromIndex7 = str.substring(7); 
		System.out.println("Substring from index 7: " + subStringFromIndex7); //World!
		
		// 4. indexOf()
		
		int indexOfComma = str.indexOf(",");
		System.out.println("Index of comma : " + indexOfComma); // 5
		
		// 5. contains()
		
		boolean containsWorld = str.contains("World");
		System.out.println("Contains World : " + containsWorld); // true
		
		// 6. toUpperCase()
		
		String upperCaseString = str.toUpperCase();
		System.out.println("Uppercase string : " + upperCaseString); // HELLO, WORLD!
		
		// 7. toLowerCase()
		
		String lowerCaseString = str.toLowerCase();
		System.out.println("Lowercase string : " + lowerCaseString); // hello, world!
		
		// 8. replace()
		
		String replaceString = str.replace("Hello", "Hi");
		System.out.println("Replaced string : " + replaceString); // Hi, World!
		
		// 9. trim()
		
		String stringWithWhiteSpace = "   Trim Me  ";
		String trimmedString = stringWithWhiteSpace.trim();
		System.out.println("Original string with whitespace : " + stringWithWhiteSpace + "'");
		System.out.println("Trimmed string : " + trimmedString + "'");
		
		// 10. spilt()
		
		String sentence = "This is a sample sentence";
		String[] words = sentence.split(" ");
		System.out.println("Words in the sentence :");
		for(String word : words) {
			System.out.println(word);
		}

	}

}
