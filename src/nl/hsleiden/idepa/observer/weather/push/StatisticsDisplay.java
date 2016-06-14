package nl.hsleiden.idepa.observer.weather.push;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class StatisticsDisplay implements Observer {
	private TextField avgTextField = new TextField();
	private TextField maxTextField = new TextField();
	private TextField minTextField = new TextField();

	private float maxTemp = 0.0f;
	private float minTemp = 0.0f;
	private float tempSum = 0.0f;
	private int numReadings;
	

	public StatisticsDisplay(Subject weatherData) {
		weatherData.registerObserver(this);

		/* Graphic stuff */
		Stage stage = new Stage();
		stage.setTitle("Current Conditions Display");
		stage.setX(0);
		stage.setY(350);
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER_RIGHT);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));

		Scene scene = new Scene(grid, 500, 275);
		stage.setScene(scene);
		Text scenetitle = new Text("Statistics Display");
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		grid.add(scenetitle, 0, 0, 2, 1);
		
		Label avgTemp = new Label("Average temperature:");
		grid.add(avgTemp, 0, 1);
		avgTextField.setDisable(true);
		grid.add(avgTextField, 1, 1);

		Label maxTemp = new Label("Maximum temperature:");
		grid.add(maxTemp, 0, 2);
		maxTextField.setDisable(true);
		grid.add(maxTextField, 1, 2);

		Label minTemp = new Label("Minimal temperature:");
		grid.add(minTemp, 0, 3);
		minTextField.setDisable(true);
		grid.add(minTextField, 1, 3);

		stage.show();
	}

	public void update(float temp, float humidity, float pressure) {
		tempSum += temp;
		numReadings++;

		if (temp > maxTemp) {
			maxTemp = temp;
		}

		if (temp < minTemp) {
			minTemp = temp;
		}

		display();
	}

	public void display() {
		avgTextField.setText((tempSum / numReadings) + "");
		maxTextField.setText(maxTemp + "");
		minTextField.setText(minTemp + "");
	}

}
