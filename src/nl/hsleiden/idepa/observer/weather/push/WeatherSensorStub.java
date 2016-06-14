package nl.hsleiden.idepa.observer.weather.push;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class WeatherSensorStub extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) {

		final WeatherData weatherData = new WeatherData();

		primaryStage.setTitle("Weather Sensor Stub");
		GridPane grid = new GridPane();
		primaryStage.setX(550);
		primaryStage.setY(133);
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));

		Scene scene = new Scene(grid, 500, 275);
		primaryStage.setScene(scene);

		Text scenetitle = new Text("Weather Sensor Stub");
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		grid.add(scenetitle, 0, 0, 2, 1);

		Label temp = new Label("Temperature:");
		grid.add(temp, 0, 1);

		final TextField tempTextField = new TextField();
		grid.add(tempTextField, 1, 1);

		Label humidity = new Label("Humidity:");
		grid.add(humidity, 0, 2);

		final TextField humidityTextField = new TextField();
		grid.add(humidityTextField, 1, 2);

		Label pressure = new Label("Pressure:");
		grid.add(pressure, 0, 3);

		final TextField pressureTextField = new TextField();
		grid.add(pressureTextField, 1, 3);

		Button updateBtn = new Button();
		updateBtn.setText("Update");
		grid.add(updateBtn, 1, 4);

		updateBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				int t = Integer.parseInt(tempTextField.getText());
				int h = Integer.parseInt(humidityTextField.getText());
				float p = Float.parseFloat(pressureTextField.getText());
				weatherData.setMeasurements(t, h, p);
			}
		});

		primaryStage.show();
		createOtherViews(weatherData);
	}

	public void createOtherViews(Subject weatherData) {
		new CurrentConditionsDisplay(weatherData);
		new StatisticsDisplay(weatherData);
	}

}