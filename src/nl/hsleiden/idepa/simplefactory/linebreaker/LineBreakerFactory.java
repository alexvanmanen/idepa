package nl.hsleiden.idepa.simplefactory.linebreaker;

import java.util.Arrays;
import java.util.List;

public class LineBreakerFactory {
    // Deze class is een Singleton.
    private static LineBreakerFactory instance = new LineBreakerFactory();

    public static final String LATEX_STYLE = "latex style";
    public static final String STANDARD = "standard";

    private LineBreakerFactory() {}

    public static LineBreakerFactory getInstance() {
        return instance;
    }

    public List<String> getLineBreakerNames() {
        return Arrays.asList(LATEX_STYLE, STANDARD);
    }

    public LineBreaker createLineBreaker(String name) {
        if (LATEX_STYLE.equals(name)) {
            return new LatexStyleLineBreaker();
        } else if (STANDARD.equals(name)) {
            return new StandardLineBreaker();
        } else {
            return null;
        }
    }
    
    public LineBreaker getDefaultLineBreaker(){
    	 return new StandardLineBreaker();
    }
}
