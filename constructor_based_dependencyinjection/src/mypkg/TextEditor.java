package mypkg;

public class TextEditor {
	private SpellChecker spellChecker;
	
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("now inside the setSpellChecker");
		this.spellChecker = spellChecker;
	}

	public void spellCheck(){
		spellChecker.checkSpelling();
	}
}
