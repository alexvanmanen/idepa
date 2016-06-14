package nl.hsleiden.idepa.state.printer;

public class JammedEmptyState implements PrinterState {
	Printer printer;
	
	public JammedEmptyState(Printer printer) {
		this.printer = printer;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub

	}

	@Override
	public void finish() {
		System.out.println("Unable to finish. Printer is jammed.");

	}

	@Override
	public void cancel() {
		System.out.println("No job to cancel.");
	}
	
	@Override
	public void paperJam() {
		System.out.println("Paper is already jammed. Nothing changed.");
	}

	@Override
	public void fix() {
		System.out.println("You fixed the jammed paper problem :)");
		printer.setPrinterState(printer.getReadyState());

	}

	public String toString(){
		return "Jammed Empty State";
	}
	
}
