package nl.hsleiden.idepa.decorator.schoenen;

public class ShoeBadges extends ShoeDecorator{

	public ShoeBadges(Shoe shoe) {
		super(shoe);
	}

	public int getRunSpeedModifier() {
		return 0 + shoe.getRunSpeedModifier();
	}

}
