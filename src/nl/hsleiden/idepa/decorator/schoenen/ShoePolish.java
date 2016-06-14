package nl.hsleiden.idepa.decorator.schoenen;

public class ShoePolish extends ShoeDecorator{

	public ShoePolish(Shoe shoe) {
		super(shoe);
	}

	public int getRunSpeedModifier() {
		return 14 + shoe.getRunSpeedModifier();
	}

}
