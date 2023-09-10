package after;

public abstract class Beverage {
    public abstract void makeBeverage();
    public void boilWater(){
        System.out.println("Boiling water...");
    }

    public abstract void prepareBeverage();

    public void pourIntoCup(){
        System.out.println("Pouring into cup...");
    }

    public abstract void addTopping ();
}
