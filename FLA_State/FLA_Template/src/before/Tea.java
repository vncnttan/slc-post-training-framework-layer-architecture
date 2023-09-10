package before;

public class Tea {

    public void makeTea(){
        boilWater();
        dipTea();
        pourToCup();
        addSugar();
    }

    public void boilWater(){
        System.out.println("Boiling water...");
    }

    public void dipTea(){
        System.out.println("Dipping tea...");
    }

    public void pourToCup(){
        System.out.println("Pouring into cup...");
    }

    public void addSugar(){
        System.out.println("Adding sugar...");
    }

}
