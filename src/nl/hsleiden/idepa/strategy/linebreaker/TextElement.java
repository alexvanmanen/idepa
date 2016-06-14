package nl.hsleiden.idepa.strategy.linebreaker;

import java.util.List;

public class TextElement {
  private String text = "Designing object oriented "
      + "software is hard, and designing reusable "
      + "object oriented software is even harder.";
  private LineBreaker lineBreaker;
  public TextElement(LineBreaker lineBreaker) {
    this.lineBreaker = lineBreaker;
  }
  private List<String> breakLines() {
    return lineBreaker.breakLines(text);
  }
  public void display() {
    for (String line : breakLines()) {
      System.out.println(line);
    }
  }
  public void setLineBreaker(LineBreaker lineBreaker) {
    this.lineBreaker = lineBreaker;
  }
}
