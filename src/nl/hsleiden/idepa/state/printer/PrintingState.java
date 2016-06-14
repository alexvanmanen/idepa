package nl.hsleiden.idepa.state.printer;

public class PrintingState implements PrinterState {
	Printer printer;
	
	public PrintingState(Printer printer) {
		this.printer = printer;
	}

	@Override
	public void print() {
		System.out.println("Already busy with printing");

	}

	@Override
	public void finish() {
		System.out.println("Done with the printing job.");
		printer.setPrinterState(printer.getReadyState());
	}

	@Override
	public void cancel() {
		System.out.println("Printing job canceled.");
		printer.setPrinterState(printer.getReadyState());
	}

	@Override
	public void paperJam() {
		System.out.println("The paper is jammed :(");
		printer.setPrinterState(printer.getJammedPendingState());

	}

	@Override
	public void fix() {
		System.out.println("Printer isn't broken. Unable to fix it");
	}

	public String toString(){
		return "Printing State";
	}
}
