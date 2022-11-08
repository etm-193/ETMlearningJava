package countingChars;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Count {
	
	private HashMap<Character, Integer> charCount = new HashMap<>();
	
	
	public Count() {
		super();
	}
	
	
	public HashMap<Character,Integer> countCharacters() {
		String word = wordIntake(); //method to assign word value as user input.
		if (word == null) { System.out.println(charCount); }
//			throw new NullPointerException("Word input cannot be empty.");
//		} else if (word.isEmpty()) {
//			throw new NullPointerException("Word input cannot be empty.");
//		}
		System.out.println(word);// test no.1 = true; null exception is working and word variable is being saved.
		
		String retreivedWord= storeWord(word);
		System.out.println(retreivedWord);
		for (int i = 0; i < retreivedWord.length(); i++) {
			Character counter = retreivedWord.charAt(i);
			HashMap<Character, Integer> characterCount = new HashMap<>();
			
				if (counter != ' ') {
					characterCount.put(counter, + 1);
				} else {
					System.out.println(charCount.toString());
				}
				
				charCount = characterCount;
		}
//		
//		String charCount = placeHolder.toString();
		System.out.println(charCount.toString());
		return charCount;
	}
	
	
	
	public String wordIntake() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the word you would like to break down.");
		String word = scan.nextLine();
		scan.close();
		return word;
	}
	
	public String storeWord(String word){
		//method to add the word as part of an ArrayList
		ArrayList<String> storedWord = new ArrayList<String>();
		storedWord.add(word);
		String savedWord = storedWord.get(0);
		return savedWord;
	}
	
//	public HashMap<Character, Integer> wordBreakDown(String retreivedWord){
//		//breakdown method to loop through the word char to assign key value pair.
//		for (int i = 0; i < retreivedWord.length(); i++ ) {
//			 
//		}
//		
//		return characterCount;
//	}
	

	public HashMap<Character, Integer> getCharCount() {
		return charCount;
	}

	public void setCharCount(HashMap<Character, Integer> charCount) {
		this.charCount = charCount;
	}


	@Override
	public int hashCode() {
		return Objects.hash(charCount);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Count other = (Count) obj;
		return Objects.equals(charCount, other.charCount);
	}


	@Override
	public String toString() {
		return "Count [charCount=" + charCount + "]";
	}

}
