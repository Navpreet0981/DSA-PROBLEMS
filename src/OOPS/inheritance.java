package OOPS;

//BASIC CONCEPTS OF INHERITANCE
class base1 {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I Am In Base And Setting X Now");
        this.x = x;
    }

    public void printMe() {
        System.out.println("I Am A Constructor ");
    }
}

class derived1 extends base1 {
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("I Am Setting Y in Derived Class");
        this.y = y;

    }
}

public class inheritance {
    public static void main(String[] args) {

        // Object Of Base Class
        base1 b = new base1();
        b.setX(4);
        System.out.println(b.getX());

        // Object Of Derived Class
        derived1 d = new derived1();
        d.setY(43);
        System.out.println(d.getY());
    }

}
