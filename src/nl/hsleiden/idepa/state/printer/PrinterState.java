package nl.hsleiden.idepa.state.printer;

public interface PrinterState {

	public void print();
	public void finish();
	public void cancel(); 
	public void paperJam();
	public void fix();
	
}
