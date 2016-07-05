package nl.hsleiden.idepa.state.printer;

public class Main {

	public static void main(String[] args) throws StateException {
		Printer printer = new Printer();

		System.out.println("huidige status: " + printer.getCurrentPrinterState());
		printer.print();
		printer.print();
		System.out.println("huidige status: " + printer.getCurrentPrinterState());
		

	}

}