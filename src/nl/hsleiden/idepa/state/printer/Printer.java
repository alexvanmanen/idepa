package nl.hsleiden.idepa.state.printer;

public class Printer {

	private PrinterState jammedEmptyState;
	private PrinterState jammedPendingState;
	private PrinterState printingState;
	private PrinterState readyState;
	private PrinterState currentState;

	public Printer() {
		jammedEmptyState = new JammedEmptyState(this);
		jammedPendingState = new JammedPendingState(this);
		printingState = new PrintingState(this);
		readyState = new ReadyState(this);
		currentState = readyState;
	}
	
	public void setPrinterState(PrinterState state){
		currentState = state;
	}
	
	public PrinterState getCurrentPrinterState(){
		return currentState;
	}

	public PrinterState getJammedEmptyState() {
		return jammedEmptyState;
	}

	public PrinterState getJammedPendingState() {
		return jammedPendingState;
	}

	public PrinterState getPrintingState() {
		return printingState;
	}

	public PrinterState getReadyState() {
		return readyState;
	}

	public void print() throws StateException {
		currentState.print();
	}

	public void finish() throws StateException {
		currentState.finish();
	}

	public void cancel() throws StateException{
		currentState.cancel();
	}

	public void paperJam() throws StateException{
		currentState.paperJam();
	}

	public void fix() throws StateException{
		currentState.fix();

	}

}
