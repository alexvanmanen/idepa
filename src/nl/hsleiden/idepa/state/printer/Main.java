package nl.hsleiden.idepa.state.printer;

public class Main {

	public static void main(String[] args) {
		scenario3();

	}

	public static void scenario1() {
		Printer printer = new Printer();
		System.out.println("Current state is: " + printer.getCurrentPrinterState());
		printer.print();
		System.out.println("Current state is: " + printer.getCurrentPrinterState());
		printer.paperJam();
		System.out.println("Current state is: " + printer.getCurrentPrinterState());
		printer.fix();
		System.out.println("Current state is: " + printer.getCurrentPrinterState());
		printer.finish();
		System.out.println("Current state is: " + printer.getCurrentPrinterState());
	}

	public static void scenario2() {
		Printer printer = new Printer();
		System.out.println("Current state is: " + printer.getCurrentPrinterState());
		printer.print();
		System.out.println("Current state is: " + printer.getCurrentPrinterState());
		printer.paperJam();
		System.out.println("Current state is: " + printer.getCurrentPrinterState());
		printer.cancel();
		System.out.println("Current state is: " + printer.getCurrentPrinterState());
		printer.fix();
		System.out.println("Current state is: " + printer.getCurrentPrinterState());
	}
	
	public static void scenario3() {
		Printer printer = new Printer();
		System.out.println("Current state is: " + printer.getCurrentPrinterState());
		printer.print();
		System.out.println("Current state is: " + printer.getCurrentPrinterState());
		printer.print();
		System.out.println("Current state is: " + printer.getCurrentPrinterState());
		printer.cancel();
		System.out.println("Current state is: " + printer.getCurrentPrinterState());
	}

}
