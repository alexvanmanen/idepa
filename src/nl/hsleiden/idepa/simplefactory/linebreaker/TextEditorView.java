package nl.hsleiden.idepa.simplefactory.linebreaker;

import java.util.List;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TextEditorView extends Application {
	public static void main(String[] args) {

		Application.launch(args);

	}

	@Override
	public void start(Stage primaryStage) {

		primaryStage.setTitle("Linebreaker with Factory Pattern");
		GridPane grid = new GridPane();
		primaryStage.setX(550);
		primaryStage.setY(133);
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));

		Scene scene = new Scene(grid, 500, 275);
		primaryStage.setScene(scene);

		Text scenetitle = new Text("Linebreaker with Factory Pattern");
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		grid.add(scenetitle, 0, 0, 2, 1);

		final TextArea textArea = new TextArea();
		textArea.setEditable(false);
		/* Tekst uit het TextElement wordt op de TextArea gezet. */
		TextElement textElement = new TextElement(LineBreakerFactory.getInstance().getDefaultLineBreaker());
		textArea.setText(textElement.getText());
		grid.add(textArea, 1, 4);

		/*
		 * Verschillende linebreaker mogelijkheden worden toegevoegd aan de
		 * choicebox
		 */
		List<String> lineBreakerNames = LineBreakerFactory.getInstance().getLineBreakerNames();
		ChoiceBox<String> cb = new ChoiceBox<String>(FXCollections.observableArrayList(lineBreakerNames));
		grid.add(cb, 1, 1);

		cb.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				/*
				 * Op basis van de gekozen linebreaker wordt deze aangemaakt
				 * door de factory. Daarna wordt deze gebruikt om de tekst te
				 * formateren en te tonen op het scherm
				 */
				String lineBreakerChoice = cb.getValue();
				LineBreaker createLineBreaker = LineBreakerFactory.getInstance().createLineBreaker(lineBreakerChoice);
				textElement.setLineBreaker(createLineBreaker);
				String breakLines = createLineBreaker.breakLines(textElement.getText());
				textArea.setText(breakLines);
			}
		});
		primaryStage.show();
	}
}