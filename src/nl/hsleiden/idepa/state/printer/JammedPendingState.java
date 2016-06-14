package nl.hsleiden.idepa.state.printer;

public class JammedPendingState implements PrinterState {

	Printer printer;
	
	public JammedPendingState(Printer printer) {
		this.printer = printer;
	}

	@Override
	public void print() {
		System.out.println("Unable to print. Printer is jammed.");

	}

	@Override
	public void finish() {
		System.out.println("Unable to finish. Printer is jammed.");
	}

	@Override
	public void cancel() {
		System.out.println("Printing job is cancelled.");
		printer.setPrinterState(printer.getJammedEmptyState());
	}

	@Override
	public void paperJam() {
		System.out.println("Paper is already jammed. Nothing changed.");
	}

	@Override
	public void fix() {
		System.out.println("You fixed the jammed paper problem :) Continuing printing....");
		printer.setPrinterState(printer.getPrintingState());

	}
	
	public String toString(){
		return "Jammed Pending State";
	}

}
