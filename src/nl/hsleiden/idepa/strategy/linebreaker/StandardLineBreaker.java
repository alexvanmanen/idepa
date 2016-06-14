package nl.hsleiden.idepa.strategy.linebreaker;

import java.util.ArrayList;
import java.util.List;

public class StandardLineBreaker implements LineBreaker {
	@Override
	public List<String> breakLines(String text) {
		List<String> result = new ArrayList<String>();
		result.add(text.substring(0, 44));
		result.add(text.substring(44, 92));
		result.add(text.substring(92));
		return result;
	}
}
