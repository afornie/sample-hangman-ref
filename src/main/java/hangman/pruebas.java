package hangman;

public class pruebas {
	
	public String word;
	char letter;
	
	public void setChar(char letter){
		this.letter = letter;
	}
	public char getChar(){
		return letter;
	}
	
	public void testChar(String word, char letter){
		this.word = word;
		this.letter = letter;
		
		for(int iCont = 0; iCont <= word.length(); iCont++){
			//Si la letra es igual a la letra de la palabra, almacenarla en un Array
			if(this.getChar() == word[iCont]){
				
			}
		}
	}

}
