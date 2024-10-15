package OOPS;
class Car {
    public void name(){
        System.out.println("The Car Name Is SUPRAA!!!!");
    }    
}
class Mustang extends Car{
    public void name(){
        System.out.println("\nThe Car Name Is Mustangg!!!!");
    } 
}



public class overiding {
    public static void main(String[] args) {
        Car c = new Car();
        c.name();
        Mustang m = new Mustang();
        m.name();
    }
    
}
