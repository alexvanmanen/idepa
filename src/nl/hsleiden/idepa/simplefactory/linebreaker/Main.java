package nl.hsleiden.idepa.simplefactory.linebreaker;



import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// Met constructors:
		TextElement textElement = new TextElement(new StandardLineBreaker());
		
		textElement.display();
		textElement.setLineBreaker(new LatexStyleLineBreaker());
		textElement.display();

		// Met een simple factory:
		LineBreakerFactory lineBreakerFactory = LineBreakerFactory.getInstance();
		textElement.setLineBreaker(lineBreakerFactory.createLineBreaker("standard"));
		textElement.display();

		// Met een selector:
		List<String> lineBreakerNames = lineBreakerFactory.getLineBreakerNames();
		System.out.println(lineBreakerNames);
		int userChoice = new Scanner(System.in).nextInt();
		textElement.setLineBreaker(
				lineBreakerFactory.createLineBreaker(
						lineBreakerNames.get(userChoice)));
		textElement.display();
	}

}
