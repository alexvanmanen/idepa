package nl.hsleiden.idepa.simplefactory.linebreaker;

import java.util.List;

public class TextElement {

	private String text = "Designing object oriented software is hard, and designing reusable object oriented software is even harder.";
	private LineBreaker lineBreaker;
	
	public TextElement(LineBreaker lineBreaker) {
		this.lineBreaker = lineBreaker;
	}
	
	private String breakLines() {
        return lineBreaker.breakLines(text);
	}

	public void display() {
		System.out.println(lineBreaker.breakLines(text));

	}

	public void setLineBreaker(LineBreaker lineBreaker) {
        this.lineBreaker = lineBreaker;
	}
	
	public String getText(){
		return text;
	}

}
