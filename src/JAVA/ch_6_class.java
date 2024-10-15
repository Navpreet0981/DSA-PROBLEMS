// Introduction To Classes, Objects And Methods
class Box {
    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

public class ch_6_class {
    public static void main(String[] args) {

        Box b1 = new Box();
        Box b2 = new Box();
        double vol;

        b1.setDim(10.2, 20.2, 32.2);
        b2.setDim(2, 2, 3);

        vol = b1.volume();
        System.out.println("The Volume Is:- " + vol);

        vol = b2.volume();
        System.out.println("\nThe Volume Is:- " + vol);

    }
}
