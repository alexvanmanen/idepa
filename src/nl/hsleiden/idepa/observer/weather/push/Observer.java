package nl.hsleiden.idepa.observer.weather.push;


public interface Observer {
	public void update(float temp, float humidity, float pressure);
}