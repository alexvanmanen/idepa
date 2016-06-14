package nl.hsleiden.idepa.state.printer;

public class ReadyState implements PrinterState {
	Printer printer;

	public ReadyState(Printer printer) {
		this.printer = printer;
	}

	@Override
	public void print() {
		System.out.println("Starting with printing ...");
		printer.setPrinterState(printer.getPrintingState());

	}

	@Override
	public void finish() {
		System.out.println("No job to finish.");
	}

	public String toString() {
		return "Ready State";
	}

	@Override
	public void cancel() {
		System.out.println("No job to cancel.");
	}

	@Override
	public void paperJam() {
		System.out.println("Printer can't be jammed if it is in the ready state");
	}

	@Override
	public void fix() {
		System.out.println("Printer isn't broken. Unable to fix it");
	}

}
