package nl.hsleiden.idepa.simplefactory.linebreaker;

public class LatexStyleLineBreaker implements LineBreaker {

	@Override
	public String breakLines(String text) {
		return text.substring(0, 44) + "\n" +  text.substring(44, 87) + "-\n" + text.substring(87);
	}

}
