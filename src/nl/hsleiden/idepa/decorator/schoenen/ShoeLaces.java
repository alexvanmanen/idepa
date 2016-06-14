package nl.hsleiden.idepa.decorator.schoenen;

public class ShoeLaces extends ShoeDecorator{

	public ShoeLaces(Shoe shoe) {
		super(shoe);
	}

	public int getRunSpeedModifier() {
		return 2 + shoe.getRunSpeedModifier();
	}

}
