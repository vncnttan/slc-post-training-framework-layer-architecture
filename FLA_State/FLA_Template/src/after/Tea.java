package after;

public class Tea extends Beverage{

    @Override
    public void makeBeverage(){
        System.out.println("==============Making Tea=================");
        boilWater();
        dipTea();
        pourIntoCup();
        addSugar();
        System.out.println("=========================================");
        System.out.println();
    }

    @Override
    public void prepareBeverage() {
        dipTea();
    }

    public void dipTea(){
        System.out.println("Dipping tea...");
    }

    @Override
    public void addTopping() {
        addSugar();
    }

    public void addSugar(){
        System.out.println("Adding sugar...");
    }
}
