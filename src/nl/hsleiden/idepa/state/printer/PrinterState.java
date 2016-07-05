package nl.hsleiden.idepa.state.printer;

public interface PrinterState {

	public void print() throws StateException;
	public void finish() throws StateException;
	public void cancel() throws StateException; 
	public void paperJam() throws StateException;
	public void fix() throws StateException;
	
}
