package nl.hsleiden.idepa.strategy.linebreaker;

import java.util.ArrayList;
import java.util.List;

public class LatexStyleLineBreaker implements LineBreaker {
	@Override
	public List<String> breakLines(String text) {
		List<String> result = new ArrayList<String>();
		result.add(text.substring(0, 44));
		result.add(text.substring(44, 87) + "-");
		result.add(text.substring(87));
		return result;	
		}
}
