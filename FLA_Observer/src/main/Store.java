package main;

import java.util.ArrayList;

public class Store implements ISubject{
    private int stock;

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.notifySubscriber(this.stock, stock);
        this.stock = stock;
    }

    public Store(int stock) {
        this.stock = stock;
    }

    ArrayList<IObserver> subscriber = new ArrayList<>();

    @Override
    public void addSubscriber(IObserver observer) {
        subscriber.add(observer);
    }

    @Override
    public void removeSubscriber(IObserver observer) {
        subscriber.remove(observer);
    }

    @Override
    public void notifySubscriber(int oldStock, int newStock) {
        for (IObserver s: subscriber) {
            s.getNotification(oldStock, newStock);
        }
    }
}
