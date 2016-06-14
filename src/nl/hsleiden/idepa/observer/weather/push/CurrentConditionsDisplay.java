package nl.hsleiden.idepa.observer.weather.push;

import javafx.application.Application;
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

public class CurrentConditionsDisplay extends Application implements Observer {

	private float temperature;
	private float humidity;
	private float pressure;

	private TextField tempTextField = new TextField();
	private TextField humidityTextField = new TextField();
	private TextField pressureTextField = new TextField();

	public CurrentConditionsDisplay(Subject weatherData) {
		weatherData.registerObserver(this);

		Stage stage = new Stage();

		stage.setTitle("Current Conditions Display");
		stage.setX(0);
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER_LEFT);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));

		Scene scene = new Scene(grid, 500, 275);
		stage.setScene(scene);

		Text scenetitle = new Text("Current Conditions Display");
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		grid.add(scenetitle, 0, 0, 2, 1);
		
		Label temp = new Label("Temperature:");
		grid.add(temp, 0, 1);
		tempTextField.setDisable(true);
		grid.add(tempTextField, 1, 1);

		Label humidity = new Label("Humidity:");
		grid.add(humidity, 0, 2);

		humidityTextField.setDisable(true);
		grid.add(humidityTextField, 1, 2);

		Label pressure = new Label("Pressure:");
		grid.add(pressure, 0, 3);

		pressureTextField.setDisable(true);
		grid.add(pressureTextField, 1, 3);

		stage.show();

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub

	}

	public void display() {
		tempTextField.setText(Float.toString(temperature));
		humidityTextField.setText(Float.toString(humidity));
		pressureTextField.setText(Float.toString(pressure));
	}

	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}
}
