package nl.hsleiden.idepa.observer.weather.push;
public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();

}
