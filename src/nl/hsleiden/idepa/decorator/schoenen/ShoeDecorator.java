package nl.hsleiden.idepa.decorator.schoenen;

public abstract class ShoeDecorator implements Shoe {

	protected Shoe shoe;

	public ShoeDecorator(Shoe shoe) {
		this.shoe = shoe;
	}

	public abstract int getRunSpeedModifier();

}
