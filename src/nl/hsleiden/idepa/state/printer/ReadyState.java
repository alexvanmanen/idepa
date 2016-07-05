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
	public void finish() throws StateException {
		throw new StateException("No job to finish.");
	}

	public String toString() {
		return "Ready State";
	}

	@Override
	public void cancel() throws StateException {
		throw new StateException("No job to cancel.");
	}

	@Override
	public void paperJam() throws StateException {
		throw new StateException("Printer can't be jammed if it is in the ready state");
	}

	@Override
	public void fix() throws StateException {
		throw new StateException("Printer isn't broken. Unable to fix it");
	}

}
