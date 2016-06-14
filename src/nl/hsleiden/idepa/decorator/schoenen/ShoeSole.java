package nl.hsleiden.idepa.decorator.schoenen;

public class ShoeSole extends ShoeDecorator{

	public ShoeSole(Shoe shoe) {
		super(shoe);
	}

	public int getRunSpeedModifier() {
		return 30 + shoe.getRunSpeedModifier();
	}

}
