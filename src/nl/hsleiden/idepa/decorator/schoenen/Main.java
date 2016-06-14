package nl.hsleiden.idepa.decorator.schoenen;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class Main {

	public static void main(String[] args) {
		Shoe shoe = new ShoeWings(new ShoeLaces(new LinnenShoe()));
		System.out.println(shoe.getRunSpeedModifier());
	}

	public void runFileReaderExample() {
		try {
			LineNumberReader lnr = new LineNumberReader(new BufferedReader(new FileReader("./bestand.txt")));
			String s;
			try {

				while ((s = lnr.readLine()) != null) {
					System.out.println(lnr.getLineNumber() + " - " + s);
				}

			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
