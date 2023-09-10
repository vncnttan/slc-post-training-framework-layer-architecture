package main;

public interface ISubject {

    public void addSubscriber(IObserver observer);
    public void removeSubscriber(IObserver observer);

    public void notifySubscriber(int oldStock, int newStock);
}
