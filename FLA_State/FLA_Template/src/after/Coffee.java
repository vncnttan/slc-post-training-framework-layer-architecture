package after;

public class Coffee extends Beverage {

    @Override
    public void makeBeverage(){
        System.out.println("==============Making Coffee=================");
        boilWater();
        filterCoffee();
        pourIntoCup();
        addMilkAndSugar();
        System.out.println("=========================================");
        System.out.println();
    }

    @Override
    public void prepareBeverage() {
        filterCoffee();
    }

    private void filterCoffee(){
        System.out.println("Filtering the coffee...");
    }

    @Override
    public void addTopping() {
        addMilkAndSugar();
    }

    private void addMilkAndSugar(){
        System.out.println("Adding milk and sugar...");
    }
}
