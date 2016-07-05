package nl.hsleiden.idepa.strategy.linebreaker;

import java.io.IOException;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) throws IOException {
		System.out.println("Wil je de tekst in LaTeX-stijl?");
		int userChoice = new Scanner(System.in).nextInt();
		TextElement textElement = new TextElement(new StandardLineBreaker());
		if(userChoice ==  1){
			textElement.setLineBreaker(new LatexStyleLineBreaker());
		}
		textElement.display();
	}

}
