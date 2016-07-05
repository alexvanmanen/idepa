package nl.hsleiden.idepa.state.printer;

public class JammedEmptyState implements PrinterState {
	Printer printer;
	
	public JammedEmptyState(Printer printer) {
		this.printer = printer;
	}

	@Override
	public void print() throws StateException {
		throw new StateException("Unable to print. Printer is jammed.");

	}

	@Override
	public void finish() throws StateException {
		throw new StateException("Unable to finish. Printer is jammed.");

	}

	@Override
	public void cancel() throws StateException {
		throw new StateException("No job to cancel.");
	}
	
	@Override
	public void paperJam() throws StateException {
		throw new StateException("Paper is already jammed. Nothing changed.");
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
