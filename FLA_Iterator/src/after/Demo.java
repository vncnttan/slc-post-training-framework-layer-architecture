package after;

public class Demo {
    public static void main(String[] args) {
        EmployeeDatabase ed = new EmployeeDatabase();

        EmployeeIterator ei = (EmployeeIterator) ed.iterator();

        while (ei.hasNext()){
            System.out.println(ei.next().toString());
        }
    }
}
