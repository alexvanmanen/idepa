package nl.hsleiden.idepa.decorator.schoenen;

public class ShoeWings extends ShoeDecorator{

	public ShoeWings(Shoe shoe) {
		super(shoe);
	}

	public int getRunSpeedModifier() {
		return 12 + shoe.getRunSpeedModifier();
	}

}
