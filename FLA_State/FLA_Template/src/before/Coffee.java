package before;

public class Coffee {

    public void makeCoffee(){
        boilWater();
        filterCoffee();
        pourIntoCup();
        addMilkAndSugar();
    }

    public void boilWater(){
        System.out.println("Boiling water...");
    }

    public void filterCoffee(){
        System.out.println("Filtering the coffee...");
    }

    public void pourIntoCup(){
        System.out.println("Pouring into cup...");
    }

    public void addMilkAndSugar(){
        System.out.println("Adding milk and sugar...");
    }
}
