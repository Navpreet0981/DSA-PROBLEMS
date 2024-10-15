package OOPS;
abstract class base {
    public base() {
        System.out.println("I Am Constructor Of Base Class");

    }

    public void sayHello() {
        System.out.println("Hello!!!");
    }

    abstract public void greet();
}

class derived extends base {
    @Override
    public void greet() {
        System.out.println("Good Morning!!");
    }

}

public class abstract_1 {
    public static void main(String[] args) {
        derived d = new derived();
    }

}