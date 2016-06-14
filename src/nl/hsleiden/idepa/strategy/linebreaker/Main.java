package nl.hsleiden.idepa.strategy.linebreaker;


import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		TextElement textElement = new TextElement(new StandardLineBreaker());
		textElement.display();
		System.out.println("");
		textElement.setLineBreaker(new LatexStyleLineBreaker());
		textElement.display();
	}
}
